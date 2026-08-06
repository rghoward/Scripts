package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class v64 implements r54<Object> {
    public final /* synthetic */ r54 t;
    public final /* synthetic */ ci4 u;

    public v64(r54 r54Var, ci4 ci4Var) {
        this.t = r54Var;
        this.u = ci4Var;
    }

    @Override // defpackage.r54
    public final Object collect(s54<? super Object> s54Var, r02<? super g2b> r02Var) {
        Object objCollect = this.t.collect(new w64(new cl8(), s54Var, this.u), r02Var);
        return objCollect == v72.t ? objCollect : g2b.a;
    }
}
