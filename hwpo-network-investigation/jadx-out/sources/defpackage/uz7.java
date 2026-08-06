package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uz7 extends ReplacementSpan {
    public Paint.FontMetricsInt A;
    public int B;
    public int C;
    public boolean D;
    public final float t;
    public final int u;
    public final float v;
    public final int w;
    public final float x;
    public final float y;
    public final int z;

    public uz7(float f, int i, float f2, int i2, tx2 tx2Var, int i3) {
        float fC1 = i == 0 ? tx2Var.C1(cka.c(f, 4294967296L)) : 0.0f;
        float fC2 = i2 == 0 ? tx2Var.C1(cka.c(f2, 4294967296L)) : 0.0f;
        this.t = f;
        this.u = i;
        this.v = f2;
        this.w = i2;
        this.x = fC1;
        this.y = fC2;
        this.z = i3;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.A;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        xj5.e("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.D) {
            vc5.c("PlaceholderSpan is not laid out yet.");
        }
        return this.C;
    }

    public final int c() {
        if (!this.D) {
            vc5.c("PlaceholderSpan is not laid out yet.");
        }
        return this.B;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float f;
        float f2;
        this.D = true;
        float textSize = paint.getTextSize();
        this.A = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            vc5.a("Invalid fontMetrics: line height can not be negative.");
        }
        int i3 = this.u;
        if (i3 == 0) {
            f = this.x;
        } else {
            if (i3 != 1) {
                vc5.b("Unsupported unit.");
                fl.a();
                return 0;
            }
            f = this.t * textSize;
        }
        this.B = (int) Math.ceil(f);
        int i4 = this.w;
        if (i4 == 0) {
            f2 = this.y;
        } else {
            if (i4 != 1) {
                vc5.b("Unsupported unit.");
                fl.a();
                return 0;
            }
            f2 = this.v * textSize;
        }
        this.C = (int) Math.ceil(f2);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            switch (this.z) {
                case 0:
                    if (fontMetricsInt.ascent > (-b())) {
                        fontMetricsInt.ascent = -b();
                    }
                    break;
                case 1:
                case 4:
                    if (b() + fontMetricsInt.ascent > fontMetricsInt.descent) {
                        fontMetricsInt.descent = b() + fontMetricsInt.ascent;
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - b();
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                        int iB = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = iB;
                        fontMetricsInt.descent = b() + iB;
                    }
                    break;
                default:
                    vc5.a("Unknown verticalAlign.");
                    break;
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        return c();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
