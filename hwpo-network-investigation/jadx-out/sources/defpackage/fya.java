package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fya extends uj0 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // defpackage.uj0
    public final s80.a a(s80.a aVar) throws s80.c {
        if (!n6b.J(aVar.c)) {
            throw new s80.c(aVar);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? s80.a.e : aVar;
    }

    @Override // defpackage.uj0
    public final void b() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // defpackage.uj0
    public final void c() {
        if (this.k) {
            int i = this.n;
            if (i > 0) {
                this.o += (long) (i / this.b.d);
            }
            this.n = 0;
        }
    }

    @Override // defpackage.uj0, defpackage.s80
    public final boolean d() {
        return super.d() && this.n == 0;
    }

    @Override // defpackage.uj0
    public final void e() {
        this.m = n6b.b;
    }

    @Override // defpackage.uj0, defpackage.s80
    public final ByteBuffer i() {
        int i;
        if (super.d() && (i = this.n) > 0) {
            f(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.i();
    }

    @Override // defpackage.s80
    public final void k(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.l);
        this.o += (long) (iMin / this.b.d);
        this.l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.l > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer byteBufferF = f(length);
        int i3 = n6b.i(length, 0, this.n);
        byteBufferF.put(this.m, 0, i3);
        int i4 = n6b.i(length - i3, 0, i2);
        byteBuffer.limit(byteBuffer.position() + i4);
        byteBufferF.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i5 = i2 - i4;
        int i6 = this.n - i3;
        this.n = i6;
        byte[] bArr = this.m;
        System.arraycopy(bArr, i3, bArr, 0, i6);
        byteBuffer.get(this.m, this.n, i5);
        this.n += i5;
        byteBufferF.flip();
    }

    @Override // defpackage.s80
    public final long n(long j) {
        return Math.max(0L, j - n6b.S(this.b.a, this.j + this.i));
    }
}
