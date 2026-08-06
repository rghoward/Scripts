package defpackage;

import io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterLoadingScreenKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lx0 implements ci4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ ox6 u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;

    public /* synthetic */ lx0(ox6 ox6Var, int i, int i2, int i3) {
        this.t = i3;
        this.u = ox6Var;
        this.v = i;
        this.w = i2;
    }

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.t;
        jt1 jt1Var = (jt1) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return BubbleMessageRowKt.FailedMessageIcon$lambda$16(this.u, this.v, this.w, jt1Var, iIntValue);
            default:
                return HelpCenterLoadingScreenKt.HelpCenterLoadingScreen$lambda$3(this.u, this.v, this.w, jt1Var, iIntValue);
        }
    }
}
