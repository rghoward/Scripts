package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class aoa implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ qi t;
    public final /* synthetic */ boolean u;

    public aoa(qi qiVar, boolean z) {
        this.t = qiVar;
        this.u = z;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            int i = xna.j.b;
            for (final int i2 = 0; i2 < i; i2++) {
                int iA = xna.j.a(i2);
                boolean zH = jt1Var2.h(i2);
                Object objF = jt1Var2.f();
                if (zH || objF == jt1.a.a) {
                    objF = new oh4() { // from class: zna
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            ec9.i((hc9) obj, 12.0f + i2);
                            return g2b.a;
                        }
                    };
                    jt1Var2.C(objF);
                }
                xna.d(pb9.b(ox6.a.t, false, (oh4) objF), this.t, iA, this.u, jt1Var2, 0);
            }
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
