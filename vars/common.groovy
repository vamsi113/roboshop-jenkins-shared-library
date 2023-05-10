def codeQuality() {
    stage('Code Quality') {
        withCredentials([usernamePassword(credentialsId: 'SONAR', passwordVariable: 'sonarPass', usernameVariable: 'sonarUser')]) {
            sh '''
            sonar-scanner -Dsonar.host.url=http://172.31.15.159:9000 -Dsonar.login=${sonarUser} -Dsonar.password=${sonarPass} -Dsonar.projectKey=${COMPONENT}
       '''
        }
    }
}

def codeChecks() {
    if ( env.BRANCH_NAME == "main" || env.TAG_NAME ==~ ".*") {
        stage('Style Checks') {
            echo 'Style Checks'
        }
        stage('Unit Tests') {
            echo 'Unit Tests'
        }

    }
}

def artifacts() {
    if ( env.TAG_NAME ==~ ".*") {
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


