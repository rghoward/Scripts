package io.intercom.android.sdk.tickets.list.ui;

import defpackage.pi1;
import defpackage.ru3;
import defpackage.xj5;
import io.intercom.android.sdk.tickets.TicketStatus;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketRowData {
    public static final int $stable = 0;
    private final String id;
    private final boolean isRead;
    private final TicketStatus status;
    private final String subTitle;
    private final String title;

    public TicketRowData(String str, String str2, String str3, TicketStatus ticketStatus, boolean z) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        ticketStatus.getClass();
        this.id = str;
        this.title = str2;
        this.subTitle = str3;
        this.status = ticketStatus;
        this.isRead = z;
    }

    public static /* synthetic */ TicketRowData copy$default(TicketRowData ticketRowData, String str, String str2, String str3, TicketStatus ticketStatus, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ticketRowData.id;
        }
        if ((i & 2) != 0) {
            str2 = ticketRowData.title;
        }
        if ((i & 4) != 0) {
            str3 = ticketRowData.subTitle;
        }
        if ((i & 8) != 0) {
            ticketStatus = ticketRowData.status;
        }
        if ((i & 16) != 0) {
            z = ticketRowData.isRead;
        }
        boolean z2 = z;
        String str4 = str3;
        return ticketRowData.copy(str, str2, str4, ticketStatus, z2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subTitle;
    }

    public final TicketStatus component4() {
        return this.status;
    }

    public final boolean component5() {
        return this.isRead;
    }

    public final TicketRowData copy(String str, String str2, String str3, TicketStatus ticketStatus, boolean z) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        ticketStatus.getClass();
        return new TicketRowData(str, str2, str3, ticketStatus, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketRowData)) {
            return false;
        }
        TicketRowData ticketRowData = (TicketRowData) obj;
        return xj5.a(this.id, ticketRowData.id) && xj5.a(this.title, ticketRowData.title) && xj5.a(this.subTitle, ticketRowData.subTitle) && this.status == ticketRowData.status && this.isRead == ticketRowData.isRead;
    }

    public final String getId() {
        return this.id;
    }

    public final TicketStatus getStatus() {
        return this.status;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isRead) + ((this.status.hashCode() + ru3.c(ru3.c(this.id.hashCode() * 31, 31, this.title), 31, this.subTitle)) * 31);
    }

    public final boolean isRead() {
        return this.isRead;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TicketRowData(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subTitle=");
        sb.append(this.subTitle);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", isRead=");
        return pi1.a(sb, this.isRead, ')');
    }
}
