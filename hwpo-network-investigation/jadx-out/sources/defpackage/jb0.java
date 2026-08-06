package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jb0 implements ge7<u92.e.d.a.b.c> {
    public static final jb0 a = new jb0();
    public static final ou3 b = ou3.a("name");
    public static final ou3 c = ou3.a("code");
    public static final ou3 d = ou3.a("address");

    @Override // defpackage.wf3
    public final void a(Object obj, he7 he7Var) {
        u92.e.d.a.b.c cVar = (u92.e.d.a.b.c) obj;
        he7 he7Var2 = he7Var;
        he7Var2.a(b, cVar.c());
        he7Var2.a(c, cVar.b());
        he7Var2.g(d, cVar.a());
    }
}
