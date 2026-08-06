package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wa0 implements ge7<u92.a> {
    public static final wa0 a = new wa0();
    public static final ou3 b = ou3.a("pid");
    public static final ou3 c = ou3.a("processName");
    public static final ou3 d = ou3.a("reasonCode");
    public static final ou3 e = ou3.a("importance");
    public static final ou3 f = ou3.a("pss");
    public static final ou3 g = ou3.a("rss");
    public static final ou3 h = ou3.a("timestamp");
    public static final ou3 i = ou3.a("traceFile");
    public static final ou3 j = ou3.a("buildIdMappingForArch");

    @Override // defpackage.wf3
    public final void a(Object obj, he7 he7Var) {
        u92.a aVar = (u92.a) obj;
        he7 he7Var2 = he7Var;
        he7Var2.e(b, aVar.c());
        he7Var2.a(c, aVar.d());
        he7Var2.e(d, aVar.f());
        he7Var2.e(e, aVar.b());
        he7Var2.g(f, aVar.e());
        he7Var2.g(g, aVar.g());
        he7Var2.g(h, aVar.h());
        he7Var2.a(i, aVar.i());
        he7Var2.a(j, aVar.a());
    }
}
