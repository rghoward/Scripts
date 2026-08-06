package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class boa implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ uf5 t;
    public final /* synthetic */ qi u;
    public final /* synthetic */ boolean v;

    public boa(uf5 uf5Var, qi qiVar, boolean z) {
        this.t = uf5Var;
        this.u = qiVar;
        this.v = z;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        ox6.a aVar;
        qi qiVar;
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            jt1Var2.K(1866272144);
            uf5 uf5Var = this.t;
            int i = uf5Var.b;
            final int i2 = 0;
            while (true) {
                aVar = ox6.a.t;
                qiVar = this.u;
                if (i2 >= i) {
                    break;
                }
                int iA = (!qiVar.a.f() || qiVar.a.e() == 1) ? uf5Var.a(i2) : uf5Var.a(i2) % 12;
                boolean zH = jt1Var2.h(i2);
                Object objF = jt1Var2.f();
                if (zH || objF == jt1.a.a) {
                    objF = new oh4() { // from class: yna
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            ec9.i((hc9) obj, i2 + 1.0f);
                            return g2b.a;
                        }
                    };
                    jt1Var2.C(objF);
                }
                xna.d(pb9.b(aVar, false, (oh4) objF), qiVar, iA, this.v, jt1Var2, 0);
                i2++;
            }
            jt1Var2.B();
            if (qiVar.a.e() == 0 && qiVar.a.f()) {
                jt1Var2.K(2020585964);
                xna.a(gi0.c(ir9.j(yq5.d(aVar, wq5.u), y48.x), uh1.j, ay8.a), xna.b, gr1.b(-1385767514, new aoa(qiVar, this.v), jt1Var2), jt1Var2, 432);
                jt1Var2.B();
            } else {
                jt1Var2.K(2021505641);
                jt1Var2.B();
            }
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
