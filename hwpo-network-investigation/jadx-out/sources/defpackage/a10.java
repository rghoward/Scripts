package defpackage;

import io.intercom.android.sdk.AppIdentityInjector;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a10 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ a10(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                return AppIdentityInjector.kotlinXRetrofit_delegate$lambda$6((AppIdentityInjector) obj);
            default:
                y96 y96Var = (y96) obj;
                y96Var.c.setVisibility(8);
                y96Var.b.setImageResource(0);
                return g2b.a;
        }
    }
}
