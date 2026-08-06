package defpackage;

import io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kh0 implements mh4 {
    public final /* synthetic */ int t = 0;
    public final /* synthetic */ mh4 u;
    public final /* synthetic */ Object v;

    public /* synthetic */ kh0(fs1 fs1Var, mh4 mh4Var) {
        this.v = fs1Var;
        this.u = mh4Var;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                ((fs1) this.v).c = this.u;
                return g2b.a;
            default:
                return CameraInputButtonKt.CameraInputButton$lambda$13$lambda$12(this.u, (h37) this.v);
        }
    }

    public /* synthetic */ kh0(mh4 mh4Var, h37 h37Var) {
        this.u = mh4Var;
        this.v = h37Var;
    }
}
