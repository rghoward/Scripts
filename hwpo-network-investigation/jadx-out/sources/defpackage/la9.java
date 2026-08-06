package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class la9 implements bz6 {
    public final /* synthetic */ ql1 a;
    public final /* synthetic */ gb9 b;
    public final /* synthetic */ long c;

    public la9(ql1 ql1Var, gb9 gb9Var, long j) {
        this.a = ql1Var;
        this.b = gb9Var;
        this.c = j;
    }

    @Override // defpackage.bz6
    public final boolean a(long j, ca9 ca9Var) {
        qq5 qq5Var = (qq5) this.a.invoke();
        if (qq5Var == null) {
            return true;
        }
        if (!qq5Var.e()) {
            return false;
        }
        gb9 gb9Var = this.b;
        if (!ib9.a(gb9Var, this.c)) {
            return false;
        }
        gb9Var.d();
        return true;
    }

    @Override // defpackage.bz6
    public final boolean b(long j) {
        qq5 qq5Var = (qq5) this.a.invoke();
        if (qq5Var == null) {
            return true;
        }
        if (!qq5Var.e()) {
            return false;
        }
        gb9 gb9Var = this.b;
        if (!ib9.a(gb9Var, this.c)) {
            return false;
        }
        gb9Var.d();
        return true;
    }

    @Override // defpackage.bz6
    public final void c() {
        this.b.f();
    }

    @Override // defpackage.bz6
    public final boolean d(long j) {
        qq5 qq5Var = (qq5) this.a.invoke();
        if (qq5Var == null || !qq5Var.e()) {
            return false;
        }
        gb9 gb9Var = this.b;
        gb9Var.d();
        return ib9.a(gb9Var, this.c);
    }

    @Override // defpackage.bz6
    public final boolean e(long j, ca9 ca9Var, int i) {
        qq5 qq5Var = (qq5) this.a.invoke();
        if (qq5Var == null || !qq5Var.e()) {
            return false;
        }
        gb9 gb9Var = this.b;
        gb9Var.e();
        return ib9.a(gb9Var, this.c);
    }
}
