package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zq2 implements ks3 {
    public final ef2 b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[65536];
    public final byte[] a = new byte[4096];

    static {
        cp6.a("media3.extractor");
    }

    public zq2(ef2 ef2Var, long j, long j2) {
        this.b = ef2Var;
        this.d = j;
        this.c = j2;
    }

    @Override // defpackage.ks3
    public final long a() {
        return this.c;
    }

    @Override // defpackage.ks3
    public final boolean b(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.g;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            r(iMin);
        }
        int iQ = iMin;
        while (iQ < i2 && iQ != -1) {
            iQ = q(bArr, i, i2, iQ, z);
        }
        if (iQ != -1) {
            this.d += (long) iQ;
        }
        return iQ != -1;
    }

    @Override // defpackage.ks3
    public final boolean e(int i, boolean z) {
        int iMin = Math.min(this.g, i);
        r(iMin);
        int iQ = iMin;
        while (iQ < i && iQ != -1) {
            byte[] bArr = this.a;
            iQ = q(bArr, -iQ, Math.min(i, bArr.length + iQ), iQ, z);
        }
        if (iQ != -1) {
            this.d += (long) iQ;
        }
        return iQ != -1;
    }

    @Override // defpackage.ks3
    public final boolean f(byte[] bArr, int i, int i2, boolean z) {
        if (!o(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // defpackage.ks3
    public final long g() {
        return this.d + ((long) this.f);
    }

    @Override // defpackage.ks3
    public final long getPosition() {
        return this.d;
    }

    @Override // defpackage.ks3
    public final void h(int i) {
        o(i, false);
    }

    @Override // defpackage.ks3
    public final int i(int i) throws EOFException, InterruptedIOException {
        zq2 zq2Var;
        int iMin = Math.min(this.g, i);
        r(iMin);
        if (iMin == 0) {
            byte[] bArr = this.a;
            zq2Var = this;
            iMin = zq2Var.q(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            zq2Var = this;
        }
        if (iMin != -1) {
            zq2Var.d += (long) iMin;
        }
        return iMin;
    }

    @Override // defpackage.ks3
    public final int j(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        zq2 zq2Var;
        int iMin;
        p(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            zq2Var = this;
            iMin = zq2Var.q(this.e, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            zq2Var.g += iMin;
        } else {
            zq2Var = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(zq2Var.e, zq2Var.f, bArr, i, iMin);
        zq2Var.f += iMin;
        return iMin;
    }

    @Override // defpackage.ks3
    public final void l() {
        this.f = 0;
    }

    @Override // defpackage.ks3
    public final void m(int i) {
        e(i, false);
    }

    @Override // defpackage.ks3
    public final void n(byte[] bArr, int i, int i2) {
        f(bArr, i, i2, false);
    }

    public final boolean o(int i, boolean z) {
        p(i);
        int iQ = this.g - this.f;
        while (iQ < i) {
            zq2 zq2Var = this;
            int i2 = i;
            boolean z2 = z;
            iQ = zq2Var.q(this.e, this.f, i2, iQ, z2);
            if (iQ == -1) {
                return false;
            }
            zq2Var.g = zq2Var.f + iQ;
            this = zq2Var;
            i = i2;
            z = z2;
        }
        this.f += i;
        return true;
    }

    public final void p(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, n6b.i(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    public final int q(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.b.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void r(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    @Override // defpackage.ef2
    public final int read(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        zq2 zq2Var;
        int i3 = this.g;
        int iQ = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, iMin);
            r(iMin);
            iQ = iMin;
        }
        if (iQ == 0) {
            zq2Var = this;
            iQ = zq2Var.q(bArr, i, i2, 0, true);
        } else {
            zq2Var = this;
        }
        if (iQ != -1) {
            zq2Var.d += (long) iQ;
        }
        return iQ;
    }

    @Override // defpackage.ks3
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        b(bArr, i, i2, false);
    }
}
