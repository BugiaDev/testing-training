package com.bugiadev.testing_training

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var btnLogin: Button
    private lateinit var btnLogout: Button
    private lateinit var layout: LinearLayout
    private lateinit var edtUsername: EditText
    private lateinit var edtPassword: EditText

    private lateinit var presenter: AuthenticationPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin = findViewById(R.id.btnLogin)
        btnLogout = findViewById(R.id.btnLogout)
        edtPassword = findViewById(R.id.edtPassword)
        edtUsername = findViewById(R.id.edtUsername)
        layout = findViewById(R.id.layoutLogin)

        btnLogin.setOnClickListener {
            val username = edtUsername.text.toString()
            val password = edtPassword.text.toString()

            if(username.equals("galicia") && password.equals("llueve")) {
                layout.visibility = View.GONE
                btnLogout.visibility = View.VISIBLE
            } else {
                Toast.makeText(this, "mal", Toast.LENGTH_SHORT).show()
            }
        }

        btnLogout.setOnClickListener{
            val seconds = System.currentTimeMillis()/1000

            if((seconds % 2).toInt() == 0) {
                layout.visibility = View.VISIBLE
                btnLogout.visibility = View.GONE
            } else {
                Toast.makeText(this, "segundos impares", Toast.LENGTH_SHORT).show()
            }
        }
    }

}
