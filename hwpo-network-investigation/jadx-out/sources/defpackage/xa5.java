package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xa5 {
    public static final u93 a = new u93(new sj3(1));

    public static final ox6 a(final va5 va5Var, final h27 h27Var) {
        ox6.a aVar = ox6.a.t;
        if (va5Var == null) {
            return aVar;
        }
        return va5Var instanceof bb5 ? new za5(h27Var, (bb5) va5Var) : it1.a(aVar, new ei4() { // from class: wa5
            @Override // defpackage.ei4
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                jt1 jt1Var = (jt1) obj2;
                ((Integer) obj3).getClass();
                jt1Var.K(-353972293);
                va5Var.getClass();
                jt1Var.K(1257603829);
                jt1Var.B();
                db7 db7Var = db7.a;
                boolean zJ = jt1Var.J(db7Var);
                Object objF = jt1Var.f();
                if (zJ || objF == jt1.a.a) {
                    objF = new ya5(db7Var);
                    jt1Var.C(objF);
                }
                ya5 ya5Var = (ya5) objF;
                jt1Var.B();
                return ya5Var;
            }
        });
    }
}
