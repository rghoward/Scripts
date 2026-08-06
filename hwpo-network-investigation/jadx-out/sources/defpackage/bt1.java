package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface bt1 {
    public static final a c = a.a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final qr5.a b = qr5.a.u;
        public static final f c = f.u;
        public static final d d = d.u;
        public static final e e = e.u;
        public static final c f = c.u;
        public static final b g = b.u;
        public static final C0034a h = C0034a.u;

        /* JADX INFO: renamed from: bt1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0034a extends wp5 implements oh4<bt1, g2b> {
            public static final C0034a u = new C0034a(1);

            @Override // defpackage.oh4
            public final g2b invoke(bt1 bt1Var) {
                bt1 bt1Var2 = bt1Var;
                qr5 qr5Var = bt1Var2 instanceof qr5 ? (qr5) bt1Var2 : null;
                if (qr5Var != null && qr5Var.j0) {
                    uc5.b("Apply is called on deactivated node " + bt1Var2);
                }
                return g2b.a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class b extends wp5 implements ci4<bt1, Integer, g2b> {
            public static final b u = new b(2);

            @Override // defpackage.ci4
            public final g2b invoke(bt1 bt1Var, Integer num) {
                bt1Var.f(num.intValue());
                return g2b.a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class c extends wp5 implements ci4<bt1, fl6, g2b> {
            public static final c u = new c(2);

            @Override // defpackage.ci4
            public final g2b invoke(bt1 bt1Var, fl6 fl6Var) {
                bt1Var.c(fl6Var);
                return g2b.a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class d extends wp5 implements ci4<bt1, ox6, g2b> {
            public static final d u = new d(2);

            @Override // defpackage.ci4
            public final g2b invoke(bt1 bt1Var, ox6 ox6Var) {
                bt1Var.l(ox6Var);
                return g2b.a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class e extends wp5 implements ci4<bt1, ou1, g2b> {
            public static final e u = new e(2);

            @Override // defpackage.ci4
            public final g2b invoke(bt1 bt1Var, ou1 ou1Var) {
                bt1Var.k(ou1Var);
                return g2b.a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class f extends wp5 implements mh4<qr5> {
            public static final f u = new f(0);

            @Override // defpackage.mh4
            public final qr5 invoke() {
                return new qr5(2);
            }
        }
    }

    void c(fl6 fl6Var);

    void f(int i);

    void k(ou1 ou1Var);

    void l(ox6 ox6Var);
}
