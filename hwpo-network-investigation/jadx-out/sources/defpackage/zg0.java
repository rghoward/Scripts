package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zg0 implements mh4 {
    public final /* synthetic */ ah0.a t;
    public final /* synthetic */ ah0 u;
    public final /* synthetic */ el8 v;

    public /* synthetic */ zg0(ah0.a aVar, ah0 ah0Var, el8 el8Var) {
        this.t = aVar;
        this.u = ah0Var;
        this.v = el8Var;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i;
        this.t.a();
        k60 k60Var = this.u.c;
        int i2 = this.v.t;
        do {
            i = k60Var.get();
        } while (!k60Var.compareAndSet(i, ((i >>> 27) & 15) == i2 ? i - 1 : i));
        return g2b.a;
    }
}
