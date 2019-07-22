pipeline { 
    agent any
    stages {
        stage('Clean') {
            steps {
                bat 'mvn -B -DskipTests clean package' 
            }
        }
        stage('Build') {
            steps {
                bat 'mvn install'
            }
        }
		stage('Deploy') {
            steps {
                bat 'copy c\\Windows\\System32\\config\\systemprofile\\.jenkins\\workspace\\jenkins-multiple-test\\simple-java-web-app\\target\\simple-java-web-app-0.0.1-SNAPSHOT.war c\\workspace\\temp'
            }
        }
    }
}