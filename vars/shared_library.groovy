def Call(Map config = [:]) {
    sh "echo Hello ${config.name}. Company is ${config.comapanyname}."
}

// def Call(Map param = [:]) {
//     sh "echo Hello ${param.address}. Company is ${param.city}."
// }



