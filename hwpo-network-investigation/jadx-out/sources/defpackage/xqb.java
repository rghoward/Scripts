package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xqb extends vt1<Void> {
    public final bq6 k;

    public xqb(bq6 bq6Var) {
        this.k = bq6Var;
    }

    public abstract void A(toa toaVar);

    public final void B() {
        y(null, this.k);
    }

    public void C() {
        B();
    }

    @Override // defpackage.bq6
    public final co6 h() {
        return this.k.h();
    }

    @Override // defpackage.bq6
    public final boolean k() {
        return this.k.k();
    }

    @Override // defpackage.bq6
    public final toa l() {
        return this.k.l();
    }

    @Override // defpackage.bq6
    public void m(co6 co6Var) {
        this.k.m(co6Var);
    }

    @Override // defpackage.qk0
    public final void r(yua yuaVar) {
        this.j = yuaVar;
        this.i = n6b.p(null);
        C();
    }

    @Override // defpackage.vt1
    public final bq6.b u(Void r1, bq6.b bVar) {
        return z(bVar);
    }

    @Override // defpackage.vt1
    public final long v(long j, Object obj) {
        return j;
    }

    @Override // defpackage.vt1
    public final int w(int i, Object obj) {
        return i;
    }

    @Override // defpackage.vt1
    public final void x(Object obj, qk0 qk0Var, toa toaVar) {
        A(toaVar);
    }

    public bq6.b z(bq6.b bVar) {
        return bVar;
    }
}
