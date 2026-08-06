package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class v16 implements sx5 {
    public final /* synthetic */ c26 a;

    public v16(c26 c26Var) {
        this.a = c26Var;
    }

    @Override // defpackage.sx5
    public final int a() {
        c26 c26Var = this.a;
        return (int) (c26Var.g().c() == fl7.t ? c26Var.g().a() & 4294967295L : c26Var.g().a() >> 32);
    }

    @Override // defpackage.sx5
    public final float b() {
        c26 c26Var = this.a;
        return (c26Var.c.c.k() * 500) + c26Var.c.e.k();
    }

    @Override // defpackage.sx5
    public final int c() {
        c26 c26Var = this.a;
        return c26Var.g().b() + c26Var.g().d();
    }

    @Override // defpackage.sx5
    public final float d() {
        c26 c26Var = this.a;
        int iK = c26Var.c.c.k();
        int iK2 = c26Var.c.e.k();
        return c26Var.d() ? (iK * 500) + iK2 + 100.0f : (iK * 500) + iK2;
    }

    @Override // defpackage.sx5
    public final ah1 e() {
        return new ah1(-1, -1);
    }

    @Override // defpackage.sx5
    public final Object f(int i, ay5.a aVar) throws Throwable {
        au3 au3Var = c26.x;
        c26 c26Var = this.a;
        c26Var.getClass();
        Object objC = c26Var.c(o37.t, new e26(c26Var, i, null), aVar);
        v72 v72Var = v72.t;
        if (objC != v72Var) {
            objC = g2b.a;
        }
        return objC == v72Var ? objC : g2b.a;
    }
}
