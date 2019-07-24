pipeline { 
    agent any
    stages {
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