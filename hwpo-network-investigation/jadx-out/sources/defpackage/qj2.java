package defpackage;

import io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qj2 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ di4 u;

    public /* synthetic */ qj2(di4 di4Var, int i) {
        this.t = i;
        this.u = di4Var;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        di4 di4Var = this.u;
        switch (i) {
            case 0:
                ((oh4) di4Var).invoke(new n23(1));
                return g2b.a;
            default:
                return HeaderMenuItemRowKt.ExpandedHeaderMenuItemRow$lambda$5$lambda$4((mh4) di4Var);
        }
    }
}
