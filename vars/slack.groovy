def call(String buildResult) {

  if ( buildResult == "SUCCESS" ) {
      slackSend color: "good", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was successful"
        }

	  else ( buildResult == "FAILURE" ) { 
	      slackSend color: "danger", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was failed"
	        }
		}
