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
				bat 'ssh azlabs@192.168.1.176'
				bat 'C:\\Windows\\System32\\config\\systemprofile\\.jenkins\\workspace\\jenkins-multiple-test\\simple-java-web-app\\jenkins\\deploy.bat'
            }
        }
    }
}