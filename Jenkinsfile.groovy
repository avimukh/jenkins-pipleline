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
        shell('curl https://download.winzip.com/gl/nkln/winzip27-downwz.exe -o cxsast_exporter.exe')
    }
}
