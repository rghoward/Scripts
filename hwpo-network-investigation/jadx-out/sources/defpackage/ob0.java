package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ob0 implements ge7<u92.e.d> {
    public static final ob0 a = new ob0();
    public static final ou3 b = ou3.a("timestamp");
    public static final ou3 c = ou3.a("type");
    public static final ou3 d = ou3.a("app");
    public static final ou3 e = ou3.a("device");
    public static final ou3 f = ou3.a("log");
    public static final ou3 g = ou3.a("rollouts");

    @Override // defpackage.wf3
    public final void a(Object obj, he7 he7Var) {
        u92.e.d dVar = (u92.e.d) obj;
        he7 he7Var2 = he7Var;
        he7Var2.g(b, dVar.e());
        he7Var2.a(c, dVar.f());
        he7Var2.a(d, dVar.a());
        he7Var2.a(e, dVar.b());
        he7Var2.a(f, dVar.c());
        he7Var2.a(g, dVar.d());
    }
}
