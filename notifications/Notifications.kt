package com.example.wird3

import android.annotation.SuppressLint
import android.app.Notification
import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.core.app.NotificationCompat

val notificationID =1
val channelID = "channel1"
val titlex= "Ntification"
val message = "Helllo"

class Notifications : BroadcastReceiver() {

    @SuppressLint("SuspiciousIndentation")
    override fun onReceive(context: Context?, intent: Intent?)
    {
        val notification = context?.let {
            NotificationCompat.Builder(it, channelID)
                .setSmallIcon(R.drawable.msbaha)
                .setContentTitle(intent?.getStringExtra(titlex))
                .setContentText(intent?.getStringExtra(message))
                .build()
        }
        val manager = context?.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            manager.notify(notificationID , notification)

    }


}