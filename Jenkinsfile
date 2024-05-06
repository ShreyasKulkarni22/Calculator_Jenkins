node {
    stage('Build') {
        // Compile the Java code
        sh 'javac -d build src/*.java'
    }
    
    stage('Test') {
        // Run TestNG tests
        sh 'java -cp "build:testng.jar" org.testng.TestNG testng.xml'
    }
}
