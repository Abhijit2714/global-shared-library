def call(Map config = [:]) {
    sh "echo Hello ${config.name}. Company is ${config.companyname}."
}

def warning(message) {
    echo "WARNING: ${message}"
}



