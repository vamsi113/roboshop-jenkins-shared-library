def call() {
    pipeline {
        agent any
        stages {
            stage('Compile Code') {
                steps {
                    echo 'Compile Code'
                }
            }

            common.codeQuality()

            stage('Style Checks') {
                when {
                    anyOf{
                        branch "main"
                        tag "*"
                    }
                }
                steps {
                    echo 'Style Checks'
                }
            }
            stage('Unit Tests') {
                when {
                    anyOf{
                        branch "main"
                        tag "*"
                    }
                }
                steps {
                    echo 'Unit Tests'
                }
            }
            stage('Build  Package') {
                when { tag "*"}
                steps {
                    echo 'Download Dependancies'
                }
            }
            stage('Prepare Artifacts') {
                when { tag "*"}
                steps {
                    echo 'Prepare Artifacts'
                }
            }
            stage('Publish Artifacts') {
                when { tag "*"}
                steps {
                    echo 'Publish Artifacts'
                }
            }
        }
    }
}