package com.example.safegear

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val tvGoRegistrarUsuario = findViewById<TextView>(R.id.tv_registrar_usuario)
        tvGoRegistrarUsuario.setOnClickListener{
            goRegistarUsuario()
        }

        val btnGoHomeUsuario = findViewById<TextView>(R.id.btn_login_iniciar_sesion)
        btnGoHomeUsuario.setOnClickListener{
            goHomeUsuario()
        }

    }

    private fun goRegistarUsuario(){
        val i= Intent(this,RegistroUsuario::class.java)
        startActivity(i)
    }

    private fun goHomeUsuario(){
        val i= Intent(this,HomeUsuario::class.java)
        startActivity(i)
    }
}