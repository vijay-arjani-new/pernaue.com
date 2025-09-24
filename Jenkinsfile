pipeline {
    agent any

    stages {
        stage('Compile and Clean') {
            steps {
                sh "mvn clean compile"
            }
        }

        stage('Deploy') {
            steps {
                sh "mvn package"
            }
        }

        stage('Build Docker image') {
            steps {
                sh "docker build -t vijayarjani/pernaue-repo:${BUILD_NUMBER} ."
            }
        }

        stage('Docker Login') {
            steps {
                withCredentials([string(credentialsId: 'DockerId', variable: 'Dockerpwd')]) {
                    sh "docker login -u vijayarjani -p ${Dockerpwd}"
                }
            }
        }

        stage('Docker Push') {
            steps {
                sh "docker push vijayarjani/pernaue-repo:${BUILD_NUMBER}"
            }
        }

        stage('Docker Deploy') {
            steps {
                sh "docker run -itd -p 8081:8080 anvbhaskar/docker_jenkins_springboot:${BUILD_NUMBER}"
            }
        }

        stage('Archiving') {
            steps {
                archiveArtifacts '**/target/*.jar'
            }
        }
    }
}