package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ib0 implements ge7<u92.e.d.a.b.AbstractC0259b> {
    public static final ib0 a = new ib0();
    public static final ou3 b = ou3.a("type");
    public static final ou3 c = ou3.a("reason");
    public static final ou3 d = ou3.a("frames");
    public static final ou3 e = ou3.a("causedBy");
    public static final ou3 f = ou3.a("overflowCount");

    @Override // defpackage.wf3
    public final void a(Object obj, he7 he7Var) {
        u92.e.d.a.b.AbstractC0259b abstractC0259b = (u92.e.d.a.b.AbstractC0259b) obj;
        he7 he7Var2 = he7Var;
        he7Var2.a(b, abstractC0259b.e());
        he7Var2.a(c, abstractC0259b.d());
        he7Var2.a(d, abstractC0259b.b());
        he7Var2.a(e, abstractC0259b.a());
        he7Var2.e(f, abstractC0259b.c());
    }
}
