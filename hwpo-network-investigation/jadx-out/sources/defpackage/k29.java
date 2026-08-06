package defpackage;

import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k29 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ k29(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                obj.getClass();
                float fFloatValue = ((Float) obj).floatValue();
                e86.a.a(fFloatValue);
                return new e86.a(fFloatValue);
            default:
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$6((ru) obj);
        }
    }
}
