import { ValueSet } from '@medplum/fhirtypes';

export const encounterTypeValueSet: ValueSet = {
  resourceType: 'ValueSet',
  status: 'active',
  url: 'https://example.com/encounter-types',
  name: 'encounter-type-codes',
  title: 'Encounter Type Codes',
  description: 'These codes are used to classify Encounter resources into various types.',
  compose: {
    include: [
      {
        system: 'http://snomed.info/sct',
        concept: [
          {
            code: '11429006',
            display: 'Consultation',
          },
          {
            code: '308540004',
            display: 'Inpatient stay',
          },
          {
            code: '371883000',
            display: 'Outpatient procedure',
          },
          {
            code: '185317003',
            display: 'Telephone encounter',
          },
          {
            code: '439708006',
            display: 'Home visit',
          },
          {
            code: '390906007',
            display: 'Follow-up encounter',
          },
          {
            code: '50849002',
            display: 'Emergency room admission',
          },
          {
            code: '255327002',
            display: 'Ambulatory',
          },
          {
            code: '110466009',
            display: 'Pre-operative evaluation',
          },
          {
            code: '91251008',
            display: 'Physical therapy procedure',
          },
          {
            code: '31205005',
            display: 'Psychiatric therapy',
          },
          {
            code: '408470005',
            display: 'Obstetrics',
          },
          {
            code: '394586005',
            display: 'Gynecology',
          },
          {
            code: '225362009',
            display: 'Dental care',
          },
          {
            code: '304567001',
            display: 'Admission for long-term care',
          },
        ],
      },
    ],
  },
};
