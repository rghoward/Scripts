package io.intercom.android.sdk.tickets.create.data;

import com.google.gson.annotations.SerializedName;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketAttributeRequest {
    public static final int $stable = 8;

    @SerializedName("descriptor_id")
    private final String descriptorId;

    @SerializedName("value")
    private final Object value;

    public TicketAttributeRequest(String str, Object obj) {
        str.getClass();
        obj.getClass();
        this.descriptorId = str;
        this.value = obj;
    }

    public static /* synthetic */ TicketAttributeRequest copy$default(TicketAttributeRequest ticketAttributeRequest, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = ticketAttributeRequest.descriptorId;
        }
        if ((i & 2) != 0) {
            obj = ticketAttributeRequest.value;
        }
        return ticketAttributeRequest.copy(str, obj);
    }

    public final String component1() {
        return this.descriptorId;
    }

    public final Object component2() {
        return this.value;
    }

    public final TicketAttributeRequest copy(String str, Object obj) {
        str.getClass();
        obj.getClass();
        return new TicketAttributeRequest(str, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketAttributeRequest)) {
            return false;
        }
        TicketAttributeRequest ticketAttributeRequest = (TicketAttributeRequest) obj;
        return xj5.a(this.descriptorId, ticketAttributeRequest.descriptorId) && xj5.a(this.value, ticketAttributeRequest.value);
    }

    public final String getDescriptorId() {
        return this.descriptorId;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.descriptorId.hashCode() * 31);
    }

    public String toString() {
        return "TicketAttributeRequest(descriptorId=" + this.descriptorId + ", value=" + this.value + ')';
    }
}
