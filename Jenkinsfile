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

                    def lastRelease = sh(
                        returnStdout: true,
                        script:'git branch -r --list origin/release/* | tail -1'
                    )
                    def currentRelease = lastRelease.split("\\/")[2]
                    def releaseParts = currentRelease.split("\\.")
                    def nextReleaseMinor = releaseParts[2] as Integer
                    echo releaseParts[0] + "." + releaseParts[1] + "." + newReleaseMinor++

                }
            }
        }
    }
}
