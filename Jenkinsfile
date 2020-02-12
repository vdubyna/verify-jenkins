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
                    nextRelease = sh(
                        returnStdout: true, 
                        script: "awk -F. '{print $1\".\"$2\".\"$3+1}' <<< `git branch -r --list origin/release/* --format=\"%(refname:lstrip=-1)\" | tail -1`"
                    )
                    echo "Next release: " + nextRelease
                }
            }
        }
    }
}
