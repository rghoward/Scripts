package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a97 extends hu9 {
    public final oh4<Object, g2b> e;
    public final hu9 f;

    public a97(long j, ou9 ou9Var, oh4<Object, g2b> oh4Var, hu9 hu9Var) {
        super(j, ou9Var);
        this.e = oh4Var;
        this.f = hu9Var;
        hu9Var.k();
    }

    @Override // defpackage.hu9
    public final void c() {
        if (this.c) {
            return;
        }
        long j = this.b;
        hu9 hu9Var = this.f;
        if (j != hu9Var.g()) {
            a();
        }
        hu9Var.l();
        super.c();
    }

    @Override // defpackage.hu9
    public final oh4 e() {
        return this.e;
    }

    @Override // defpackage.hu9
    public final boolean f() {
        return true;
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
    public final void n(m0a m0aVar) {
        q32 q32Var = qu9.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.hu9
    public final hu9 u(oh4 oh4Var) {
        return new a97(this.b, this.a, qu9.k(oh4Var, this.e, true), this.f);
    }

    @Override // defpackage.hu9
    public final void m() {
    }
}
