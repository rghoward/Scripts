package com.rhoward.hoots_and_reps.wear

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.Service
import android.content.Intent
import android.os.IBinder

/** Keeps a Hoots exercise visibly active when the watch screen sleeps. */
class WorkoutForegroundService : Service() {
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val manager = getSystemService(NotificationManager::class.java)
        val channel = NotificationChannel(
            CHANNEL_ID,
            "Active Hoots workout",
            NotificationManager.IMPORTANCE_LOW,
        )
        manager.createNotificationChannel(channel)
        val openWorkout = PendingIntent.getActivity(
            this,
            0,
            Intent(this, WearWorkoutActivity::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP or Intent.FLAG_ACTIVITY_CLEAR_TOP)
            },
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE,
        )
        val notification = android.app.Notification.Builder(this, CHANNEL_ID)
            .setSmallIcon(android.R.drawable.ic_media_play)
            .setContentTitle("Hoots & Reps workout")
            .setContentText("Workout timer and heart rate are active")
            .setContentIntent(openWorkout)
            .setOngoing(true)
            .build()
        startForeground(NOTIFICATION_ID, notification)
        // Health Services owns the exercise, but a sticky service gives the
        // athlete a reliable route back to the live workout if Wear OS needs
        // to recreate the visible activity.
        return START_STICKY
    }

    override fun onBind(intent: Intent?): IBinder? = null

    companion object {
        const val CHANNEL_ID = "hoots_active_workout"
        const val NOTIFICATION_ID = 41
    }
}
