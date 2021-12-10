pipeline {
    agent any
    stages {
        stage("A") {
            steps {
                echo "Started stage A"
            }
        }
    }
}
