def call(Map config = [:]) {
    sh "echo Hello ${config.name}. Company is ${config.comapanyname}."
}

def call(Map param = [:]) {
    sh "echo Hello ${param.name}. Company is ${param.comapanyname}."
}



