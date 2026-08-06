package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l07 {
    public final m07 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public l07(m07 m07Var, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int iG;
        int i5;
        this.a = m07Var;
        this.b = i;
        if (xx1.j(j) != 0 || xx1.i(j) != 0) {
            vc5.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = m07Var.e;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= size) {
                i3 = 0;
                z = false;
                break;
            }
            os7 os7Var = (os7) arrayList2.get(i6);
            tp tpVar = os7Var.a;
            int iH = xx1.h(j);
            if (xx1.c(j)) {
                i4 = i6;
                iG = xx1.g(j) - ((int) Math.ceil(f));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                i4 = i6;
                iG = xx1.g(j);
            }
            i3 = 0;
            qp qpVar = new qp(tpVar, this.b - i7, i2, zx1.b(0, iH, 0, iG, 5));
            float fC = qpVar.c() + f;
            nia niaVar = qpVar.d;
            int i8 = i7 + niaVar.g;
            arrayList.add(new ns7(qpVar, os7Var.b, os7Var.c, i7, i8, f, fC));
            if (!niaVar.d) {
                if (i8 == this.b) {
                    i5 = i4;
                    if (i5 != ws0.g(this.a.e)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i8;
                f = fC;
            }
            z = true;
            i7 = i8;
            f = fC;
            break;
        }
        this.e = f;
        this.f = i7;
        this.c = z;
        this.h = arrayList;
        this.d = xx1.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = i3; i9 < size2; i9++) {
            ns7 ns7Var = (ns7) arrayList.get(i9);
            List<sk8> list = ns7Var.a.f;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i10 = i3; i10 < size3; i10++) {
                sk8 sk8Var = list.get(i10);
                arrayList4.add(sk8Var != null ? ns7Var.a(sk8Var) : null);
            }
            rh1.o(arrayList4, arrayList3);
        }
        if (arrayList3.size() < this.a.b.size()) {
            int size4 = this.a.b.size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i11 = i3; i11 < size4; i11++) {
                arrayList5.add(null);
            }
            arrayList3 = th1.K(arrayList3, arrayList5);
        }
        this.g = arrayList3;
    }

    public static void i(l07 l07Var, n41 n41Var, long j, el9 el9Var, fda fdaVar, e73 e73Var) {
        n41Var.f();
        ArrayList arrayList = l07Var.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ns7 ns7Var = (ns7) arrayList.get(i);
            ns7Var.a.h(n41Var, j, el9Var, fdaVar, e73Var);
            n41Var.n(0.0f, ns7Var.a.c());
        }
        n41Var.o();
    }

    public static void j(l07 l07Var, n41 n41Var, fx0 fx0Var, float f, el9 el9Var, fda fdaVar, e73 e73Var) {
        n41Var.f();
        ArrayList arrayList = l07Var.h;
        if (arrayList.size() <= 1 || (fx0Var instanceof aw9)) {
            lp.b(l07Var, n41Var, fx0Var, f, el9Var, fdaVar, e73Var);
        } else {
            if (!(fx0Var instanceof cl9)) {
                u.b();
                return;
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fC = 0.0f;
            for (int i = 0; i < size; i++) {
                ns7 ns7Var = (ns7) arrayList.get(i);
                fC += ns7Var.a.c();
                fMax = Math.max(fMax, ns7Var.a.f());
            }
            Shader shaderB = ((cl9) fx0Var).b((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fC)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                qp qpVar = ((ns7) arrayList.get(i2)).a;
                qpVar.i(n41Var, new gx0(shaderB), f, el9Var, fdaVar, e73Var);
                n41Var.n(0.0f, qpVar.c());
                matrix.setTranslate(0.0f, -qpVar.c());
                shaderB.setLocalMatrix(matrix);
            }
        }
        n41Var.o();
    }

    public final void a(final long j, final float[] fArr) {
        k(lja.f(j));
        l(lja.e(j));
        final el8 el8Var = new el8();
        el8Var.t = 0;
        final dl8 dl8Var = new dl8();
        sm3.e(this.h, j, new oh4() { // from class: j07
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                long j2;
                qp qpVar;
                boolean z;
                float fA;
                float fA2;
                ns7 ns7Var = (ns7) obj;
                int i = ns7Var.b;
                qp qpVar2 = ns7Var.a;
                int iE = ns7Var.c;
                long j3 = j;
                int iF = i > lja.f(j3) ? ns7Var.b : lja.f(j3);
                if (iE >= lja.e(j3)) {
                    iE = lja.e(j3);
                }
                long jC = ay.c(ns7Var.d(iF), ns7Var.d(iE));
                el8 el8Var2 = el8Var;
                int i2 = el8Var2.t;
                nia niaVar = qpVar2.d;
                int iF2 = lja.f(jC);
                int iE2 = lja.e(jC);
                Layout layout = niaVar.f;
                int length = layout.getText().length();
                if (iF2 < 0) {
                    vc5.a("startOffset must be > 0");
                }
                if (iF2 >= length) {
                    vc5.a("startOffset must be less than text length");
                }
                if (iE2 <= iF2) {
                    vc5.a("endOffset must be greater than startOffset");
                }
                if (iE2 > length) {
                    vc5.a("endOffset must be smaller or equal to text length");
                }
                int i3 = (iE2 - iF2) * 4;
                float[] fArr2 = fArr;
                if (fArr2.length - i2 < i3) {
                    vc5.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(iF2);
                int lineForOffset2 = layout.getLineForOffset(iE2 - 1);
                g15 g15Var = new g15(niaVar);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        int iF3 = niaVar.f(lineForOffset);
                        int iMax = Math.max(iF2, lineStart);
                        int iMin = Math.min(iE2, iF3);
                        float fG = niaVar.g(lineForOffset);
                        float fE = niaVar.e(lineForOffset);
                        j2 = jC;
                        qpVar = qpVar2;
                        boolean z2 = false;
                        boolean z3 = layout.getParagraphDirection(lineForOffset) == 1;
                        while (iMax < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                            if (!z3 || zIsRtlCharAt) {
                                if (z3 && zIsRtlCharAt) {
                                    z2 = false;
                                    float fA3 = g15Var.a(false, false, false, iMax);
                                    z = z3;
                                    fA = g15Var.a(true, true, false, iMax + 1);
                                    fA2 = fA3;
                                } else {
                                    z = z3;
                                    z2 = false;
                                    if (z || !zIsRtlCharAt) {
                                        fA = g15Var.a(false, false, false, iMax);
                                        fA2 = g15Var.a(true, true, false, iMax + 1);
                                    } else {
                                        fA2 = g15Var.a(false, false, true, iMax);
                                        fA = g15Var.a(true, true, true, iMax + 1);
                                    }
                                }
                                fArr2[i2] = fA;
                                fArr2[i2 + 1] = fG;
                                fArr2[i2 + 2] = fA2;
                                fArr2[i2 + 3] = fE;
                                i2 += 4;
                                iMax++;
                                z3 = z;
                            } else {
                                fA = g15Var.a(z2, z2, true, iMax);
                                z = z3;
                                fA2 = g15Var.a(true, true, true, iMax + 1);
                            }
                            z2 = false;
                            fArr2[i2] = fA;
                            fArr2[i2 + 1] = fG;
                            fArr2[i2 + 2] = fA2;
                            fArr2[i2 + 3] = fE;
                            i2 += 4;
                            iMax++;
                            z3 = z;
                        }
                        if (lineForOffset == lineForOffset2) {
                            break;
                        }
                        lineForOffset++;
                        qpVar2 = qpVar;
                        jC = j2;
                    }
                } else {
                    j2 = jC;
                    qpVar = qpVar2;
                }
                int iD = (lja.d(j2) * 4) + el8Var2.t;
                int i4 = el8Var2.t;
                while (true) {
                    dl8 dl8Var2 = dl8Var;
                    if (i4 >= iD) {
                        el8Var2.t = iD;
                        dl8Var2.t = qpVar.c() + dl8Var2.t;
                        return g2b.a;
                    }
                    int i5 = i4 + 1;
                    float f = fArr2[i5];
                    float f2 = dl8Var2.t;
                    fArr2[i5] = f + f2;
                    int i6 = i4 + 3;
                    fArr2[i6] = fArr2[i6] + f2;
                    i4 += 4;
                }
            }
        });
    }

    public final float b(int i) {
        m(i);
        ArrayList arrayList = this.h;
        ns7 ns7Var = (ns7) arrayList.get(sm3.c(i, arrayList));
        qp qpVar = ns7Var.a;
        return qpVar.d.e(i - ns7Var.d) + ns7Var.f;
    }

    public final int c(int i, boolean z) {
        int iF;
        m(i);
        ArrayList arrayList = this.h;
        ns7 ns7Var = (ns7) arrayList.get(sm3.c(i, arrayList));
        qp qpVar = ns7Var.a;
        int i2 = i - ns7Var.d;
        nia niaVar = qpVar.d;
        if (z) {
            Layout layout = niaVar.f;
            ThreadLocal<xaa> threadLocal = tia.a;
            if (layout.getEllipsisCount(i2) <= 0 || niaVar.b != TextUtils.TruncateAt.END) {
                vq5 vq5VarC = niaVar.c();
                Layout layout2 = vq5VarC.a;
                iF = vq5VarC.f(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                iF = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iF = niaVar.f(i2);
        }
        return iF + ns7Var.b;
    }

    public final int d(int i) {
        int iB;
        int length = this.a.a.u.length();
        ArrayList arrayList = this.h;
        if (i >= length) {
            iB = ws0.g(arrayList);
        } else {
            iB = i < 0 ? 0 : sm3.b(i, arrayList);
        }
        ns7 ns7Var = (ns7) arrayList.get(iB);
        return ns7Var.a.d.f.getLineForOffset(ns7Var.d(i)) + ns7Var.d;
    }

    public final int e(float f) {
        ArrayList arrayList = this.h;
        ns7 ns7Var = (ns7) arrayList.get(sm3.d(arrayList, f));
        int i = ns7Var.c - ns7Var.b;
        int i2 = ns7Var.d;
        if (i == 0) {
            return i2;
        }
        qp qpVar = ns7Var.a;
        float f2 = f - ns7Var.f;
        nia niaVar = qpVar.d;
        return niaVar.f.getLineForVertical(((int) f2) - niaVar.h) + i2;
    }

    public final float f(int i) {
        m(i);
        ArrayList arrayList = this.h;
        ns7 ns7Var = (ns7) arrayList.get(sm3.c(i, arrayList));
        qp qpVar = ns7Var.a;
        return qpVar.d.g(i - ns7Var.d) + ns7Var.f;
    }

    public final int g(long j) {
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        ns7 ns7Var = (ns7) arrayList.get(sm3.d(arrayList, fIntBitsToFloat));
        int i2 = ns7Var.c;
        int i3 = ns7Var.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        qp qpVar = ns7Var.a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - ns7Var.f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        nia niaVar = qpVar.d;
        int lineForVertical = niaVar.f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits))) - niaVar.h);
        return niaVar.f.getOffsetForHorizontal(lineForVertical, (niaVar.b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i3;
    }

    public final long h(sk8 sk8Var, int i, pha phaVar) {
        long jB;
        long j;
        float f = sk8Var.b;
        ArrayList arrayList = this.h;
        int iD = sm3.d(arrayList, f);
        float f2 = ((ns7) arrayList.get(iD)).g;
        float f3 = sk8Var.d;
        if (f2 >= f3 || iD == ws0.g(arrayList)) {
            ns7 ns7Var = (ns7) arrayList.get(iD);
            return ns7Var.b(ns7Var.a.e(ns7Var.c(sk8Var), i, phaVar), true);
        }
        int iD2 = sm3.d(arrayList, f3);
        long jB2 = lja.b;
        while (true) {
            jB = lja.b;
            if (!lja.b(jB2, jB) || iD > iD2) {
                break;
            }
            ns7 ns7Var2 = (ns7) arrayList.get(iD);
            jB2 = ns7Var2.b(ns7Var2.a.e(ns7Var2.c(sk8Var), i, phaVar), true);
            iD++;
        }
        if (lja.b(jB2, jB)) {
            return jB;
        }
        while (true) {
            j = lja.b;
            if (!lja.b(jB, j) || iD > iD2) {
                break;
            }
            ns7 ns7Var3 = (ns7) arrayList.get(iD2);
            jB = ns7Var3.b(ns7Var3.a.e(ns7Var3.c(sk8Var), i, phaVar), true);
            iD2--;
        }
        return lja.b(jB, j) ? jB2 : ay.c((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void k(int i) {
        iw iwVar = this.a.a;
        if (i < 0 || i >= iwVar.u.length()) {
            StringBuilder sbB = t43.b(i, "offset(", ") is out of bounds [0, ");
            sbB.append(iwVar.u.length());
            sbB.append(')');
            vc5.a(sbB.toString());
        }
    }

    public final void l(int i) {
        iw iwVar = this.a.a;
        if (i < 0 || i > iwVar.u.length()) {
            StringBuilder sbB = t43.b(i, "offset(", ") is out of bounds [0, ");
            sbB.append(iwVar.u.length());
            sbB.append(']');
            vc5.a(sbB.toString());
        }
    }

    public final void m(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        vc5.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }
}
