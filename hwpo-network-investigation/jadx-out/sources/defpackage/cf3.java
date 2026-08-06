package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class cf3 implements vg5 {
    @Override // defpackage.vg5
    public final qu8 intercept(vg5.a aVar) {
        aj8 aj8Var = (aj8) aVar;
        qu8 qu8VarA = aj8Var.a(aj8Var.e);
        if (!qu8VarA.J) {
            return qu8VarA;
        }
        int i = qu8VarA.w;
        if (i != 204 && i != 205) {
            return qu8VarA;
        }
        su8 su8Var = qu8VarA.z;
        if ((su8Var != null ? su8Var.k() : -1L) >= 0) {
            qu8.a aVarK = qu8VarA.k();
            aVarK.c = 200;
            return aVarK.a();
        }
        tu8 tu8Var = su8.u;
        ol8 ol8Var = wq6.e;
        tu8 tu8VarA = su8.b.a(BuildConfig.FLAVOR, wq6.a.a("text/plain"));
        qu8.a aVarK2 = qu8VarA.k();
        aVarK2.c = 200;
        aVarK2.g = tu8VarA;
        return aVarK2.a();
    }
}
