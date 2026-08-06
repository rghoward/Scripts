package defpackage;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dw9 implements s80 {
    public int b;
    public float c;
    public float d;
    public s80.a e;
    public s80.a f;
    public s80.a g;
    public s80.a h;
    public boolean i;
    public cw9 j;
    public ByteBuffer k;
    public ByteBuffer l;
    public long m;
    public long n;
    public boolean o;

    @Override // defpackage.s80
    public final boolean d() {
        if (this.o) {
            cw9 cw9Var = this.j;
            if (cw9Var != null) {
                xl7.r(cw9Var.k >= 0);
                if (cw9Var.i.o() * cw9Var.k * cw9Var.b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.s80
    public final boolean h() {
        if (this.f.a != -1) {
            return Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // defpackage.s80
    public final ByteBuffer i() {
        cw9 cw9Var = this.j;
        if (cw9Var != null) {
            cw9.b<?> bVar = cw9Var.i;
            int i = cw9Var.b;
            xl7.r(cw9Var.k >= 0);
            int iO = bVar.o() * cw9Var.k * i;
            if (iO > 0) {
                if (this.k.capacity() < iO) {
                    this.k = ByteBuffer.allocateDirect(iO).order(ByteOrder.nativeOrder());
                } else {
                    this.k.clear();
                }
                ByteBuffer byteBuffer = this.k;
                xl7.r(cw9Var.k >= 0);
                int iMin = Math.min(byteBuffer.remaining() / (bVar.o() * i), cw9Var.k);
                bVar.b(iMin, byteBuffer);
                cw9Var.k -= iMin;
                System.arraycopy(bVar.h(), iMin * i, bVar.h(), 0, cw9Var.k * i);
                this.k.flip();
                this.n += (long) iO;
                this.l = this.k;
            }
        }
        ByteBuffer byteBuffer2 = this.l;
        this.l = s80.a;
        return byteBuffer2;
    }

    @Override // defpackage.s80
    public final void j(s80.b bVar) {
        if (h()) {
            s80.a aVar = this.e;
            this.g = aVar;
            s80.a aVar2 = this.f;
            this.h = aVar2;
            if (this.i) {
                this.j = new cw9(aVar.a, aVar.b, this.c, this.d, aVar2.a, aVar.c == 4);
            } else {
                cw9 cw9Var = this.j;
                if (cw9Var != null) {
                    cw9Var.j = 0;
                    cw9Var.k = 0;
                    cw9Var.l = 0;
                    cw9Var.m = 0;
                    cw9Var.n = 0;
                    cw9Var.o = 0;
                    cw9Var.p = 0;
                    cw9Var.q = 0.0d;
                    cw9Var.i.flush();
                }
            }
        }
        this.l = s80.a;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }

    @Override // defpackage.s80
    public final void k(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            cw9 cw9Var = this.j;
            cw9Var.getClass();
            this.m += (long) byteBuffer.remaining();
            int iRemaining = byteBuffer.remaining();
            int i = cw9Var.b;
            cw9.b<?> bVar = cw9Var.i;
            int iO = iRemaining / (bVar.o() * i);
            bVar.p(iO);
            bVar.a(iRemaining, byteBuffer);
            cw9Var.j += iO;
            cw9Var.b();
        }
    }

    @Override // defpackage.s80
    public final s80.a l(s80.a aVar) throws s80.c {
        int i = aVar.c;
        if (i != 2 && i != 4) {
            throw new s80.c(aVar);
        }
        int i2 = this.b;
        if (i2 == -1) {
            i2 = aVar.a;
        }
        this.e = aVar;
        s80.a aVar2 = new s80.a(i2, aVar.b, i);
        this.f = aVar2;
        this.i = true;
        return aVar2;
    }

    @Override // defpackage.s80
    public final void m() {
        cw9 cw9Var = this.j;
        if (cw9Var != null) {
            int i = cw9Var.j;
            float f = cw9Var.c;
            float f2 = cw9Var.d;
            double d = f / f2;
            double d2 = cw9Var.e * f2;
            int i2 = cw9Var.o;
            int i3 = cw9Var.k + ((int) ((((((((double) (i - i2)) / d) + ((double) i2)) + cw9Var.q) + ((double) cw9Var.l)) / d2) + 0.5d));
            cw9Var.q = 0.0d;
            cw9.b<?> bVar = cw9Var.i;
            int i4 = cw9Var.h * 2;
            bVar.p(i4 + i);
            bVar.c(i * cw9Var.b, i4);
            cw9Var.j = i4 + cw9Var.j;
            cw9Var.b();
            if (cw9Var.k > i3) {
                cw9Var.k = Math.max(i3, 0);
            }
            cw9Var.j = 0;
            cw9Var.o = 0;
            cw9Var.l = 0;
        }
        this.o = true;
    }

    @Override // defpackage.s80
    public final long n(long j) {
        if (this.n < 1024) {
            return (long) (j / ((double) this.c));
        }
        long j2 = this.m;
        cw9 cw9Var = this.j;
        cw9Var.getClass();
        long jO = j2 - ((long) (cw9Var.i.o() * (cw9Var.j * cw9Var.b)));
        int i = this.h.a;
        int i2 = this.g.a;
        long j3 = this.n;
        return i == i2 ? n6b.U(j, j3, jO, RoundingMode.DOWN) : n6b.U(j, j3 * ((long) i2), jO * ((long) i), RoundingMode.DOWN);
    }

    @Override // defpackage.s80
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        s80.a aVar = s80.a.e;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        ByteBuffer byteBuffer = s80.a;
        this.k = byteBuffer;
        this.l = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }
}
