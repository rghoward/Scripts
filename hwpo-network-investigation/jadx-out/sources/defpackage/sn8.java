package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sn8 {
    public static final Object a(s66 s66Var, s66.b bVar, ci4 ci4Var, p6a p6aVar) {
        if (bVar == s66.b.u) {
            z90.a("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
            return null;
        }
        if (s66Var.b() == s66.b.t) {
            return g2b.a;
        }
        Object objD = u72.d(new rn8(s66Var, bVar, ci4Var, null), p6aVar);
        return objD == v72.t ? objD : g2b.a;
    }
}
