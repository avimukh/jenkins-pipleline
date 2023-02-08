job (CxSASTExportUtility){
	scm {
            github('avimukh/jenkins-pipleline')
        }
	parameters {
        stringParam('ProjectName', 'testProject', 'Test Project')
    }
	triggers {
        scm('H/5 * * * *')
    }
	steps {
        shell('wget https://binaries.avivagroup.com/artifactory/shared-installers/checkmarx/cxsast/v1.1.1/cxsast_exporter.exe')
    }
}