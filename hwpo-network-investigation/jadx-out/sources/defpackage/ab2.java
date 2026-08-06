package defpackage;

import io.intercom.android.sdk.m5.components.EmptyStateKt;
import io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ab2 implements ci4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;

    public /* synthetic */ ab2(int i, int i2) {
        this.t = i2;
        this.u = i;
    }

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.t;
        jt1 jt1Var = (jt1) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i2 = this.u;
        switch (i) {
            case 0:
                return CreateTicketContentScreenKt.CreateTicketContentErrorScreenPreview$lambda$9(i2, jt1Var, iIntValue);
            default:
                return EmptyStateKt.EmptyStatePreview$lambda$5(i2, jt1Var, iIntValue);
        }
    }
}
