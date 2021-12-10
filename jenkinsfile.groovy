pipeline {
    agent any
    stages {
        stage("A") {
            steps {
                println "Started stage A"
                script {
                    println '1st method'
                    10.times {print it % 2 == 0?it:''}
                    println ''
                    println '--------------------'
                    println '2nd method'
                    0.step(10, 2) { println it }
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
