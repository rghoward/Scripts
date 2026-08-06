package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class v54 implements r54<Object> {
    public final /* synthetic */ ei4 t;

    public v54(ei4 ei4Var) {
        this.t = ei4Var;
    }

    @Override // defpackage.r54
    public final Object collect(s54<? super Object> s54Var, r02<? super g2b> r02Var) throws Throwable {
        w54 w54Var = new w54(this.t, s54Var, null);
        u54 u54Var = new u54(r02Var, r02Var.getContext());
        Object objD = wx7.d(u54Var, true, u54Var, w54Var);
        return objD == v72.t ? objD : g2b.a;
    }
}
