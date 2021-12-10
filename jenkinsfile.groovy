pipeline {
    agent any
    stages {
        stage("A") {
            steps {
                println "Started stage A"
                script {
                  (1..20).findAll{it in ODD}
                  (1..20).each{
                    switch(it) {
                      case EVEN:
                        println "${it} is even"
                        break
                      case ODD:
                        println "${it} is odd"
                        break
                      default:
                        println "${it} is a mystery to me"
                    }
                  }
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
