package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a1a {
    public static final a1a c = new a1a(null, null);
    public final qq5 a;
    public final ria b;

    public a1a(qq5 qq5Var, ria riaVar) {
        this.a = qq5Var;
        this.b = riaVar;
    }

    public static a1a a(a1a a1aVar, mb7 mb7Var, ria riaVar, int i) {
        qq5 qq5Var = mb7Var;
        if ((i & 1) != 0) {
            qq5Var = a1aVar.a;
        }
        if ((i & 2) != 0) {
            riaVar = a1aVar.b;
        }
        return new a1a(qq5Var, riaVar);
    }
}
