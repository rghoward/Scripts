package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class m74 implements r54<Object> {
    public final /* synthetic */ r54 t;
    public final /* synthetic */ r54 u;
    public final /* synthetic */ ei4 v;

    public m74(r54 r54Var, r54 r54Var2, ei4 ei4Var) {
        this.t = r54Var;
        this.u = r54Var2;
        this.v = ei4Var;
    }

    @Override // defpackage.r54
    public final Object collect(s54<? super Object> s54Var, r02<? super g2b> r02Var) throws Throwable {
        dj1 dj1Var = new dj1(new r54[]{this.t, this.u}, new n74(this.v, null), s54Var, null);
        u54 u54Var = new u54(r02Var, r02Var.getContext());
        Object objD = wx7.d(u54Var, true, u54Var, dj1Var);
        v72 v72Var = v72.t;
        if (objD != v72Var) {
            objD = g2b.a;
        }
        return objD == v72Var ? objD : g2b.a;
    }
}
