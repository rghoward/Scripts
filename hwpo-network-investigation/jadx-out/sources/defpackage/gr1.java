package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gr1 {
    public static final Object a = new Object();

    public static final int a(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final fr1 b(int i, di4 di4Var, jt1 jt1Var) {
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new fr1(true, i, di4Var);
            jt1Var.C(objF);
        }
        fr1 fr1Var = (fr1) objF;
        fr1Var.j(di4Var);
        return fr1Var;
    }

    public static final boolean c(vj8 vj8Var, vj8 vj8Var2) {
        if (vj8Var == null) {
            return true;
        }
        if (!(vj8Var instanceof xj8) || !(vj8Var2 instanceof xj8)) {
            return false;
        }
        xj8 xj8Var = (xj8) vj8Var;
        return !xj8Var.a() || vj8Var == vj8Var2 || xj5.a(xj8Var.c, ((xj8) vj8Var2).c);
    }
}
