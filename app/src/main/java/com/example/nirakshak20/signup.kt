package com.example.nirakshak20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        val clk = findViewById<Button>(R.id.createAccnt)
        clk.setOnClickListener(){
            val i = Intent(this,login::class.java)
            startActivity(i)
        }



    }
}