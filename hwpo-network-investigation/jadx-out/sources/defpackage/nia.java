package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nia {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public oob e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final Paint.FontMetricsInt m;
    public final int n;
    public final f86[] o;
    public final Rect p = new Rect();
    public vq5 q;

    /* JADX WARN: Code duplicated, block: B:57:0x012a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0161  */
    /* JADX WARN: Code duplicated, block: B:86:0x0178  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a1 A[PHI: r14
      0x01a1: PHI (r14v7 int) = (r14v6 int), (r14v9 int) binds: [B:102:0x01b3, B:95:0x019a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r25v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    public nia(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, cr5 cr5Var) {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutA;
        f86[] f86VarArr;
        int i10;
        int i11;
        int i12;
        int i13;
        char c;
        long j;
        int i14;
        int i15;
        int i16;
        long jA;
        ?? r8;
        boolean zA;
        int topPadding;
        boolean zB;
        long jA2;
        int i17;
        Paint.FontMetricsInt fontMetricsInt;
        int i18;
        this.a = textPaint;
        this.b = truncateAt;
        this.c = z;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicB = tia.b(i2);
        Layout.Alignment alignment = waa.a;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : waa.b : waa.a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z2 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, hl0.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsA = cr5Var.a();
            double d = f;
            int iCeil = (int) Math.ceil(d);
            if (metricsA == null || cr5Var.c() > f || z2) {
                this.l = false;
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicB;
                layoutA = x0a.a(charSequence, textPaint, iCeil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
            } else {
                this.l = true;
                if (iCeil < 0) {
                    vc5.a("negative width");
                }
                if (iCeil < 0) {
                    vc5.a("negative ellipsized width");
                }
                layoutA = Build.VERSION.SDK_INT >= 33 ? xs0.a(charSequence, textPaint, iCeil, alignment2, metricsA, z, truncateAt, iCeil) : new BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsA, z, truncateAt, iCeil);
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicB;
            }
            this.f = layoutA;
            Trace.endSection();
            int iMin = Math.min(layoutA.getLineCount(), i9);
            this.g = iMin;
            int i19 = iMin - 1;
            this.d = iMin >= i9 && (layoutA.getEllipsisCount(i19) > 0 || layoutA.getLineEnd(i19) != charSequence.length());
            if (layoutA.getText() instanceof Spanned) {
                CharSequence text = layoutA.getText();
                text.getClass();
                if (ia0.c((Spanned) text, f86.class) || layoutA.getText().length() <= 0) {
                    CharSequence text2 = layoutA.getText();
                    text2.getClass();
                    i10 = 0;
                    f86VarArr = (f86[]) ((Spanned) text2).getSpans(0, layoutA.getText().length(), f86.class);
                } else {
                    f86VarArr = null;
                    i10 = 0;
                }
            } else {
                f86VarArr = null;
                i10 = 0;
            }
            this.o = f86VarArr;
            if (f86VarArr == null) {
                i11 = 2;
                i12 = i10;
            } else {
                f86 f86Var = f86VarArr.length == 0 ? null : f86VarArr[i10];
                if (f86Var != null) {
                    if (f86Var.v) {
                        i11 = 2;
                        i18 = f86Var.y == 2 ? 1 : i18;
                        i12 = i18;
                    } else {
                        i11 = 2;
                    }
                    i18 = i10;
                    i12 = i18;
                } else {
                    i11 = 2;
                    i12 = i10;
                }
            }
            if (f86VarArr == null) {
                i13 = i10;
            } else {
                f86 f86Var2 = f86VarArr.length == 0 ? null : f86VarArr[i10];
                if (f86Var2 != null && f86Var2.w && f86Var2.y == i11) {
                    i13 = 1;
                } else {
                    i13 = i10;
                }
            }
            if (i12 == 0 || i13 == 0) {
                long jA3 = tia.b;
                if (z) {
                    c = ' ';
                    j = 4294967295L;
                    i14 = 1;
                    i15 = 33;
                } else {
                    if (this.l) {
                        BoringLayout boringLayout = (BoringLayout) layoutA;
                        i15 = 33;
                        if (Build.VERSION.SDK_INT >= 33) {
                            zB = ys0.b(boringLayout);
                        } else {
                            r8 = i10;
                        }
                    } else {
                        i15 = 33;
                        StaticLayout staticLayout = (StaticLayout) layoutA;
                        int i20 = Build.VERSION.SDK_INT;
                        if (i20 >= 33) {
                            zA = v0a.a(staticLayout);
                        } else if (i20 >= 28) {
                            r8 = 1;
                        } else {
                            r8 = i10;
                        }
                    }
                    if (r8 != 0) {
                        r8 = zA;
                        c = ' ';
                        j = 4294967295L;
                        i14 = 1;
                    } else {
                        r8 = zA;
                        TextPaint paint = layoutA.getPaint();
                        CharSequence text3 = layoutA.getText();
                        c = ' ';
                        Rect rectA = ds7.a(paint, text3, layoutA.getLineStart(i10), layoutA.getLineEnd(i10));
                        int lineAscent = layoutA.getLineAscent(i10);
                        j = 4294967295L;
                        int i21 = rectA.top;
                        if (i21 < lineAscent) {
                            r8 = zB;
                            topPadding = lineAscent - i21;
                        } else {
                            r8 = zB;
                            topPadding = layoutA.getTopPadding();
                        }
                        i14 = 1;
                        rectA = iMin != 1 ? ds7.a(paint, text3, layoutA.getLineStart(i19), layoutA.getLineEnd(i19)) : rectA;
                        int lineDescent = layoutA.getLineDescent(i19);
                        int i22 = rectA.bottom;
                        int bottomPadding = i22 > lineDescent ? i22 - lineDescent : layoutA.getBottomPadding();
                        if (topPadding != 0 || bottomPadding != 0) {
                            jA3 = tia.a(topPadding, bottomPadding);
                        }
                    }
                }
                int i23 = i12 != 0 ? i10 : (int) (jA3 >> c);
                if (i13 != 0) {
                    r8 = zB;
                    r8 = zB;
                    i16 = i10;
                } else {
                    r8 = zB;
                    r8 = zB;
                    i16 = (int) (jA3 & j);
                }
                jA = tia.a(i23, i16);
            } else {
                jA = tia.b;
                c = ' ';
                j = 4294967295L;
                i14 = 1;
                i15 = 33;
            }
            if (f86VarArr != null) {
                int length2 = f86VarArr.length;
                int iMax = i10;
                int iMax2 = iMax;
                for (int i24 = iMax2; i24 < length2; i24++) {
                    f86 f86Var3 = f86VarArr[i24];
                    int i25 = f86Var3.D;
                    iMax = i25 < 0 ? Math.max(iMax, Math.abs(i25)) : iMax;
                    int i26 = f86Var3.E;
                    if (i26 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i26));
                    }
                }
                jA2 = (iMax == 0 && iMax2 == 0) ? tia.b : tia.a(iMax, iMax2);
            } else {
                jA2 = tia.b;
            }
            this.h = Math.max((int) (jA >> c), (int) (jA2 >> c));
            this.i = Math.max((int) (jA & j), (int) (jA2 & j));
            TextPaint textPaint2 = this.a;
            f86[] f86VarArr2 = this.o;
            int i27 = this.g - i14;
            Layout layout = this.f;
            if (layout.getLineStart(i27) != layout.getLineEnd(i27) || f86VarArr2 == null || f86VarArr2.length == 0) {
                i17 = i10;
                fontMetricsInt = null;
            } else {
                SpannableString spannableString = new SpannableString("\u200b");
                f86 f86Var4 = (f86) u30.w(f86VarArr2);
                spannableString.setSpan(new f86(f86Var4.t, spannableString.length(), (i27 == 0 || !f86Var4.w) ? f86Var4.w : i10, f86Var4.w, f86Var4.x, f86Var4.y), i10, spannableString.length(), i15);
                i17 = i10;
                StaticLayout staticLayoutA = x0a.a(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, pq5.a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.c, 0, 0, 0, 0);
                fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutA.getLineAscent(i17);
                fontMetricsInt.descent = staticLayoutA.getLineDescent(i17);
                fontMetricsInt.top = staticLayoutA.getLineTop(i17);
                fontMetricsInt.bottom = staticLayoutA.getLineBottom(i17);
            }
            this.n = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e(i19) - g(i19))) : i17;
            this.m = fontMetricsInt;
            Layout layout2 = this.f;
            this.j = na5.a(layout2, i19, layout2.getPaint());
            Layout layout3 = this.f;
            this.k = na5.b(layout3, i19, layout3.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z = this.d;
        Layout layout = this.f;
        return (z ? layout.getLineBottom(this.g - 1) : layout.getHeight()) + this.h + this.i + this.n;
    }

    public final float b(int i) {
        if (i == this.g - 1) {
            return this.j + this.k;
        }
        return 0.0f;
    }

    public final vq5 c() {
        vq5 vq5Var = this.q;
        if (vq5Var != null) {
            return vq5Var;
        }
        vq5 vq5Var2 = new vq5(this.f);
        this.q = vq5Var2;
        return vq5Var2;
    }

    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.h + ((i != this.g + (-1) || (fontMetricsInt = this.m) == null) ? this.f.getLineBaseline(i) : g(i) - fontMetricsInt.ascent);
    }

    public final float e(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.g;
        int i3 = i2 - 1;
        Layout layout = this.f;
        if (i != i3 || (fontMetricsInt = this.m) == null) {
            return this.h + layout.getLineBottom(i) + (i == i2 + (-1) ? this.i : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i) {
        ThreadLocal<xaa> threadLocal = tia.a;
        Layout layout = this.f;
        return (layout.getEllipsisCount(i) <= 0 || this.b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final float g(int i) {
        return this.f.getLineTop(i) + (i == 0 ? 0 : this.h);
    }

    public final float h(int i, boolean z) {
        return b(this.f.getLineForOffset(i)) + c().c(i, true, z);
    }

    public final float i(int i, boolean z) {
        return b(this.f.getLineForOffset(i)) + c().c(i, false, z);
    }

    public final oob j() {
        oob oobVar = this.e;
        if (oobVar != null) {
            return oobVar;
        }
        Layout layout = this.f;
        oob oobVar2 = new oob(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.e = oobVar2;
        return oobVar2;
    }
}
