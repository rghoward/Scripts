package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u0c extends b1c {
    public final byte[] c;
    public final int d;
    public int e;

    public u0c(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            z90.a(u.a(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            throw null;
        }
        this.c = bArr;
        this.e = 0;
        this.d = i;
    }

    @Override // defpackage.b1c
    public final int A() {
        return this.d - this.e;
    }

    public final void B(byte[] bArr, int i, int i2) throws v0c {
        try {
            System.arraycopy(bArr, i, this.c, this.e, i2);
            this.e += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new v0c(this.e, this.d, i2, e);
        }
    }

    @Override // defpackage.b1c
    public final void e(byte[] bArr, int i, int i2) throws v0c {
        B(bArr, i, i2);
    }

    @Override // defpackage.b1c
    public final void f(int i, int i2) throws v0c {
        v((i << 3) | i2);
    }

    @Override // defpackage.b1c
    public final void g(int i, int i2) throws v0c {
        v(i << 3);
        u(i2);
    }

    @Override // defpackage.b1c
    public final void h(int i, int i2) throws v0c {
        v(i << 3);
        v(i2);
    }

    @Override // defpackage.b1c
    public final void i(int i, int i2) throws v0c {
        v((i << 3) | 5);
        w(i2);
    }

    @Override // defpackage.b1c
    public final void j(int i, long j) throws v0c {
        v(i << 3);
        x(j);
    }

    @Override // defpackage.b1c
    public final void k(int i, long j) throws v0c {
        v((i << 3) | 1);
        y(j);
    }

    @Override // defpackage.b1c
    public final void l(int i, boolean z) throws v0c {
        v(i << 3);
        t(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.b1c
    public final void m(int i, String str) throws v0c {
        v((i << 3) | 2);
        z(str);
    }

    @Override // defpackage.b1c
    public final void n(int i, p0c p0cVar) throws v0c {
        v((i << 3) | 2);
        o(p0cVar);
    }

    @Override // defpackage.b1c
    public final void o(p0c p0cVar) throws v0c {
        v(p0cVar.e());
        p0cVar.j(this);
    }

    @Override // defpackage.b1c
    public final void p(byte[] bArr, int i) throws v0c {
        v(i);
        B(bArr, 0, i);
    }

    @Override // defpackage.b1c
    public final void q(int i, g3c g3cVar) throws v0c {
        v(11);
        h(2, i);
        v(26);
        s(g3cVar);
        v(12);
    }

    @Override // defpackage.b1c
    public final void r(int i, p0c p0cVar) throws v0c {
        v(11);
        h(2, i);
        n(3, p0cVar);
        v(12);
    }

    @Override // defpackage.b1c
    public final void s(g3c g3cVar) throws v0c {
        v(g3cVar.f());
        g3cVar.b(this);
    }

    @Override // defpackage.b1c
    public final void t(byte b) throws v0c {
        int i = this.e;
        try {
            int i2 = i + 1;
            try {
                this.c[i] = b;
                this.e = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new v0c(i, this.d, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // defpackage.b1c
    public final void u(int i) throws v0c {
        if (i >= 0) {
            v(i);
        } else {
            x(i);
        }
    }

    @Override // defpackage.b1c
    public final void v(int i) throws v0c {
        int i2;
        int i3 = this.e;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.c;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.e = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new v0c(i2, this.d, 1, e);
                }
            }
            throw new v0c(i2, this.d, 1, e);
        }
    }

    @Override // defpackage.b1c
    public final void w(int i) throws v0c {
        int i2 = this.e;
        try {
            byte[] bArr = this.c;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.e = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new v0c(i2, this.d, 4, e);
        }
    }

    @Override // defpackage.b1c
    public final void x(long j) throws v0c {
        int i;
        int i2 = this.e;
        byte[] bArr = this.c;
        int i3 = this.d;
        if (!b1c.b || i3 - i2 < 10) {
            while ((j & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i4;
                    throw new v0c(i, i3, 1, e);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new v0c(i, i3, 1, e);
            }
        } else {
            while ((j & (-128)) != 0) {
                m4c.k(bArr, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            m4c.k(bArr, i2, (byte) j);
        }
        this.e = i;
    }

    @Override // defpackage.b1c
    public final void y(long j) throws v0c {
        int i = this.e;
        try {
            byte[] bArr = this.c;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.e = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new v0c(i, this.d, 8, e);
        }
    }

    @Override // defpackage.b1c
    public final void z(String str) throws v0c {
        int i = this.e;
        try {
            int iA = b1c.a(str.length() * 3);
            int iA2 = b1c.a(str.length());
            byte[] bArr = this.c;
            if (iA2 != iA) {
                v(o4c.b(str));
                int i2 = this.e;
                this.e = o4c.c(str, bArr, i2, bArr.length - i2);
            } else {
                int i3 = i + iA2;
                this.e = i3;
                int iC = o4c.c(str, bArr, i3, bArr.length - i3);
                this.e = i;
                v((iC - i) - iA2);
                this.e = iC;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new v0c(e);
        }
    }
}
