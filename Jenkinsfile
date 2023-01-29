pipeline{
	agent {
		docker {
			image 'maven:3.6.3'
		}
	}
	stages{
		stage('Build'){
			steps{
				sh 'mvn --version'
				
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
