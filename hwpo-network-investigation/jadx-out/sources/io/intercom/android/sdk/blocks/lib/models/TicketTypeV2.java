package io.intercom.android.sdk.blocks.lib.models;

import com.google.gson.annotations.SerializedName;
import defpackage.ru3;
import defpackage.xj5;
import defpackage.zc6;
import io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketTypeV2 {
    public static final int $stable = 8;

    @SerializedName("form_fields")
    private final List<FormField> formFields;

    @SerializedName("name")
    private final String name;

    @SerializedName(CreateTicketDestinationKt.TICKET_TYPE_ID)
    private final long ticketTypeId;

    public TicketTypeV2(long j, String str, List<FormField> list) {
        str.getClass();
        list.getClass();
        this.ticketTypeId = j;
        this.name = str;
        this.formFields = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TicketTypeV2 copy$default(TicketTypeV2 ticketTypeV2, long j, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = ticketTypeV2.ticketTypeId;
        }
        if ((i & 2) != 0) {
            str = ticketTypeV2.name;
        }
        if ((i & 4) != 0) {
            list = ticketTypeV2.formFields;
        }
        return ticketTypeV2.copy(j, str, list);
    }

    public final long component1() {
        return this.ticketTypeId;
    }

    public final String component2() {
        return this.name;
    }

    public final List<FormField> component3() {
        return this.formFields;
    }

    public final TicketTypeV2 copy(long j, String str, List<FormField> list) {
        str.getClass();
        list.getClass();
        return new TicketTypeV2(j, str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketTypeV2)) {
            return false;
        }
        TicketTypeV2 ticketTypeV2 = (TicketTypeV2) obj;
        return this.ticketTypeId == ticketTypeV2.ticketTypeId && xj5.a(this.name, ticketTypeV2.name) && xj5.a(this.formFields, ticketTypeV2.formFields);
    }

    public final List<FormField> getFormFields() {
        return this.formFields;
    }

    public final String getName() {
        return this.name;
    }

    public final long getTicketTypeId() {
        return this.ticketTypeId;
    }

    public int hashCode() {
        return this.formFields.hashCode() + ru3.c(Long.hashCode(this.ticketTypeId) * 31, 31, this.name);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TicketTypeV2(ticketTypeId=");
        sb.append(this.ticketTypeId);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", formFields=");
        return zc6.a(sb, this.formFields, ')');
    }
}
