def call() {
    node {

        sh 'env'
        common.codeQuality()
        common.codeChecks()
        common.artifacts()

    }
}