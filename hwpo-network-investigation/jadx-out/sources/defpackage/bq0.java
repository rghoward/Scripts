package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bq0 {
    public final a a;
    public final f b;
    public c c;
    public final int d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a implements t89 {
        public final d a;
        public final long b;
        public final long c;
        public final long d;
        public final long e;
        public final long f;

        public a(d dVar, long j, long j2, long j3, long j4, long j5) {
            this.a = dVar;
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
        }

        @Override // defpackage.t89
        public final boolean b() {
            return true;
        }

        @Override // defpackage.t89
        public final t89.a e(long j) {
            v89 v89Var = new v89(j, c.a(this.a.a(j), 0L, this.c, this.d, this.e, this.f));
            return new t89.a(v89Var, v89Var);
        }

        @Override // defpackage.t89
        public final long g() {
            return this.b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c {
        public final long a;
        public final long b;
        public final long c;
        public long d = 0;
        public long e;
        public long f;
        public long g;
        public long h;

        public c(long j, long j2, long j3, long j4, long j5, long j6) {
            this.a = j;
            this.b = j2;
            this.e = j3;
            this.f = j4;
            this.g = j5;
            this.c = j6;
            this.h = a(j2, 0L, j3, j4, j5, j6);
        }

        public static long a(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
            return n6b.j(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface d {
        long a(long j);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e {
        public static final e d = new e(-9223372036854775807L, -3, -1);
        public final int a;
        public final long b;
        public final long c;

        public e(long j, int i, long j2) {
            this.a = i;
            this.b = j;
            this.c = j2;
        }
    }

    public bq0(d dVar, f fVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = fVar;
        this.d = i;
        this.a = new a(dVar, j, j2, j3, j4, j5);
    }

    public static int b(ks3 ks3Var, long j, o68 o68Var) {
        if (j == ks3Var.getPosition()) {
            return 0;
        }
        o68Var.a = j;
        return 1;
    }

    public final int a(ks3 ks3Var, o68 o68Var) {
        while (true) {
            c cVar = this.c;
            cVar.getClass();
            long j = cVar.f;
            long j2 = cVar.g;
            long j3 = cVar.h;
            long j4 = j2 - j;
            long j5 = this.d;
            f fVar = this.b;
            if (j4 <= j5) {
                this.c = null;
                fVar.b();
                return b(ks3Var, j, o68Var);
            }
            long position = j3 - ks3Var.getPosition();
            if (position < 0 || position > 262144) {
                return b(ks3Var, j3, o68Var);
            }
            ks3Var.m((int) position);
            ks3Var.l();
            e eVarA = fVar.a(ks3Var, cVar.b);
            int i = eVarA.a;
            long j6 = eVarA.b;
            long j7 = eVarA.c;
            if (i == -3) {
                this.c = null;
                fVar.b();
                return b(ks3Var, j3, o68Var);
            }
            if (i == -2) {
                cVar.d = j6;
                cVar.f = j7;
                cVar.h = c.a(cVar.b, j6, cVar.e, j7, cVar.g, cVar.c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        aa0.c("Invalid case");
                        return 0;
                    }
                    long position2 = j7 - ks3Var.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        ks3Var.m((int) position2);
                    }
                    this.c = null;
                    fVar.b();
                    return b(ks3Var, j7, o68Var);
                }
                cVar.e = j6;
                cVar.g = j7;
                cVar.h = c.a(cVar.b, cVar.d, j6, cVar.f, j7, cVar.c);
            }
        }
    }

    public final void c(long j) {
        c cVar = this.c;
        if (cVar == null || cVar.a != j) {
            a aVar = this.a;
            this.c = new c(j, aVar.a.a(j), aVar.c, aVar.d, aVar.e, aVar.f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface f {
        e a(ks3 ks3Var, long j);

        default void b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements d {
        @Override // bq0.d
        public final long a(long j) {
            return j;
        }
    }
}
