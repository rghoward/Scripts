package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class lj0 extends ya1<ij0> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ya1, defpackage.v55
    public rw4 a(float f, float f2) {
        rw4 rw4VarA = super.a(f, f2);
        if (rw4VarA == null) {
            return null;
        }
        mrb.a aVar = mrb.a.t;
        pj0 pj0Var = this.a;
        rf6 rf6VarB = pj0Var.a(aVar).b(f, f2);
        q55 q55Var = (q55) ((ij0) pj0Var).getBarData().b(rw4VarA.f);
        if (!q55Var.B()) {
            rf6.c(rf6VarB);
            return rw4VarA;
        }
        float f3 = (float) rf6VarB.b;
        float f4 = (float) rf6VarB.c;
        kj0 kj0Var = (kj0) q55Var.L(f3, f4);
        if (kj0Var != null) {
            if (kj0Var.w == null) {
                return rw4VarA;
            }
            th8[] th8VarArr = kj0Var.x;
            if (th8VarArr.length > 0) {
                int iE = e(th8VarArr, f4);
                rf6 rf6VarA = ((ij0) pj0Var).a(q55Var.G()).a(rw4VarA.a, th8VarArr[iE].b);
                rw4 rw4Var = new rw4(kj0Var.v, kj0Var.t, (float) rf6VarA.b, (float) rf6VarA.c, rw4VarA.f, iE, rw4VarA.h);
                rf6.c(rf6VarA);
                return rw4Var;
            }
        }
        return null;
    }

    @Override // defpackage.ya1
    public final oj0 b() {
        return ((ij0) this.a).getBarData();
    }

    @Override // defpackage.ya1
    public float c(float f, float f2, float f3, float f4) {
        return Math.abs(f - f3);
    }

    public int e(th8[] th8VarArr, float f) {
        if (th8VarArr != null && th8VarArr.length != 0) {
            int i = 0;
            for (th8 th8Var : th8VarArr) {
                if (f > th8Var.a && f <= th8Var.b) {
                    return i;
                }
                i++;
            }
            int iMax = Math.max(th8VarArr.length - 1, 0);
            if (f > th8VarArr[iMax].b) {
                return iMax;
            }
        }
        return 0;
    }
}
