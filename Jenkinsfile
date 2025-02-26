pipeline {
    agent any

    environment {
        DOCKER_IMAGE = "himanshuraw/scientific-calculator:latest"
        DOCKER_HUB_CREDENTIALS = "dockerhub-credentials"
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
                   script{
                       docker.build("${DOCKER_IMAGE}", '.')
                   }
            }
        }

        stage('Docker Push'){
            steps{
                script {
                    docker.withRegistry('',  DOCKER_HUB_CREDENTIALS){
                        sh "docker tag ${DOCKER_IMAGE} ${DOCKER_IMAGE}"
                        sh "docker push ${DOCKER_IMAGE}"
                    }
                }
            }
        }

        stage('Deploy with Ansible'){
            steps{
                script{
                    withEnv(["ANSIBLE_HOST_KEY_CHECKING=False"]){
                        ansiblePlaybook(
                            playbook: 'deploy.yml',
                            inventory: 'inventory.ini',
                            credentials: 'ansible-ssh'
                        )
                    }
                }
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