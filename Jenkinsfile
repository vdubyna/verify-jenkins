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

//                     lastRelease = sh(
//                         script: 'git branch -r --list origin/release/* | tail -1',
//                         returnStdout: true
//                     ).trim()


                    lastRelease = "origin/release/1.0.1"
                    echo lastRelease

                }
            }
        }
    }
}

def lastRelease(lastRelease) {

    releaseParts = lastRelease.split("\\/")
    currentRelease = ​releaseParts[2]
    ​currentReleaseParts = ​currentRelease.split("\\.")

    nextPatch = currentReleaseParts[2] as Integer
    nextPatch++
    nextMajor = ​currentReleaseParts[0]
    nextMinor = ​currentReleaseParts[1]
    return nextMajor+"."​+nextMinor+"."+nextPatch
}
