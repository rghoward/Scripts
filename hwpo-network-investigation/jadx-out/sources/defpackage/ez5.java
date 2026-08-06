package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ez5 implements cu9 {
    public final /* synthetic */ nz5 a;
    public final /* synthetic */ du9 b;

    public ez5(nz5 nz5Var, du9 du9Var) {
        this.a = nz5Var;
        this.b = du9Var;
    }

    @Override // defpackage.cu9
    public final float a(float f, float f2) {
        float fAbs = Math.abs(f2);
        ty5 ty5VarJ = this.a.j();
        int i = 0;
        if (!ty5VarJ.g().isEmpty()) {
            int size = ty5VarJ.g().size();
            List<hy5> listG = ty5VarJ.g();
            int size2 = listG.size();
            int size3 = 0;
            while (i < size2) {
                size3 += listG.get(i).getSize();
                i++;
            }
            i = size3 / size;
        }
        float f3 = fAbs - i;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        return Math.signum(f2) * f3;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c8  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cu9
    public final float b(float f) {
        nz5 nz5Var = this.a;
        List<hy5> listG = nz5Var.j().g();
        int size = listG.size();
        float f2 = Float.POSITIVE_INFINITY;
        float f3 = Float.NEGATIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            hy5 hy5Var = listG.get(i);
            uw5 uw5Var = hy5Var instanceof uw5 ? (uw5) hy5Var : null;
            if (uw5Var == null || !uw5Var.h()) {
                ty5 ty5VarJ = nz5Var.j();
                int iA = (int) (ty5VarJ.c() == fl7.t ? ty5VarJ.a() & 4294967295L : ty5VarJ.a() >> 32);
                int iD = nz5Var.j().d();
                int iB = nz5Var.j().b();
                int size2 = hy5Var.getSize();
                int offset = hy5Var.getOffset();
                nz5Var.j().e();
                float f4 = offset - this.b.f(iA, size2, iD, iB);
                if (f4 <= 0.0f && f4 > f3) {
                    f3 = f4;
                }
                if (f4 >= 0.0f && f4 < f2) {
                    f2 = f4;
                }
            }
        }
        char c = Math.abs(f) >= ((xy5) nz5Var.f.getValue()).i.U0(400.0f) ? f > 0.0f ? (char) 1 : (char) 2 : (char) 0;
        if (c == 0) {
            if (Math.abs(f2) <= Math.abs(f3)) {
                f3 = f2;
            }
        } else if (c == 1) {
            f3 = f2;
        } else if (c != 2) {
            f3 = 0.0f;
        }
        if (f3 == Float.POSITIVE_INFINITY || f3 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return f3;
    }
}
