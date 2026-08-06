package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mb0 implements ge7<u92.e.d.a.c> {
    public static final mb0 a = new mb0();
    public static final ou3 b = ou3.a("processName");
    public static final ou3 c = ou3.a("pid");
    public static final ou3 d = ou3.a("importance");
    public static final ou3 e = ou3.a("defaultProcess");

    @Override // defpackage.wf3
    public final void a(Object obj, he7 he7Var) {
        u92.e.d.a.c cVar = (u92.e.d.a.c) obj;
        he7 he7Var2 = he7Var;
        he7Var2.a(b, cVar.c());
        he7Var2.e(c, cVar.b());
        he7Var2.e(d, cVar.a());
        he7Var2.d(e, cVar.d());
    }
}
