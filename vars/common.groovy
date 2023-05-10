def codeQuality() {
    stage('Code Quality') {
        echo 'Code Quality'
    }
}

def codeChecks() {
    if ( BRANCH_NAME == "main" || TAG_NAME ==~ ".*") {
        stage('Style Checks') {
            echo 'Style Checks'
        }
        stage('Unit Tests') {
            echo 'Unit Tests'
        }

    }
}

def artifacts() {
    if ( TAG_NAME ==~ ".*") {
        stage('Download Dependancies') {
            echo 'Download Dependancies'
        }
        stage('Prepare Artifacts') {
            echo 'Prepare Artifacts'
        }
        stage('Publish Artifacts') {
            echo 'Publish Artifacts'
        }

    }
}


