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
                script {newReleaseMinor

                    lastRelease = sh(
                        returnStdout: true,
                        script:'git branch -r --list origin/release/* | tail -1'
                    )

                    releaseParts = lastRelease.split("\\/")

                    currentRelease = ​releaseParts[2]
                    ​currentReleaseParts = ​currentRelease.split("\\.")
                    nextPatch = currentReleaseParts[2] as Integer
                    nextPatch++
                    nextRelease = ​currentReleaseParts[0] +"."​+currentReleaseParts[1] +"."+nextPatch
                    ​
                    echo ​nextRelease

                }
            }
        }
    }
}
