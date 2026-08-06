package defpackage;

import io.intercom.android.sdk.ui.theme.IntercomColorsKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qh5 implements mh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ qh5(int i) {
        this.t = i;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                return IntercomColorsKt.intercomLightColors();
            default:
                jc5 jc5Var = new jc5();
                jc5Var.a(ll8.a(u47.a.class), new t47(0));
                return jc5Var.b();
        }
    }
}
