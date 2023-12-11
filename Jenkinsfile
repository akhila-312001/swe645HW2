pipeline {
    agent any
    environment {
        PROJECT_ID = 'rancher'
        CLUSTER_NAME = 'rancher'
        LOCATION = 'us-east-1a'
        DOCKERHUB_PASS = 'akhpngubuntu'
    }
    stages {
        stage("Checkout code") {
            steps {
                checkout scm
            }
        }
        stage('BuildJAR') {
            steps {
                echo 'Building the JAR ...'
                sh 'java -version'
                sh 'cp target/HW3-0.0.1-SNAPSHOT.jar .'  
                sh 'docker login -u akhpng31 -p ${DOCKERHUB_PASS}'
                sh 'docker build -t akhpng31/survey4 .'
            }
        }
        stage("Pushing image to docker") {
            steps {
                script {
                    sh 'docker push akhpng31/survey4'
                }
            }
        }
        stage("UpdateDeployment") {
            steps {
                sh 'kubectl rollout restart deploy deployment1'
            }
        }
    }
}
