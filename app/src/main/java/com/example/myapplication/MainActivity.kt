package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.iid.FirebaseInstanceId

class MainActivity : AppCompatActivity() {

    lateinit var btnSend: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSend = findViewById(R.id.button_send_notification)
        btnSend.setOnClickListener {
            this.showNotification("1234", "Bootcamp Android", "Kotlin Android")

        }

        println("token do firebaseee" + FirebaseInstanceId.getInstance().token.toString())


    }
}