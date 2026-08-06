package defpackage;

import io.intercom.android.sdk.helpcenter.articles.ReactionsComponentKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class md2 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ md2(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                return nd2.f((nd2) obj);
            case 1:
                return ReactionsComponentKt.ReactionsComponent$lambda$13$lambda$12$lambda$10$lambda$9((mh4) obj);
            default:
                g8a g8aVar = (g8a) obj;
                String string = g8aVar.requireArguments().getString("TAB_KEY");
                if (string == null) {
                    z90.a("Required value was null.");
                    return null;
                }
                ic6 ic6Var = g8aVar.A;
                if (ic6Var != null) {
                    return ic6Var.a(string);
                }
                xj5.e("localCiceroneHolder");
                throw null;
        }
    }
}
