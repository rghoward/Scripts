package defpackage;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qu8 implements Closeable {
    public final qv9 A;
    public final qu8 B;
    public final qu8 C;
    public final qu8 D;
    public final long E;
    public final long F;
    public final gn3 G;
    public final wua H;
    public n01 I;
    public final boolean J;
    public final jp8 t;
    public final gf8 u;
    public final String v;
    public final int w;
    public final nt4 x;
    public final nu4 y;
    public final su8 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public jp8 a;
        public gf8 b;
        public String d;
        public nt4 e;
        public qv9 h;
        public qu8 i;
        public qu8 j;
        public qu8 k;
        public long l;
        public long m;
        public gn3 n;
        public int c = -1;
        public su8 g = su8.u;
        public wua o = wua.a;
        public nu4.a f = new nu4.a();

        public static void b(String str, qu8 qu8Var) {
            if (qu8Var != null) {
                if (qu8Var.B != null) {
                    ca0.a(str.concat(".networkResponse != null"));
                } else if (qu8Var.C != null) {
                    ca0.a(str.concat(".cacheResponse != null"));
                } else {
                    if (qu8Var.D == null) {
                        return;
                    }
                    ca0.a(str.concat(".priorResponse != null"));
                }
            }
        }

        public final qu8 a() {
            int i = this.c;
            if (i < 0) {
                aa.b(this.c, "code < 0: ");
                return null;
            }
            jp8 jp8Var = this.a;
            if (jp8Var == null) {
                aa0.c("request == null");
                return null;
            }
            gf8 gf8Var = this.b;
            if (gf8Var == null) {
                aa0.c("protocol == null");
                return null;
            }
            String str = this.d;
            if (str != null) {
                return new qu8(jp8Var, gf8Var, str, i, this.e, this.f.d(), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
            }
            aa0.c("message == null");
            return null;
        }
    }

    public qu8(jp8 jp8Var, gf8 gf8Var, String str, int i, nt4 nt4Var, nu4 nu4Var, su8 su8Var, qv9 qv9Var, qu8 qu8Var, qu8 qu8Var2, qu8 qu8Var3, long j, long j2, gn3 gn3Var, wua wuaVar) {
        jp8Var.getClass();
        gf8Var.getClass();
        str.getClass();
        su8Var.getClass();
        wuaVar.getClass();
        this.t = jp8Var;
        this.u = gf8Var;
        this.v = str;
        this.w = i;
        this.x = nt4Var;
        this.y = nu4Var;
        this.z = su8Var;
        this.A = qv9Var;
        this.B = qu8Var;
        this.C = qu8Var2;
        this.D = qu8Var3;
        this.E = j;
        this.F = j2;
        this.G = gn3Var;
        this.H = wuaVar;
        boolean z = false;
        if (200 <= i && i < 300) {
            z = true;
        }
        this.J = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.z.close();
    }

    public final n01 h() {
        n01 n01Var = this.I;
        if (n01Var != null) {
            return n01Var;
        }
        n01 n01Var2 = n01.n;
        n01 n01VarA = n01.b.a(this.y);
        this.I = n01VarA;
        return n01VarA;
    }

    public final a k() {
        a aVar = new a();
        aVar.c = -1;
        aVar.g = su8.u;
        aVar.o = wua.a;
        aVar.a = this.t;
        aVar.b = this.u;
        aVar.c = this.w;
        aVar.d = this.v;
        aVar.e = this.x;
        aVar.f = this.y.f();
        aVar.g = this.z;
        aVar.h = this.A;
        aVar.i = this.B;
        aVar.j = this.C;
        aVar.k = this.D;
        aVar.l = this.E;
        aVar.m = this.F;
        aVar.n = this.G;
        aVar.o = this.H;
        return aVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.u + ", code=" + this.w + ", message=" + this.v + ", url=" + this.t.a + '}';
    }
}
