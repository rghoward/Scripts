package defpackage;

import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h91 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ h91(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                int i = m91.I;
                return Boolean.valueOf(((n91) obj).g);
            case 1:
                ec9.h((hc9) obj);
                return g2b.a;
            default:
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$8((ru) obj);
        }
    }
}
