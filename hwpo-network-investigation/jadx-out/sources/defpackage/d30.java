package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d30 {
    public final int a;
    public final float b;
    public int c;
    public int d;
    public final float e;
    public final float f;
    public final int g;
    public final float h;

    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    public d30(int i, float f, float f2, float f3, int i2, float f4, int i3, float f5, int i4, float f6) {
        float fAbs;
        this.a = i;
        float fC = ym7.c(f, f2, f3);
        this.b = fC;
        this.c = i2;
        this.e = f4;
        this.d = i3;
        this.f = f5;
        this.g = i4;
        float f7 = i4;
        float f8 = (f4 * i3) + (f5 * f7);
        float f9 = i2;
        float f10 = f6 - ((fC * f9) + f8);
        if (i2 > 0 && f10 > 0.0f) {
            this.b = Math.min(f10 / f9, f3 - fC) + fC;
        } else if (i2 > 0 && f10 < 0.0f) {
            this.b = Math.max(f10 / f9, f2 - fC) + fC;
        }
        int i5 = this.c;
        float f11 = i5 > 0 ? this.b : 0.0f;
        this.b = f11;
        int i6 = this.d;
        float f12 = i6;
        float f13 = f12 / 2.0f;
        float f14 = (f6 - ((i5 + f13) * (i5 > 0 ? f11 : 0.0f))) / (f13 + f7);
        this.f = f14;
        float f15 = (f11 + f14) / 2.0f;
        this.e = f15;
        if (i6 > 0 && f14 != f5) {
            float f16 = (f5 - f14) * f7;
            float fMin = Math.min(Math.abs(f16), f15 * 0.1f * f12);
            float f17 = this.e;
            int i7 = this.d;
            if (f16 > 0.0f) {
                this.e = f17 - (fMin / i7);
                this.f = (fMin / f7) + this.f;
            } else {
                this.e = (fMin / i7) + f17;
                this.f -= fMin / f7;
            }
        }
        if (i4 > 0 && this.c > 0 && this.d > 0) {
            float f18 = this.f;
            float f19 = this.e;
            if (f18 <= f19 || f19 <= this.b) {
                fAbs = Float.MAX_VALUE;
            } else {
                fAbs = i * Math.abs(f5 - this.f);
            }
        } else if (i4 <= 0 || this.c <= 0 || this.f > this.b) {
            fAbs = i * Math.abs(f5 - this.f);
        } else {
            fAbs = Float.MAX_VALUE;
        }
        this.h = fAbs;
    }

    public static d30 a(float f, float f2, float f3, float f4, int[] iArr, float f5, int[] iArr2, float f6, int[] iArr3) {
        d30 d30Var = null;
        int i = 1;
        for (int i2 : iArr3) {
            int length = iArr2.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = iArr2[i3];
                int length2 = iArr.length;
                int i5 = 0;
                while (i5 < length2) {
                    int i6 = length;
                    int i7 = i3;
                    int i8 = i;
                    int i9 = length2;
                    int i10 = i5;
                    d30 d30Var2 = new d30(i8, f2, f3, f4, iArr[i5], f5, i4, f6, i2, f);
                    float f7 = d30Var2.h;
                    if (d30Var == null || f7 < d30Var.h) {
                        if (f7 == 0.0f) {
                            return d30Var2;
                        }
                        d30Var = d30Var2;
                    }
                    int i11 = i8 + 1;
                    i5 = i10 + 1;
                    i3 = i7;
                    i = i11;
                    length = i6;
                    length2 = i9;
                }
                i3++;
                i = i;
                length = length;
            }
        }
        return d30Var;
    }

    public final String toString() {
        return "Arrangement [priority=" + this.a + ", smallCount=" + this.c + ", smallSize=" + this.b + ", mediumCount=" + this.d + ", mediumSize=" + this.e + ", largeCount=" + this.g + ", largeSize=" + this.f + ", cost=" + this.h + "]";
    }
}
