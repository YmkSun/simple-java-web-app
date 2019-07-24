pipeline { 
    agent any
    stages {
        stage('Clean') {
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
        stage('Build') {
            steps {
                sh 'mvn install'
            }
        }
		stage('Deploy') {
            steps {
				sh 'pwd'
            }
        }
    }
}