package com.example.appcocina3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
var login :Boolean = false
var usuarios : ArrayList<Usuario> = ArrayList<Usuario>()
class MainActivity : AppCompatActivity() , View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (login){
            setContentView(R.layout.activity_main)
        }
        else {
            setContentView(R.layout.login)
            //var btnRegister = findViewById<Button>(R.id.button_register)
            //btnRegister!!.setOnClickListener(this)

        }
    }
    private fun setup(){
        var btnRegister = findViewById<Button>(R.id.button_crearCuenta)
        var email = findViewById<EditText>(R.id.edt_email)
        var usuario = findViewById<EditText>(R.id.edt_usuario)
        var pass1 = findViewById<EditText>(R.id.edt_pass)
        var pass2 = findViewById<EditText>(R.id.edt_pass2)
        title = "Autenticacion"

        btnRegister.setOnClickListener{
            if(email.text.isNotEmpty() && usuario.text.isNotEmpty() && pass1.text.isNotEmpty() && pass2.text.isNotEmpty()){
                if (pass1.text == pass2.text){
                    Toast.makeText(getApplicationContext(),"Compruebe si su contraseña esta correcta", Toast.LENGTH_SHORT).show()
                }
                //FirebaseAuth
            }
            else{}
        }






    }

    // Funciones Login
    override fun onClick(p0: View?) {
        setContentView(R.layout.register)
    }

    fun botonLogin(p0: View?){
        var usuario = findViewById<EditText>(R.id.edt_usuario)
        var contraseña = findViewById<EditText>(R.id.edt_pass)
        //if(Usuario.comprobarUsuario(usuario.text, contraseña.text))
            

        setContentView(R.layout.activity_main)
    }

}