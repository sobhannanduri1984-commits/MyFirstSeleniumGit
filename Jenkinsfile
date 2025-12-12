pipeline {
    agent any

    tools {
        maven "Maven3"     // Jenkins Maven installation name
        jdk "JDK21"        // Jenkins JDK installation name
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/sobhannanduri1984-commits/MyFirstSeleniumGit.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Run Tests') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Archive Reports') {
            steps {
                archiveArtifacts artifacts: '**/target/surefire-reports/*.xml', fingerprint: true
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }

    post {
        always {
            echo "Cleaning workspace..."
            cleanWs()
        }
    }
}
