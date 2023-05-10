def call() {

    node {
        sh 'env'
        common.codeQuality()

        if ( BRANCH_NAME == "main" || tag ==~ ".*") {
            stage('Style Checks') {
                echo 'Style Checks'
            }
        }


    }



//    pipeline {
//        agent any
//        stages {
//

//

//                when {
//                    anyOf{
//                        branch "main"
//                        tag "*"
//                    }
//                }
//                steps {
//                    echo 'Style Checks'
//                }
//            }
//            stage('Unit Tests') {
//                when {
//                    anyOf{
//                        branch "main"
//                        tag "*"
//                    }
//                }
//                steps {
//                    echo 'Unit Tests'
//                }
//            }
//            stage('Download Dependancies') {
//                when { tag "*"}
//                steps {
//                    echo 'Download Dependancies'
//                }
//            }
//            stage('Prepare Artifacts') {
//                when { tag "*"}
//                steps {
//                    echo 'Prepare Artifacts'
//                }
//            }
//            stage('Publish Artifacts') {
//                when { tag "*"}
//                steps {
//                    echo 'Publish Artifacts'
//                }
//            }
//        }
//    }
}