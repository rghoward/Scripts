package com.rhoward.hoots_and_reps.wear

import android.content.Context
import android.content.Intent
import com.google.android.gms.wearable.DataEvent
import com.google.android.gms.wearable.DataEventBuffer
import com.google.android.gms.wearable.DataMapItem
import com.google.android.gms.wearable.WearableListenerService

object WatchSessionStore {
    const val ACTION_CHANGED = "com.rhoward.hoots_and_reps.wear.SESSION_CHANGED"
    private const val PREFS = "watch_workout"
    private const val PAYLOAD = "session_payload"

    fun read(context: Context): String? =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getString(PAYLOAD, null)

    fun write(context: Context, payload: String) {
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .edit().putString(PAYLOAD, payload).apply()
    }
}

/** Persists the phone-owned workout envelope before waking the watch UI. */
class WatchSessionListenerService : WearableListenerService() {
    override fun onDataChanged(events: DataEventBuffer) {
        events.forEach { event ->
            if (event.type != DataEvent.TYPE_CHANGED ||
                event.dataItem.uri.path != "/hoots/workout-session"
            ) return@forEach
            val payload = DataMapItem.fromDataItem(event.dataItem)
                .dataMap.getString("payload") ?: return@forEach
            WatchSessionStore.write(this, payload)
            sendBroadcast(Intent(WatchSessionStore.ACTION_CHANGED).setPackage(packageName))
        }
    }
}
