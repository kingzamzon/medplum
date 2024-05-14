import { AppShell, ErrorBoundary, Loading, Logo, useMedplum, useMedplumProfile } from '@medplum/react';
import {
  IconClipboardHeart,
  IconClipboardList,
  IconDatabaseImport,
  IconHealthRecognition,
  IconQuestionMark,
  IconRobot,
  IconUser,
} from '@tabler/icons-react';
import { Suspense } from 'react';
import { Route, Routes } from 'react-router-dom';
import { PatientPage } from './pages/PatientPage';
import { EncounterPage } from './pages/EncounterPage';
import { LandingPage } from './pages/LandingPage';
import { ResourcePage } from './pages/ResourcePage';
import { SearchPage } from './pages/SearchPage';
import { SignInPage } from './pages/SignInPage';
import { UploadDataPage } from './pages/UploadDataPage';
import { MedplumClient } from '@medplum/core';

export function App(): JSX.Element | null {
  const medplum = useMedplum();
  const profile = useMedplumProfile();

  const questionnairesUploaded = checkQuestionnairesUploaded(medplum);

  if (medplum.isLoading()) {
    return null;
  }

  return (
    <AppShell
      logo={<Logo size={24} />}
      menus={[
        {
          title: 'Charts',
          links: [{ icon: <IconUser />, label: 'Patients', href: '/Patient' }],
        },
        {
          title: 'Encounters',
          links: [
            { icon: <IconClipboardList />, label: 'All Encounters', href: '/Encounter' },
            {
              icon: <IconClipboardHeart />,
              label: 'My Encounters',
              href: `/Encounter?participant=Practitioner/${profile?.id}`,
            },
          ],
        },
        {
          title: 'Upload Data',
          links: [
            { icon: <IconDatabaseImport />, label: 'Upload Core ValueSets', href: '/upload/core' },
            { icon: <IconHealthRecognition />, label: 'Upload Example Patient Data', href: '/upload/example' },
            questionnairesUploaded
              ? { icon: <IconRobot />, label: 'Upload Example Bots', href: '/upload/bots' }
              : { icon: <IconQuestionMark />, label: 'Upload Questionnaires', href: '/upload/questionnaire' },
          ],
        },
      ]}
    >
      <ErrorBoundary>
        <Suspense fallback={<Loading />}>
          <Routes>
            <Route path="/" element={profile ? <SearchPage /> : <LandingPage />} />
            <Route path="/signin" element={<SignInPage />} />
            <Route path="/Patient/:id/*" element={<PatientPage />} />
            <Route path="/:resourceType/:id/*" element={<ResourcePage />} />
            <Route path="/:resourceType" element={<SearchPage />} />
            <Route path="/Encounter/:id/*" element={<EncounterPage />} />
            <Route path="/upload/:dataType" element={<UploadDataPage />} />
          </Routes>
        </Suspense>
      </ErrorBoundary>
    </AppShell>
  );
}

function checkQuestionnairesUploaded(medplum: MedplumClient): boolean {
  let check = false;
  const clinicalNoteQuestionnaires = medplum
    .searchResources('Questionnaire', {
      context: 'CLINNOTEE',
    })
    .read();

  const questionnairesToCheck = clinicalNoteQuestionnaires.filter(
    (questionnaire) =>
      questionnaire.title === 'Obstetric Return Visit' ||
      questionnaire.title === 'Gynecology New Visit' ||
      questionnaire.title === 'Encounter Note'
  );

  if (questionnairesToCheck.length === 3) {
    check = true;
  }

  return check;
}
