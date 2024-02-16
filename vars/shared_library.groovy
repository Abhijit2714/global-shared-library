def Call(Map config = [:]) {
    sh "echo Hello ${config.name}. Company is ${config.companyname}."
}

// def Call(Map param = [:]) {
//     sh "echo Hello ${param.address}. Company is ${param.city}."
// }



