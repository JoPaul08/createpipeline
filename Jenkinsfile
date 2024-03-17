pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Check out the code from your Git repository
                git 'https://github.com/JoPaul08/createpipeline.git'
            }
        }

        stage('Build Maven Project') {
            steps {
                // Build the Maven project
                sh 'mvn clean package'
            }
        }

        stage('Code Coverage') {
            steps {

            }
        }

        stage('Docker Build') {
            steps {
                // Build the Docker image
                script {
                    docker.build('my-image')
                }
            }
        }
         environment {
                DOCKERHUB_CREDENTIALS = credentials('15322ae3-fb52-4aa3-b2a7-5948dfa0f9cf')
                DOCKERHUB_USERNAME = 'jbpaul'
                IMAGE_TAG = 'my-image'
            }

        stage('Docker Login') {
            steps {
                // Log in to Docker Hub
                script {
                    docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-credentials') {
                        docker.build("${DOCKERHUB_USERNAME}/my-image:${IMAGE_TAG}")
                        docker.push("${DOCKERHUB_USERNAME}/my-image:${IMAGE_TAG}")
                    }
                }
            }
        }

        stage('Docker Push') {
            steps {
                // Push the Docker image to Docker Hub
                script {
                    docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-credentials') {
                        docker.image('my-image').push('latest')
                    }
                }
            }
        }
    }
}