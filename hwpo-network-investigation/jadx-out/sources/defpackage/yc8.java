package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yc8 implements xc8 {
    public final am9 a;
    public final am9 b;

    public yc8() {
        am9 am9VarB = ty1.b(7, null);
        this.a = am9VarB;
        this.b = am9VarB;
    }

    @Override // defpackage.xc8
    public final Object a(u02 u02Var) throws Throwable {
        g2b g2bVar = g2b.a;
        Object objEmit = this.a.emit(g2bVar, u02Var);
        return objEmit == v72.t ? objEmit : g2bVar;
    }

    @Override // defpackage.xc8
    public final am9 b() {
        return this.b;
    }
}
