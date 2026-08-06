package io.intercom.android.sdk.m5.conversation.states;

import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketProgressRowState {
    public static final int $stable = 0;
    private final String name;
    private final String status;

    public TicketProgressRowState(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.name = str;
        this.status = str2;
    }

    public static /* synthetic */ TicketProgressRowState copy$default(TicketProgressRowState ticketProgressRowState, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ticketProgressRowState.name;
        }
        if ((i & 2) != 0) {
            str2 = ticketProgressRowState.status;
        }
        return ticketProgressRowState.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.status;
    }

    public final TicketProgressRowState copy(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new TicketProgressRowState(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketProgressRowState)) {
            return false;
        }
        TicketProgressRowState ticketProgressRowState = (TicketProgressRowState) obj;
        return xj5.a(this.name, ticketProgressRowState.name) && xj5.a(this.status, ticketProgressRowState.status);
    }

    public final String getName() {
        return this.name;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TicketProgressRowState(name=");
        sb.append(this.name);
        sb.append(", status=");
        return wu0.a(sb, this.status, ')');
    }
}
