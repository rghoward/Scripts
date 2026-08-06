package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kb0 implements ge7<u92.e.d.a.b.AbstractC0260d> {
    public static final kb0 a = new kb0();
    public static final ou3 b = ou3.a("name");
    public static final ou3 c = ou3.a("importance");
    public static final ou3 d = ou3.a("frames");

    @Override // defpackage.wf3
    public final void a(Object obj, he7 he7Var) {
        u92.e.d.a.b.AbstractC0260d abstractC0260d = (u92.e.d.a.b.AbstractC0260d) obj;
        he7 he7Var2 = he7Var;
        he7Var2.a(b, abstractC0260d.c());
        he7Var2.e(c, abstractC0260d.b());
        he7Var2.a(d, abstractC0260d.a());
    }
}
