package defpackage;

import io.intercom.android.sdk.m5.components.HomeItemKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gb3 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ gb3(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                rb3.a aVar = rb3.Companion;
                ((rb3) obj).s().f(vc3.b);
                return g2b.a;
            case 1:
                h37 h37Var = (h37) obj;
                ((tq3) h37Var.getValue()).getClass();
                h37Var.setValue(new tq3());
                return g2b.a;
            case 2:
                return HomeItemKt.HomeItem$lambda$3$lambda$2((mh4) obj);
            default:
                dr7 dr7Var = (dr7) obj;
                return Integer.valueOf(dr7Var.k.a() ? dr7Var.r.k() : dr7Var.k());
        }
    }
}
