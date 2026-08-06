package defpackage;

import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.inbox.ui.InboxErrorScreenKt;
import io.intercom.android.sdk.tickets.list.ui.TicketsErrorScreenKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aa5 implements ci4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ ErrorState u;
    public final /* synthetic */ ox6 v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    public /* synthetic */ aa5(ErrorState errorState, ox6 ox6Var, int i, int i2, int i3) {
        this.t = i3;
        this.u = errorState;
        this.v = ox6Var;
        this.w = i;
        this.x = i2;
    }

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return InboxErrorScreenKt.InboxErrorScreen$lambda$0(this.u, this.v, this.w, this.x, (jt1) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return TicketsErrorScreenKt.TicketsErrorScreen$lambda$0(this.u, this.v, this.w, this.x, (jt1) obj, iIntValue2);
        }
    }
}
