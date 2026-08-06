package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ki8 extends hu9 {
    public final oh4<Object, g2b> e;
    public int f;

    public ki8(long j, ou9 ou9Var, oh4<Object, g2b> oh4Var) {
        super(j, ou9Var);
        this.e = oh4Var;
        this.f = 1;
    }

    @Override // defpackage.hu9
    public final void c() {
        if (this.c) {
            return;
        }
        l();
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
        this.f++;
    }

    @Override // defpackage.hu9
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // defpackage.hu9
    public final void n(m0a m0aVar) {
        q32 q32Var = qu9.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.hu9
    public final hu9 u(oh4<Object, g2b> oh4Var) {
        qu9.c(this);
        return new a97(this.b, this.a, qu9.k(oh4Var, this.e, true), this);
    }

    @Override // defpackage.hu9
    public final void m() {
    }
}
