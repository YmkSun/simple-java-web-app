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
		stage('Deliver') {
			steps {
				bat 'cp -Rp /target/simple-java-web-app-0.0.1-SNAPSHOT.war C:/workspace/temp'
			}
		}
    }
}