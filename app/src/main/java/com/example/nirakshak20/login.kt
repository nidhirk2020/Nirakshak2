package com.example.nirakshak20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        val clk=findViewById<TextView>(R.id.signupbtn)
        clk.setOnClickListener(){
            val intent = Intent(this,signup::class.java)
            startActivity(intent)
        }
    }
}