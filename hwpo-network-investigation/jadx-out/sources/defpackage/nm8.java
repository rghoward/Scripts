package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nm8 implements t72, im8 {
    public static final m41 w = new m41();
    public final h72 t;
    public final nm8 u = this;
    public volatile h72 v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends y0 implements o72 {
        public final /* synthetic */ du1 u;
        public final /* synthetic */ nm8 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(du1 du1Var, nm8 nm8Var) {
            super(o72.a.t);
            this.u = du1Var;
            this.v = nm8Var;
        }

        @Override // defpackage.o72
        public final void B(h72 h72Var, Throwable th) throws Throwable {
            du1 du1Var = this.u;
            nm8 nm8Var = this.v;
            du1Var.b(nm8Var, th);
            o72 o72Var = (o72) nm8Var.t.d0(o72.a.t);
            if (o72Var == null) {
                throw th;
            }
            o72Var.B(h72Var, th);
        }
    }

    public nm8(h72 h72Var) {
        this.t = h72Var;
    }

    public final void a() {
        synchronized (this.u) {
            try {
                h72 h72Var = this.v;
                if (h72Var == null) {
                    this.v = w;
                } else {
                    sd.c(h72Var, new ed4());
                }
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.im8
    public final void b() {
        a();
    }

    @Override // defpackage.im8
    public final void c() {
        a();
    }

    @Override // defpackage.t72
    public final h72 getCoroutineContext() {
        h72 h72VarC0;
        h72 h72Var = this.v;
        if (h72Var == null || h72Var == w) {
            du1 du1Var = (du1) this.t.d0(du1.u);
            h72 aVar = du1Var != null ? new a(du1Var, this) : ff3.t;
            synchronized (this.u) {
                try {
                    h72 h72Var2 = this.v;
                    if (h72Var2 == null) {
                        h72 h72Var3 = this.t;
                        h72VarC0 = h72Var3.c0(new gl5((el5) h72Var3.d0(el5.a.t))).c0(ff3.t).c0(aVar);
                    } else if (h72Var2 == w) {
                        h72 h72Var4 = this.t;
                        gl5 gl5Var = new gl5((el5) h72Var4.d0(el5.a.t));
                        gl5Var.z(new ed4());
                        h72VarC0 = h72Var4.c0(gl5Var).c0(ff3.t).c0(aVar);
                    } else {
                        h72VarC0 = h72Var2;
                    }
                    this.v = h72VarC0;
                    g2b g2bVar = g2b.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            h72Var = h72VarC0;
        }
        h72Var.getClass();
        return h72Var;
    }

    @Override // defpackage.im8
    public final void d() {
    }
}
