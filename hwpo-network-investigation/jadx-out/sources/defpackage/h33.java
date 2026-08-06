package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h33 extends wp5 implements mh4<g2b> {
    public final /* synthetic */ boolean u;
    public final /* synthetic */ b19 v;
    public final /* synthetic */ String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h33(boolean z, b19 b19Var, String str) {
        super(0);
        this.u = z;
        this.v = b19Var;
        this.w = str;
    }

    @Override // defpackage.mh4
    public final g2b invoke() {
        if (this.u) {
            b19 b19Var = this.v;
            String str = this.w;
            e19 e19Var = b19Var.a;
            synchronized (e19Var.c) {
            }
        }
        return g2b.a;
    }
}
