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
				bat 'pscp -i C:/Users/"Ye Myo Kyaw"/.ssh/id_rsa C:/Windows/System32/config/systemprofile/.jenkins/workspace/simple-multi-pipeline/simple-java-web-app/target/simple-java-web-app-0.0.1-SNAPSHOT.war azlabs@192.168.1.176:/home/azlabs/jtest-tmp'
			}
		}
    }
}