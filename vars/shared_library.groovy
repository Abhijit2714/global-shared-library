def call(Map config = [:]) {
    sh "echo Hello ${config.name}. Company is ${config.comapanyname}."
}

def getadd(Map param = [:]) {
    sh "echo Hello ${param.address}. Company is ${param.city}."
}



