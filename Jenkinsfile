pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                // Define build steps here
                sh 'javac -d build src/*.java'
            }
        }
        
        stage('Test') {
            steps {
                // Define test steps here
                sh 'echo "Testing..."'
            }
        }
        
        stage('Deploy') {
            steps {
                // Define deploy steps here
                sh 'echo "Deploying..."'
            }
        }
    }
}
