package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gb0 implements ge7<u92.e.d.a.b.AbstractC0258a> {
    public static final gb0 a = new gb0();
    public static final ou3 b = ou3.a("baseAddress");
    public static final ou3 c = ou3.a("size");
    public static final ou3 d = ou3.a("name");
    public static final ou3 e = ou3.a("uuid");

    @Override // defpackage.wf3
    public final void a(Object obj, he7 he7Var) {
        u92.e.d.a.b.AbstractC0258a abstractC0258a = (u92.e.d.a.b.AbstractC0258a) obj;
        he7 he7Var2 = he7Var;
        he7Var2.g(b, abstractC0258a.a());
        he7Var2.g(c, abstractC0258a.c());
        he7Var2.a(d, abstractC0258a.b());
        String strD = abstractC0258a.d();
        he7Var2.a(e, strD != null ? strD.getBytes(u92.a) : null);
    }
}
