package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hb0 implements ge7<u92.e.d.a.b> {
    public static final hb0 a = new hb0();
    public static final ou3 b = ou3.a("threads");
    public static final ou3 c = ou3.a("exception");
    public static final ou3 d = ou3.a("appExitInfo");
    public static final ou3 e = ou3.a("signal");
    public static final ou3 f = ou3.a("binaries");

    @Override // defpackage.wf3
    public final void a(Object obj, he7 he7Var) {
        u92.e.d.a.b bVar = (u92.e.d.a.b) obj;
        he7 he7Var2 = he7Var;
        he7Var2.a(b, bVar.e());
        he7Var2.a(c, bVar.c());
        he7Var2.a(d, bVar.a());
        he7Var2.a(e, bVar.d());
        he7Var2.a(f, bVar.b());
    }
}
