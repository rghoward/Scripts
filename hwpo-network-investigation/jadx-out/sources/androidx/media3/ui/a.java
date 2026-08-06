package androidx.media3.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.BidiFormatter;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import defpackage.d5a;
import defpackage.ec2;
import defpackage.md6;
import defpackage.oy9;
import defpackage.u43;
import defpackage.up0;
import defpackage.x4a;
import defpackage.y41;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends View implements SubtitleView.a {
    public final ArrayList t;
    public List<ec2> u;
    public float v;
    public y41 w;
    public float x;

    public a(Context context, int i) {
        super(context, null);
        this.t = new ArrayList();
        this.u = Collections.EMPTY_LIST;
        this.v = 0.0533f;
        this.w = y41.g;
        this.x = 0.08f;
    }

    @Override // androidx.media3.ui.SubtitleView.a
    public final void a(List list, y41 y41Var, float f, float f2) {
        this.u = list;
        this.w = y41Var;
        this.v = f;
        this.x = f2;
        while (true) {
            ArrayList arrayList = this.t;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new x4a(getContext()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:258:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:260:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:262:0x05fe  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v21, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19, types: [oy9] */
    /* JADX WARN: Type inference failed for: r7v6, types: [oy9] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        Object[] objArr;
        int[] iArr;
        Spanned spanned;
        int[] iArr2;
        List<String> listB;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        float f2;
        int i7;
        float f3;
        int i8;
        int iMax;
        int iMin;
        int iRound;
        int i9;
        a aVar = this;
        Canvas canvas2 = canvas;
        List<ec2> list = aVar.u;
        if (list.isEmpty()) {
            return;
        }
        int height = aVar.getHeight();
        int paddingLeft = aVar.getPaddingLeft();
        int paddingTop = aVar.getPaddingTop();
        int width = aVar.getWidth() - aVar.getPaddingRight();
        int paddingBottom = height - aVar.getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i10 = paddingBottom - paddingTop;
        float fB = d5a.b(0, aVar.v, height, i10);
        float f4 = 0.0f;
        if (fB <= 0.0f) {
            return;
        }
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            ec2 ec2VarA = list.get(i11);
            float f5 = f4;
            if (ec2VarA.p != Integer.MIN_VALUE) {
                ec2.a aVarA = ec2VarA.a();
                aVarA.h = -3.4028235E38f;
                aVarA.i = Integer.MIN_VALUE;
                aVarA.c = null;
                int i12 = ec2VarA.f;
                float f6 = ec2VarA.e;
                if (i12 == 0) {
                    aVarA.e = 1.0f - f6;
                    i9 = 0;
                    aVarA.f = 0;
                } else {
                    i9 = 0;
                    aVarA.e = (-f6) - 1.0f;
                    aVarA.f = 1;
                }
                int i13 = ec2VarA.g;
                if (i13 == 0) {
                    aVarA.g = 2;
                } else if (i13 == 2) {
                    aVarA.g = i9;
                }
                ec2VarA = aVarA.a();
            }
            float fB2 = d5a.b(ec2VarA.n, ec2VarA.o, height, i10);
            x4a x4aVar = (x4a) aVar.t.get(i11);
            y41 y41Var = aVar.w;
            List<ec2> list2 = list;
            float f7 = aVar.x;
            TextPaint textPaint = x4aVar.f;
            int i14 = height;
            Bitmap bitmap = ec2VarA.d;
            int i15 = i10;
            float f8 = ec2VarA.k;
            int i16 = size;
            float f9 = ec2VarA.j;
            int i17 = i11;
            int i18 = ec2VarA.i;
            float f10 = ec2VarA.h;
            int i19 = ec2VarA.g;
            float f11 = fB;
            int i20 = ec2VarA.f;
            float f12 = ec2VarA.e;
            Layout.Alignment alignment = ec2VarA.b;
            ?? spannableStringBuilder = ec2VarA.a;
            boolean z2 = bitmap == null;
            if (z2) {
                if (TextUtils.isEmpty(spannableStringBuilder)) {
                    i6 = paddingBottom;
                    z = false;
                } else {
                    f = f10;
                    i = ec2VarA.l ? ec2VarA.m : y41Var.c;
                }
                i11 = i17 + 1;
                aVar = this;
                paddingBottom = i6;
                f4 = f5;
                list = list2;
                height = i14;
                i10 = i15;
                size = i16;
                fB = f11;
            } else {
                f = f10;
                i = -16777216;
            }
            ?? r14 = x4aVar.i;
            if ((r14 == spannableStringBuilder || (r14 != 0 && r14.equals(spannableStringBuilder))) && Objects.equals(x4aVar.j, alignment) && x4aVar.k == bitmap && x4aVar.l == f12 && x4aVar.m == i20) {
                i2 = i19;
                if (Integer.valueOf(x4aVar.n).equals(Integer.valueOf(i2)) && x4aVar.o == f && Integer.valueOf(x4aVar.p).equals(Integer.valueOf(i18)) && x4aVar.q == f9 && x4aVar.r == f8 && x4aVar.s == y41Var.a && x4aVar.t == y41Var.b && x4aVar.u == i && x4aVar.w == y41Var.d && x4aVar.v == y41Var.e && Objects.equals(textPaint.getTypeface(), y41Var.f) && x4aVar.x == f11 && x4aVar.y == fB2 && x4aVar.z == f7 && x4aVar.A == paddingLeft && x4aVar.B == paddingTop && x4aVar.C == width && x4aVar.D == paddingBottom) {
                    x4aVar.a(canvas2, z2);
                    i6 = paddingBottom;
                    z = false;
                }
                i11 = i17 + 1;
                aVar = this;
                paddingBottom = i6;
                f4 = f5;
                list = list2;
                height = i14;
                i10 = i15;
                size = i16;
                fB = f11;
            } else {
                i2 = i19;
            }
            oy9 oy9Var = up0.a;
            if (spannableStringBuilder == 0) {
                i4 = width;
                paddingBottom = paddingBottom;
                z2 = z2;
            } else {
                int length = spannableStringBuilder.length();
                int iCharCount = 0;
                while (true) {
                    if (iCharCount < length) {
                        int iCodePointAt = Character.codePointAt((CharSequence) spannableStringBuilder, iCharCount);
                        int i21 = length;
                        byte directionality = Character.getDirectionality(iCodePointAt);
                        int i22 = iCharCount;
                        if (directionality == 1 || directionality == 2 || directionality == 16 || directionality == 17) {
                            BidiFormatter bidiFormatter = BidiFormatter.getInstance();
                            if (spannableStringBuilder instanceof Spanned) {
                                spanned = (Spanned) spannableStringBuilder;
                                Object[] spans = spanned.getSpans(0, spannableStringBuilder.length(), Object.class);
                                int[] iArr3 = new int[spans.length];
                                iArr = new int[spans.length];
                                Arrays.fill(iArr3, -1);
                                Arrays.fill(iArr, -1);
                                objArr = spans;
                                iArr2 = iArr3;
                            } else {
                                objArr = null;
                                iArr = null;
                                spanned = null;
                                iArr2 = null;
                            }
                            int[] iArr4 = iArr;
                            if (spannableStringBuilder.toString().contains("\r\n")) {
                                listB = up0.b.b(spannableStringBuilder);
                                i3 = 2;
                            } else {
                                listB = up0.a.b(spannableStringBuilder);
                                i3 = 1;
                            }
                            List<String> list3 = listB;
                            ArrayList arrayList = new ArrayList(list3.size());
                            int i23 = 0;
                            int i24 = 0;
                            for (String str : list3) {
                                int i25 = i3;
                                int i26 = width;
                                String strUnicodeWrap = bidiFormatter.unicodeWrap(str, TextDirectionHeuristics.LTR);
                                if (objArr != null) {
                                    spanned.getClass();
                                    iArr2.getClass();
                                    iArr4.getClass();
                                    int length2 = strUnicodeWrap.length() - str.length();
                                    if (length2 > 0) {
                                        i24++;
                                    }
                                    for (int i27 = 0; i27 < objArr.length; i27 = i5 + 1) {
                                        if (iArr2[i27] >= 0 || spanned.getSpanStart(objArr[i27]) < i23) {
                                            i5 = i27;
                                        } else {
                                            i5 = i27;
                                            if (spanned.getSpanStart(objArr[i27]) < str.length() + i23) {
                                                iArr2[i5] = i24;
                                            }
                                        }
                                        if (iArr4[i5] < 0 && spanned.getSpanEnd(objArr[i5]) - 1 >= i23 && spanned.getSpanEnd(objArr[i5]) - 1 < str.length() + i23) {
                                            iArr4[i5] = i24;
                                        }
                                    }
                                    int length3 = str.length() + i25 + i23;
                                    if (length2 > 0) {
                                        i24++;
                                    }
                                    i23 = length3;
                                }
                                arrayList.add(strUnicodeWrap);
                                width = i26;
                                i3 = i25;
                                bidiFormatter = bidiFormatter;
                            }
                            i4 = width;
                            spannableStringBuilder = new SpannableStringBuilder(up0.c.b(arrayList));
                            if (objArr != null) {
                                spanned.getClass();
                                iArr2.getClass();
                                iArr4.getClass();
                                int i28 = 0;
                                while (i28 < objArr.length) {
                                    int spanStart = spanned.getSpanStart(objArr[i28]) + iArr2[i28];
                                    int spanEnd = spanned.getSpanEnd(objArr[i28]) + iArr4[i28];
                                    int spanFlags = spanned.getSpanFlags(objArr[i28]);
                                    Object[] objArr2 = objArr;
                                    if (spanStart < 0 || spanStart >= spannableStringBuilder.length() || spanEnd < 0 || spanEnd > spannableStringBuilder.length()) {
                                        StringBuilder sbB = u43.b("Span out of bounds: start=", ",end=", ",len=", spanStart, spanEnd);
                                        sbB.append(spannableStringBuilder.length());
                                        md6.g("BidiUtils", sbB.toString());
                                    } else {
                                        spannableStringBuilder.setSpan(objArr2[i28], spanStart, spanEnd, spanFlags);
                                    }
                                    i28++;
                                    objArr = objArr2;
                                }
                            }
                        } else {
                            iCharCount = Character.charCount(iCodePointAt) + i22;
                            length = i21;
                        }
                    } else {
                        i4 = width;
                        paddingBottom = paddingBottom;
                        z2 = z2;
                    }
                }
            }
            x4aVar.i = spannableStringBuilder;
            x4aVar.j = alignment;
            x4aVar.k = bitmap;
            x4aVar.l = f12;
            x4aVar.m = i20;
            x4aVar.n = i2;
            x4aVar.o = f;
            x4aVar.p = i18;
            x4aVar.q = f9;
            x4aVar.r = f8;
            x4aVar.s = y41Var.a;
            x4aVar.t = y41Var.b;
            x4aVar.u = i;
            x4aVar.w = y41Var.d;
            x4aVar.v = y41Var.e;
            textPaint.setTypeface(y41Var.f);
            f11 = f11;
            x4aVar.x = f11;
            x4aVar.y = fB2;
            x4aVar.z = f7;
            x4aVar.A = paddingLeft;
            x4aVar.B = paddingTop;
            width = i4;
            x4aVar.C = width;
            i6 = paddingBottom;
            x4aVar.D = i6;
            if (z2) {
                x4aVar.i.getClass();
                CharSequence charSequence = x4aVar.i;
                SpannableStringBuilder spannableStringBuilder2 = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(x4aVar.i);
                int i29 = x4aVar.C - x4aVar.A;
                int i30 = x4aVar.D - x4aVar.B;
                textPaint.setTextSize(x4aVar.x);
                int i31 = (int) ((x4aVar.x * 0.125f) + 0.5f);
                int i32 = i31 * 2;
                int i33 = i29 - i32;
                float f13 = x4aVar.q;
                if (f13 != -3.4028235E38f) {
                    i33 = (int) (i33 * f13);
                }
                int i34 = i33;
                if (i34 <= 0) {
                    md6.g("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
                    f11 = f11;
                } else {
                    if (x4aVar.y > f5) {
                        i8 = 0;
                        spannableStringBuilder2.setSpan(new AbsoluteSizeSpan((int) x4aVar.y), 0, spannableStringBuilder2.length(), 16711680);
                    } else {
                        i8 = 0;
                    }
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder2);
                    if (x4aVar.w == 1) {
                        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder3.getSpans(i8, spannableStringBuilder3.length(), ForegroundColorSpan.class);
                        int i35 = 0;
                        for (int length4 = foregroundColorSpanArr.length; i35 < length4; length4 = length4) {
                            spannableStringBuilder3.removeSpan(foregroundColorSpanArr[i35]);
                            i35++;
                        }
                    }
                    if (Color.alpha(x4aVar.t) > 0) {
                        int i36 = x4aVar.w;
                        if (i36 == 0 || i36 == 2) {
                            spannableStringBuilder2.setSpan(new BackgroundColorSpan(x4aVar.t), 0, spannableStringBuilder2.length(), 16711680);
                        } else {
                            spannableStringBuilder3.setSpan(new BackgroundColorSpan(x4aVar.t), 0, spannableStringBuilder3.length(), 16711680);
                        }
                    }
                    Layout.Alignment alignment2 = x4aVar.j;
                    if (alignment2 == null) {
                        alignment2 = Layout.Alignment.ALIGN_CENTER;
                    }
                    Layout.Alignment alignment3 = alignment2;
                    SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, r1, i34, alignment3, x4aVar.d, x4aVar.e, true);
                    x4aVar.E = staticLayout;
                    int height2 = staticLayout.getHeight();
                    int i37 = 0;
                    int iMax2 = 0;
                    for (int lineCount = x4aVar.E.getLineCount(); i37 < lineCount; lineCount = lineCount) {
                        iMax2 = Math.max((int) Math.ceil(x4aVar.E.getLineWidth(i37)), iMax2);
                        i37++;
                        height2 = height2;
                    }
                    int i38 = height2;
                    int i39 = ((x4aVar.q == -3.4028235E38f || iMax2 >= i34) ? iMax2 : i34) + i32;
                    float f14 = x4aVar.o;
                    if (f14 != -3.4028235E38f) {
                        int iRound2 = Math.round(i29 * f14);
                        int i40 = x4aVar.A;
                        int i41 = iRound2 + i40;
                        int i42 = x4aVar.p;
                        if (i42 == 1) {
                            i41 = ((i41 * 2) - i39) / 2;
                        } else if (i42 == 2) {
                            i41 -= i39;
                        }
                        iMax = Math.max(i41, i40);
                        iMin = Math.min(iMax + i39, x4aVar.C);
                    } else {
                        iMax = x4aVar.A + ((i29 - i39) / 2);
                        iMin = iMax + i39;
                    }
                    int i43 = iMin - iMax;
                    if (i43 <= 0) {
                        md6.g("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
                    } else {
                        float f15 = x4aVar.l;
                        if (f15 != -3.4028235E38f) {
                            if (x4aVar.m == 0) {
                                iRound = Math.round(i30 * f15) + x4aVar.B;
                                int i44 = x4aVar.n;
                                if (i44 == 2) {
                                    iRound -= i38;
                                } else if (i44 == 1) {
                                    iRound = ((iRound * 2) - i38) / 2;
                                }
                                z = false;
                            } else {
                                z = false;
                                int lineBottom = x4aVar.E.getLineBottom(0) - x4aVar.E.getLineTop(0);
                                float f16 = x4aVar.l;
                                iRound = f16 >= f5 ? Math.round(f16 * lineBottom) + x4aVar.B : (Math.round((f16 + 1.0f) * lineBottom) + x4aVar.D) - i38;
                            }
                            int i45 = iRound + i38;
                            int i46 = x4aVar.D;
                            if (i45 > i46) {
                                iRound = i46 - i38;
                            } else {
                                int i47 = x4aVar.B;
                                if (iRound < i47) {
                                    iRound = i47;
                                }
                            }
                        } else {
                            z = false;
                            iRound = (x4aVar.D - i38) - ((int) (i30 * x4aVar.z));
                        }
                        x4aVar.E = new StaticLayout(spannableStringBuilder4, r1, i43, alignment3, x4aVar.d, x4aVar.e, true);
                        x4aVar.F = new StaticLayout(spannableStringBuilder3, textPaint, i43, alignment3, x4aVar.d, x4aVar.e, true);
                        x4aVar.G = iMax;
                        x4aVar.H = iRound;
                        x4aVar.I = i31;
                    }
                }
                z = false;
            } else {
                f11 = f11;
                z = false;
                x4aVar.k.getClass();
                Bitmap bitmap2 = x4aVar.k;
                int i48 = x4aVar.C;
                int i49 = x4aVar.A;
                int i50 = x4aVar.D;
                int i51 = x4aVar.B;
                float f17 = i48 - i49;
                float f18 = (x4aVar.o * f17) + i49;
                float f19 = i50 - i51;
                float f20 = (x4aVar.l * f19) + i51;
                int iRound3 = Math.round(f17 * x4aVar.q);
                float f21 = x4aVar.r;
                int iRound4 = f21 != -3.4028235E38f ? Math.round(f19 * f21) : Math.round((bitmap2.getHeight() / bitmap2.getWidth()) * iRound3);
                int i52 = x4aVar.p;
                if (i52 == 2) {
                    f2 = iRound3;
                } else {
                    if (i52 == 1) {
                        f2 = iRound3 / 2;
                    }
                    int iRound5 = Math.round(f18);
                    i7 = x4aVar.n;
                    if (i7 == 2) {
                        f3 = iRound4;
                    } else {
                        if (i7 == 1) {
                            f3 = iRound4 / 2;
                        }
                        int iRound6 = Math.round(f20);
                        x4aVar.J = new Rect(iRound5, iRound6, iRound3 + iRound5, iRound4 + iRound6);
                    }
                    f20 -= f3;
                    int iRound7 = Math.round(f20);
                    x4aVar.J = new Rect(iRound5, iRound7, iRound3 + iRound5, iRound4 + iRound7);
                }
                f18 -= f2;
                int iRound8 = Math.round(f18);
                i7 = x4aVar.n;
                if (i7 == 2) {
                    f3 = iRound4;
                } else {
                    if (i7 == 1) {
                        f3 = iRound4 / 2;
                    }
                    int iRound9 = Math.round(f20);
                    x4aVar.J = new Rect(iRound8, iRound9, iRound3 + iRound8, iRound4 + iRound9);
                }
                f20 -= f3;
                int iRound10 = Math.round(f20);
                x4aVar.J = new Rect(iRound8, iRound10, iRound3 + iRound8, iRound4 + iRound10);
            }
            canvas2 = canvas;
            x4aVar.a(canvas2, z2);
            i11 = i17 + 1;
            aVar = this;
            paddingBottom = i6;
            f4 = f5;
            list = list2;
            height = i14;
            i10 = i15;
            size = i16;
            fB = f11;
        }
    }
}
