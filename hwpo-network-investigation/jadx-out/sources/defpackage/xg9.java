package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xg9 implements wg9 {
    public static final /* synthetic */ ho5<Object>[] f = {new z27(xg9.class, "accessToken", "getAccessToken()Ljava/lang/String;", 0)};
    public final ah9 a;
    public final e6 b;
    public final a0a c;
    public final zq6 d;
    public final a0a e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends pi4 implements mh4<String> {
        @Override // defpackage.mh4
        public final String invoke() {
            return ((e6) this.receiver).b();
        }
    }

    public xg9(ah9 ah9Var, e6 e6Var) {
        this.a = ah9Var;
        this.b = e6Var;
        a0a a0aVarB = b0a.b(null);
        this.c = a0aVarB;
        this.d = new zq6(ah9Var, new a(0, e6Var, e6.class, "getAuthToken", "getAuthToken()Ljava/lang/String;", 0));
        this.e = a0aVarB;
    }

    @Override // defpackage.wg9
    public final a0a a() {
        return this.e;
    }

    @Override // defpackage.wg9
    public final h5b b() {
        return (h5b) this.c.getValue();
    }

    @Override // defpackage.wg9
    public final void c(h5b h5bVar) {
        a0a a0aVar = this.c;
        a0aVar.getClass();
        a0aVar.l(null, h5bVar);
    }

    @Override // defpackage.wg9
    public final void clear() {
        this.a.clear();
        this.c.setValue(null);
    }

    @Override // defpackage.wg9
    public final String d() {
        return (String) this.d.a(this, f[0]);
    }

    @Override // defpackage.wg9
    public final void e(String str) {
        this.d.b(this, f[0], str);
    }
}
