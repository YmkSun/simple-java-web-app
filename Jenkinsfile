pipeline { 
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn -e install'
            }
        }
		stage('Deploy') {
            steps {
				sh 'pwd'
            }
        }
    }
}