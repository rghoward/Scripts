package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xt {
    public static final ty9<Float> a = xv.b(0.0f, 0.0f, null, 7);
    public static final ty9<y43> b;

    static {
        Map<cza<?, ?>, Float> map = njb.a;
        b = xv.b(0.0f, 0.0f, new y43(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    public static final yz9 a(float f, a04 a04Var, jt1 jt1Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            a04Var = b;
        }
        return c(new y43(f), b0a.x, a04Var, null, "DpAnimation", jt1Var, (i << 3) & 896, 8);
    }

    public static final yz9 b(float f, a04 a04Var, jt1 jt1Var, int i) {
        if (a04Var == a) {
            jt1Var.K(1144115775);
            boolean zG = jt1Var.g(0.01f);
            Object objF = jt1Var.f();
            if (zG || objF == jt1.a.a) {
                objF = xv.b(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                jt1Var.C(objF);
            }
            a04Var = (ty9) objF;
            jt1Var.B();
        } else {
            jt1Var.K(1144225701);
            jt1Var.B();
        }
        return c(Float.valueOf(f), b0a.v, a04Var, null, "FloatAnimation", jt1Var, 0, 0);
    }

    public static final yz9 c(final Object obj, cza czaVar, wv wvVar, Float f, String str, jt1 jt1Var, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        Object objF = jt1Var.f();
        Object obj2 = jt1.a.a;
        if (objF == obj2) {
            objF = bl7.i(null);
            jt1Var.C(objF);
        }
        h37 h37Var = (h37) objF;
        Object objF2 = jt1Var.f();
        if (objF2 == obj2) {
            objF2 = new qt(obj, czaVar, f);
            jt1Var.C(objF2);
        }
        qt qtVar = (qt) objF2;
        h37 h37VarJ = bl7.j(null, jt1Var);
        if (f != null && (wvVar instanceof ty9)) {
            ty9 ty9Var = (ty9) wvVar;
            if (!xj5.a(ty9Var.c, f)) {
                wvVar = new ty9(ty9Var.a, ty9Var.b, f);
            }
        }
        h37 h37VarJ2 = bl7.j(wvVar, jt1Var);
        Object objF3 = jt1Var.f();
        if (objF3 == obj2) {
            objF3 = da1.a(-1, 6, null);
            jt1Var.C(objF3);
        }
        final p91 p91Var = (p91) objF3;
        boolean zJ = jt1Var.j(p91Var) | jt1Var.j(obj);
        Object objF4 = jt1Var.f();
        if (zJ || objF4 == obj2) {
            objF4 = new mh4() { // from class: vt
                @Override // defpackage.mh4
                public final Object invoke() {
                    p91Var.n(obj);
                    return g2b.a;
                }
            };
            jt1Var.C(objF4);
        }
        c33 c33Var = wd3.a;
        jt1Var.w((mh4) objF4);
        boolean zJ2 = jt1Var.j(p91Var) | jt1Var.j(qtVar) | jt1Var.J(h37VarJ2) | jt1Var.J(h37VarJ);
        Object objF5 = jt1Var.f();
        if (zJ2 || objF5 == obj2) {
            Object wtVar = new wt(p91Var, qtVar, h37VarJ2, h37VarJ, null);
            jt1Var.C(wtVar);
            objF5 = wtVar;
        }
        wd3.d(jt1Var, (ci4) objF5, p91Var);
        yz9 yz9Var = (yz9) h37Var.getValue();
        return yz9Var == null ? qtVar.c : yz9Var;
    }
}
