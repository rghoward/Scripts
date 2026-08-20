package com.rhoward.hoots_and_reps

import com.google.android.gms.wearable.DataEvent
import com.google.android.gms.wearable.DataEventBuffer
import com.google.android.gms.wearable.DataMapItem
import com.google.android.gms.wearable.MessageEvent
import com.google.android.gms.wearable.WearableListenerService
import org.json.JSONObject

/** Small, persistent inbox for actions received while Flutter is not alive. */
object WatchActionInbox {
    private const val PREFS = "watch_workout_actions"
    private const val PENDING = "pending"
    private const val PROCESSED = "processed_action_ids"

    fun enqueue(context: android.content.Context, payload: String) {
        val prefs = context.getSharedPreferences(PREFS, android.content.Context.MODE_PRIVATE)
        val actionId = runCatching { JSONObject(payload).optString("actionId") }.getOrDefault("")
        val processed = prefs.getStringSet(PROCESSED, emptySet())?.toMutableSet() ?: mutableSetOf()
        if (actionId.isNotBlank() && !processed.add(actionId)) return
        val values = prefs.getStringSet(PENDING, emptySet())?.toMutableSet() ?: mutableSetOf()
        values.add(payload)
        // Bound the receipt list while retaining enough IDs to cover Data Layer
        // replays after a phone reconnect.
        while (processed.size > 128) processed.remove(processed.first())
        prefs.edit()
            .putStringSet(PENDING, values)
            .putStringSet(PROCESSED, processed)
            .apply()
    }

    fun drain(context: android.content.Context): List<String> {
        val prefs = context.getSharedPreferences(PREFS, android.content.Context.MODE_PRIVATE)
        val values = prefs.getStringSet(PENDING, emptySet())?.toList().orEmpty()
        prefs.edit().remove(PENDING).apply()
        return values
    }
}

/** Receives durable, idempotent workout actions created by the watch. */
class WearWorkoutListenerService : WearableListenerService() {
    override fun onMessageReceived(messageEvent: MessageEvent) {
        if (messageEvent.path != "/hoots/workout-action") return
        val payload = messageEvent.data.toString(Charsets.UTF_8)
        WatchActionInbox.enqueue(this, payload)
        WearWorkoutBridge.notifyActionsAvailable()
    }

    override fun onDataChanged(events: DataEventBuffer) {
        events.forEach { event ->
            if (event.type != DataEvent.TYPE_CHANGED) return@forEach
            val path = event.dataItem.uri.path ?: return@forEach
            if (!path.startsWith("/hoots/workout-actions/")) return@forEach
            val payload = DataMapItem.fromDataItem(event.dataItem)
                .dataMap
                .getString("payload")
                ?: return@forEach
            WatchActionInbox.enqueue(this, payload)
            WearWorkoutBridge.notifyActionsAvailable()
        }
    }
}
