package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface ca9 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final s43 a = new s43();
        public static final t43 b = new t43();
        public static final u43 c = new u43();
        public static final v43 d = new v43();

        /* JADX INFO: renamed from: ca9$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0038a implements pu0 {
            public static final C0038a a = new C0038a();

            @Override // defpackage.pu0
            public final long a(u99 u99Var, int i) {
                String str = u99Var.d.a.a.u;
                return ay.c(g2a.b(str, i), g2a.a(str, i));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class b implements pu0 {
            public static final b a = new b();

            @Override // defpackage.pu0
            public final long a(u99 u99Var, int i) {
                return u99Var.d.j(i);
            }
        }
    }

    ba9 a(rq9 rq9Var);
}
