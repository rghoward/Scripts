package defpackage;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mi implements js3 {
    public static final int[] q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] r = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] s;
    public static final byte[] t;
    public final g13 b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public int h;
    public long i;
    public ls3 j;
    public hsa k;
    public hsa l;
    public t89 m;
    public boolean n;
    public long o;
    public boolean p;
    public final byte[] a = new byte[1];
    public int g = -1;

    static {
        String str = n6b.a;
        Charset charset = StandardCharsets.UTF_8;
        s = "#!AMR\n".getBytes(charset);
        t = "#!AMR-WB\n".getBytes(charset);
    }

    public mi() {
        g13 g13Var = new g13();
        this.b = g13Var;
        this.l = g13Var;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00eb A[PHI: r4
      0x00eb: PHI (r4v1 ks3) = (r4v0 ks3), (r4v6 ks3) binds: [B:53:0x00e9, B:56:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:61:0x0102  */
    @Override // defpackage.js3
    public final int c(ks3 ks3Var, o68 o68Var) throws ut7 {
        ks3 ks3Var2;
        int iF;
        int i;
        this.k.getClass();
        String str = n6b.a;
        if (ks3Var.getPosition() == 0 && !i(ks3Var)) {
            throw ut7.a(null, "Could not find AMR header.");
        }
        if (!this.p) {
            this.p = true;
            boolean z = this.c;
            String str2 = z ? "audio/amr-wb" : "audio/amr";
            String str3 = z ? "audio/amr-wb" : "audio/3gpp";
            int i2 = z ? 16000 : 8000;
            int i3 = z ? r[8] : q[7];
            hsa hsaVar = this.k;
            id4.a aVar = new id4.a();
            aVar.m = fv6.n(str2);
            aVar.n = fv6.n(str3);
            aVar.o = i3;
            aVar.F = 1;
            aVar.G = i2;
            hy1.b(aVar, hsaVar);
        }
        int i4 = 0;
        if (this.f == 0) {
            try {
                int iH = h(ks3Var);
                this.e = iH;
                this.f = iH;
                if (this.g == -1) {
                    ks3Var.getPosition();
                    this.g = this.e;
                }
                if (this.g == this.e) {
                    this.h++;
                }
                t89 t89Var = this.m;
                if (t89Var instanceof qa5) {
                    qa5 qa5Var = (qa5) t89Var;
                    long j = this.i + this.d + 20000;
                    long position = ks3Var.getPosition() + ((long) this.e);
                    de6 de6Var = qa5Var.b;
                    int i5 = de6Var.a;
                    if (i5 == 0 || j - de6Var.c(i5 - 1) >= 100000) {
                        de6 de6Var2 = qa5Var.a;
                        de6 de6Var3 = qa5Var.b;
                        if (de6Var3.a == 0 && j > 0) {
                            de6Var2.a(0L);
                            de6Var3.a(0L);
                        }
                        de6Var2.a(position);
                        de6Var3.a(j);
                    }
                    if (this.n && Math.abs(this.o - j) < 20000) {
                        this.n = false;
                        this.l = this.k;
                    }
                }
                ks3Var2 = ks3Var;
                iF = this.l.f(ks3Var2, this.f, true);
                if (iF == -1) {
                    i4 = -1;
                } else {
                    i = this.f - iF;
                    this.f = i;
                    if (i <= 0) {
                        this.l.a(this.d + this.i, 1, this.e, 0, null);
                        this.d += 20000;
                    }
                }
            } catch (EOFException unused) {
                ks3Var2 = ks3Var;
            }
        } else {
            ks3Var2 = ks3Var;
            iF = this.l.f(ks3Var2, this.f, true);
            if (iF == -1) {
                i4 = -1;
            } else {
                i = this.f - iF;
                this.f = i;
                if (i <= 0) {
                    this.l.a(this.d + this.i, 1, this.e, 0, null);
                    this.d += 20000;
                }
            }
        }
        ks3Var2.a();
        if (this.m == null) {
            t89.b bVar = new t89.b(-9223372036854775807L);
            this.m = bVar;
            this.j.t(bVar);
        }
        if (i4 == -1) {
            t89 t89Var2 = this.m;
            if (t89Var2 instanceof qa5) {
                long j2 = this.i + this.d;
                ((qa5) t89Var2).c = j2;
                this.j.t(t89Var2);
                this.k.d(j2);
            }
        }
        return i4;
    }

    @Override // defpackage.js3
    public final boolean d(ks3 ks3Var) {
        return i(ks3Var);
    }

    @Override // defpackage.js3
    public final void e(long j, long j2) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        this.o = j2;
        t89 t89Var = this.m;
        if (!(t89Var instanceof qa5)) {
            if (j == 0 || !(t89Var instanceof nx1)) {
                this.i = 0L;
                return;
            } else {
                nx1 nx1Var = (nx1) t89Var;
                this.i = (Math.max(0L, j - nx1Var.b) * 8000000) / ((long) nx1Var.e);
                return;
            }
        }
        qa5 qa5Var = (qa5) t89Var;
        de6 de6Var = qa5Var.b;
        long jC = de6Var.a == 0 ? -9223372036854775807L : de6Var.c(n6b.c(qa5Var.a, j));
        this.i = jC;
        if (Math.abs(this.o - jC) < 20000) {
            return;
        }
        this.n = true;
        this.l = this.b;
    }

    @Override // defpackage.js3
    public final void g(ls3 ls3Var) {
        this.j = ls3Var;
        hsa hsaVarP = ls3Var.p(0, 1);
        this.k = hsaVarP;
        this.l = hsaVarP;
        ls3Var.k();
    }

    public final int h(ks3 ks3Var) throws ut7 {
        boolean z;
        ks3Var.l();
        byte[] bArr = this.a;
        ks3Var.n(bArr, 0, 1);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw ut7.a(null, "Invalid padding bits for frame header " + ((int) b));
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.c) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? r[i] : q[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw ut7.a(null, sb.toString());
    }

    public final boolean i(ks3 ks3Var) {
        ks3Var.l();
        byte[] bArr = s;
        byte[] bArr2 = new byte[bArr.length];
        ks3Var.n(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.c = false;
            ks3Var.m(bArr.length);
            return true;
        }
        ks3Var.l();
        byte[] bArr3 = t;
        byte[] bArr4 = new byte[bArr3.length];
        ks3Var.n(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.c = true;
        ks3Var.m(bArr3.length);
        return true;
    }

    @Override // defpackage.js3
    public final void a() {
    }
}
