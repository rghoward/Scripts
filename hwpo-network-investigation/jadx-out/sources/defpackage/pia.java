package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import java.text.Bidi;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pia {
    public static final float a(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    /* JADX WARN: Code duplicated, block: B:144:0x025c A[EDGE_INSN: B:144:0x025c->B:171:0x02b8 BREAK  A[LOOP:5: B:154:0x0278->B:206:0x0278]] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a4  */
    public static final int b(nia niaVar, Layout layout, vq5 vq5Var, int i, RectF rectF, h99 h99Var, pp ppVar, boolean z) {
        vq5.a[] aVarArr;
        vq5.a[] aVarArr2;
        int i2;
        int iJ0;
        int i3;
        int i4;
        int iI0;
        Bidi bidiCreateLineBidi;
        float fA;
        float fA2;
        float fA3;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i5 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i5];
        Layout layout2 = niaVar.f;
        int lineStart2 = layout2.getLineStart(i);
        int iF = niaVar.f(i);
        if (i5 < (iF - lineStart2) * 2) {
            vc5.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        g15 g15Var = new g15(niaVar);
        boolean z2 = false;
        boolean z3 = layout2.getParagraphDirection(i) == 1;
        int i6 = 0;
        while (lineStart2 < iF) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z3 && !zIsRtlCharAt) {
                fA = g15Var.a(z2, z2, true, lineStart2);
                fA3 = g15Var.a(true, true, true, lineStart2 + 1);
            } else if (z3 && zIsRtlCharAt) {
                fA3 = g15Var.a(false, false, false, lineStart2);
                fA = g15Var.a(true, true, false, lineStart2 + 1);
            } else {
                if (zIsRtlCharAt) {
                    fA2 = g15Var.a(false, false, true, lineStart2);
                    fA = g15Var.a(true, true, true, lineStart2 + 1);
                } else {
                    fA = g15Var.a(false, false, false, lineStart2);
                    fA2 = g15Var.a(true, true, false, lineStart2 + 1);
                }
                fA3 = fA2;
            }
            fArr[i6] = fA;
            fArr[i6 + 1] = fA3;
            i6 += 2;
            lineStart2++;
            z3 = z3;
            z2 = false;
        }
        Layout layout3 = vq5Var.a;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int iD = vq5Var.d(lineStart3, false);
        int iE = vq5Var.e(iD);
        int i7 = lineStart3 - iE;
        int i8 = lineEnd2 - iE;
        Bidi bidiA = vq5Var.a(iD);
        if (bidiA == null || (bidiCreateLineBidi = bidiA.createLineBidi(i7, i8)) == null) {
            aVarArr = new vq5.a[]{new vq5.a(lineStart3, layout3.isRtlCharAt(lineStart3), lineEnd2)};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            aVarArr = new vq5.a[runCount];
            int i9 = 0;
            while (i9 < runCount) {
                int i10 = runCount;
                aVarArr[i9] = new vq5.a(bidiCreateLineBidi.getRunStart(i9) + lineStart3, bidiCreateLineBidi.getRunLevel(i9) % 2 == 1, bidiCreateLineBidi.getRunLimit(i9) + lineStart3);
                i9++;
                runCount = i10;
            }
        }
        dg5 fg5Var = z ? new fg5(0, aVarArr.length - 1, 1) : new dg5(aVarArr.length - 1, 0, -1);
        int i11 = fg5Var.t;
        int i12 = fg5Var.u;
        int i13 = fg5Var.v;
        if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
            return -1;
        }
        while (true) {
            vq5.a aVar = aVarArr[i11];
            boolean z4 = aVar.c;
            int iW = aVar.a;
            int iX = aVar.b;
            float f = z4 ? fArr[((iX - 1) - lineStart) * 2] : fArr[(iW - lineStart) * 2];
            float fA4 = z4 ? a(iW, lineStart, fArr) : a(iX - 1, lineStart, fArr);
            float f2 = rectF.left;
            int i14 = i13;
            if (!z) {
                aVarArr2 = aVarArr;
                if (fA4 < f2) {
                    iX = -1;
                    break;
                }
                float f3 = rectF.right;
                if (f <= f3) {
                    if ((z4 || f3 < fA4) && (!z4 || f2 > f)) {
                        int i15 = iX;
                        int i16 = iW;
                        while (i15 - i16 > 1) {
                            int i17 = (i15 + i16) / 2;
                            float f4 = fArr[(i17 - lineStart) * 2];
                            int i18 = i15;
                            if ((z4 || f4 <= rectF.right) && (!z4 || f4 >= rectF.left)) {
                                i15 = i18;
                                i16 = i17;
                            } else {
                                i15 = i17;
                            }
                        }
                        i2 = z4 ? i15 : i16;
                    } else {
                        i2 = iX - 1;
                    }
                    int iI1 = h99Var.i0(i2 + 1);
                    if (iI1 == -1 || (iJ0 = h99Var.j0(iI1)) <= iW) {
                        iX = -1;
                        break;
                    }
                    if (iI1 < iW) {
                        iI1 = iW;
                    }
                    if (iJ0 <= iX) {
                        iX = iJ0;
                    }
                    RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                    int iI2 = iI1;
                    while (true) {
                        rectF2.left = z4 ? fArr[((iX - 1) - lineStart) * 2] : fArr[(iI2 - lineStart) * 2];
                        rectF2.right = z4 ? a(iI2, lineStart, fArr) : a(iX - 1, lineStart, fArr);
                        if (((Boolean) ppVar.invoke(rectF2, rectF)).booleanValue()) {
                            break;
                        }
                        iX = h99Var.X(iX);
                        if (iX == -1 || iX <= iW) {
                            iX = -1;
                            break;
                        }
                        iI2 = h99Var.i0(iX);
                        if (iI2 < iW) {
                            iI2 = iW;
                        }
                    }
                } else {
                    iX = -1;
                    break;
                }
                iW = iX;
            } else {
                if (fA4 < f2) {
                    aVarArr2 = aVarArr;
                    iW = -1;
                    break;
                }
                float f5 = rectF.right;
                if (f <= f5) {
                    if ((z4 || f2 > f) && (!z4 || f5 < fA4)) {
                        int i19 = iX;
                        int i20 = iW;
                        while (true) {
                            i3 = i19;
                            if (i19 - i20 <= 1) {
                                break;
                            }
                            int i21 = (i3 + i20) / 2;
                            float f6 = fArr[(i21 - lineStart) * 2];
                            if ((z4 || f6 <= rectF.left) && (!z4 || f6 >= rectF.right)) {
                                i19 = i3;
                                i20 = i21;
                            } else {
                                i19 = i21;
                            }
                        }
                        i4 = z4 ? i3 : i20;
                    } else {
                        i4 = iW;
                    }
                    int iJ1 = h99Var.j0(i4);
                    if (iJ1 != -1 && (iI0 = h99Var.i0(iJ1)) < iX) {
                        if (iI0 >= iW) {
                            iW = iI0;
                        }
                        if (iJ1 > iX) {
                            iJ1 = iX;
                        }
                        aVarArr2 = aVarArr;
                        RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                        int iJ2 = iJ1;
                        while (true) {
                            rectF3.left = z4 ? fArr[((iJ2 - 1) - lineStart) * 2] : fArr[(iW - lineStart) * 2];
                            rectF3.right = z4 ? a(iW, lineStart, fArr) : a(iJ2 - 1, lineStart, fArr);
                            if (((Boolean) ppVar.invoke(rectF3, rectF)).booleanValue()) {
                                break;
                            }
                            iW = h99Var.W(iW);
                            if (iW != -1 && iW < iX) {
                                iJ2 = h99Var.j0(iW);
                                if (iJ2 > iX) {
                                    iJ2 = iX;
                                }
                            }
                        }
                    } else {
                        aVarArr2 = aVarArr;
                    }
                    iW = -1;
                    break;
                } else {
                    aVarArr2 = aVarArr;
                    iW = -1;
                    break;
                }
            }
            if (iW >= 0) {
                return iW;
            }
            if (i11 == i12) {
                return -1;
            }
            i11 += i14;
            i13 = i14;
            aVarArr = aVarArr2;
        }
    }
}
