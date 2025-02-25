pipeline {
    agent any

    environment {
        DOCKER_IMAGE = "himanshuraw/scientific-calculator:latest"
        DOCKER_HUB_CREDENTIALS = "714e94e2-85a4-438d-a0be-3733132555a0"
    }
    stages {
        stage('Build & Test'){
            steps{
                sh 'mvn clean install'
                sh 'mvn test'
            }
        }

        stage('Docker Build'){
            steps{
                sh 'docker build -t $DOCKER_IMAGE .'
            }
        }
    }
    post{
        failure{
            mail (
                to: 'Himanshu.Rawat@iiitb.ac.in',
                subject: "Build Failed: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: "Check Jenkins logs: ${env.BUILD_URL}"
            )
        }
    }
}