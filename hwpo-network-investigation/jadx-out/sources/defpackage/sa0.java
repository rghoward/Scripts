package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sa0 implements ge7<td6> {
    public static final sa0 a = new sa0();
    public static final ou3 b = ou3.a("requestTimeMs");
    public static final ou3 c = ou3.a("requestUptimeMs");
    public static final ou3 d = ou3.a("clientInfo");
    public static final ou3 e = ou3.a("logSource");
    public static final ou3 f = ou3.a("logSourceName");
    public static final ou3 g = ou3.a("logEvent");
    public static final ou3 h = ou3.a("qosTier");

    @Override // defpackage.wf3
    public final void a(Object obj, he7 he7Var) {
        td6 td6Var = (td6) obj;
        he7 he7Var2 = he7Var;
        he7Var2.g(b, td6Var.f());
        he7Var2.g(c, td6Var.g());
        he7Var2.a(d, td6Var.a());
        he7Var2.a(e, td6Var.c());
        he7Var2.a(f, td6Var.d());
        he7Var2.a(g, td6Var.b());
        he7Var2.a(h, td6Var.e());
    }
}
