Map modules = [:]
pipeline {
    agent any
    stages {
        stage('test') {
            steps {
                script{
                    modules.second = load "dev/second.groovy"
                    modules.second.test1()
                    modules.second.test2()
                }
            }
        }
    }
}
