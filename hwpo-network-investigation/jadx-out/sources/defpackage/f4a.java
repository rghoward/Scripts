package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f4a {
    public final h4a a;
    public xr5 b;
    public final e c;
    public final c d;
    public final d e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        boolean a(b88 b88Var);

        b apply();

        boolean c();

        void cancel();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends wp5 implements ci4<qr5, yt1, g2b> {
        public c() {
            super(2);
        }

        @Override // defpackage.ci4
        public final g2b invoke(qr5 qr5Var, yt1 yt1Var) {
            f4a.this.a().u = yt1Var;
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d extends wp5 implements ci4<qr5, ci4<? super g4a, ? super xx1, ? extends gl6>, g2b> {
        public d() {
            super(2);
        }

        @Override // defpackage.ci4
        public final g2b invoke(qr5 qr5Var, ci4<? super g4a, ? super xx1, ? extends gl6> ci4Var) {
            xr5 xr5VarA = f4a.this.a();
            qr5Var.c(new yr5(xr5VarA, ci4Var, xr5VarA.I));
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e extends wp5 implements ci4<qr5, f4a, g2b> {
        public e() {
            super(2);
        }

        @Override // defpackage.ci4
        public final g2b invoke(qr5 qr5Var, f4a f4aVar) {
            qr5 qr5Var2 = qr5Var;
            f4a f4aVar2 = f4a.this;
            h4a h4aVar = f4aVar2.a;
            xr5 xr5Var = qr5Var2.a0;
            if (xr5Var == null) {
                xr5Var = new xr5(qr5Var2, h4aVar);
                qr5Var2.a0 = xr5Var;
            }
            f4aVar2.b = xr5Var;
            f4aVar2.a().h();
            xr5 xr5VarA = f4aVar2.a();
            if (xr5VarA.v != h4aVar) {
                xr5VarA.v = h4aVar;
                xr5VarA.i(false);
                qr5.g0(xr5VarA.t, false, 7);
            }
            return g2b.a;
        }
    }

    public f4a(h4a h4aVar) {
        this.a = h4aVar;
        this.c = new e();
        this.d = new c();
        this.e = new d();
    }

    public final xr5 a() {
        xr5 xr5Var = this.b;
        if (xr5Var != null) {
            return xr5Var;
        }
        z90.a("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
        default long a(int i) {
            return 0L;
        }

        default int b() {
            return 0;
        }

        void dispose();

        default void d(a88 a88Var) {
        }

        default void c(int i, long j) {
        }
    }

    public f4a() {
        this(fb7.a);
    }
}
