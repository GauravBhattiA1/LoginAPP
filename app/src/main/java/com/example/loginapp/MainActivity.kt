package com.example.loginapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var usernameInput : EditText
    lateinit var passwordInput : EditText
    lateinit var loginBtn : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        usernameInput = findViewById<EditText>(R.id.username_input)
        passwordInput = findViewById<EditText>(R.id.password_input)
        loginBtn = findViewById<Button>(R.id.login_btn)

        loginBtn.setOnClickListener{

            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()
            Log.i("Test Credentials" , "Username : $username and password : $password ")

        }

        }
    }