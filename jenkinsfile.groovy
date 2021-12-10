pipeline {
    agent any
    stages {
        stage("A") {
            steps {
                println "Started stage A"
            }
        }
    }
}
