def call() {
    node {
        if (! env.TAG_NAME) {
            env.TAG_NAME = ""
        }

        sh 'env'
        common.codeQuality()
        common.codeChecks()
        common.artifacts()

    }
}