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
                sh 'java -cp "build:testng.jar" org.testng.TestNG testng.xml'
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
