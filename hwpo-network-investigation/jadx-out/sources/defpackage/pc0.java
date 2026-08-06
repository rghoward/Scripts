package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pc0 implements ge7<yg9> {
    public static final pc0 a = new pc0();
    public static final ou3 b = ou3.a("sessionId");
    public static final ou3 c = ou3.a("firstSessionId");
    public static final ou3 d = ou3.a("sessionIndex");
    public static final ou3 e = ou3.a("eventTimestampUs");
    public static final ou3 f = ou3.a("dataCollectionStatus");
    public static final ou3 g = ou3.a("firebaseInstallationId");
    public static final ou3 h = ou3.a("firebaseAuthenticationToken");

    @Override // defpackage.wf3
    public final void a(Object obj, he7 he7Var) {
        yg9 yg9Var = (yg9) obj;
        he7 he7Var2 = he7Var;
        he7Var2.a(b, yg9Var.a);
        he7Var2.a(c, yg9Var.b);
        he7Var2.e(d, yg9Var.c);
        he7Var2.g(e, yg9Var.d);
        he7Var2.a(f, yg9Var.e);
        he7Var2.a(g, yg9Var.f);
        he7Var2.a(h, yg9Var.g);
    }
}
