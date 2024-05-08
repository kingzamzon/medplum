import { applyHiddenFields, buildElementsContext } from './elements-context';
import { HTTP_HL7_ORG } from './constants';
import { isPopulated } from './utils';
import {
  InternalTypeSchema,
  getDataType,
  indexStructureDefinitionBundle,
  parseStructureDefinition,
} from './typeschema/types';
import { AccessPolicy, Bundle, Patient, StructureDefinition } from '@medplum/fhirtypes';
import { readJson } from '@medplum/definitions';

describe('buildElementsContext', () => {
  let USCoreStructureDefinitions: StructureDefinition[];

  function getSchemaFromProfileUrl(url: string): InternalTypeSchema {
    const sd = USCoreStructureDefinitions.find((sd) => sd.url === url);
    if (!isPopulated(sd)) {
      fail(`Expected structure definition for ${url} to be found`);
    }
    return parseStructureDefinition(sd);
  }
  beforeAll(() => {
    USCoreStructureDefinitions = readJson('fhir/r4/testing/uscore-v5.0.1-structuredefinitions.json');
  });

  test('deeply nested schema', () => {
    const profileUrl = `${HTTP_HL7_ORG}/fhir/us/core/StructureDefinition/us-core-medicationrequest`;
    const schema = getSchemaFromProfileUrl(profileUrl);

    const context = buildElementsContext({
      elements: schema.elements,
      path: 'MedicationRequest',
      parentContext: undefined,
      profileUrl,
    });

    if (context === undefined) {
      fail('Expected context to be defined');
    }

    expect(context.profileUrl).toEqual(profileUrl);
    expect(context.elements['dosageInstruction.method']).toBeDefined();
    expect(context.elementsByPath['MedicationRequest.dosageInstruction.method']).toBeDefined();
    expect(context.elements['dosageInstruction.method']).toBe(
      context.elementsByPath['MedicationRequest.dosageInstruction.method']
    );
  });

  test('building context at same path returns undefined', () => {
    const profileUrl = `${HTTP_HL7_ORG}/fhir/us/core/StructureDefinition/us-core-patient`;
    const schema = getSchemaFromProfileUrl(profileUrl);
    const context = buildElementsContext({
      elements: schema.elements,
      path: 'Patient',
      parentContext: undefined,
      profileUrl,
    });

    if (context === undefined) {
      fail('Expected context to be defined');
    }

    const samePath = buildElementsContext({
      elements: schema.elements,
      path: 'Patient',
      parentContext: context,
      profileUrl,
    });

    expect(samePath).toBeUndefined();
  });

  test('nested context', () => {
    const profileUrl = `${HTTP_HL7_ORG}/fhir/us/core/StructureDefinition/us-core-patient`;
    const profileSchema = getSchemaFromProfileUrl(profileUrl);

    const context = buildElementsContext({
      elements: profileSchema.elements,
      path: 'Patient',
      parentContext: undefined,
      profileUrl,
    });

    if (context === undefined) {
      fail('Expected context to be defined');
    }

    const extensionUrl = `${HTTP_HL7_ORG}/fhir/us/core/StructureDefinition/us-core-race`;
    const extensionSchema = getSchemaFromProfileUrl(extensionUrl);

    const extensionContext = buildElementsContext({
      elements: extensionSchema.elements,
      path: 'Patient.extension',
      parentContext: context,
      profileUrl: extensionUrl,
      debugMode: true,
    });

    if (extensionContext === undefined) {
      fail('Expected extension context to be defined');
    }

    expect(extensionContext.profileUrl).toEqual(extensionUrl);
    expect(Object.keys(extensionContext.elements)).toEqual(
      expect.arrayContaining(['extension', 'id', 'url', 'value[x]'])
    );

    expect(extensionContext.elements['extension'].slicing?.slices.length).toBe(3);
    expect(extensionContext.elements['extension']).toBe(extensionContext.elementsByPath['Patient.extension.extension']);

    expect(extensionContext.elements['url'].fixed).toEqual({
      type: 'uri',
      value: 'http://hl7.org/fhir/us/core/StructureDefinition/us-core-race',
    });
  });
});

describe.only('#applyHiddenFields', () => {
  beforeAll(() => {
    indexStructureDefinitionBundle(readJson('fhir/r4/profiles-types.json') as Bundle);
    indexStructureDefinitionBundle(readJson('fhir/r4/profiles-resources.json') as Bundle);
  });

  test('no hidden fields', () => {
    const schema = getDataType('Patient');
    const elements = schema.elements;

    const accessPolicy: AccessPolicy = {
      resourceType: 'AccessPolicy',
      resource: [{ resourceType: 'Patient', hiddenFields: [] }],
    };
    const patient: Patient = {
      resourceType: 'Patient',
      gender: 'unknown',
      maritalStatus: { coding: [{}] },
    };
    const result = applyHiddenFields(patient, accessPolicy, elements);
    expect(result.size).toBe(0);
  });

  test('some hidden fields', () => {
    const schema = getDataType('Patient');
    const elements = schema.elements;

    const accessPolicy: AccessPolicy = {
      resourceType: 'AccessPolicy',
      resource: [{ resourceType: 'Patient', hiddenFields: ['gender'] }],
    };
    const patient: Patient = {
      resourceType: 'Patient',
      gender: 'unknown',
      maritalStatus: { coding: [{}] },
    };
    console.log(JSON.stringify(Object.keys(elements), undefined, 2));
    const result = applyHiddenFields(patient, accessPolicy, elements);
    expect(result.size).toBe(1);
    expect(result.has('gender'));
  });
});
