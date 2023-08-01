def call() {
    env.APPTYPE="nodejs"
    node {
        try {
            common.codeCheckout()
            common.codeQuality()
            common.codeChecks()
            #common.artifacts()
            common.docker()

        } catch (Exception e) {
            mail bcc: '', body: "Build Failed ${RUN_DISPLAY_URL}", cc: '', from: 'sudddapalli@gmail.com', replyTo: '', subject: 'BUILD_FAILURE', to: 'sudddapalli@gmail.com'
        }

    }
}