package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ux5 implements sx5 {
    public final /* synthetic */ dr7 a;
    public final /* synthetic */ boolean b;

    public ux5(dr7 dr7Var, boolean z) {
        this.a = dr7Var;
        this.b = z;
    }

    @Override // defpackage.sx5
    public final int a() {
        dr7 dr7Var = this.a;
        return (int) (dr7Var.n().c() == fl7.t ? dr7Var.n().a() & 4294967295L : dr7Var.n().a() >> 32);
    }

    @Override // defpackage.sx5
    public final float b() {
        return zv.d(this.a);
    }

    @Override // defpackage.sx5
    public final int c() {
        dr7 dr7Var = this.a;
        return dr7Var.n().b() + dr7Var.n().d();
    }

    @Override // defpackage.sx5
    public final float d() {
        dr7 dr7Var = this.a;
        return hr7.a(dr7Var.n(), dr7Var.o());
    }

    @Override // defpackage.sx5
    public final ah1 e() {
        boolean z = this.b;
        dr7 dr7Var = this.a;
        return z ? new ah1(dr7Var.o(), 1) : new ah1(1, dr7Var.o());
    }

    @Override // defpackage.sx5
    public final Object f(int i, ay5.a aVar) {
        dr7 dr7Var = this.a;
        dr7Var.getClass();
        Object objC = dr7Var.c(o37.t, new er7(dr7Var, i, null), aVar);
        v72 v72Var = v72.t;
        if (objC != v72Var) {
            objC = g2b.a;
        }
        return objC == v72Var ? objC : g2b.a;
    }
}
