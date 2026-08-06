package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vq7 implements cu9 {
    public final /* synthetic */ dr7 a;
    public final /* synthetic */ wp7 b;

    public vq7(dr7 dr7Var, wp7 wp7Var, uq7 uq7Var) {
        this.a = dr7Var;
        this.b = wp7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cu9
    public final float a(float f, float f2) {
        dr7 dr7Var = this.a;
        int iP = dr7Var.p();
        dt7 dt7Var = dr7Var.m;
        int i = ((pq7) dt7Var.getValue()).c + iP;
        if (i == 0) {
            return 0.0f;
        }
        int i2 = dr7Var.e;
        if (f < 0.0f) {
            i2++;
        }
        int iG = uh8.g(((int) (f2 / i)) + i2, 0, dr7Var.o());
        dr7Var.p();
        int i3 = ((pq7) dt7Var.getValue()).c;
        long j = i2;
        long j2 = j - 1;
        if (j2 < 0) {
            j2 = 0;
        }
        int i4 = (int) j2;
        long j3 = j + 1;
        if (j3 > 2147483647L) {
            j3 = 2147483647L;
        }
        int iAbs = Math.abs((uh8.g(uh8.g(iG, i4, (int) j3), 0, dr7Var.o()) - i2) * i) - i;
        int i5 = iAbs >= 0 ? iAbs : 0;
        if (i5 == 0) {
            return i5;
        }
        return Math.signum(f) * i5;
    }

    @Override // defpackage.cu9
    public final float b(float f) {
        dr7 dr7Var = this.a;
        du9 du9VarK = dr7Var.n().k();
        List<kp7> listF = dr7Var.n().f();
        int size = listF.size();
        float f2 = Float.POSITIVE_INFINITY;
        float f3 = Float.NEGATIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            kp7 kp7Var = listF.get(i);
            int iB = oq3.b(dr7Var.n());
            int iD = dr7Var.n().d();
            int iB2 = dr7Var.n().b();
            int iG = dr7Var.n().g();
            int offset = kp7Var.getOffset();
            dr7Var.o();
            float f4 = offset - du9VarK.f(iB, iG, iD, iB2);
            if (f4 <= 0.0f && f4 > f3) {
                f3 = f4;
            }
            if (f4 >= 0.0f && f4 < f2) {
                f2 = f4;
            }
        }
        if (f3 == Float.NEGATIVE_INFINITY) {
            f3 = f2;
        }
        if (f2 == Float.POSITIVE_INFINITY) {
            f2 = f3;
        }
        if (!dr7Var.d()) {
            if (wq7.b(dr7Var, f)) {
                f3 = 0.0f;
                f2 = 0.0f;
            } else {
                f2 = 0.0f;
            }
        }
        if (!dr7Var.b()) {
            f3 = 0.0f;
            if (!wq7.b(dr7Var, f)) {
                f2 = 0.0f;
            }
        }
        Float fValueOf = Float.valueOf(f3);
        Float fValueOf2 = Float.valueOf(f2);
        float fFloatValue = fValueOf.floatValue();
        float fFloatValue2 = fValueOf2.floatValue();
        float fFloatValue3 = ((Number) this.b.invoke(Float.valueOf(f), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue();
        if (fFloatValue3 != fFloatValue && fFloatValue3 != fFloatValue2 && fFloatValue3 != 0.0f) {
            xc5.c("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
        }
        if (fFloatValue3 == Float.POSITIVE_INFINITY || fFloatValue3 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return fFloatValue3;
    }
}
