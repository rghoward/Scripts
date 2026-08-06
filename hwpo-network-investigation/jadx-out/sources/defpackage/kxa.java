package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kxa implements Runnable {
    public final /* synthetic */ oxa t;
    public final /* synthetic */ tj4 u;
    public final /* synthetic */ o20 v;

    public /* synthetic */ kxa(oxa oxaVar, tj4 tj4Var, o20 o20Var) {
        this.t = oxaVar;
        this.u = tj4Var;
        this.v = o20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ev7.a aVarE = ev7.E();
        aVarE.n();
        ev7.z((ev7) aVarE.u, this.u);
        this.t.d(aVarE, this.v);
    }
}
