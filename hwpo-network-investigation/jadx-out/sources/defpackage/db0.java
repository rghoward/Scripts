package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class db0 implements ge7<u92.e.c> {
    public static final db0 a = new db0();
    public static final ou3 b = ou3.a("arch");
    public static final ou3 c = ou3.a("model");
    public static final ou3 d = ou3.a("cores");
    public static final ou3 e = ou3.a("ram");
    public static final ou3 f = ou3.a("diskSpace");
    public static final ou3 g = ou3.a("simulator");
    public static final ou3 h = ou3.a("state");
    public static final ou3 i = ou3.a("manufacturer");
    public static final ou3 j = ou3.a("modelClass");

    @Override // defpackage.wf3
    public final void a(Object obj, he7 he7Var) {
        u92.e.c cVar = (u92.e.c) obj;
        he7 he7Var2 = he7Var;
        he7Var2.e(b, cVar.a());
        he7Var2.a(c, cVar.e());
        he7Var2.e(d, cVar.b());
        he7Var2.g(e, cVar.g());
        he7Var2.g(f, cVar.c());
        he7Var2.d(g, cVar.i());
        he7Var2.e(h, cVar.h());
        he7Var2.a(i, cVar.d());
        he7Var2.a(j, cVar.f());
    }
}
