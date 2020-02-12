pipeline {
    agent any
    parameters {
        choice(name: 'environment', choices: ['development', 'uat', 'stage', 'integration', 'qa', 'production'], description: 'Deployment environment')
    }
    stages {
        stage('load libraries') {
            steps {
                script {
                    echo "Hello world"
                }
            }
        }
    }
}
