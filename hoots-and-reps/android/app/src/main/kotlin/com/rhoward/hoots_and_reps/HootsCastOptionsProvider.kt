package com.rhoward.hoots_and_reps

import android.content.Context
import com.google.android.gms.cast.framework.CastOptions
import com.google.android.gms.cast.framework.OptionsProvider
import com.google.android.gms.cast.framework.SessionProvider

/** Supplies the registered Hoots & Reps receiver ID to the Cast SDK. */
class HootsCastOptionsProvider : OptionsProvider {
    override fun getCastOptions(context: Context): CastOptions = CastOptions.Builder()
        .setReceiverApplicationId(context.getString(R.string.cast_receiver_application_id))
        // A custom workout receiver has no media queue. Keep it alive if the
        // sender is backgrounded/temporarily disconnected, then reconnect to
        // the same receiver when Android resumes the Cast session.
        .setStopReceiverApplicationWhenEndingSession(false)
        .setEnableReconnectionService(true)
        .setResumeSavedSession(true)
        .build()

    override fun getAdditionalSessionProviders(context: Context): List<SessionProvider>? = null
}
