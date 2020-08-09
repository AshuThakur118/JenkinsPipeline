pipeline {
    agent any
    tools {
        maven 'Maven3.6.3'
    }
    options {
         timestamps()
    }

    stages {
        stage("SCM Checkout") {
            steps{
               git url: 'https://github.com/AshuThakur118/JenkinsPipeline'
            }
        }
        stage("Build Code") {
            steps {
              sh "mvn clean install"
            }
         }
        stage("Test") {
            steps {
                sh 'mvn verify'
            }
        }
        stage("Deploy") {
            steps {
              sshagent(['tomcat_deploy']) {
                sh "scp -o StrictHostKeyChecking=no target/PipelineProject.war ubuntu@13.235.95.108:/home/ubuntu/opt/apache-tomcat-9.0.37/webapps"
              }
           } 
        } 
    }
}