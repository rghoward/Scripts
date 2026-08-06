package io.intercom.android.sdk.tickets;

import defpackage.nl3;
import defpackage.ol3;
import defpackage.u7d;
import io.intercom.android.sdk.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public enum TicketStatus {
    Submitted(u7d.d(4278212607L), R.drawable.intercom_ticket_submitted_icon),
    InProgress(u7d.d(4278212607L), R.drawable.intercom_ticket_submitted_icon),
    WaitingOnCustomer(u7d.d(4291644690L), R.drawable.intercom_ticket_waiting_icon),
    Resolved(u7d.d(4279072050L), R.drawable.intercom_ticket_resolved_icon);

    private static final /* synthetic */ nl3 $ENTRIES = ol3.b(values());
    private final long color;
    private final int iconRes;

    TicketStatus(long j, int i) {
        this.color = j;
        this.iconRes = i;
    }

    public static nl3<TicketStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m527getColor0d7_KjU() {
        return this.color;
    }

    public final int getIconRes() {
        return this.iconRes;
    }
}
