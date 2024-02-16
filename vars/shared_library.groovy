def call(Map config = [:]) {
    sh "echo Hello ${config.name}. Company is ${config.comapanyname}."
}

def call(Map param = [:]) {
    sh "echo Address is  ${param.address}. city is ${param.city}."
}


