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

                    lastRelease = sh 'git branch -r --list origin/release/* | tail -1'
                    echo newRelease(lastRelease)

                }
            }
        }
    }
}

def newRelease(String lastRelease) {

    releaseParts = lastRelease.split("\\/")
    currentRelease = ​releaseParts[2]
    ​currentReleaseParts = ​currentRelease.split("\\.")
    nextPatch = currentReleaseParts[2] as Integer
    nextPatch++
    nextPatchString = nextPatch as String
    nextMajor = ​currentReleaseParts[0]
    nextMinor = ​currentReleaseParts[0]
    return  nextMajor+"."​+nextMinor+"."+nextPatchString
}
