package io.intercom.android.sdk.m5.home.data;

import com.google.gson.annotations.SerializedName;
import defpackage.os2;
import defpackage.ru3;
import defpackage.xj5;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketLink {
    public static final int $stable = 8;

    @SerializedName("display_order")
    private final int displayOrder;

    @SerializedName("icon_url")
    private final String iconUrl;

    @SerializedName("ticket_type")
    private final TicketType ticketType;

    @SerializedName(CreateTicketDestinationKt.TICKET_TYPE_ID)
    private final long ticketTypeId;

    @SerializedName("ticket_type_name")
    private final String ticketTypeName;

    public TicketLink(long j, String str, String str2, int i, TicketType ticketType) {
        str.getClass();
        str2.getClass();
        ticketType.getClass();
        this.ticketTypeId = j;
        this.ticketTypeName = str;
        this.iconUrl = str2;
        this.displayOrder = i;
        this.ticketType = ticketType;
    }

    public static /* synthetic */ TicketLink copy$default(TicketLink ticketLink, long j, String str, String str2, int i, TicketType ticketType, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = ticketLink.ticketTypeId;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            str = ticketLink.ticketTypeName;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = ticketLink.iconUrl;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            i = ticketLink.displayOrder;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            ticketType = ticketLink.ticketType;
        }
        return ticketLink.copy(j2, str3, str4, i3, ticketType);
    }

    public final long component1() {
        return this.ticketTypeId;
    }

    public final String component2() {
        return this.ticketTypeName;
    }

    public final String component3() {
        return this.iconUrl;
    }

    public final int component4() {
        return this.displayOrder;
    }

    public final TicketType component5() {
        return this.ticketType;
    }

    public final TicketLink copy(long j, String str, String str2, int i, TicketType ticketType) {
        str.getClass();
        str2.getClass();
        ticketType.getClass();
        return new TicketLink(j, str, str2, i, ticketType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketLink)) {
            return false;
        }
        TicketLink ticketLink = (TicketLink) obj;
        return this.ticketTypeId == ticketLink.ticketTypeId && xj5.a(this.ticketTypeName, ticketLink.ticketTypeName) && xj5.a(this.iconUrl, ticketLink.iconUrl) && this.displayOrder == ticketLink.displayOrder && xj5.a(this.ticketType, ticketLink.ticketType);
    }

    public final int getDisplayOrder() {
        return this.displayOrder;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final TicketType getTicketType() {
        return this.ticketType;
    }

    public final long getTicketTypeId() {
        return this.ticketTypeId;
    }

    public final String getTicketTypeName() {
        return this.ticketTypeName;
    }

    public int hashCode() {
        return this.ticketType.hashCode() + os2.a(this.displayOrder, ru3.c(ru3.c(Long.hashCode(this.ticketTypeId) * 31, 31, this.ticketTypeName), 31, this.iconUrl), 31);
    }

    public String toString() {
        return "TicketLink(ticketTypeId=" + this.ticketTypeId + ", ticketTypeName=" + this.ticketTypeName + ", iconUrl=" + this.iconUrl + ", displayOrder=" + this.displayOrder + ", ticketType=" + this.ticketType + ')';
    }
}
