package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f86 implements LineHeightSpan {
    public int D;
    public int E;
    public final float t;
    public final int u;
    public final boolean v;
    public final boolean w;
    public final float x;
    public final int y;
    public int z = Integer.MIN_VALUE;
    public int A = Integer.MIN_VALUE;
    public int B = Integer.MIN_VALUE;
    public int C = Integer.MIN_VALUE;

    public f86(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.t = f;
        this.u = i;
        this.v = z;
        this.w = z2;
        this.x = f2;
        this.y = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            vc5.c("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        double dCeil;
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.u;
        int i7 = this.y;
        boolean z3 = this.w;
        boolean z4 = this.v;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.z == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int iCeil = (int) Math.ceil(this.t);
            int i9 = iCeil - i8;
            if (i7 != 1 || i9 > 0) {
                float fAbs = this.x;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                if (i9 <= 0) {
                    dCeil = Math.ceil(i9 * fAbs);
                } else {
                    dCeil = Math.ceil((1.0f - fAbs) * i9);
                }
                int i10 = (int) dCeil;
                int i11 = fontMetricsInt.descent;
                int i12 = i10 + i11;
                this.B = i12;
                int i13 = i12 - iCeil;
                this.A = i13;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i13 = fontMetricsInt.ascent;
                    }
                    this.z = i13;
                    if (z3) {
                        i12 = i11;
                    }
                    this.C = i12;
                    this.D = fontMetricsInt.ascent - i13;
                    this.E = i12 - i11;
                } else if (i7 == 2) {
                    int i14 = fontMetricsInt.ascent;
                    this.z = z4 ? Math.max(i14, i13) : Math.min(i14, i13);
                    int i15 = fontMetricsInt.descent;
                    int i16 = this.B;
                    this.C = z3 ? Math.min(i15, i16) : Math.max(i15, i16);
                    this.D = 0;
                    this.E = 0;
                }
            } else {
                int i17 = fontMetricsInt.ascent;
                this.A = i17;
                int i18 = fontMetricsInt.descent;
                this.B = i18;
                this.z = i17;
                this.C = i18;
                this.D = 0;
                this.E = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.z : this.A;
        fontMetricsInt.descent = z2 ? this.C : this.B;
    }
}
