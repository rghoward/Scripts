package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mc0 implements ge7<we2> {
    public static final mc0 a = new mc0();
    public static final ou3 b = ou3.a("performance");
    public static final ou3 c = ou3.a("crashlytics");
    public static final ou3 d = ou3.a("sessionSamplingRate");

    @Override // defpackage.wf3
    public final void a(Object obj, he7 he7Var) {
        we2 we2Var = (we2) obj;
        he7 he7Var2 = he7Var;
        he7Var2.a(b, we2Var.a);
        he7Var2.a(c, we2Var.b);
        he7Var2.f(d, we2Var.c);
    }
}
