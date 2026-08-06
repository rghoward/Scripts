package io.intercom.android.sdk.m5.push;

import defpackage.nl3;
import defpackage.ol3;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public enum NotificationChannel {
    CHAT_REPLIES_CHANNEL("intercom_chat_replies_channel"),
    NEW_CHATS_CHANNEL("intercom_new_chats_channel"),
    ACTIONS_CHANNEL("intercom_actions_channel");

    private static final /* synthetic */ nl3 $ENTRIES = ol3.b(values());
    private final String channelName;

    NotificationChannel(String str) {
        this.channelName = str;
    }

    public static nl3<NotificationChannel> getEntries() {
        return $ENTRIES;
    }

    public final String getChannelName() {
        return this.channelName;
    }
}
