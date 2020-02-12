pipeline {
    agent any
    stages {
        stage('load libraries') {
            steps {
                script {
                    echo "Hello world"
                }
            }
        }
        stage('Generate release') {
            steps {
                script {

                    lastRelease = sh(
                        returnStdout: true,
                        script:'git branch -r --list origin/release/* | tail -1'
                    )
                    echo lastRelease.split("\\/")[0]
                    echo lastRelease.split("\\/")[1]
                    echo lastRelease.split("\\/")[2]

                    echo lastRelease.split("\\.")[0]
                    echo lastRelease.split("\\.")[1]
                    echo lastRelease.split("\\.")[2]
                    newRelease = lastRelease.split("\\.")[2]+1
                    echo lastRelease.split("\\.")[0] + "." + lastRelease.split("\\.")[1] + "." + newRelease

                }
            }
        }
    }
}
