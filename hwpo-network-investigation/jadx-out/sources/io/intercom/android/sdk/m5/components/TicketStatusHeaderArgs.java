package io.intercom.android.sdk.m5.components;

import defpackage.ob4;
import defpackage.qq2;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketStatusHeaderArgs {
    public static final int $stable = 0;
    private final ob4 fontWeight;
    private final String title;

    public TicketStatusHeaderArgs(String str, ob4 ob4Var) {
        str.getClass();
        ob4Var.getClass();
        this.title = str;
        this.fontWeight = ob4Var;
    }

    public static /* synthetic */ TicketStatusHeaderArgs copy$default(TicketStatusHeaderArgs ticketStatusHeaderArgs, String str, ob4 ob4Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ticketStatusHeaderArgs.title;
        }
        if ((i & 2) != 0) {
            ob4Var = ticketStatusHeaderArgs.fontWeight;
        }
        return ticketStatusHeaderArgs.copy(str, ob4Var);
    }

    public final String component1() {
        return this.title;
    }

    public final ob4 component2() {
        return this.fontWeight;
    }

    public final TicketStatusHeaderArgs copy(String str, ob4 ob4Var) {
        str.getClass();
        ob4Var.getClass();
        return new TicketStatusHeaderArgs(str, ob4Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketStatusHeaderArgs)) {
            return false;
        }
        TicketStatusHeaderArgs ticketStatusHeaderArgs = (TicketStatusHeaderArgs) obj;
        return xj5.a(this.title, ticketStatusHeaderArgs.title) && xj5.a(this.fontWeight, ticketStatusHeaderArgs.fontWeight);
    }

    public final ob4 getFontWeight() {
        return this.fontWeight;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.fontWeight.t;
    }

    public String toString() {
        return "TicketStatusHeaderArgs(title=" + this.title + ", fontWeight=" + this.fontWeight + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TicketStatusHeaderArgs(String str, ob4 ob4Var, int i, qq2 qq2Var) {
        if ((i & 2) != 0) {
            ob4 ob4Var2 = ob4.u;
            ob4Var = ob4.y;
        }
        this(str, ob4Var);
    }
}
