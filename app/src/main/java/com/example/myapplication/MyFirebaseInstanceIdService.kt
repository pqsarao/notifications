package com.example.myapplication

import android.content.ContentValues.TAG
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService

class MyFirebaseInstanceIdService : FirebaseMessagingService() {

    override fun onNewToken(token: String) {
        Log.i(TAG, "Refreshed token: $token")
    }
}