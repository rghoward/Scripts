package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d06 {
    public static final vb6 a;

    static {
        ub6.c cVar = new ub6.c(false);
        a = new vb6(ub6.b.b, cVar, cVar);
    }

    public static final a06 a(r54 r54Var, jt1 jt1Var) {
        boolean zJ = jt1Var.J(r54Var);
        Object objF = jt1Var.f();
        Object obj = jt1.a.a;
        if (zJ || objF == obj) {
            objF = new a06(r54Var);
            jt1Var.C(objF);
        }
        a06 a06Var = (a06) objF;
        Object obj2 = ff3.t;
        boolean zJ2 = jt1Var.j(obj2) | jt1Var.j(a06Var);
        Object objF2 = jt1Var.f();
        if (zJ2 || objF2 == obj) {
            objF2 = new b06(a06Var, null);
            jt1Var.C(objF2);
        }
        wd3.d(jt1Var, (ci4) objF2, a06Var);
        boolean zJ3 = jt1Var.j(obj2) | jt1Var.j(a06Var);
        Object objF3 = jt1Var.f();
        if (zJ3 || objF3 == obj) {
            objF3 = new c06(a06Var, null);
            jt1Var.C(objF3);
        }
        wd3.d(jt1Var, (ci4) objF3, a06Var);
        return a06Var;
    }
}
