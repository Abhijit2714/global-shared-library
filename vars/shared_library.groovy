def call(Map config = [:]) {
    sh "echo Hello ${config.name}. Company is ${config.comapanyname}."
}

def call(Map config = [:]) {
    sh "echo Address is  ${config.address}. city is ${config.city}."
}


