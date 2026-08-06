package io.intercom.android.sdk.m5.conversation.data;

import com.google.gson.annotations.SerializedName;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AblyMessage {
    public static final int $stable = 8;

    @SerializedName("eventData")
    private final AblyEventData eventData;

    @SerializedName("eventName")
    private final String eventName;

    public AblyMessage(String str, AblyEventData ablyEventData) {
        str.getClass();
        ablyEventData.getClass();
        this.eventName = str;
        this.eventData = ablyEventData;
    }

    public static /* synthetic */ AblyMessage copy$default(AblyMessage ablyMessage, String str, AblyEventData ablyEventData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ablyMessage.eventName;
        }
        if ((i & 2) != 0) {
            ablyEventData = ablyMessage.eventData;
        }
        return ablyMessage.copy(str, ablyEventData);
    }

    public final String component1() {
        return this.eventName;
    }

    public final AblyEventData component2() {
        return this.eventData;
    }

    public final AblyMessage copy(String str, AblyEventData ablyEventData) {
        str.getClass();
        ablyEventData.getClass();
        return new AblyMessage(str, ablyEventData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AblyMessage)) {
            return false;
        }
        AblyMessage ablyMessage = (AblyMessage) obj;
        return xj5.a(this.eventName, ablyMessage.eventName) && xj5.a(this.eventData, ablyMessage.eventData);
    }

    public final AblyEventData getEventData() {
        return this.eventData;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public int hashCode() {
        return this.eventData.hashCode() + (this.eventName.hashCode() * 31);
    }

    public String toString() {
        return "AblyMessage(eventName=" + this.eventName + ", eventData=" + this.eventData + ')';
    }
}
