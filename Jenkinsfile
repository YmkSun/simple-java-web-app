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
				bat 'scp -p /target/simple-java-web-app-0.0.1-SNAPSHOT.war yemyokyaw@192.168.1.88:8080'
			}
		}
    }
}