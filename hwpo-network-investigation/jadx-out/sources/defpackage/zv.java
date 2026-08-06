package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zv implements jac {
    public static final /* synthetic */ zv t = new zv();

    public static yv b(float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return new yv(b0a.v, Float.valueOf(f), new bw(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yv c(yv yvVar, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = ((Number) yvVar.u.getValue()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((bw) yvVar.v).a;
        }
        return new yv(yvVar.t, Float.valueOf(f), new bw(f2), yvVar.w, yvVar.x, yvVar.y);
    }

    public static final long d(dr7 dr7Var) {
        return wk6.c(dr7Var.l() * dr7Var.q()) + (((long) dr7Var.k()) * ((long) dr7Var.q()));
    }

    public static final ky8 e(pj5 pj5Var) {
        Object objG = pj5Var.g();
        if (objG instanceof ky8) {
            return (ky8) objG;
        }
        return null;
    }

    public static final float f(ky8 ky8Var) {
        if (ky8Var != null) {
            return ky8Var.a;
        }
        return 0.0f;
    }

    public static Object g(mh4 mh4Var, u02 u02Var) {
        return oy0.g(ff3.t, new jj5(mh4Var, null), u02Var);
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Long.valueOf(u4c.u.get().m());
    }
}
