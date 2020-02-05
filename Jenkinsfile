Map modules = [:]
pipeline {
    agent any
    stages {
        stage('load libraries') {
            steps {
                script {
                    modules.second = load "dev/second.groovy"
                }
            }
        }
        stage('test') {
            steps {
                script {
                    modules.second.test1()
                    modules.second.test2()
                }
            }
        }
    }
}
