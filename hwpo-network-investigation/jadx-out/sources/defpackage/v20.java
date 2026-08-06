package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class v20 {
    public final a[][] a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public float h;
        public float i;
        public final float[] j;
        public final float k;
        public final float l;
        public final float m;
        public final float n;
        public final float o;
        public final boolean p;
        public final float q;
        public final float r;

        public a(int i, float f, float f2, float f3, float f4, float f5, float f6) {
            boolean z;
            int i2;
            float f7;
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = f5;
            this.f = f6;
            float f8 = f5 - f3;
            float f9 = f6 - f4;
            float f10 = 0.0f;
            int i3 = 1;
            boolean z2 = i == 1 || (i == 4 ? f9 > 0.0f : !(i != 5 || f9 >= 0.0f));
            float f11 = z2 ? -1.0f : 1.0f;
            this.m = f11;
            float f12 = 1.0f / (f2 - f);
            this.k = f12;
            float[] fArr = new float[101];
            this.j = fArr;
            boolean z3 = i == 3;
            if (z3 || Math.abs(f8) < 0.001f || Math.abs(f9) < 0.001f) {
                float fHypot = (float) Math.hypot(f9, f8);
                this.g = fHypot;
                this.l = fHypot * f12;
                this.q = f8 * f12;
                this.r = f9 * f12;
                this.n = Float.NaN;
                this.o = Float.NaN;
                z = true;
            } else {
                this.n = f8 * f11;
                this.o = f9 * (-f11);
                this.q = z2 ? f5 : f3;
                this.r = z2 ? f4 : f6;
                float f13 = f5 - f3;
                float f14 = f4 - f6;
                float[] fArr2 = w20.a;
                float f15 = f14;
                float fHypot2 = 0.0f;
                float f16 = 0.0f;
                int i4 = 1;
                while (true) {
                    double d = (float) (((((double) i4) * 90.0d) / 90.0d) * 0.017453292519943295d);
                    i2 = i3;
                    float fSin = ((float) Math.sin(d)) * f13;
                    float fCos = ((float) Math.cos(d)) * f14;
                    f7 = f10;
                    fHypot2 += (float) Math.hypot(fSin - f16, fCos - f15);
                    fArr2[i4] = fHypot2;
                    if (i4 == 90) {
                        break;
                    }
                    i4++;
                    f16 = fSin;
                    f15 = fCos;
                    i3 = i2;
                    f10 = f7;
                }
                this.g = fHypot2;
                int i5 = i2;
                while (true) {
                    fArr2[i5] = fArr2[i5] / fHypot2;
                    if (i5 == 90) {
                        break;
                    } else {
                        i5++;
                    }
                }
                int length = fArr.length;
                for (int i6 = 0; i6 < length; i6++) {
                    float f17 = i6 / 100.0f;
                    int iBinarySearch = Arrays.binarySearch(fArr2, 0, 91, f17);
                    if (iBinarySearch >= 0) {
                        fArr[i6] = iBinarySearch / 90.0f;
                    } else if (iBinarySearch == -1) {
                        fArr[i6] = f7;
                    } else {
                        int i7 = -iBinarySearch;
                        int i8 = i7 - 2;
                        float f18 = i8;
                        float f19 = fArr2[i8];
                        fArr[i6] = (((f17 - f19) / (fArr2[i7 - i2] - f19)) + f18) / 90.0f;
                    }
                }
                this.l = this.g * this.k;
                z = z3;
            }
            this.p = z;
        }

        public final float a() {
            float f = this.n * this.i;
            return f * this.m * (this.l / ((float) Math.hypot(f, (-this.o) * this.h)));
        }

        public final float b() {
            float f = this.n * this.i;
            float f2 = (-this.o) * this.h;
            return f2 * this.m * (this.l / ((float) Math.hypot(f, f2)));
        }

        public final void c(float f) {
            float f2 = (this.m == -1.0f ? this.b - f : f - this.a) * this.k;
            float fA = 0.0f;
            if (f2 > 0.0f) {
                fA = 1.0f;
                if (f2 < 1.0f) {
                    float f3 = f2 * 100.0f;
                    int i = (int) f3;
                    float[] fArr = this.j;
                    float f4 = fArr[i];
                    fA = go.a(fArr[i + 1], f4, f3 - i, f4);
                }
            }
            double d = fA * 1.5707964f;
            this.h = (float) Math.sin(d);
            this.i = (float) Math.cos(d);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024 A[PHI: r9
      0x0024: PHI (r9v1 int) = (r9v0 int), (r9v3 int), (r9v4 int) binds: [B:5:0x0014, B:10:0x001d, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    public v20(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        int length = fArr.length - 1;
        a[][] aVarArr = new a[length][];
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        while (i4 < length) {
            int i5 = iArr[i4];
            int i6 = 3;
            if (i5 == 0) {
                i = i6;
            } else if (i5 == 1) {
                i2 = 1;
                i = i2;
            } else {
                if (i5 != 2) {
                    if (i5 != 3) {
                        i6 = 4;
                        if (i5 != 4) {
                            i6 = 5;
                            if (i5 != 5) {
                                i = i3;
                            } else {
                                i = i6;
                            }
                        } else {
                            i = i6;
                        }
                    } else {
                        if (i2 != 1) {
                            i2 = 1;
                        }
                        i = i2;
                    }
                }
                i2 = 2;
                i = i2;
            }
            float[] fArr3 = fArr2[i4];
            int i7 = i4 + 1;
            float[] fArr4 = fArr2[i7];
            float f = fArr[i4];
            float f2 = fArr[i7];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            a[] aVarArr2 = new a[length2];
            int i8 = 0;
            while (i8 < length2) {
                int i9 = i8 * 2;
                a[] aVarArr3 = aVarArr2;
                int i10 = i8;
                int i11 = i9 + 1;
                aVarArr3[i10] = new a(i, f, f2, fArr3[i9], fArr3[i11], fArr4[i9], fArr4[i11]);
                i8 = i10 + 1;
                aVarArr2 = aVarArr3;
            }
            aVarArr[i4] = aVarArr2;
            i4 = i7;
            i3 = i;
        }
        this.a = aVarArr;
    }
}
