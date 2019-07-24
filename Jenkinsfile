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
                bat 'mvn -e install'
            }
        }
		stage('Deploy') {
            steps {
				bat 'pwd'
            }
        }
    }
}