Map modules = [:]
modules.second = load "dev/second.groovy"
pipeline {
    agent any
    stages {
        stage('test') {
            steps {
                script{
                    modules.second.test1()
                    modules.second.test2()
                }
            }
        }
    }
}
