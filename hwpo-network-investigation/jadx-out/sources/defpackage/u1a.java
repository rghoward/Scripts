package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u1a {
    public hsa b;
    public ls3 c;
    public ig7 d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final gg7 a = new gg7();
    public a j = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public id4 a;
        public v34.a b;
    }

    public void a(long j) {
        this.g = j;
    }

    public abstract long b(pt7 pt7Var);

    public abstract boolean c(pt7 pt7Var, long j, a aVar);

    public void d(boolean z) {
        if (z) {
            this.j = new a();
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements ig7 {
        @Override // defpackage.ig7
        public final long a(ks3 ks3Var) {
            return -1L;
        }

        @Override // defpackage.ig7
        public final t89 b() {
            return new t89.b(-9223372036854775807L);
        }

        @Override // defpackage.ig7
        public final void c(long j) {
        }
    }
}
