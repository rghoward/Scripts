package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m0c extends n0c {
    public final byte[] v;
    public final int w;
    public final int x;

    public m0c(byte[] bArr, int i, int i2) {
        p0c.q(i, i + i2, bArr.length);
        this.v = bArr;
        this.w = i;
        this.x = i2;
    }

    @Override // defpackage.p0c
    public final byte d(int i) {
        return this.v[this.w + i];
    }

    @Override // defpackage.p0c
    public final int e() {
        return this.x;
    }

    @Override // defpackage.p0c
    public final n0c f(int i, int i2) {
        int iQ = p0c.q(i, i2, this.x);
        if (iQ == 0) {
            return p0c.u;
        }
        return new m0c(this.v, this.w + i, iQ);
    }

    @Override // defpackage.p0c
    public final void i(byte[] bArr, int i) {
        System.arraycopy(this.v, this.w, bArr, 0, i);
    }

    @Override // defpackage.p0c
    public final void j(b1c b1cVar) {
        b1cVar.e(this.v, this.w, this.x);
    }

    @Override // defpackage.p0c
    public final boolean k(p0c p0cVar) {
        boolean z = p0cVar instanceof o0c;
        if (!z && !(p0cVar instanceof m0c)) {
            return p0cVar.k(this);
        }
        int iE = p0cVar.e();
        int i = this.x;
        if (i > iE) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i).length());
            sb.append("Length too large: ");
            sb.append(i);
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i > p0cVar.e()) {
            int iE2 = p0cVar.e();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 27 + String.valueOf(iE2).length());
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(iE2);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.v;
        int i2 = this.w;
        if (z) {
            return p0c.r(i2, 0, i, bArr, ((o0c) p0cVar).v);
        }
        if (!(p0cVar instanceof m0c)) {
            return p0cVar.f(0, i).equals(f(i2, i + i2));
        }
        m0c m0cVar = (m0c) p0cVar;
        return p0c.r(i2, m0cVar.w, i, bArr, m0cVar.v);
    }

    @Override // defpackage.p0c
    public final int l(int i, int i2) {
        return g2c.a(i, this.v, this.w, i2);
    }
}
