pipeline{
	agent any
	stages{
		stage('Build'){
			steps{
				echo "Build"
				
			}
		}
		stage('Test'){
			steps{
				
				echo "Test"
			}
		}
		stage('IntegrationService'){
			steps{
				echo "IntegrationService"
			}
		}
	}
	post{
		always{
			echo "Pipeline run complete"
		}
		success{
			echo "Ran successfully"
		}
		failure{
			echo "Failed"
		}
	}

}
