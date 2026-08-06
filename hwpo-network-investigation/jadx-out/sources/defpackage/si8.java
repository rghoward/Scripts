package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class si8 implements i13 {
    public final fy3 a;
    public final o13 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final o13.a a;

        public a(o13.a aVar) {
            this.a = aVar;
        }

        public final b a() {
            o13.c cVarM;
            o13.a aVar = this.a;
            o13 o13Var = o13.this;
            synchronized (o13Var) {
                aVar.a(true);
                cVarM = o13Var.m(aVar.a.a);
            }
            if (cVarM != null) {
                return new b(cVarM);
            }
            return null;
        }

        public final du7 b() {
            return this.a.b(0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements i13.b {
        public final o13.c t;

        public b(o13.c cVar) {
            this.t = cVar;
        }

        @Override // i13.b
        public final du7 G() {
            o13.c cVar = this.t;
            if (!cVar.u) {
                return cVar.t.c.get(0);
            }
            aa0.c("snapshot is closed");
            return null;
        }

        @Override // i13.b
        public final a Q() {
            o13.a aVarK;
            o13.c cVar = this.t;
            o13 o13Var = o13.this;
            synchronized (o13Var) {
                cVar.close();
                aVarK = o13Var.k(cVar.t.a);
            }
            if (aVarK != null) {
                return new a(aVarK);
            }
            return null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.t.close();
        }

        @Override // i13.b
        public final du7 getData() {
            o13.c cVar = this.t;
            if (!cVar.u) {
                return cVar.t.c.get(1);
            }
            aa0.c("snapshot is closed");
            return null;
        }
    }

    public si8(long j, n72 n72Var, fy3 fy3Var, du7 du7Var) {
        this.a = fy3Var;
        this.b = new o13(j, n72Var, fy3Var, du7Var);
    }

    @Override // defpackage.i13
    public final a a(String str) {
        g01 g01Var = g01.w;
        o13.a aVarK = this.b.k(g01.a.c(str).f("SHA-256").h());
        if (aVarK != null) {
            return new a(aVarK);
        }
        return null;
    }

    @Override // defpackage.i13
    public final b b(String str) {
        g01 g01Var = g01.w;
        o13.c cVarM = this.b.m(g01.a.c(str).f("SHA-256").h());
        if (cVarM != null) {
            return new b(cVarM);
        }
        return null;
    }

    @Override // defpackage.i13
    public final fy3 getFileSystem() {
        return this.a;
    }
}
