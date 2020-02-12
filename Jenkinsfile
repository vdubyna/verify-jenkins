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

                    sh '''
                    awk -F. \\"{print \\$1\\\\".\\\\"\\$2\\\\".\\\\"\\$3+1}\\" <<< 1.0.1
                    '''
                }
            }
        }
    }
}


// node {
//     echo 'Results included as an inline comment exactly how they are returned as of Jenkins 2.121, with $BUILD_NUMBER = 1'
//     echo 'No quotes, pipeline command in single quotes'
//     sh 'echo $BUILD_NUMBER' // 1
//
//     echo 'Double quotes are silently dropped'
//     sh 'echo "$BUILD_NUMBER"' // 1
//
//     echo 'Even escaped with a single backslash they are dropped'
//     sh 'echo \"$BUILD_NUMBER\"' // 1
//
//     echo 'Using two backslashes, the quotes are preserved'
//     sh 'echo \\"$BUILD_NUMBER\\"' // "1"
//
//     echo 'Using three backslashes still results in only preserving the quotes'
//     sh 'echo \\\"$BUILD_NUMBER\\\"' // "1"
//
//     echo 'To end up with \" use \\\\\\" (yes, six backslashes)'
//     sh 'echo \\\\\\"$BUILD_NUMBER\\\\\\"'
//
//     echo 'This is fine and all, but we cannot substitute Jenkins variables in single quote strings'
//     def foo = 'bar'
//     sh 'echo "${foo}"' // (returns nothing)
//
//     echo 'This does not interpolate the string but instead tries to look up "foo" on the command line, so use double quotes'
//     sh "echo \"${foo}\"" // bar
//
//     echo 'Great, more escaping is needed now. How about just concatenate the strings? Well that gets kind of ugly'
//     sh 'echo \\\\\\"' + foo + '\\\\\\"' // \"bar\"
//
//     echo 'We still needed all of that escaping and mixing concatenation is hideous!'
//     echo 'There must be a better way, enter dollar slashy strings (actual term)'
//     def command = $/echo \\\"${foo}\\\"/$
//     sh command // \"bar\"
//
//     echo 'String interpolation works out of the box as well as environment variables, escaped with double dollars'
//     def vash = $/echo \\\"$$BUILD_NUMBER\\\" ${foo}/$
//     sh vash // \"3\" bar
//     echo 'It still requires escaping the escape but that is just bash being bash at that point'
//     echo 'Slashy strings are the closest to raw shell input with Jenkins, although the non dollar variant seems to give an error but the dollar slash works fine'
// }
