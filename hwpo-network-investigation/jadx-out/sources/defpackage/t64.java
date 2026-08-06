package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class t64 implements r54<Object> {
    public final /* synthetic */ r54 t;
    public final /* synthetic */ int u;

    public t64(r54 r54Var, int i) {
        this.t = r54Var;
        this.u = i;
    }

    @Override // defpackage.r54
    public final Object collect(s54<? super Object> s54Var, r02<? super g2b> r02Var) {
        Object objCollect = this.t.collect(new u64(new el8(), this.u, s54Var), r02Var);
        return objCollect == v72.t ? objCollect : g2b.a;
    }
}
