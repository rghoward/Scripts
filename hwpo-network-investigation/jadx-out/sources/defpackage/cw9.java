package defpackage;

import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cw9 {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final b<?> i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public double q;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a implements b<float[]> {
        public final float[] a;
        public float[] b;
        public float[] c;
        public float[] d;
        public double e;
        public double f;
        public double g;

        public a() {
            int i = cw9.this.h;
            this.a = new float[i];
            int i2 = i * cw9.this.b;
            this.b = new float[i2];
            this.c = new float[i2];
            this.d = new float[i2];
        }

        @Override // cw9.b
        public final void a(int i, ByteBuffer byteBuffer) {
            FloatBuffer floatBufferAsFloatBuffer = byteBuffer.asFloatBuffer();
            float[] fArr = this.b;
            cw9 cw9Var = cw9.this;
            floatBufferAsFloatBuffer.get(fArr, cw9Var.j * cw9Var.b, i / 4);
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // cw9.b
        public final void b(int i, ByteBuffer byteBuffer) {
            FloatBuffer floatBufferAsFloatBuffer = byteBuffer.asFloatBuffer();
            float[] fArr = this.c;
            int i2 = cw9.this.b;
            floatBufferAsFloatBuffer.put(fArr, 0, i * i2);
            byteBuffer.position((i * 4 * i2) + byteBuffer.position());
        }

        @Override // cw9.b
        public final void c(int i, int i2) {
            for (int i3 = 0; i3 < cw9.this.b * i2; i3++) {
                this.b[i + i3] = 0.0f;
            }
        }

        @Override // cw9.b
        public final void d(int i, int i2) {
            cw9 cw9Var = cw9.this;
            int i3 = cw9Var.h / i2;
            int i4 = cw9Var.b;
            int i5 = i2 * i4;
            int i6 = i * i4;
            for (int i7 = 0; i7 < i3; i7++) {
                double d = 0.0d;
                for (int i8 = 0; i8 < i5; i8++) {
                    d += (double) this.b[(i7 * i5) + i6 + i8];
                }
                this.a[i7] = (float) (d / ((double) i5));
            }
        }

        @Override // cw9.b
        public final int e(int i, int i2, int i3) {
            return s(this.b, i, i2, i3);
        }

        @Override // cw9.b
        public final void f() {
            this.g = this.e;
        }

        @Override // cw9.b
        public final void flush() {
            this.g = 0.0d;
            this.e = 0.0d;
            this.f = 0.0d;
        }

        @Override // cw9.b
        public final float[] g() {
            return this.b;
        }

        @Override // cw9.b
        public final float[] h() {
            return this.c;
        }

        @Override // cw9.b
        public final void i(int i) {
            this.c = r(cw9.this.k, i, this.c);
        }

        @Override // cw9.b
        public final boolean j() {
            double d = this.e;
            return d != 0.0d && cw9.this.p != 0 && this.f <= d * 3.0d && d * 2.0d > this.g * 3.0d;
        }

        @Override // cw9.b
        public final void k(long j, int i, long j2) {
            int i2 = 0;
            while (true) {
                cw9 cw9Var = cw9.this;
                int i3 = cw9Var.b;
                if (i2 >= i3) {
                    return;
                }
                float[] fArr = this.c;
                int i4 = (cw9Var.k * i3) + i2;
                float[] fArr2 = this.d;
                int i5 = (i * i3) + i2;
                float f = fArr2[i5];
                float f2 = fArr2[i5 + i3];
                long j3 = ((long) cw9Var.n) * j;
                int i6 = cw9Var.m;
                long j4 = ((long) (i6 + 1)) * j2;
                long j5 = j4 - j3;
                long j6 = j4 - (((long) i6) * j2);
                fArr[i4] = (((j6 - j5) * f2) + (j5 * f)) / j6;
                i2++;
            }
        }

        @Override // cw9.b
        public final float[] l() {
            return this.d;
        }

        @Override // cw9.b
        public final void m(int i, int i2, int i3, int i4, int i5) {
            float[] fArr = this.c;
            float[] fArr2 = this.b;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = (i3 * i2) + i6;
                int i8 = (i5 * i2) + i6;
                int i9 = (i4 * i2) + i6;
                for (int i10 = 0; i10 < i; i10++) {
                    fArr[i7] = ((fArr2[i8] * i10) + (fArr2[i9] * (i - i10))) / i;
                    i7 += i2;
                    i9 += i2;
                    i8 += i2;
                }
            }
        }

        @Override // cw9.b
        public final void n(int i) {
            this.d = r(cw9.this.l, i, this.d);
        }

        @Override // cw9.b
        public final int o() {
            return 4;
        }

        @Override // cw9.b
        public final void p(int i) {
            this.b = r(cw9.this.j, i, this.b);
        }

        @Override // cw9.b
        public final int q(int i, int i2) {
            return s(this.a, 0, i, i2);
        }

        public final float[] r(int i, int i2, float[] fArr) {
            int length = fArr.length;
            int i3 = cw9.this.b;
            int i4 = length / i3;
            return i + i2 <= i4 ? fArr : Arrays.copyOf(fArr, (((i4 * 3) / 2) + i2) * i3);
        }

        public final int s(float[] fArr, int i, int i2, int i3) {
            int i4 = cw9.this.b * i;
            double d = 1.0d;
            int i5 = 0;
            double d2 = 0.0d;
            int i6 = 255;
            int i7 = i2;
            while (i7 <= i3) {
                double dAbs = 0.0d;
                for (int i8 = 0; i8 < i7; i8++) {
                    dAbs += (double) Math.abs(fArr[i4 + i8] - fArr[(i4 + i7) + i8]);
                }
                int i9 = i4;
                double d3 = i7;
                if (((double) i5) * dAbs < d * d3) {
                    i5 = i7;
                    d = dAbs;
                }
                if (((double) i6) * dAbs > d3 * d2) {
                    i6 = i7;
                    d2 = dAbs;
                }
                i7++;
                i4 = i9;
            }
            this.e = d / ((double) i5);
            this.f = d2 / ((double) i6);
            return i5;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b<T> {
        void a(int i, ByteBuffer byteBuffer);

        void b(int i, ByteBuffer byteBuffer);

        void c(int i, int i2);

        void d(int i, int i2);

        int e(int i, int i2, int i3);

        void f();

        void flush();

        T g();

        T h();

        void i(int i);

        boolean j();

        void k(long j, int i, long j2);

        T l();

        void m(int i, int i2, int i3, int i4, int i5);

        void n(int i);

        int o();

        void p(int i);

        int q(int i, int i2);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class c implements b<short[]> {
        public final short[] a;
        public short[] b;
        public short[] c;
        public short[] d;
        public int e;
        public int f;
        public int g;

        public c() {
            int i = cw9.this.h;
            this.a = new short[i];
            int i2 = i * cw9.this.b;
            this.b = new short[i2];
            this.c = new short[i2];
            this.d = new short[i2];
        }

        @Override // cw9.b
        public final void a(int i, ByteBuffer byteBuffer) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            short[] sArr = this.b;
            cw9 cw9Var = cw9.this;
            shortBufferAsShortBuffer.get(sArr, cw9Var.j * cw9Var.b, i / 2);
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // cw9.b
        public final void b(int i, ByteBuffer byteBuffer) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            short[] sArr = this.c;
            int i2 = cw9.this.b;
            shortBufferAsShortBuffer.put(sArr, 0, i * i2);
            byteBuffer.position((i * 2 * i2) + byteBuffer.position());
        }

        @Override // cw9.b
        public final void c(int i, int i2) {
            for (int i3 = 0; i3 < cw9.this.b * i2; i3++) {
                this.b[i + i3] = 0;
            }
        }

        @Override // cw9.b
        public final void d(int i, int i2) {
            short[] sArr = this.b;
            cw9 cw9Var = cw9.this;
            int i3 = cw9Var.h / i2;
            int i4 = cw9Var.b;
            int i5 = i2 * i4;
            int i6 = i * i4;
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = 0;
                for (int i9 = 0; i9 < i5; i9++) {
                    i8 += sArr[(i7 * i5) + i6 + i9];
                }
                this.a[i7] = (short) (i8 / i5);
            }
        }

        @Override // cw9.b
        public final int e(int i, int i2, int i3) {
            return s(this.b, i, i2, i3);
        }

        @Override // cw9.b
        public final void f() {
            this.g = this.e;
        }

        @Override // cw9.b
        public final void flush() {
            this.g = 0;
            this.e = 0;
            this.f = 0;
        }

        @Override // cw9.b
        public final short[] g() {
            return this.b;
        }

        @Override // cw9.b
        public final short[] h() {
            return this.c;
        }

        @Override // cw9.b
        public final void i(int i) {
            this.c = r(this.c, cw9.this.k, i);
        }

        @Override // cw9.b
        public final boolean j() {
            int i = this.e;
            return i != 0 && cw9.this.p != 0 && this.f <= i * 3 && i * 2 > this.g * 3;
        }

        @Override // cw9.b
        public final void k(long j, int i, long j2) {
            int i2 = 0;
            while (true) {
                cw9 cw9Var = cw9.this;
                int i3 = cw9Var.b;
                if (i2 >= i3) {
                    return;
                }
                short[] sArr = this.c;
                int i4 = (cw9Var.k * i3) + i2;
                short[] sArr2 = this.d;
                int i5 = (i * i3) + i2;
                short s = sArr2[i5];
                short s2 = sArr2[i5 + i3];
                long j3 = ((long) cw9Var.n) * j;
                int i6 = cw9Var.m;
                long j4 = ((long) (i6 + 1)) * j2;
                long j5 = j4 - j3;
                long j6 = j4 - (((long) i6) * j2);
                sArr[i4] = (short) ((((j6 - j5) * ((long) s2)) + (((long) s) * j5)) / j6);
                i2++;
            }
        }

        @Override // cw9.b
        public final short[] l() {
            return this.d;
        }

        @Override // cw9.b
        public final void m(int i, int i2, int i3, int i4, int i5) {
            short[] sArr = this.c;
            short[] sArr2 = this.b;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = (i3 * i2) + i6;
                int i8 = (i5 * i2) + i6;
                int i9 = (i4 * i2) + i6;
                for (int i10 = 0; i10 < i; i10++) {
                    sArr[i7] = (short) (((sArr2[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                    i7 += i2;
                    i9 += i2;
                    i8 += i2;
                }
            }
        }

        @Override // cw9.b
        public final void n(int i) {
            this.d = r(this.d, cw9.this.l, i);
        }

        @Override // cw9.b
        public final int o() {
            return 2;
        }

        @Override // cw9.b
        public final void p(int i) {
            this.b = r(this.b, cw9.this.j, i);
        }

        @Override // cw9.b
        public final int q(int i, int i2) {
            return s(this.a, 0, i, i2);
        }

        public final short[] r(short[] sArr, int i, int i2) {
            int length = sArr.length;
            int i3 = cw9.this.b;
            int i4 = length / i3;
            return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
        }

        public final int s(short[] sArr, int i, int i2, int i3) {
            int i4 = i * cw9.this.b;
            int i5 = 255;
            int i6 = 1;
            int i7 = 0;
            int i8 = 0;
            while (i2 <= i3) {
                int iAbs = 0;
                for (int i9 = 0; i9 < i2; i9++) {
                    iAbs += Math.abs(sArr[i4 + i9] - sArr[(i4 + i2) + i9]);
                }
                if (iAbs * i7 < i6 * i2) {
                    i7 = i2;
                    i6 = iAbs;
                }
                if (iAbs * i5 > i8 * i2) {
                    i5 = i2;
                    i8 = iAbs;
                }
                i2++;
            }
            this.e = i6 / i7;
            this.f = i8 / i5;
            return i7;
        }
    }

    public cw9(int i, int i2, float f, float f2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i / i3;
        this.f = i / CarouselScreenFragment.CAROUSEL_ANIMATION_MS;
        int i4 = i / 65;
        this.g = i4;
        this.h = i4 * 2;
        this.i = z ? new a() : new c();
    }

    public final void a(int i, int i2) {
        b<?> bVar = this.i;
        bVar.i(i2);
        Object objG = bVar.g();
        int i3 = this.b;
        System.arraycopy(objG, i * i3, bVar.h(), this.k * i3, i3 * i2);
        this.k += i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        float f;
        int iQ;
        double d;
        int i;
        int iRound;
        int i2;
        int iRound2;
        int i3;
        int i4;
        long j;
        long j2;
        int i5 = this.k;
        float f2 = this.c;
        float f3 = this.d;
        double d2 = f2 / f3;
        float f4 = this.e * f3;
        int i6 = this.a;
        int i7 = 1;
        b<?> bVar = this.i;
        int i8 = this.b;
        if (d2 > 1.0000100135803223d || d2 < 0.9999899864196777d) {
            int i9 = this.j;
            int i10 = this.h;
            if (i9 >= i10) {
                int i11 = 0;
                while (true) {
                    int i12 = this.o;
                    if (i12 > 0) {
                        int iMin = Math.min(i10, i12);
                        a(i11, iMin);
                        this.o -= iMin;
                        i11 += iMin;
                        f = f4;
                        d = d2;
                        i2 = i7;
                        i = i10;
                    } else {
                        int i13 = i6 > 4000 ? i6 / 4000 : i7;
                        int i14 = this.g;
                        int i15 = this.f;
                        if (i8 == i7 && i13 == i7) {
                            iQ = bVar.e(i11, i15, i14);
                            f = f4;
                        } else {
                            bVar.d(i11, i13);
                            f = f4;
                            int iQ2 = bVar.q(i15 / i13, i14 / i13);
                            if (i13 != i7) {
                                int i16 = iQ2 * i13;
                                int i17 = i13 * 4;
                                int i18 = i16 - i17;
                                int i19 = i16 + i17;
                                if (i18 >= i15) {
                                    i15 = i18;
                                }
                                if (i19 <= i14) {
                                    i14 = i19;
                                }
                                if (i8 == i7) {
                                    iQ = bVar.e(i11, i15, i14);
                                } else {
                                    bVar.d(i11, i7);
                                    iQ = bVar.q(i15, i14);
                                }
                            } else {
                                iQ = iQ2;
                            }
                        }
                        int i20 = bVar.j() ? this.p : iQ;
                        bVar.f();
                        this.p = iQ;
                        double d3 = this.q;
                        if (d2 > 1.0d) {
                            if (d2 >= 2.0d) {
                                double d4 = (((double) i20) / (d2 - 1.0d)) + d3;
                                iRound2 = (int) Math.round(d4);
                                d = d2;
                                this.q = d4 - ((double) iRound2);
                                bVar = bVar;
                            } else {
                                d = d2;
                                double d5 = (((2.0d - d) * ((double) i20)) / (d - 1.0d)) + d3;
                                int iRound3 = (int) Math.round(d5);
                                this.o = iRound3;
                                this.q = d5 - ((double) iRound3);
                                iRound2 = i20;
                            }
                            bVar.i(iRound2);
                            int i21 = i10;
                            int i22 = iRound2;
                            bVar.m(i22, this.b, this.k, i11, i11 + i20);
                            this.k += i22;
                            i11 = i20 + i22 + i11;
                            i = i21;
                            i2 = i7;
                        } else {
                            d = d2;
                            int i23 = i7;
                            i = i10;
                            if (d < 0.5d) {
                                double d6 = ((((double) i20) * d) / (1.0d - d)) + d3;
                                iRound = (int) Math.round(d6);
                                this.q = d6 - ((double) iRound);
                            } else {
                                double d7 = ((((2.0d * d) - 1.0d) * ((double) i20)) / (1.0d - d)) + d3;
                                int iRound4 = (int) Math.round(d7);
                                this.o = iRound4;
                                this.q = d7 - ((double) iRound4);
                                iRound = i20;
                            }
                            int i24 = i20 + iRound;
                            bVar.i(i24);
                            i2 = i23;
                            System.arraycopy(bVar.g(), i11 * i8, bVar.h(), this.k * i8, i20 * i8);
                            int i25 = i11;
                            bVar.m(iRound, this.b, this.k + i20, i20 + i11, i25);
                            this.k += i24;
                            i11 = i25 + iRound;
                        }
                    }
                    if (i11 + i > i9) {
                        break;
                    }
                    i10 = i;
                    f4 = f;
                    i7 = i2;
                    d2 = d;
                }
                int i26 = this.j - i11;
                System.arraycopy(bVar.g(), i11 * i8, bVar.g(), 0, i26 * i8);
                this.j = i26;
            }
            if (f != 1.0f || this.k == i5) {
            }
            long j3 = (long) (i6 / f);
            long j4 = i6;
            while (j3 != 0 && j4 != 0 && j3 % 2 == 0 && j4 % 2 == 0) {
                j3 /= 2;
                j4 /= 2;
            }
            int i27 = this.k - i5;
            bVar.n(i27);
            System.arraycopy(bVar.h(), i5 * i8, bVar.l(), this.l * i8, i27 * i8);
            this.k = i5;
            this.l += i27;
            int i28 = 0;
            while (true) {
                i3 = this.l - 1;
                if (i28 >= i3) {
                    break;
                }
                while (true) {
                    i4 = this.m + 1;
                    j = i4;
                    long j5 = j * j3;
                    j2 = this.n;
                    if (j5 <= j2 * j4) {
                        break;
                    }
                    int i29 = i2;
                    bVar.i(i29);
                    bVar.k(j4, i28, j3);
                    this.n += i29;
                    this.k += i29;
                }
                int i30 = i2;
                this.m = i4;
                if (j == j4) {
                    this.m = 0;
                    xl7.r(j2 == j3 ? i30 : 0);
                    this.n = 0;
                }
                i28++;
                i2 = i30;
            }
            if (i3 == 0) {
                return;
            }
            System.arraycopy(bVar.l(), i3 * i8, bVar.l(), 0, (this.l - i3) * i8);
            this.l -= i3;
            return;
        }
        a(0, this.j);
        this.j = 0;
        f = f4;
        i2 = 1;
        if (f != 1.0f) {
        }
    }
}
