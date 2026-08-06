package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ya0 implements ge7<u92> {
    public static final ya0 a = new ya0();
    public static final ou3 b = ou3.a("sdkVersion");
    public static final ou3 c = ou3.a("gmpAppId");
    public static final ou3 d = ou3.a("platform");
    public static final ou3 e = ou3.a("installationUuid");
    public static final ou3 f = ou3.a("firebaseInstallationId");
    public static final ou3 g = ou3.a("firebaseAuthenticationToken");
    public static final ou3 h = ou3.a("appQualitySessionId");
    public static final ou3 i = ou3.a("buildVersion");
    public static final ou3 j = ou3.a("displayVersion");
    public static final ou3 k = ou3.a("session");
    public static final ou3 l = ou3.a("ndkPayload");
    public static final ou3 m = ou3.a("appExitInfo");

    @Override // defpackage.wf3
    public final void a(Object obj, he7 he7Var) {
        u92 u92Var = (u92) obj;
        he7 he7Var2 = he7Var;
        he7Var2.a(b, u92Var.k());
        he7Var2.a(c, u92Var.g());
        he7Var2.e(d, u92Var.j());
        he7Var2.a(e, u92Var.h());
        he7Var2.a(f, u92Var.f());
        he7Var2.a(g, u92Var.e());
        he7Var2.a(h, u92Var.b());
        he7Var2.a(i, u92Var.c());
        he7Var2.a(j, u92Var.d());
        he7Var2.a(k, u92Var.l());
        he7Var2.a(l, u92Var.i());
        he7Var2.a(m, u92Var.a());
    }
}
