package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nb0 implements ge7<u92.e.d.c> {
    public static final nb0 a = new nb0();
    public static final ou3 b = ou3.a("batteryLevel");
    public static final ou3 c = ou3.a("batteryVelocity");
    public static final ou3 d = ou3.a("proximityOn");
    public static final ou3 e = ou3.a("orientation");
    public static final ou3 f = ou3.a("ramUsed");
    public static final ou3 g = ou3.a("diskUsed");

    @Override // defpackage.wf3
    public final void a(Object obj, he7 he7Var) {
        u92.e.d.c cVar = (u92.e.d.c) obj;
        he7 he7Var2 = he7Var;
        he7Var2.a(b, cVar.a());
        he7Var2.e(c, cVar.b());
        he7Var2.d(d, cVar.f());
        he7Var2.e(e, cVar.d());
        he7Var2.g(f, cVar.e());
        he7Var2.g(g, cVar.c());
    }
}
