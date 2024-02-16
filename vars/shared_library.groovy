def call(Map config = [:]) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
    echo "Application Name: ${config.application}"
    echo "Application Version: ${config.version}"
}
