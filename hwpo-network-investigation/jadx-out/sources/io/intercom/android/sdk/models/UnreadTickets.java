package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.hf3;
import defpackage.qq2;
import defpackage.xj5;
import defpackage.zc6;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class UnreadTickets {

    @SerializedName("total_count")
    private final int totalCount;

    @SerializedName("unread_ticket_ids")
    private final List<String> unreadTicketIds;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final UnreadTickets NULL = new UnreadTickets(0, hf3.t);

    public UnreadTickets(int i, List<String> list) {
        list.getClass();
        this.totalCount = i;
        this.unreadTicketIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnreadTickets copy$default(UnreadTickets unreadTickets, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = unreadTickets.totalCount;
        }
        if ((i2 & 2) != 0) {
            list = unreadTickets.unreadTicketIds;
        }
        return unreadTickets.copy(i, list);
    }

    public final int component1() {
        return this.totalCount;
    }

    public final List<String> component2() {
        return this.unreadTicketIds;
    }

    public final UnreadTickets copy(int i, List<String> list) {
        list.getClass();
        return new UnreadTickets(i, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnreadTickets)) {
            return false;
        }
        UnreadTickets unreadTickets = (UnreadTickets) obj;
        return this.totalCount == unreadTickets.totalCount && xj5.a(this.unreadTicketIds, unreadTickets.unreadTicketIds);
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final List<String> getUnreadTicketIds() {
        return this.unreadTicketIds;
    }

    public int hashCode() {
        return this.unreadTicketIds.hashCode() + (Integer.hashCode(this.totalCount) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UnreadTickets(totalCount=");
        sb.append(this.totalCount);
        sb.append(", unreadTicketIds=");
        return zc6.a(sb, this.unreadTicketIds, ')');
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public final UnreadTickets getNULL() {
            return UnreadTickets.NULL;
        }

        private Companion() {
        }
    }
}
