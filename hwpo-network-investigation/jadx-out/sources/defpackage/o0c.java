package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o0c extends n0c {
    public final byte[] v;

    public o0c(byte[] bArr) {
        bArr.getClass();
        this.v = bArr;
    }

    @Override // defpackage.p0c
    public final byte d(int i) {
        return this.v[i];
    }

    @Override // defpackage.p0c
    public final int e() {
        return this.v.length;
    }

    @Override // defpackage.p0c
    public final n0c f(int i, int i2) {
        byte[] bArr = this.v;
        int iQ = p0c.q(0, i2, bArr.length);
        return iQ == 0 ? p0c.u : new m0c(bArr, 0, iQ);
    }

    @Override // defpackage.p0c
    public final void i(byte[] bArr, int i) {
        System.arraycopy(this.v, 0, bArr, 0, i);
    }

    @Override // defpackage.p0c
    public final void j(b1c b1cVar) {
        byte[] bArr = this.v;
        b1cVar.e(bArr, 0, bArr.length);
    }

    @Override // defpackage.p0c
    public final boolean k(p0c p0cVar) {
        boolean z = p0cVar instanceof o0c;
        byte[] bArr = this.v;
        if (z) {
            return Arrays.equals(bArr, ((o0c) p0cVar).v);
        }
        boolean z2 = p0cVar instanceof m0c;
        if (!z2) {
            return p0cVar.k(this);
        }
        m0c m0cVar = (m0c) p0cVar;
        int i = m0cVar.x;
        int length = bArr.length;
        if (length > i) {
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 18 + String.valueOf(length).length());
            sb.append("Length too large: ");
            sb.append(length);
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        if (length <= i) {
            if (z) {
                return p0c.r(0, 0, length, bArr, ((o0c) p0cVar).v);
            }
            if (!z2) {
                return p0cVar.f(0, length).equals(f(0, length));
            }
            return p0c.r(0, m0cVar.w, length, bArr, m0cVar.v);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 27 + String.valueOf(i).length());
        sb2.append("Ran off end of other: 0, ");
        sb2.append(length);
        sb2.append(", ");
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // defpackage.p0c
    public final int l(int i, int i2) {
        return g2c.a(i, this.v, 0, i2);
    }
}
