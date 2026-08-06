package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mga implements lda {
    public final /* synthetic */ qga a;

    public mga(qga qgaVar) {
        this.a = qgaVar;
    }

    @Override // defpackage.lda
    public final void a() {
        qga qgaVar = this.a;
        qgaVar.r.setValue(null);
        qgaVar.s.setValue(null);
    }

    @Override // defpackage.lda
    public final void b(long j, ca9 ca9Var) {
        sia siaVarD;
        qga qgaVar = this.a;
        long jA = ab9.a(qgaVar.l(true));
        u56 u56Var = qgaVar.d;
        if (u56Var == null || (siaVarD = u56Var.d()) == null) {
            return;
        }
        long jE = siaVarD.e(jA);
        qgaVar.o = jE;
        qgaVar.s.setValue(new vf7(jE));
        qgaVar.q = 0L;
        qgaVar.r.setValue(ys4.t);
        qgaVar.t(false);
    }

    @Override // defpackage.lda
    public final void c() {
        qga qgaVar = this.a;
        qgaVar.r.setValue(null);
        qgaVar.s.setValue(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lda
    public final void e(long j) {
        sia siaVarD;
        st4 st4Var;
        qga qgaVar = this.a;
        qgaVar.q = vf7.e(qgaVar.q, j);
        u56 u56Var = qgaVar.d;
        if (u56Var == null || (siaVarD = u56Var.d()) == null) {
            return;
        }
        qgaVar.s.setValue(new vf7(vf7.e(qgaVar.o, qgaVar.q)));
        ag7 ag7Var = qgaVar.b;
        vf7 vf7VarI = qgaVar.i();
        vf7VarI.getClass();
        int iA = ag7Var.a(siaVarD.b(vf7VarI.a, true));
        long jC = ay.c(iA, iA);
        if (lja.b(jC, qgaVar.n().b)) {
            return;
        }
        u56 u56Var2 = qgaVar.d;
        if ((u56Var2 == null || ((Boolean) u56Var2.q.getValue()).booleanValue()) && (st4Var = qgaVar.k) != null) {
            st4Var.a(9);
        }
        qgaVar.c.invoke(qga.e(qgaVar.n().a, jC));
        qgaVar.w = new lja(jC);
    }

    @Override // defpackage.lda
    public final void d() {
    }

    @Override // defpackage.lda
    public final void onCancel() {
    }
}
