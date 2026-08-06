package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ra0 implements ge7<od6> {
    public static final ra0 a = new ra0();
    public static final ou3 b = ou3.a("eventTimeMs");
    public static final ou3 c = ou3.a("eventCode");
    public static final ou3 d = ou3.a("complianceData");
    public static final ou3 e = ou3.a("eventUptimeMs");
    public static final ou3 f = ou3.a("sourceExtension");
    public static final ou3 g = ou3.a("sourceExtensionJsonProto3");
    public static final ou3 h = ou3.a("timezoneOffsetSeconds");
    public static final ou3 i = ou3.a("networkConnectionInfo");
    public static final ou3 j = ou3.a("experimentIds");

    @Override // defpackage.wf3
    public final void a(Object obj, he7 he7Var) {
        od6 od6Var = (od6) obj;
        he7 he7Var2 = he7Var;
        he7Var2.g(b, od6Var.c());
        he7Var2.a(c, od6Var.b());
        he7Var2.a(d, od6Var.a());
        he7Var2.g(e, od6Var.d());
        he7Var2.a(f, od6Var.g());
        he7Var2.a(g, od6Var.h());
        he7Var2.g(h, od6Var.i());
        he7Var2.a(i, od6Var.f());
        he7Var2.a(j, od6Var.e());
    }
}
