package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wd3 {
    public static final c33 a = new c33();

    public static final void a(Object obj, oh4 oh4Var, jt1 jt1Var) {
        boolean zJ = jt1Var.J(obj);
        Object objF = jt1Var.f();
        if (zJ || objF == jt1.a.a) {
            objF = new a33(oh4Var);
            jt1Var.C(objF);
        }
    }

    public static final void b(Object obj, Object obj2, oh4 oh4Var, jt1 jt1Var) {
        boolean zJ = jt1Var.J(obj) | jt1Var.J(obj2);
        Object objF = jt1Var.f();
        if (zJ || objF == jt1.a.a) {
            objF = new a33(oh4Var);
            jt1Var.C(objF);
        }
    }

    public static final void c(Object[] objArr, oh4 oh4Var, jt1 jt1Var) {
        boolean zJ = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zJ |= jt1Var.J(obj);
        }
        Object objF = jt1Var.f();
        if (zJ || objF == jt1.a.a) {
            jt1Var.C(new a33(oh4Var));
        }
    }

    public static final void d(jt1 jt1Var, ci4 ci4Var, Object obj) {
        h72 h72VarX = jt1Var.x();
        boolean zJ = jt1Var.J(obj);
        Object objF = jt1Var.f();
        if (zJ || objF == jt1.a.a) {
            objF = new iq5(h72VarX, ci4Var);
            jt1Var.C(objF);
        }
    }

    public static final void e(nz5 nz5Var, Boolean bool, Boolean bool2, ci4 ci4Var, jt1 jt1Var) {
        h72 h72VarX = jt1Var.x();
        boolean zJ = jt1Var.J(nz5Var) | jt1Var.J(bool) | jt1Var.J(bool2);
        Object objF = jt1Var.f();
        if (zJ || objF == jt1.a.a) {
            objF = new iq5(h72VarX, ci4Var);
            jt1Var.C(objF);
        }
    }

    public static final void f(Object obj, Object obj2, ci4 ci4Var, jt1 jt1Var) {
        h72 h72VarX = jt1Var.x();
        boolean zJ = jt1Var.J(obj) | jt1Var.J(obj2);
        Object objF = jt1Var.f();
        if (zJ || objF == jt1.a.a) {
            objF = new iq5(h72VarX, ci4Var);
            jt1Var.C(objF);
        }
    }

    public static final t72 g(jt1 jt1Var) {
        return new nm8(jt1Var.x());
    }
}
