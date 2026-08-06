package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o06 implements sx5 {
    public final /* synthetic */ zu5 a;

    public o06(zu5 zu5Var) {
        this.a = zu5Var;
    }

    @Override // defpackage.sx5
    public final int a() {
        zu5 zu5Var = this.a;
        return (int) (zu5Var.g().c() == fl7.t ? zu5Var.g().a() & 4294967295L : zu5Var.g().a() >> 32);
    }

    @Override // defpackage.sx5
    public final float b() {
        zu5 zu5Var = this.a;
        return (zu5Var.d.a.k() * 500) + zu5Var.d.b.k();
    }

    @Override // defpackage.sx5
    public final int c() {
        zu5 zu5Var = this.a;
        return zu5Var.g().b() + zu5Var.g().d();
    }

    @Override // defpackage.sx5
    public final float d() {
        zu5 zu5Var = this.a;
        int iK = zu5Var.d.a.k();
        int iK2 = zu5Var.d.b.k();
        return zu5Var.d() ? (iK * 500) + iK2 + 100.0f : (iK * 500) + iK2;
    }

    @Override // defpackage.sx5
    public final ah1 e() {
        return new ah1(-1, -1);
    }

    @Override // defpackage.sx5
    public final Object f(int i, ay5.a aVar) throws Throwable {
        au3 au3Var = zu5.w;
        zu5 zu5Var = this.a;
        zu5Var.getClass();
        Object objC = zu5Var.c(o37.t, new av5(zu5Var, i, null), aVar);
        v72 v72Var = v72.t;
        if (objC != v72Var) {
            objC = g2b.a;
        }
        return objC == v72Var ? objC : g2b.a;
    }
}
