package defpackage;

import io.intercom.android.sdk.m5.navigation.TicketsDestinationKt;
import io.intercom.android.sdk.tickets.RecentTicketsCardKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w86 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ w86(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                y86 y86Var = (y86) obj;
                y86Var.getClass();
                ln4 ln4Var = y86Var.z;
                if (ln4Var instanceof y86) {
                    return (y86) ln4Var;
                }
                return null;
            case 1:
                return RecentTicketsCardKt.RecentTicketsCard$lambda$1$lambda$0((String) obj);
            default:
                return TicketsDestinationKt.ticketsDestination$lambda$2((ru) obj);
        }
    }
}
