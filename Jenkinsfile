pipeline {
    /* The environment specifies the credentials required to push my image to dockerhub */
    environment {
        registry = "pratikiiitb/scientific-calculator"
        registryCredential = 'dockerhub'
        dockerImage = ''
    }
  
    agent any

    stages {
        stage('Git') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'main', url: 'https://github.com/WidoutSyntax/Scientific-Calculator-with-Devops.git'
            }
        }
        
        stage('Build maven') {
            steps {
                // Compile and package code without unit testing.
                sh "mvn -B -DskipTests clean package"
            }
        }
        
        stage('Test') {
            steps {
                // Unit testing on compiled source code.
                sh "mvn test"
            }
        }
        
        stage('Building docker image') {
            steps{
                script {
                    dockerImage = docker.build registry + ":latest"
                }
            }
        }
        
        stage('Push docker image to dockerhub') {
            steps{
                script {
                    docker.withRegistry( '', registryCredential ) {
                    dockerImage.push()
                    }
                }
            }
        }
        
        stage('Deploy on Node') {
            steps {
                script {
                    step([
                        $class: "RundeckNotifier",
                        includeRundeckLogs: true,
                        rundeckInstance: "scientific-calculator",
                        jobId: "79181c66-def5-4019-b387-dc62ca2e881c",
                        shouldWaitForRundeckJob: true,
                        shouldFailTheBuild: true,
                        tailLog: true
                    ])
                }
            }
        }

    }
}

