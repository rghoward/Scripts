package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bb0 implements ge7<u92.e.a> {
    public static final bb0 a = new bb0();
    public static final ou3 b = ou3.a("identifier");
    public static final ou3 c = ou3.a("version");
    public static final ou3 d = ou3.a("displayVersion");
    public static final ou3 e = ou3.a("organization");
    public static final ou3 f = ou3.a("installationUuid");
    public static final ou3 g = ou3.a("developmentPlatform");
    public static final ou3 h = ou3.a("developmentPlatformVersion");

    @Override // defpackage.wf3
    public final void a(Object obj, he7 he7Var) {
        u92.e.a aVar = (u92.e.a) obj;
        he7 he7Var2 = he7Var;
        he7Var2.a(b, aVar.d());
        he7Var2.a(c, aVar.g());
        he7Var2.a(d, aVar.c());
        he7Var2.a(e, aVar.f());
        he7Var2.a(f, aVar.e());
        he7Var2.a(g, aVar.a());
        he7Var2.a(h, aVar.b());
    }
}
