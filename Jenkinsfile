pipeline {
    agent any

    stages {
        stage('Build & Test'){
            steps{
                sh 'mvn clean install'
                sh 'mvn test'
            }
        }
    }
    post{
        failure{
            mail
                to: 'Himanshu.Rawat@iiitb.ac.in',
                subject: "Build Failed: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: "Check Jenkins logs: ${env.BUILD_URL}"
        }
    }
}