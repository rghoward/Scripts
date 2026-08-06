package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fc0 implements ge7<i1a> {
    public static final fc0 a = new fc0();
    public static final ou3 b = new ou3("currentCacheSizeBytes", wb0.a(vb0.b(we8.class, new x50(1))));
    public static final ou3 c = new ou3("maxCacheSizeBytes", wb0.a(vb0.b(we8.class, new x50(2))));

    @Override // defpackage.wf3
    public final void a(Object obj, he7 he7Var) {
        i1a i1aVar = (i1a) obj;
        he7 he7Var2 = he7Var;
        he7Var2.g(b, i1aVar.a);
        he7Var2.g(c, i1aVar.b);
    }
}
