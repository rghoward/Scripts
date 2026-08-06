package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zt7 implements p89 {
    public id4 a;
    public apa b;
    public hsa c;

    public zt7(String str) {
        id4.a aVar = new id4.a();
        aVar.m = fv6.n("video/mp2t");
        aVar.n = fv6.n(str);
        this.a = new id4(aVar);
    }

    @Override // defpackage.p89
    public final void a(pt7 pt7Var) {
        long jD;
        long j;
        this.b.getClass();
        String str = n6b.a;
        apa apaVar = this.b;
        synchronized (apaVar) {
            try {
                long j2 = apaVar.c;
                jD = j2 != -9223372036854775807L ? j2 + apaVar.b : apaVar.d();
            } catch (Throwable th) {
                throw th;
            }
        }
        apa apaVar2 = this.b;
        synchronized (apaVar2) {
            j = apaVar2.b;
        }
        if (jD == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        id4 id4Var = this.a;
        if (j != id4Var.t) {
            id4.a aVarA = id4Var.a();
            aVarA.s = j;
            id4 id4Var2 = new id4(aVarA);
            this.a = id4Var2;
            this.c.g(id4Var2);
        }
        int iA = pt7Var.a();
        this.c.e(iA, pt7Var);
        this.c.a(jD, 1, iA, 0, null);
    }

    @Override // defpackage.p89
    public final void b(apa apaVar, ls3 ls3Var, pya.c cVar) {
        this.b = apaVar;
        cVar.a();
        cVar.b();
        hsa hsaVarP = ls3Var.p(cVar.d, 5);
        this.c = hsaVarP;
        hsaVarP.g(this.a);
    }
}
