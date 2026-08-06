package defpackage;

import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iq2 implements il0 {
    public static final iq2 a = new iq2();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements ci4<jt1, Integer, g2b> {
        public final /* synthetic */ jl0 t;

        public a(jl0 jl0Var) {
            this.t = jl0Var;
        }

        @Override // defpackage.ci4
        public final g2b invoke(jt1 jt1Var, Integer num) {
            jt1 jt1Var2 = jt1Var;
            int iIntValue = num.intValue();
            if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                String strB = ws3.b(jt1Var2, R.string.m3c_dialog);
                jl0 jl0Var = this.t;
                ox6 ox6Var = jl0Var.b;
                ko7 ko7Var = ci.a;
                ox6 ox6VarM = ir9.m(ox6Var, 280.0f, 0.0f, 560.0f, 0.0f, 10);
                boolean zJ = jt1Var2.J(strB);
                Object objF = jt1Var2.f();
                if (zJ || objF == jt1.a.a) {
                    objF = new ql0(1, strB);
                    jt1Var2.C(objF);
                }
                ox6 ox6VarH = ox6VarM.H(pb9.b(ox6.a.t, false, (oh4) objF));
                fl6 fl6VarD = dv0.d(di.a.a, true);
                int iD = jt1Var2.D();
                kw7 kw7VarY = jt1Var2.y();
                ox6 ox6VarC = it1.c(jt1Var2, ox6VarH);
                bt1.c.getClass();
                qr5.a aVar = bt1.a.b;
                if (jt1Var2.s() == null) {
                    ml5.c();
                    throw null;
                }
                jt1Var2.q();
                if (jt1Var2.l()) {
                    jt1Var2.k(aVar);
                } else {
                    jt1Var2.z();
                }
                rd7.d(jt1Var2, bt1.a.f, fl6VarD);
                rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                bt1.a.b bVar = bt1.a.g;
                if (jt1Var2.l() || !xj5.a(jt1Var2.f(), Integer.valueOf(iD))) {
                    rh.b(iD, jt1Var2, iD, bVar);
                }
                rd7.d(jt1Var2, bt1.a.d, ox6VarC);
                jl0Var.d.invoke(jt1Var2, 0);
                jt1Var2.I();
            } else {
                jt1Var2.u();
            }
            return g2b.a;
        }
    }

    @Override // defpackage.il0
    public final void a(jl0 jl0Var, jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1565826668);
        int i2 = (bj4VarO.J(jl0Var) ? 4 : 2) | i;
        if (bj4VarO.A(i2 & 1, (i2 & 3) != 2)) {
            wn.a(jl0Var.a, jl0Var.c, gr1.b(1163527043, new a(jl0Var), bj4VarO), bj4VarO, 384, 0);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new nl0(i, 1, this, jl0Var);
        }
    }
}
