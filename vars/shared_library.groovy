def call(Map config = [:]) {
    sh "echo Hello ${config.name}. Company is ${config.companyname}."
}

def Call(Map param = [:]) {
    sh "echo address is ${param.address}. city is ${param.city}."
}



