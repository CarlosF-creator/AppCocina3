package com.example.appcocina3

open class Usuario(idUsuario: Int, nombre: String, email: String, pass: String) {
    val idUsuario:Int=idUsuario
    var nombre:String=nombre
    val email:String=email
    var pass:String=pass


    //Comprobamos si el usuario ingresado esta correcto
    open fun comprobarUsuario(us: String,pass: String,usuarios:ArrayList<Usuario>): Boolean {
        for (x:Usuario in usuarios){
            if((x.nombre==  us && x.pass == pass) || (x.email == us && x.pass == pass)){
                return true
            }
        }
        return false
    }
}