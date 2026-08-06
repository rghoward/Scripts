package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ms4 implements ls4 {
    public static final a Companion = new a();
    public final es4 a;
    public final q1 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public ms4(es4 es4Var) {
        es4Var.getClass();
        this.a = es4Var;
        this.b = new q1();
    }

    @Override // defpackage.ls4
    public final j74 a() {
        return this.b.b;
    }

    @Override // defpackage.ls4
    public final Object b(String str, boolean z, String str2, String str3, jq8 jq8Var) throws Throwable {
        Object objC = nr1.c.c(z, str, new ns4(0, this.b, p1.class, "getNextPageKey", "getNextPageKey()Ljava/lang/Integer;", 0), new os4(this, str2, str3, null), new ps4(this, null), new qs4(this, null), jq8Var);
        return objC == v72.t ? objC : g2b.a;
    }
}
