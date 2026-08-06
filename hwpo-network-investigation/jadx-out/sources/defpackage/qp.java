package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qp {
    public final tp a;
    public final int b;
    public final long c;
    public final nia d;
    public final CharSequence e;
    public final List<sk8> f;

    /* JADX WARN: Code duplicated, block: B:100:0x012c  */
    /* JADX WARN: Code duplicated, block: B:101:0x012f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0143  */
    /* JADX WARN: Code duplicated, block: B:106:0x014e  */
    /* JADX WARN: Code duplicated, block: B:118:0x019a  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:142:0x0211  */
    /* JADX WARN: Code duplicated, block: B:143:0x0214  */
    /* JADX WARN: Code duplicated, block: B:145:0x022e  */
    /* JADX WARN: Code duplicated, block: B:147:0x0248  */
    /* JADX WARN: Code duplicated, block: B:149:0x024c A[LOOP:1: B:148:0x024a->B:149:0x024c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:152:0x0277  */
    /* JADX WARN: Code duplicated, block: B:153:0x027b  */
    /* JADX WARN: Code duplicated, block: B:155:0x0293  */
    /* JADX WARN: Code duplicated, block: B:157:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:158:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:161:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:164:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:167:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:168:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:170:0x02db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:172:0x02df  */
    /* JADX WARN: Code duplicated, block: B:195:0x0341  */
    /* JADX WARN: Code duplicated, block: B:197:0x0358  */
    /* JADX WARN: Code duplicated, block: B:199:0x036b  */
    /* JADX WARN: Code duplicated, block: B:200:0x0377  */
    /* JADX WARN: Code duplicated, block: B:201:0x038a  */
    /* JADX WARN: Code duplicated, block: B:202:0x0393  */
    /* JADX WARN: Code duplicated, block: B:203:0x0398  */
    /* JADX WARN: Code duplicated, block: B:214:0x033b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x0101  */
    /* JADX WARN: Code duplicated, block: B:93:0x011a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0123  */
    /* JADX WARN: Code duplicated, block: B:97:0x0126  */
    /* JADX WARN: Code duplicated, block: B:98:0x0129  */
    /* JADX WARN: Instruction removed from duplicated block: B:147:0x0248, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:153:0x027b, please report this as an issue */
    public qp(tp tpVar, int i, int i2, long j) {
        int i3;
        int i4;
        int i5;
        int i6;
        char c;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        nia niaVarA;
        int i7;
        int i8;
        qp qpVar;
        int i9;
        int i10;
        Layout layout;
        Spanned spanned;
        dl9[] dl9VarArr;
        CharSequence charSequence;
        Spanned spanned2;
        ArrayList arrayList;
        int i11;
        List<sk8> list;
        int spanEnd;
        int lineForOffset;
        boolean z;
        boolean z2;
        boolean z3;
        sk8 sk8Var;
        float fI;
        int iC;
        float fH;
        int iC2;
        nia niaVar;
        float fD;
        int iB;
        float fG;
        float fB;
        float fD2;
        int i12;
        int i13;
        this.a = tpVar;
        this.b = i;
        this.c = j;
        if (xx1.i(j) != 0 || xx1.j(j) != 0) {
            vc5.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            vc5.a("maxLines should be greater than 0");
        }
        wja wjaVar = tpVar.b;
        CharSequence charSequence2 = tpVar.h;
        if (i2 == 2) {
            i3 = 0;
            if (!bka.a(wjaVar.a.h, cka.b(0)) && !bka.a(wjaVar.a.h, bka.c) && (i13 = wjaVar.b.a) != 0 && i13 != 5 && i13 != 4 && charSequence2.length() != 0) {
                Spannable spannableString = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
                spannableString = spannableString == null ? new SpannableString(charSequence2) : spannableString;
                if (!ia0.c(spannableString, ma5.class)) {
                    spannableString.setSpan(new ma5(), spannableString.length() - 1, spannableString.length() - 1, 33);
                }
                charSequence2 = spannableString;
            }
        } else {
            i3 = 0;
        }
        CharSequence charSequence3 = charSequence2;
        this.e = charSequence3;
        ss7 ss7Var = wjaVar.b;
        ww9 ww9Var = wjaVar.a;
        int i14 = ss7Var.a;
        int i15 = 3;
        int i16 = i14 == 1 ? 3 : i14 == 2 ? 4 : i14 == 3 ? 2 : (i14 != 5 && i14 == 6) ? 1 : i3;
        int i17 = i14 == 4 ? 1 : i3;
        int i18 = ss7Var.h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i19 = ss7Var.g;
        int i20 = i19 & 255;
        if (i20 == 1) {
            i4 = i3;
        } else if (i20 == 2) {
            i4 = 1;
        } else if (i20 == 3) {
            i4 = 2;
        } else {
            i4 = i3;
        }
        int i21 = (i19 >> 8) & 255;
        if (i21 == 1) {
            i15 = i3;
        } else if (i21 == 2) {
            i15 = 1;
        } else if (i21 == 3) {
            i15 = 2;
        } else if (i21 != 4) {
            i15 = i3;
        }
        int i22 = (i19 >> 16) & 255;
        if (i22 != 1) {
            i5 = 2;
            i6 = i22 == 2 ? 1 : i6;
            if (i2 == i5) {
                truncateAt2 = TextUtils.TruncateAt.END;
            } else {
                if (i2 == 5) {
                    if (i2 == 4) {
                        truncateAt2 = TextUtils.TruncateAt.START;
                    } else {
                        c = ' ';
                        truncateAt = null;
                    }
                    niaVarA = a(i16, i17, truncateAt, i, i18, i4, i15, i6, charSequence3);
                    Layout layout2 = niaVarA.f;
                    i7 = i16;
                    if (Build.VERSION.SDK_INT < 35 || tpVar.g.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                        i8 = 2;
                        qpVar = this;
                        i9 = i;
                        i10 = i7;
                    } else {
                        int ellipsisStart = layout2.getEllipsisStart(0);
                        i8 = 2;
                        CharSequence[] charSequenceArr = {charSequence3.subSequence(0, ellipsisStart), "…", charSequence3.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence3.length())};
                        qpVar = this;
                        i9 = i;
                        i10 = i7;
                        niaVarA = qpVar.a(i10, i17, truncateAt, i9, i18, i4, i15, i6, TextUtils.concat(charSequenceArr));
                    }
                    int i23 = niaVarA.g;
                    if (i2 == i8 || niaVarA.a() <= xx1.g(j) || i9 <= 1) {
                        qpVar.d = niaVarA;
                    } else {
                        int iG = xx1.g(j);
                        int i24 = 0;
                        while (true) {
                            if (i24 >= i23) {
                                i24 = i23;
                                break;
                            } else if (niaVarA.e(i24) > iG) {
                                break;
                            } else {
                                i24++;
                            }
                        }
                        if (i24 >= 0 && i24 != qpVar.b) {
                            niaVarA = qpVar.a(i10, i17, truncateAt, i24 < 1 ? 1 : i24, i18, i4, i15, i6, qpVar.e);
                        }
                        qpVar.d = niaVarA;
                    }
                    qpVar.a.g.c(ww9Var.a.e(), (((long) Float.floatToRawIntBits(qpVar.c())) & 4294967295L) | (((long) Float.floatToRawIntBits(qpVar.f())) << c), ww9Var.a.a());
                    layout = qpVar.d.f;
                    if (layout.getText() instanceof Spanned) {
                        CharSequence text = layout.getText();
                        text.getClass();
                        spanned = (Spanned) text;
                        if (spanned.nextSpanTransition(-1, spanned.length(), dl9.class) != spanned.length()) {
                            CharSequence text2 = layout.getText();
                            text2.getClass();
                            dl9VarArr = (dl9[]) ((Spanned) text2).getSpans(0, layout.getText().length(), dl9.class);
                        } else {
                            dl9VarArr = null;
                        }
                    } else {
                        dl9VarArr = null;
                    }
                    if (dl9VarArr != null) {
                        for (dl9 dl9Var : dl9VarArr) {
                            dl9Var.v.setValue(new cr9((((long) Float.floatToRawIntBits(qpVar.c())) & 4294967295L) | (((long) Float.floatToRawIntBits(qpVar.f())) << c)));
                        }
                    }
                    charSequence = qpVar.e;
                    if (charSequence instanceof Spanned) {
                        spanned2 = (Spanned) charSequence;
                        Object[] spans = spanned2.getSpans(0, charSequence.length(), uz7.class);
                        arrayList = new ArrayList(spans.length);
                        for (Object obj : spans) {
                            uz7 uz7Var = (uz7) obj;
                            int spanStart = spanned2.getSpanStart(uz7Var);
                            spanEnd = spanned2.getSpanEnd(uz7Var);
                            lineForOffset = qpVar.d.f.getLineForOffset(spanStart);
                            if (lineForOffset >= qpVar.b) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (qpVar.d.f.getEllipsisCount(lineForOffset) > 0 || spanEnd <= qpVar.d.f.getEllipsisStart(lineForOffset) + qpVar.d.f.getLineStart(lineForOffset)) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (spanEnd > qpVar.d.f(lineForOffset)) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z2 && !z3 && !z) {
                                boolean z4 = qpVar.d.f.getParagraphDirection(lineForOffset) == 1;
                                boolean zIsRtlCharAt = qpVar.d.f.isRtlCharAt(spanStart);
                                if (!z4 || zIsRtlCharAt) {
                                    if (z4 && zIsRtlCharAt) {
                                        fH = qpVar.d.i(spanStart, false);
                                        iC2 = uz7Var.c();
                                    } else {
                                        nia niaVar2 = qpVar.d;
                                        if (zIsRtlCharAt) {
                                            fH = niaVar2.h(spanStart, false);
                                            iC2 = uz7Var.c();
                                        } else {
                                            fI = niaVar2.i(spanStart, false);
                                            iC = uz7Var.c();
                                        }
                                    }
                                    fI = fH - iC2;
                                    niaVar = qpVar.d;
                                    switch (uz7Var.z) {
                                        case 0:
                                            fD = niaVar.d(lineForOffset);
                                            iB = uz7Var.b();
                                            fG = fD - iB;
                                            sk8Var = new sk8(fI, fG, fH, uz7Var.b() + fG);
                                            break;
                                        case 1:
                                            fG = niaVar.g(lineForOffset);
                                            sk8Var = new sk8(fI, fG, fH, uz7Var.b() + fG);
                                            break;
                                        case 2:
                                            fD = niaVar.e(lineForOffset);
                                            iB = uz7Var.b();
                                            fG = fD - iB;
                                            sk8Var = new sk8(fI, fG, fH, uz7Var.b() + fG);
                                            break;
                                        case 3:
                                            fG = ((niaVar.e(lineForOffset) + niaVar.g(lineForOffset)) - uz7Var.b()) / 2.0f;
                                            sk8Var = new sk8(fI, fG, fH, uz7Var.b() + fG);
                                            break;
                                        case 4:
                                            fB = uz7Var.a().ascent;
                                            fD2 = niaVar.d(lineForOffset);
                                            fG = fD2 + fB;
                                            sk8Var = new sk8(fI, fG, fH, uz7Var.b() + fG);
                                            break;
                                        case 5:
                                            fD = niaVar.d(lineForOffset) + uz7Var.a().descent;
                                            iB = uz7Var.b();
                                            fG = fD - iB;
                                            sk8Var = new sk8(fI, fG, fH, uz7Var.b() + fG);
                                            break;
                                        case 6:
                                            Paint.FontMetricsInt fontMetricsIntA = uz7Var.a();
                                            fB = ((fontMetricsIntA.ascent + fontMetricsIntA.descent) - uz7Var.b()) / 2;
                                            fD2 = niaVar.d(lineForOffset);
                                            fG = fD2 + fB;
                                            sk8Var = new sk8(fI, fG, fH, uz7Var.b() + fG);
                                            break;
                                        default:
                                            aa0.c("unexpected verticalAlignment");
                                            throw null;
                                    }
                                } else {
                                    fI = qpVar.d.h(spanStart, false);
                                    iC = uz7Var.c();
                                }
                                fH = iC + fI;
                                niaVar = qpVar.d;
                                switch (uz7Var.z) {
                                    case 0:
                                        fD = niaVar.d(lineForOffset);
                                        iB = uz7Var.b();
                                        fG = fD - iB;
                                        sk8Var = new sk8(fI, fG, fH, uz7Var.b() + fG);
                                        break;
                                    case 1:
                                        fG = niaVar.g(lineForOffset);
                                        sk8Var = new sk8(fI, fG, fH, uz7Var.b() + fG);
                                        break;
                                    case 2:
                                        fD = niaVar.e(lineForOffset);
                                        iB = uz7Var.b();
                                        fG = fD - iB;
                                        sk8Var = new sk8(fI, fG, fH, uz7Var.b() + fG);
                                        break;
                                    case 3:
                                        fG = ((niaVar.e(lineForOffset) + niaVar.g(lineForOffset)) - uz7Var.b()) / 2.0f;
                                        sk8Var = new sk8(fI, fG, fH, uz7Var.b() + fG);
                                        break;
                                    case 4:
                                        fB = uz7Var.a().ascent;
                                        fD2 = niaVar.d(lineForOffset);
                                        fG = fD2 + fB;
                                        sk8Var = new sk8(fI, fG, fH, uz7Var.b() + fG);
                                        break;
                                    case 5:
                                        fD = niaVar.d(lineForOffset) + uz7Var.a().descent;
                                        iB = uz7Var.b();
                                        fG = fD - iB;
                                        sk8Var = new sk8(fI, fG, fH, uz7Var.b() + fG);
                                        break;
                                    case 6:
                                        Paint.FontMetricsInt fontMetricsIntA2 = uz7Var.a();
                                        fB = ((fontMetricsIntA2.ascent + fontMetricsIntA2.descent) - uz7Var.b()) / 2;
                                        fD2 = niaVar.d(lineForOffset);
                                        fG = fD2 + fB;
                                        sk8Var = new sk8(fI, fG, fH, uz7Var.b() + fG);
                                        break;
                                    default:
                                        aa0.c("unexpected verticalAlignment");
                                        throw null;
                                }
                            }
                            arrayList.add(sk8Var);
                        }
                        list = arrayList;
                    } else {
                        list = hf3.t;
                    }
                    qpVar.f = list;
                }
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            }
            c = ' ';
            truncateAt = truncateAt2;
            niaVarA = a(i16, i17, truncateAt, i, i18, i4, i15, i6, charSequence3);
            Layout layout3 = niaVarA.f;
            i7 = i16;
            if (Build.VERSION.SDK_INT < 35) {
                i8 = 2;
                qpVar = this;
                i9 = i;
                i10 = i7;
            } else {
                i8 = 2;
                qpVar = this;
                i9 = i;
                i10 = i7;
            }
            int i25 = niaVarA.g;
            if (i2 == i8) {
            }
            qpVar.d = niaVarA;
            qpVar.a.g.c(ww9Var.a.e(), (((long) Float.floatToRawIntBits(qpVar.c())) & 4294967295L) | (((long) Float.floatToRawIntBits(qpVar.f())) << c), ww9Var.a.a());
            layout = qpVar.d.f;
            if (layout.getText() instanceof Spanned) {
                dl9VarArr = null;
            } else {
                CharSequence text3 = layout.getText();
                text3.getClass();
                spanned = (Spanned) text3;
                if (spanned.nextSpanTransition(-1, spanned.length(), dl9.class) != spanned.length()) {
                    CharSequence text4 = layout.getText();
                    text4.getClass();
                    dl9VarArr = (dl9[]) ((Spanned) text4).getSpans(0, layout.getText().length(), dl9.class);
                } else {
                    dl9VarArr = null;
                }
            }
            if (dl9VarArr != null) {
                while (i12 < r2) {
                    dl9Var.v.setValue(new cr9((((long) Float.floatToRawIntBits(qpVar.c())) & 4294967295L) | (((long) Float.floatToRawIntBits(qpVar.f())) << c)));
                }
            }
            charSequence = qpVar.e;
            if (charSequence instanceof Spanned) {
                list = hf3.t;
            } else {
                spanned2 = (Spanned) charSequence;
                Object[] spans2 = spanned2.getSpans(0, charSequence.length(), uz7.class);
                arrayList = new ArrayList(spans2.length);
                while (i11 < r4) {
                    uz7 uz7Var2 = (uz7) obj;
                    int spanStart2 = spanned2.getSpanStart(uz7Var2);
                    spanEnd = spanned2.getSpanEnd(uz7Var2);
                    lineForOffset = qpVar.d.f.getLineForOffset(spanStart2);
                    if (lineForOffset >= qpVar.b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (qpVar.d.f.getEllipsisCount(lineForOffset) > 0) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (spanEnd > qpVar.d.f(lineForOffset)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    sk8Var = z2 ? null : null;
                    arrayList.add(sk8Var);
                }
                list = arrayList;
            }
            qpVar.f = list;
        }
        i5 = 2;
        i6 = i3;
        if (i2 == i5) {
            truncateAt2 = TextUtils.TruncateAt.END;
        } else {
            if (i2 == 5) {
                if (i2 == 4) {
                    truncateAt2 = TextUtils.TruncateAt.START;
                } else {
                    c = ' ';
                    truncateAt = null;
                }
                niaVarA = a(i16, i17, truncateAt, i, i18, i4, i15, i6, charSequence3);
                Layout layout4 = niaVarA.f;
                i7 = i16;
                if (Build.VERSION.SDK_INT < 35) {
                    i8 = 2;
                    qpVar = this;
                    i9 = i;
                    i10 = i7;
                } else {
                    i8 = 2;
                    qpVar = this;
                    i9 = i;
                    i10 = i7;
                }
                int i26 = niaVarA.g;
                if (i2 == i8) {
                }
                qpVar.d = niaVarA;
                qpVar.a.g.c(ww9Var.a.e(), (((long) Float.floatToRawIntBits(qpVar.c())) & 4294967295L) | (((long) Float.floatToRawIntBits(qpVar.f())) << c), ww9Var.a.a());
                layout = qpVar.d.f;
                if (layout.getText() instanceof Spanned) {
                    dl9VarArr = null;
                } else {
                    CharSequence text5 = layout.getText();
                    text5.getClass();
                    spanned = (Spanned) text5;
                    if (spanned.nextSpanTransition(-1, spanned.length(), dl9.class) != spanned.length()) {
                        CharSequence text6 = layout.getText();
                        text6.getClass();
                        dl9VarArr = (dl9[]) ((Spanned) text6).getSpans(0, layout.getText().length(), dl9.class);
                    } else {
                        dl9VarArr = null;
                    }
                }
                if (dl9VarArr != null) {
                    while (i12 < r2) {
                        dl9Var.v.setValue(new cr9((((long) Float.floatToRawIntBits(qpVar.c())) & 4294967295L) | (((long) Float.floatToRawIntBits(qpVar.f())) << c)));
                    }
                }
                charSequence = qpVar.e;
                if (charSequence instanceof Spanned) {
                    list = hf3.t;
                } else {
                    spanned2 = (Spanned) charSequence;
                    Object[] spans3 = spanned2.getSpans(0, charSequence.length(), uz7.class);
                    arrayList = new ArrayList(spans3.length);
                    while (i11 < r4) {
                        uz7 uz7Var3 = (uz7) obj;
                        int spanStart3 = spanned2.getSpanStart(uz7Var3);
                        spanEnd = spanned2.getSpanEnd(uz7Var3);
                        lineForOffset = qpVar.d.f.getLineForOffset(spanStart3);
                        if (lineForOffset >= qpVar.b) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (qpVar.d.f.getEllipsisCount(lineForOffset) > 0) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (spanEnd > qpVar.d.f(lineForOffset)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2) {
                        }
                        arrayList.add(sk8Var);
                    }
                    list = arrayList;
                }
                qpVar.f = list;
            }
            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
        }
        c = ' ';
        truncateAt = truncateAt2;
        niaVarA = a(i16, i17, truncateAt, i, i18, i4, i15, i6, charSequence3);
        Layout layout5 = niaVarA.f;
        i7 = i16;
        if (Build.VERSION.SDK_INT < 35) {
            i8 = 2;
            qpVar = this;
            i9 = i;
            i10 = i7;
        } else {
            i8 = 2;
            qpVar = this;
            i9 = i;
            i10 = i7;
        }
        int i27 = niaVarA.g;
        if (i2 == i8) {
        }
        qpVar.d = niaVarA;
        qpVar.a.g.c(ww9Var.a.e(), (((long) Float.floatToRawIntBits(qpVar.c())) & 4294967295L) | (((long) Float.floatToRawIntBits(qpVar.f())) << c), ww9Var.a.a());
        layout = qpVar.d.f;
        if (layout.getText() instanceof Spanned) {
            dl9VarArr = null;
        } else {
            CharSequence text7 = layout.getText();
            text7.getClass();
            spanned = (Spanned) text7;
            if (spanned.nextSpanTransition(-1, spanned.length(), dl9.class) != spanned.length()) {
                CharSequence text8 = layout.getText();
                text8.getClass();
                dl9VarArr = (dl9[]) ((Spanned) text8).getSpans(0, layout.getText().length(), dl9.class);
            } else {
                dl9VarArr = null;
            }
        }
        if (dl9VarArr != null) {
            while (i12 < r2) {
                dl9Var.v.setValue(new cr9((((long) Float.floatToRawIntBits(qpVar.c())) & 4294967295L) | (((long) Float.floatToRawIntBits(qpVar.f())) << c)));
            }
        }
        charSequence = qpVar.e;
        if (charSequence instanceof Spanned) {
            list = hf3.t;
        } else {
            spanned2 = (Spanned) charSequence;
            Object[] spans4 = spanned2.getSpans(0, charSequence.length(), uz7.class);
            arrayList = new ArrayList(spans4.length);
            while (i11 < r4) {
                uz7 uz7Var4 = (uz7) obj;
                int spanStart4 = spanned2.getSpanStart(uz7Var4);
                spanEnd = spanned2.getSpanEnd(uz7Var4);
                lineForOffset = qpVar.d.f.getLineForOffset(spanStart4);
                if (lineForOffset >= qpVar.b) {
                    z = true;
                } else {
                    z = false;
                }
                if (qpVar.d.f.getEllipsisCount(lineForOffset) > 0) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (spanEnd > qpVar.d.f(lineForOffset)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                }
                arrayList.add(sk8Var);
            }
            list = arrayList;
        }
        qpVar.f = list;
    }

    public final nia a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        h18 h18Var;
        float f = f();
        tp tpVar = this.a;
        ms msVar = tpVar.g;
        int i8 = tpVar.l;
        cr5 cr5Var = tpVar.i;
        wja wjaVar = tpVar.b;
        rp.a aVar = rp.a;
        b28 b28Var = wjaVar.c;
        return new nia(charSequence, f, msVar, i, truncateAt, i8, (b28Var == null || (h18Var = b28Var.b) == null) ? false : h18Var.a, i3, i5, i6, i7, i4, i2, cr5Var);
    }

    public final float b() {
        return this.d.d(0);
    }

    public final float c() {
        return this.d.a();
    }

    public final float d() {
        nia niaVar = this.d;
        return niaVar.d(niaVar.g - 1);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a5  */
    public final long e(sk8 sk8Var, int i, pha phaVar) {
        h99 ho4Var;
        int i2;
        int[] iArrA;
        RectF rectFD = h40.d(sk8Var);
        int i3 = (i != 0 && i == 1) ? 1 : 0;
        pp ppVar = new pp(phaVar);
        nia niaVar = this.d;
        Layout layout = niaVar.f;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            iArrA = vo.a(niaVar, rectFD, i3, ppVar);
        } else {
            vq5 vq5VarC = niaVar.c();
            if (i3 == 1) {
                ho4Var = new pob(layout.getText(), niaVar.j());
            } else {
                CharSequence text = layout.getText();
                ho4Var = i4 >= 29 ? new ho4(text, niaVar.a) : new io4(text);
            }
            h99 h99Var = ho4Var;
            int lineForVertical = layout.getLineForVertical((int) rectFD.top);
            if (rectFD.top <= niaVar.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < niaVar.g) {
                int i5 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFD.bottom);
                if (lineForVertical2 != 0 || rectFD.bottom >= niaVar.g(0)) {
                    int iB = pia.b(niaVar, layout, vq5VarC, i5, rectFD, h99Var, ppVar, true);
                    while (true) {
                        i2 = i5;
                        if (iB != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i5 = i2 + 1;
                        iB = pia.b(niaVar, layout, vq5VarC, i5, rectFD, h99Var, ppVar, true);
                    }
                    if (iB == -1) {
                        iArrA = null;
                    } else {
                        int i6 = lineForVertical2;
                        int iB2 = pia.b(niaVar, layout, vq5VarC, i6, rectFD, h99Var, ppVar, false);
                        while (iB2 == -1 && i2 < i6) {
                            i6--;
                            iB2 = pia.b(niaVar, layout, vq5VarC, i6, rectFD, h99Var, ppVar, false);
                        }
                        if (iB2 == -1) {
                            iArrA = null;
                        } else {
                            iArrA = new int[]{h99Var.i0(iB + 1), h99Var.j0(iB2 - 1)};
                        }
                    }
                } else {
                    iArrA = null;
                }
            } else {
                iArrA = null;
            }
        }
        return iArrA == null ? lja.b : ay.c(iArrA[0], iArrA[1]);
    }

    public final float f() {
        return xx1.h(this.c);
    }

    public final void g(n41 n41Var) {
        Canvas canvasA = pl.a(n41Var);
        nia niaVar = this.d;
        if (niaVar.d) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, f(), c());
        }
        int i = niaVar.h;
        if (canvasA.getClipBounds(niaVar.p)) {
            if (i != 0) {
                canvasA.translate(0.0f, i);
            }
            ThreadLocal<xaa> threadLocal = tia.a;
            xaa xaaVar = threadLocal.get();
            if (xaaVar == null) {
                xaaVar = new xaa();
                threadLocal.set(xaaVar);
            }
            xaa xaaVar2 = xaaVar;
            xaaVar2.a = canvasA;
            try {
                niaVar.f.draw(xaaVar2);
                xaaVar2.a = null;
                if (i != 0) {
                    canvasA.translate(0.0f, (-1.0f) * i);
                }
            } catch (Throwable th) {
                xaaVar2.a = null;
                throw th;
            }
        }
        if (niaVar.d) {
            canvasA.restore();
        }
    }

    public final void h(n41 n41Var, long j, el9 el9Var, fda fdaVar, e73 e73Var) {
        ms msVar = this.a.g;
        int i = msVar.c;
        msVar.d(j);
        msVar.f(el9Var);
        msVar.g(fdaVar);
        msVar.e(e73Var);
        msVar.b(3);
        g(n41Var);
        msVar.b(i);
    }

    public final void i(n41 n41Var, fx0 fx0Var, float f, el9 el9Var, fda fdaVar, e73 e73Var) {
        ms msVar = this.a.g;
        int i = msVar.c;
        float f2 = f();
        msVar.c(fx0Var, (((long) Float.floatToRawIntBits(c())) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), f);
        msVar.f(el9Var);
        msVar.g(fdaVar);
        msVar.e(e73Var);
        msVar.b(3);
        g(n41Var);
        msVar.b(i);
    }
}
