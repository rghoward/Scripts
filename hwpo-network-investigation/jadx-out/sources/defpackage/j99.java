package defpackage;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class j99 extends g01 {
    public final transient byte[][] x;
    public final transient int[] y;

    public j99(byte[][] bArr, int[] iArr) {
        super(g01.w.t);
        this.x = bArr;
        this.y = iArr;
    }

    @Override // defpackage.g01
    public final String a() {
        throw null;
    }

    @Override // defpackage.g01
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g01) {
            g01 g01Var = (g01) obj;
            if (g01Var.g() == g() && o(0, g01Var, g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.g01
    public final g01 f(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.x;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.y;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new g01(bArrDigest);
    }

    @Override // defpackage.g01
    public final int g() {
        return this.y[this.x.length - 1];
    }

    @Override // defpackage.g01
    public final String h() {
        return y().h();
    }

    @Override // defpackage.g01
    public final int hashCode() {
        int i = this.u;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.x;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.y;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.u = i3;
        return i3;
    }

    @Override // defpackage.g01
    public final int i(byte[] bArr, int i) {
        bArr.getClass();
        return y().i(bArr, i);
    }

    @Override // defpackage.g01
    public final byte[] k() {
        return v();
    }

    @Override // defpackage.g01
    public final byte l(int i) {
        byte[][] bArr = this.x;
        int length = bArr.length - 1;
        int[] iArr = this.y;
        t.b(iArr[length], i, 1L);
        int iD = s.d(this, i);
        return bArr[iD][(i - (iD == 0 ? 0 : iArr[iD - 1])) + iArr[bArr.length + iD]];
    }

    @Override // defpackage.g01
    public final int m(byte[] bArr, int i) {
        bArr.getClass();
        return y().m(bArr, i);
    }

    @Override // defpackage.g01
    public final boolean o(int i, g01 g01Var, int i2) {
        g01Var.getClass();
        if (i >= 0 && i <= g() - i2) {
            int i3 = i2 + i;
            int iD = s.d(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.y;
                int i5 = iD == 0 ? 0 : iArr[iD - 1];
                int i6 = iArr[iD] - i5;
                byte[][] bArr = this.x;
                int i7 = iArr[bArr.length + iD];
                int iMin = Math.min(i3, i6 + i5) - i;
                if (g01Var.p(i4, bArr[iD], (i - i5) + i7, iMin)) {
                    i4 += iMin;
                    i += iMin;
                    iD++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.g01
    public final boolean p(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i < 0 || i > g() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iD = s.d(this, i);
        while (i < i4) {
            int[] iArr = this.y;
            int i5 = iD == 0 ? 0 : iArr[iD - 1];
            int i6 = iArr[iD] - i5;
            byte[][] bArr2 = this.x;
            int i7 = iArr[bArr2.length + iD];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!t.a((i - i5) + i7, i2, iMin, bArr2[iD], bArr)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iD++;
        }
        return true;
    }

    @Override // defpackage.g01
    public final String r(Charset charset) {
        charset.getClass();
        return y().r(charset);
    }

    @Override // defpackage.g01
    public final g01 s(int i, int i2) {
        if (i2 == t.b) {
            i2 = g();
        }
        if (i < 0) {
            ca0.a(pk.d(i, "beginIndex=", " < 0"));
            return null;
        }
        if (i2 > g()) {
            StringBuilder sbB = t43.b(i2, "endIndex=", " > length(");
            sbB.append(g());
            sbB.append(')');
            throw new IllegalArgumentException(sbB.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            ca0.a(u.a(i2, i, "endIndex=", " < beginIndex="));
            return null;
        }
        if (i == 0 && i2 == g()) {
            return this;
        }
        if (i == i2) {
            return g01.w;
        }
        int iD = s.d(this, i);
        int iD2 = s.d(this, i2 - 1);
        byte[][] bArr = this.x;
        byte[][] bArr2 = (byte[][]) gz3.k(iD, iD2 + 1, bArr);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.y;
        if (iD <= iD2) {
            int i4 = iD;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == iD2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iD != 0 ? iArr2[iD - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new j99(bArr2, iArr);
    }

    @Override // defpackage.g01
    public final String toString() {
        return y().toString();
    }

    @Override // defpackage.g01
    public final g01 u() {
        return y().u();
    }

    @Override // defpackage.g01
    public final byte[] v() {
        byte[] bArr = new byte[g()];
        byte[][] bArr2 = this.x;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.y;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            gz3.d(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.g01
    public final void x(tx0 tx0Var, int i) {
        int iD = s.d(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.y;
            int i3 = iD == 0 ? 0 : iArr[iD - 1];
            int i4 = iArr[iD] - i3;
            byte[][] bArr = this.x;
            int i5 = iArr[bArr.length + iD];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            f99 f99Var = new f99(bArr[iD], i6, i6 + iMin, true, false);
            f99 f99Var2 = tx0Var.t;
            if (f99Var2 == null) {
                f99Var.g = f99Var;
                f99Var.f = f99Var;
                tx0Var.t = f99Var;
            } else {
                f99 f99Var3 = f99Var2.g;
                f99Var3.getClass();
                f99Var3.b(f99Var);
            }
            i2 += iMin;
            iD++;
        }
        tx0Var.u += (long) i;
    }

    public final g01 y() {
        return new g01(v());
    }
}
