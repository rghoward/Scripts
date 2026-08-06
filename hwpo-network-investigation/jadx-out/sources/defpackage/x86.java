package defpackage;

import io.intercom.android.sdk.m5.navigation.MessagesDestinationKt;
import io.intercom.android.sdk.m5.navigation.TicketsDestinationKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x86 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ x86(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                y86 y86Var = (y86) obj;
                y86Var.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append(y86Var.x);
                sb.append('=');
                sb.append(y86Var.y);
                return sb.toString();
            case 1:
                return MessagesDestinationKt.messagesDestination$lambda$2((ru) obj);
            default:
                return TicketsDestinationKt.ticketsDestination$lambda$3((ru) obj);
        }
    }
}
