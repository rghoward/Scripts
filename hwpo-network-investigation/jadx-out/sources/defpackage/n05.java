package defpackage;

import io.intercom.android.sdk.m5.home.ui.header.HomeHeaderKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n05 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ n05(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                return HomeHeaderKt.HomeErrorHeader$lambda$17$lambda$16$lambda$14$lambda$13((mh4) obj);
            default:
                return Long.valueOf(((tva) obj).b());
        }
    }
}
