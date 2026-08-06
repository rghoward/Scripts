package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oc0 implements ge7<ng9> {
    public static final oc0 a = new oc0();
    public static final ou3 b = ou3.a("eventType");
    public static final ou3 c = ou3.a("sessionData");
    public static final ou3 d = ou3.a("applicationInfo");

    @Override // defpackage.wf3
    public final void a(Object obj, he7 he7Var) {
        ng9 ng9Var = (ng9) obj;
        he7 he7Var2 = he7Var;
        ng9Var.getClass();
        he7Var2.a(b, dn3.SESSION_START);
        he7Var2.a(c, ng9Var.a);
        he7Var2.a(d, ng9Var.b);
    }
}
