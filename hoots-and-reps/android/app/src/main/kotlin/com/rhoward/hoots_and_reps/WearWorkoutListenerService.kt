package com.rhoward.hoots_and_reps

import com.google.android.gms.wearable.DataEvent
import com.google.android.gms.wearable.DataEventBuffer
import com.google.android.gms.wearable.DataMapItem
import com.google.android.gms.wearable.MessageEvent
import com.google.android.gms.wearable.WearableListenerService

/** Receives durable, idempotent workout actions created by the watch. */
class WearWorkoutListenerService : WearableListenerService() {
    override fun onMessageReceived(messageEvent: MessageEvent) {
        if (messageEvent.path != "/hoots/workout-action") return
        WearWorkoutBridge.dispatch(messageEvent.data.toString(Charsets.UTF_8))
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
            WearWorkoutBridge.dispatch(payload)
        }
    }
}
