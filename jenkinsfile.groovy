pipeline {
    agent any
    stages {
        stage("A") {
            steps {
                println "Started stage A"
                script {
                    println '1st method'
                    100.times {print it % 2 != 0?it:''}
                    println ''
                    println '--------------------'
                    
                }
            }
        }
        stage("B") {
            steps {
                println "Started stage B"
            }
        }
    }
}
