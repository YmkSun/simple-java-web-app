pipeline { 
    agent any
    stages {
        stage('Build') {
            steps {
                bat 'mvn -B -DskipTests clean package' 
            }
        }
        stage('Deliver') {
            steps {
                bat 'mvn install'
            }
        }
    }
}