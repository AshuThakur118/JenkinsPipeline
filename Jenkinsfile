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
               git 'https://github.com/AshuThakur118/JenkinsPipeline'
            }
        }
        stage("Compile-Package") {
            steps {
              bat "mvn -version"
              bat "mvn clean install"
              bat "mvn package"
            }
         }
      }
   post {
      always {
         cleanWs()
      }
   }
}