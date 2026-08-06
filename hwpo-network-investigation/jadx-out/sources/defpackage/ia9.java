package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ia9 implements im8 {
    public final long t;
    public final gb9 u;
    public final long v;
    public a1a w = a1a.c;
    public final ox6 x;

    public ia9(long j, gb9 gb9Var, long j2) {
        this.t = j;
        this.u = gb9Var;
        this.v = j2;
        ql1 ql1Var = new ql1(2, this);
        ka9 ka9Var = new ka9(ql1Var, gb9Var, j);
        la9 la9Var = new la9(ql1Var, gb9Var, j);
        ja9 ja9Var = new ja9(la9Var, ka9Var);
        r48 r48Var = t6a.a;
        q6a q6aVar = new q6a(la9Var, ka9Var, ja9Var, 4);
        w48.a.getClass();
        this.x = by5.c(q6aVar, y48.u);
    }

    @Override // defpackage.im8
    public final void d() {
        this.u.a();
    }

    @Override // defpackage.im8
    public final void b() {
    }

    @Override // defpackage.im8
    public final void c() {
    }
}
