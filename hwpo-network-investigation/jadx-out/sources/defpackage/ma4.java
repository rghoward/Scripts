package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ma4 extends pi4 implements ci4<v94, v94, g2b> {
    @Override // defpackage.ci4
    public final g2b invoke(v94 v94Var, v94 v94Var2) {
        boolean zE;
        v94 v94Var3 = v94Var;
        v94 v94Var4 = v94Var2;
        la4 la4Var = (la4) this.receiver;
        if (la4Var.G && (zE = v94Var4.e()) != v94Var3.e()) {
            oh4<Boolean, g2b> oh4Var = la4Var.K;
            if (oh4Var != null) {
                oh4Var.invoke(Boolean.valueOf(zE));
            }
            if (zE) {
                oy0.d(la4Var.Q1(), null, null, new na4(la4Var, null), 3);
                gl8 gl8Var = new gl8();
                sf7.a(la4Var, new ka4(gl8Var, la4Var));
                ez7 ez7Var = (ez7) gl8Var.t;
                la4Var.M = ez7Var != null ? ez7Var.b() : null;
                mb7 mb7Var = la4Var.N;
                if (mb7Var != null && mb7Var.g1().G) {
                    la4Var.g2();
                }
            } else {
                ez7.a aVar = la4Var.M;
                if (aVar != null) {
                    aVar.a();
                }
                la4Var.M = null;
                la4Var.g2();
            }
            ew2.f(la4Var).R();
            h27 h27Var = la4Var.J;
            if (h27Var != null) {
                v84 v84Var = la4Var.L;
                if (zE) {
                    if (v84Var != null) {
                        la4Var.f2(h27Var, new w84(v84Var));
                        la4Var.L = null;
                    }
                    v84 v84Var2 = new v84();
                    la4Var.f2(h27Var, v84Var2);
                    la4Var.L = v84Var2;
                } else if (v84Var != null) {
                    la4Var.f2(h27Var, new w84(v84Var));
                    la4Var.L = null;
                }
            }
        }
        return g2b.a;
    }
}
