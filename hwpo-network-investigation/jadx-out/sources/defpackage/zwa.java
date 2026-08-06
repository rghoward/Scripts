package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zwa extends g37 {
    public final g37 o;
    public final boolean p;
    public final boolean q;
    public oh4<Object, g2b> r;
    public oh4<Object, g2b> s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    public zwa(g37 g37Var, oh4<Object, g2b> oh4Var, oh4<Object, g2b> oh4Var2, boolean z, boolean z2) {
        oh4<Object, g2b> oh4VarI;
        oh4<Object, g2b> oh4VarE;
        q32 q32Var = qu9.a;
        super(0L, ou9.x, qu9.k(oh4Var, (g37Var == null || (oh4VarE = g37Var.e()) == null) ? qu9.j.e : oh4VarE, z), qu9.l(oh4Var2, (g37Var == null || (oh4VarI = g37Var.i()) == null) ? qu9.j.f : oh4VarI));
        this.o = g37Var;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = e00.a();
    }

    @Override // defpackage.g37
    public final void B(d37<m0a> d37Var) {
        kw0.b();
        throw null;
    }

    @Override // defpackage.g37
    public final g37 C(oh4<Object, g2b> oh4Var, oh4<Object, g2b> oh4Var2) {
        oh4<Object, g2b> oh4VarK = qu9.k(oh4Var, this.r, true);
        oh4<Object, g2b> oh4VarL = qu9.l(oh4Var2, this.s);
        return !this.p ? new zwa(D().C(null, oh4VarL), oh4VarK, oh4VarL, false, true) : D().C(oh4VarK, oh4VarL);
    }

    public final g37 D() {
        g37 g37Var = this.o;
        return g37Var == null ? qu9.j : g37Var;
    }

    @Override // defpackage.g37, defpackage.hu9
    public final void c() {
        g37 g37Var;
        this.c = true;
        if (!this.q || (g37Var = this.o) == null) {
            return;
        }
        g37Var.c();
    }

    @Override // defpackage.hu9
    public final ou9 d() {
        return D().d();
    }

    @Override // defpackage.g37, defpackage.hu9
    public final oh4 e() {
        return this.r;
    }

    @Override // defpackage.g37, defpackage.hu9
    public final boolean f() {
        return D().f();
    }

    @Override // defpackage.hu9
    public final long g() {
        return D().g();
    }

    @Override // defpackage.g37, defpackage.hu9
    public final int h() {
        return D().h();
    }

    @Override // defpackage.g37, defpackage.hu9
    public final oh4<Object, g2b> i() {
        return this.s;
    }

    @Override // defpackage.g37, defpackage.hu9
    public final void k() {
        kw0.b();
        throw null;
    }

    @Override // defpackage.g37, defpackage.hu9
    public final void l() {
        kw0.b();
        throw null;
    }

    @Override // defpackage.g37, defpackage.hu9
    public final void m() {
        D().m();
    }

    @Override // defpackage.g37, defpackage.hu9
    public final void n(m0a m0aVar) {
        D().n(m0aVar);
    }

    @Override // defpackage.hu9
    public final void r(ou9 ou9Var) {
        kw0.b();
        throw null;
    }

    @Override // defpackage.hu9
    public final void s(long j) {
        kw0.b();
        throw null;
    }

    @Override // defpackage.g37, defpackage.hu9
    public final void t(int i) {
        D().t(i);
    }

    @Override // defpackage.g37, defpackage.hu9
    public final hu9 u(oh4<Object, g2b> oh4Var) {
        oh4<Object, g2b> oh4VarK = qu9.k(oh4Var, this.r, true);
        return !this.p ? qu9.g(D().u(null), oh4VarK, true) : D().u(oh4VarK);
    }

    @Override // defpackage.g37
    public final ju9 w() {
        return D().w();
    }

    @Override // defpackage.g37
    public final d37<m0a> x() {
        return D().x();
    }

    @Override // defpackage.g37
    /* JADX INFO: renamed from: y */
    public final oh4<Object, g2b> e() {
        return this.r;
    }
}
