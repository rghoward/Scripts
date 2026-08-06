package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i27 implements h27 {
    public final am9 a = ty1.b(1, xx0.u);

    @Override // defpackage.h27
    public final am9 a() {
        return this.a;
    }

    @Override // defpackage.h27
    public final boolean b(qg5 qg5Var) {
        return this.a.f(qg5Var);
    }

    @Override // defpackage.h27
    public final Object c(qg5 qg5Var, r02<? super g2b> r02Var) throws Throwable {
        Object objEmit = this.a.emit(qg5Var, r02Var);
        return objEmit == v72.t ? objEmit : g2b.a;
    }
}
