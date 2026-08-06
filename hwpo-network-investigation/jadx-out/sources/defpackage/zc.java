package defpackage;

import io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zc implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ zc(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                gd.a aVar = gd.Companion;
                return Boolean.valueOf(((ud) obj).g);
            case 1:
                int i = bd4.C;
                return Boolean.valueOf(((bd4.b) obj).b);
            default:
                return HomeScreenDestinationKt.homeScreen$lambda$0((ru) obj);
        }
    }
}
