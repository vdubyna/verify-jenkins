Map modules = [:]
pipeline {
    agent any
    parameters {
        choice(name: 'environment', choices: ['development', 'uat', 'stage', 'integration', 'qa', 'production'], description: 'Deployment environment')
    }
    stages {
        stage('load libraries') {
            steps {
                script {
                    modules.second = load "dev/second.groovy"
                    modules.first = load "dev/first.groovy"
                }
            }
        }
        stage('test') {
            steps {
                script {
                    modules.second.test1(modules)
                    modules.second.test2(modules)
                }
            }
        }
    }
}
