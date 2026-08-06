package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class jm2 implements r54 {
    public final /* synthetic */ int t;
    public final /* synthetic */ r54 u;
    public final /* synthetic */ dl0 v;

    public /* synthetic */ jm2(r54 r54Var, dl0 dl0Var, int i) {
        this.t = i;
        this.u = r54Var;
        this.v = dl0Var;
    }

    @Override // defpackage.r54
    public final Object collect(s54 s54Var, r02 r02Var) {
        int i = this.t;
        v72 v72Var = v72.t;
        dl0 dl0Var = this.v;
        r54 r54Var = this.u;
        switch (i) {
            case 0:
                Object objCollect = r54Var.collect(new im2(s54Var, (cm2) dl0Var), r02Var);
                return objCollect == v72Var ? objCollect : g2b.a;
            default:
                Object objCollect2 = ((e84) r54Var).collect(new acb(s54Var, (ybb) dl0Var), r02Var);
                return objCollect2 == v72Var ? objCollect2 : g2b.a;
        }
    }
}
