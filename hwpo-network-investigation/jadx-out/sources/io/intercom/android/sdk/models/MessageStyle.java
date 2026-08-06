package io.intercom.android.sdk.models;

import defpackage.nl3;
import defpackage.ol3;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public enum MessageStyle {
    CHAT,
    POST,
    NOTE,
    ADMIN_IS_TYPING_STYLE,
    QUICK_REPLY,
    ATTRIBUTE_COLLECTOR,
    TICKET_STATE_UPDATED,
    MERGED_PRIMARY_CONVERSATION,
    FIN_ANSWER;

    private static final /* synthetic */ nl3 $ENTRIES = ol3.b(values());

    public static nl3<MessageStyle> getEntries() {
        return $ENTRIES;
    }
}
