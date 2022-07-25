package com.example.ganpat_kotlin_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlin.math.log

class ViewDataActivity : AppCompatActivity() {
     var TAG= "ViewDataActivity"
    lateinit var username : TextView
    lateinit var tvvpassword : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_data)
        username= findViewById(R.id.tvEmailData)
        tvvpassword= findViewById(R.id.tvPasswordData)
        intent.let {

            val email = intent.getStringExtra(ConstantUtils.EMAIL)
            val password = intent.getStringExtra(ConstantUtils.PASSWORD)
            Log.e(TAG,"$email  $password")

            username.text=email
            tvvpassword.text=password
        }
    }
}