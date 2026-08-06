package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bc0 implements ge7<ou6> {
    public static final bc0 a = new bc0();
    public static final ou3 b = new ou3("projectNumber", wb0.a(vb0.b(we8.class, new x50(1))));
    public static final ou3 c = new ou3("messageId", wb0.a(vb0.b(we8.class, new x50(2))));
    public static final ou3 d = new ou3("instanceId", wb0.a(vb0.b(we8.class, new x50(3))));
    public static final ou3 e = new ou3("messageType", wb0.a(vb0.b(we8.class, new x50(4))));
    public static final ou3 f = new ou3("sdkPlatform", wb0.a(vb0.b(we8.class, new x50(5))));
    public static final ou3 g = new ou3("packageName", wb0.a(vb0.b(we8.class, new x50(6))));
    public static final ou3 h = new ou3("collapseKey", wb0.a(vb0.b(we8.class, new x50(7))));
    public static final ou3 i = new ou3("priority", wb0.a(vb0.b(we8.class, new x50(8))));
    public static final ou3 j = new ou3("ttl", wb0.a(vb0.b(we8.class, new x50(9))));
    public static final ou3 k = new ou3("topic", wb0.a(vb0.b(we8.class, new x50(10))));
    public static final ou3 l = new ou3("bulkId", wb0.a(vb0.b(we8.class, new x50(11))));
    public static final ou3 m = new ou3("event", wb0.a(vb0.b(we8.class, new x50(12))));
    public static final ou3 n = new ou3("analyticsLabel", wb0.a(vb0.b(we8.class, new x50(13))));
    public static final ou3 o = new ou3("campaignId", wb0.a(vb0.b(we8.class, new x50(14))));
    public static final ou3 p = new ou3("composerLabel", wb0.a(vb0.b(we8.class, new x50(15))));

    @Override // defpackage.wf3
    public final void a(Object obj, he7 he7Var) {
        ou6 ou6Var = (ou6) obj;
        he7 he7Var2 = he7Var;
        he7Var2.g(b, ou6Var.a);
        he7Var2.a(c, ou6Var.b);
        he7Var2.a(d, ou6Var.c);
        he7Var2.a(e, ou6Var.d);
        he7Var2.a(f, ou6.c.ANDROID);
        he7Var2.a(g, ou6Var.e);
        he7Var2.a(h, ou6Var.f);
        he7Var2.e(i, ou6Var.g);
        he7Var2.e(j, ou6Var.h);
        he7Var2.a(k, ou6Var.i);
        he7Var2.g(l, 0L);
        he7Var2.a(m, ou6.a.MESSAGE_DELIVERED);
        he7Var2.a(n, ou6Var.j);
        he7Var2.g(o, 0L);
        he7Var2.a(p, ou6Var.k);
    }
}
