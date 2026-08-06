package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oga implements lda {
    public final /* synthetic */ qga a;
    public final /* synthetic */ boolean b;

    public oga(qga qgaVar, boolean z) {
        this.a = qgaVar;
        this.b = z;
    }

    @Override // defpackage.lda
    public final void a() {
        qga qgaVar = this.a;
        qgaVar.r.setValue(null);
        qgaVar.s.setValue(null);
        qgaVar.t(true);
    }

    @Override // defpackage.lda
    public final void c() {
        qga qgaVar = this.a;
        qgaVar.r.setValue(null);
        qgaVar.s.setValue(null);
        qgaVar.t(true);
    }

    @Override // defpackage.lda
    public final void d() {
        sia siaVarD;
        boolean z = this.b;
        ys4 ys4Var = z ? ys4.u : ys4.v;
        qga qgaVar = this.a;
        qgaVar.r.setValue(ys4Var);
        long jA = ab9.a(qgaVar.l(z));
        u56 u56Var = qgaVar.d;
        if (u56Var == null || (siaVarD = u56Var.d()) == null) {
            return;
        }
        long jE = siaVarD.e(jA);
        qgaVar.o = jE;
        qgaVar.s.setValue(new vf7(jE));
        qgaVar.q = 0L;
        qgaVar.t = -1;
        u56 u56Var2 = qgaVar.d;
        if (u56Var2 != null) {
            u56Var2.q.setValue(Boolean.TRUE);
        }
        qgaVar.t(false);
    }

    @Override // defpackage.lda
    public final void e(long j) {
        qga qgaVar = this.a;
        long jE = vf7.e(qgaVar.q, j);
        qgaVar.q = jE;
        qgaVar.s.setValue(new vf7(vf7.e(qgaVar.o, jE)));
        kha khaVarN = qgaVar.n();
        vf7 vf7VarI = qgaVar.i();
        vf7VarI.getClass();
        qga.c(qgaVar, khaVarN, vf7VarI.a, false, this.b, ca9.a.d, true, new tt4(9));
        qgaVar.t(false);
    }

    @Override // defpackage.lda
    public final void onCancel() {
    }

    @Override // defpackage.lda
    public final void b(long j, ca9 ca9Var) {
    }
}
