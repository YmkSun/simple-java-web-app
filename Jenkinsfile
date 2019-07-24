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
				bat 'ssh -tt azlabs@192.168.1.176'
				bat 'scp \\target\\simple-java-web-app-0.0.1-SNAPSHOT.war azlabs@192.168.1.176:/home/azlabs/jtest-tmp'
			}
		}
    }
}