package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ka9 implements lda {
    public long a = 0;
    public long b = 0;
    public final /* synthetic */ ql1 c;
    public final /* synthetic */ gb9 d;
    public final /* synthetic */ long e;

    public ka9(ql1 ql1Var, gb9 gb9Var, long j) {
        this.c = ql1Var;
        this.d = gb9Var;
        this.e = j;
    }

    @Override // defpackage.lda
    public final void a() {
        long j = this.e;
        gb9 gb9Var = this.d;
        if (ib9.a(gb9Var, j)) {
            gb9Var.f();
        }
    }

    @Override // defpackage.lda
    public final void b(long j, ca9 ca9Var) {
        qq5 qq5Var = (qq5) this.c.invoke();
        gb9 gb9Var = this.d;
        if (qq5Var != null) {
            if (!qq5Var.e()) {
                return;
            }
            gb9Var.e();
            this.a = j;
        }
        if (ib9.a(gb9Var, this.e)) {
            this.b = 0L;
        }
    }

    @Override // defpackage.lda
    public final void e(long j) {
        qq5 qq5Var = (qq5) this.c.invoke();
        if (qq5Var == null || !qq5Var.e()) {
            return;
        }
        gb9 gb9Var = this.d;
        if (ib9.a(gb9Var, this.e)) {
            long jE = vf7.e(this.b, j);
            this.b = jE;
            long jE2 = vf7.e(this.a, jE);
            if (gb9Var.d()) {
                this.a = jE2;
                this.b = 0L;
            }
        }
    }

    @Override // defpackage.lda
    public final void onCancel() {
        long j = this.e;
        gb9 gb9Var = this.d;
        if (ib9.a(gb9Var, j)) {
            gb9Var.f();
        }
    }

    @Override // defpackage.lda
    public final void c() {
    }

    @Override // defpackage.lda
    public final void d() {
    }
}
