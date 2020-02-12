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
                    script: 'git branch -r --list origin/release/* | tail -1'
                    )

                    releaseParts = lastRelease.split("\\/")
                    currentRelease = ​releaseParts[2]
                    ​currentReleaseParts = ​currentRelease.split("\\.")

                    nextPatch = currentReleaseParts[2] as Integer
                    nextPatch++
                    nextMajor = ​currentReleaseParts[0]
                    nextMinor = ​currentReleaseParts[1]
                    echo nextMajor+"."​+nextMinor+"."+nextPatch
                }
            }
        }
    }
}
