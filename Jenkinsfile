pipeline {
    agent any

    tools{ 
        maven "maven3.9.6"
    }

    stages {
    
        stage('clean') {
            steps {
                echo 'Started'
                bat 'mvn clean'
            }
        }
    
        
        stage('compile') {
            steps {
                echo 'compile'
                bat 'mvn compile'
            }
        }
        
        
        stage('test') {
            steps {
                echo 'Test'
                bat 'mvn test'
            }
        }

        
        stage('package') {
            steps {
                echo 'Packaging'
                bat 'mvn package -DskipTests'
            }
        }
    }
    
}