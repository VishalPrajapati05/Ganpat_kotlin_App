package com.example.ganpat_kotlin_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    var emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
    lateinit var userName : EditText
    lateinit var password : EditText
    lateinit var btnLogin : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        userName = findViewById(R.id.username)
        password = findViewById(R.id.password)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {

             if (userName.text.toString().trim().equals("",ignoreCase = true)) {
                 userName.setError("UserName Required")
             } else if (!userName.text.toString().matches(Regex(emailPattern))) {
                 userName.setError("Valid Email Required")
             } else if(password.text.toString().trim().equals("",ignoreCase = true)) {
                 password.setError("Password Required")
             } else {
                 var intent = Intent(this, ViewDataActivity::class.java)
                 intent.putExtra(ConstantUtils.EMAIL, userName.text.toString())
                 intent.putExtra(ConstantUtils.PASSWORD, password.text.toString())
                 startActivity(intent)


                 Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show()
             }
        }

    }
}