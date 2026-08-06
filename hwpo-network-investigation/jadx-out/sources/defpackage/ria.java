package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ria {
    public final qia a;
    public final l07 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public ria(qia qiaVar, l07 l07Var, long j) {
        this.a = qiaVar;
        this.b = l07Var;
        this.c = j;
        ArrayList arrayList = l07Var.h;
        float fD = 0.0f;
        this.d = arrayList.isEmpty() ? 0.0f : ((ns7) arrayList.get(0)).a.b();
        if (!arrayList.isEmpty()) {
            ns7 ns7Var = (ns7) th1.G(arrayList);
            fD = ns7Var.a.d() + ns7Var.f;
        }
        this.e = fD;
        this.f = l07Var.g;
    }

    public final jt8 a(int i) {
        l07 l07Var = this.b;
        l07Var.l(i);
        int length = l07Var.a.a.u.length();
        ArrayList arrayList = l07Var.h;
        ns7 ns7Var = (ns7) arrayList.get(i == length ? ws0.g(arrayList) : sm3.b(i, arrayList));
        return ns7Var.a.d.f.isRtlCharAt(ns7Var.d(i)) ? jt8.u : jt8.t;
    }

    public final sk8 b(int i) {
        float fI;
        float fI2;
        float fH;
        float fH2;
        l07 l07Var = this.b;
        l07Var.k(i);
        ArrayList arrayList = l07Var.h;
        ns7 ns7Var = (ns7) arrayList.get(sm3.b(i, arrayList));
        qp qpVar = ns7Var.a;
        int iD = ns7Var.d(i);
        CharSequence charSequence = qpVar.e;
        if (iD < 0 || iD >= charSequence.length()) {
            StringBuilder sbB = t43.b(iD, "offset(", ") is out of bounds [0,");
            sbB.append(charSequence.length());
            sbB.append(')');
            vc5.a(sbB.toString());
        }
        nia niaVar = qpVar.d;
        Layout layout = niaVar.f;
        int lineForOffset = layout.getLineForOffset(iD);
        float fG = niaVar.g(lineForOffset);
        float fE = niaVar.e(lineForOffset);
        boolean z = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fH = niaVar.i(iD, false);
                fH2 = niaVar.i(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fH = niaVar.h(iD, false);
                fH2 = niaVar.h(iD + 1, true);
            } else {
                fI = niaVar.i(iD, false);
                fI2 = niaVar.i(iD + 1, true);
            }
            float f = fH;
            fI = fH2;
            fI2 = f;
        } else {
            fI = niaVar.h(iD, false);
            fI2 = niaVar.h(iD + 1, true);
        }
        RectF rectF = new RectF(fI, fG, fI2, fE);
        return ns7Var.a(new sk8(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final sk8 c(int i) {
        l07 l07Var = this.b;
        l07Var.l(i);
        int length = l07Var.a.a.u.length();
        ArrayList arrayList = l07Var.h;
        ns7 ns7Var = (ns7) arrayList.get(i == length ? ws0.g(arrayList) : sm3.b(i, arrayList));
        qp qpVar = ns7Var.a;
        int iD = ns7Var.d(i);
        CharSequence charSequence = qpVar.e;
        nia niaVar = qpVar.d;
        if (iD < 0 || iD > charSequence.length()) {
            StringBuilder sbB = t43.b(iD, "offset(", ") is out of bounds [0,");
            sbB.append(charSequence.length());
            sbB.append(']');
            vc5.a(sbB.toString());
        }
        float fH = niaVar.h(iD, false);
        int lineForOffset = niaVar.f.getLineForOffset(iD);
        return ns7Var.a(new sk8(fH, niaVar.g(lineForOffset), fH, niaVar.e(lineForOffset)));
    }

    public final boolean d() {
        long j = this.c;
        float f = (int) (j >> 32);
        l07 l07Var = this.b;
        return f < l07Var.d || l07Var.c || ((float) ((int) (j & 4294967295L))) < l07Var.e;
    }

    public final float e(int i) {
        l07 l07Var = this.b;
        l07Var.m(i);
        ArrayList arrayList = l07Var.h;
        ns7 ns7Var = (ns7) arrayList.get(sm3.c(i, arrayList));
        qp qpVar = ns7Var.a;
        int i2 = i - ns7Var.d;
        nia niaVar = qpVar.d;
        return niaVar.f.getLineLeft(i2) + (i2 == niaVar.g + (-1) ? niaVar.j : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ria) {
            ria riaVar = (ria) obj;
            if (xj5.a(this.a, riaVar.a) && this.b == riaVar.b && kg5.b(this.c, riaVar.c) && this.d == riaVar.d && this.e == riaVar.e && xj5.a(this.f, riaVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final float f(int i) {
        l07 l07Var = this.b;
        l07Var.m(i);
        ArrayList arrayList = l07Var.h;
        ns7 ns7Var = (ns7) arrayList.get(sm3.c(i, arrayList));
        qp qpVar = ns7Var.a;
        int i2 = i - ns7Var.d;
        nia niaVar = qpVar.d;
        return niaVar.f.getLineRight(i2) + (i2 == niaVar.g + (-1) ? niaVar.k : 0.0f);
    }

    public final int g(int i) {
        l07 l07Var = this.b;
        l07Var.m(i);
        ArrayList arrayList = l07Var.h;
        ns7 ns7Var = (ns7) arrayList.get(sm3.c(i, arrayList));
        qp qpVar = ns7Var.a;
        return qpVar.d.f.getLineStart(i - ns7Var.d) + ns7Var.b;
    }

    public final jt8 h(int i) {
        l07 l07Var = this.b;
        l07Var.l(i);
        int length = l07Var.a.a.u.length();
        ArrayList arrayList = l07Var.h;
        ns7 ns7Var = (ns7) arrayList.get(i == length ? ws0.g(arrayList) : sm3.b(i, arrayList));
        qp qpVar = ns7Var.a;
        int iD = ns7Var.d(i);
        nia niaVar = qpVar.d;
        return niaVar.f.getParagraphDirection(niaVar.f.getLineForOffset(iD)) == 1 ? jt8.t : jt8.u;
    }

    public final int hashCode() {
        return this.f.hashCode() + h44.a(h44.a(al.c(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), this.d, 31), this.e, 31);
    }

    public final vp i(final int i, final int i2) {
        l07 l07Var = this.b;
        iw iwVar = l07Var.a.a;
        if (i < 0 || i > i2 || i2 > iwVar.u.length()) {
            StringBuilder sbB = u43.b("Start(", ") or End(", ") is out of range [0..", i, i2);
            sbB.append(iwVar.u.length());
            sbB.append("), or start > end!");
            vc5.a(sbB.toString());
        }
        if (i == i2) {
            return xp.a();
        }
        final vp vpVarA = xp.a();
        sm3.e(l07Var.h, ay.c(i, i2), new oh4() { // from class: k07
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                ns7 ns7Var = (ns7) obj;
                qp qpVar = ns7Var.a;
                int iD = ns7Var.d(i);
                int iD2 = ns7Var.d(i2);
                CharSequence charSequence = qpVar.e;
                if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
                    StringBuilder sbB2 = u43.b("start(", ") or end(", ") is out of range [0..", iD, iD2);
                    sbB2.append(charSequence.length());
                    sbB2.append("], or start > end!");
                    vc5.a(sbB2.toString());
                }
                Path path = new Path();
                nia niaVar = qpVar.d;
                niaVar.f.getSelectionPath(iD, iD2, path);
                int i3 = niaVar.h;
                if (i3 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i3);
                }
                vp vpVar = new vp(path);
                vpVar.s((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(ns7Var.f)) & 4294967295L));
                vpVarA.o(vpVar, 0L);
                return g2b.a;
            }
        });
        return vpVarA;
    }

    public final long j(int i) {
        int i2;
        int iH;
        int iH2;
        l07 l07Var = this.b;
        l07Var.l(i);
        int length = l07Var.a.a.u.length();
        ArrayList arrayList = l07Var.h;
        ns7 ns7Var = (ns7) arrayList.get(i == length ? ws0.g(arrayList) : sm3.b(i, arrayList));
        qp qpVar = ns7Var.a;
        int iD = ns7Var.d(i);
        oob oobVarJ = qpVar.d.j();
        if (oobVarJ.g(oobVarJ.i(iD))) {
            oobVarJ.a(iD);
            i2 = iD;
            while (i2 != -1 && (!oobVarJ.g(i2) || oobVarJ.c(i2))) {
                i2 = oobVarJ.i(i2);
            }
        } else {
            oobVarJ.a(iD);
            if (oobVarJ.f(iD)) {
                i2 = (!oobVarJ.d(iD) || oobVarJ.b(iD)) ? oobVarJ.i(iD) : iD;
            } else {
                i2 = oobVarJ.b(iD) ? oobVarJ.i(iD) : -1;
            }
        }
        if (i2 == -1) {
            i2 = iD;
        }
        if (oobVarJ.c(oobVarJ.h(iD))) {
            oobVarJ.a(iD);
            iH = iD;
            while (iH != -1 && (oobVarJ.g(iH) || !oobVarJ.c(iH))) {
                iH = oobVarJ.h(iH);
            }
        } else {
            oobVarJ.a(iD);
            if (oobVarJ.b(iD)) {
                if (!oobVarJ.d(iD) || oobVarJ.f(iD)) {
                    iH2 = oobVarJ.h(iD);
                    iH = iH2;
                } else {
                    iH = iD;
                }
            } else if (oobVarJ.f(iD)) {
                iH2 = oobVarJ.h(iD);
                iH = iH2;
            } else {
                iH = -1;
            }
        }
        if (iH != -1) {
            iD = iH;
        }
        return ns7Var.b(ay.c(i2, iD), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) kg5.c(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}
