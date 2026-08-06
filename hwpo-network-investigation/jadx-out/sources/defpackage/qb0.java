package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qb0 implements ge7<u92.e.d.AbstractC0265e> {
    public static final qb0 a = new qb0();
    public static final ou3 b = ou3.a("rolloutVariant");
    public static final ou3 c = ou3.a("parameterKey");
    public static final ou3 d = ou3.a("parameterValue");
    public static final ou3 e = ou3.a("templateVersion");

    @Override // defpackage.wf3
    public final void a(Object obj, he7 he7Var) {
        u92.e.d.AbstractC0265e abstractC0265e = (u92.e.d.AbstractC0265e) obj;
        he7 he7Var2 = he7Var;
        he7Var2.a(b, abstractC0265e.c());
        he7Var2.a(c, abstractC0265e.a());
        he7Var2.a(d, abstractC0265e.b());
        he7Var2.g(e, abstractC0265e.d());
    }
}
