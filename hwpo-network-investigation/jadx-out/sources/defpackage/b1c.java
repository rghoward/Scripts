package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b1c {
    public static final boolean b = m4c.d;
    public c1c a;

    public b1c() {
        throw null;
    }

    public static int a(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int b(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int c(g3c g3cVar) {
        int iF = g3cVar.f();
        return a(iF) + iF;
    }

    public abstract int A();

    public final void d() {
        if (A() > 0) {
            aa0.c("Did not write as much data as expected.");
        } else {
            if (A() >= 0) {
                return;
            }
            aa0.c("Wrote more data than expected.");
        }
    }

    public abstract void e(byte[] bArr, int i, int i2);

    public abstract void f(int i, int i2);

    public abstract void g(int i, int i2);

    public abstract void h(int i, int i2);

    public abstract void i(int i, int i2);

    public abstract void j(int i, long j);

    public abstract void k(int i, long j);

    public abstract void l(int i, boolean z);

    public abstract void m(int i, String str);

    public abstract void n(int i, p0c p0cVar);

    public abstract void o(p0c p0cVar);

    public abstract void p(byte[] bArr, int i);

    public abstract void q(int i, g3c g3cVar);

    public abstract void r(int i, p0c p0cVar);

    public abstract void s(g3c g3cVar);

    public abstract void t(byte b2);

    public abstract void u(int i);

    public abstract void v(int i);

    public abstract void w(int i);

    public abstract void x(long j);

    public abstract void y(long j);

    public abstract void z(String str);
}
