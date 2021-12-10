pipeline {
    agent any
    stages {
        stage("A") {
            steps {
                println "Started stage A"
            }
        }
        stage("B") {
            steps {
                println "Started stage B"
            }
        }
    }
}
