package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class axa extends hu9 {
    public final hu9 e;
    public final boolean f;
    public final boolean g;
    public oh4<Object, g2b> h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axa(hu9 hu9Var, oh4<Object, g2b> oh4Var, boolean z, boolean z2) {
        oh4<Object, g2b> oh4VarE;
        super(0L, ou9.x);
        q32 q32Var = qu9.a;
        this.e = hu9Var;
        this.f = z;
        this.g = z2;
        this.h = qu9.k(oh4Var, (hu9Var == null || (oh4VarE = hu9Var.e()) == null) ? qu9.j.e : oh4VarE, z);
        this.i = e00.a();
    }

    @Override // defpackage.hu9
    public final void c() {
        hu9 hu9Var;
        this.c = true;
        if (!this.g || (hu9Var = this.e) == null) {
            return;
        }
        hu9Var.c();
    }

    @Override // defpackage.hu9
    public final ou9 d() {
        return v().d();
    }

    @Override // defpackage.hu9
    public final oh4 e() {
        return this.h;
    }

    @Override // defpackage.hu9
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.hu9
    public final long g() {
        return v().g();
    }

    @Override // defpackage.hu9
    public final oh4<Object, g2b> i() {
        return null;
    }

    @Override // defpackage.hu9
    public final void k() {
        kw0.b();
        throw null;
    }

    @Override // defpackage.hu9
    public final void l() {
        kw0.b();
        throw null;
    }

    @Override // defpackage.hu9
    public final void m() {
        v().m();
    }

    @Override // defpackage.hu9
    public final void n(m0a m0aVar) {
        v().n(m0aVar);
    }

    @Override // defpackage.hu9
    public final hu9 u(oh4<Object, g2b> oh4Var) {
        oh4<Object, g2b> oh4VarK = qu9.k(oh4Var, this.h, true);
        return !this.f ? qu9.g(v().u(null), oh4VarK, true) : v().u(oh4VarK);
    }

    public final hu9 v() {
        hu9 hu9Var = this.e;
        return hu9Var == null ? qu9.j : hu9Var;
    }
}
