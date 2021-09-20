package com.example.appcocina3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
var login :Boolean = false
class MainActivity : AppCompatActivity() , View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (login){
            setContentView(R.layout.activity_main)
        }
        else {
            setContentView(R.layout.login)
            var btnRegister = findViewById<Button>(R.id.button_register)
            btnRegister!!.setOnClickListener(this)
        }
    }

    override fun onClick(p0: View?) {
        setContentView(R.layout.register)
    }


}