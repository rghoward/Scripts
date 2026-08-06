package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dz5 implements ox5, t69 {
    public final /* synthetic */ t69 a;
    public final /* synthetic */ nz5 b;

    public dz5(t69 t69Var, nz5 nz5Var) {
        this.b = nz5Var;
        this.a = t69Var;
    }

    @Override // defpackage.ox5
    public final int a() {
        hy5 hy5Var = (hy5) th1.H(this.b.j().g());
        if (hy5Var != null) {
            return hy5Var.getIndex();
        }
        return 0;
    }

    @Override // defpackage.ox5
    public final int b() {
        return this.b.j().e();
    }

    @Override // defpackage.ox5
    public final void c(int i, int i2) {
        this.b.l(i, i2);
    }

    @Override // defpackage.ox5
    public final int d() {
        return this.b.i();
    }

    @Override // defpackage.ox5
    public final int e(int i) {
        hy5 hy5Var;
        nz5 nz5Var = this.b;
        ty5 ty5VarJ = nz5Var.j();
        if (!ty5VarJ.g().isEmpty()) {
            int iH = nz5Var.h();
            if (i > a() || iH > i) {
                return ((i - nz5Var.h()) * uy5.e(ty5VarJ)) - nz5Var.i();
            }
            List<hy5> listG = ty5VarJ.g();
            int size = listG.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    hy5Var = null;
                    break;
                }
                hy5Var = listG.get(i2);
                if (hy5Var.getIndex() == i) {
                    break;
                }
                i2++;
            }
            hy5 hy5Var2 = hy5Var;
            if (hy5Var2 != null) {
                return hy5Var2.getOffset();
            }
        }
        return 0;
    }

    @Override // defpackage.t69
    public final float f(float f) {
        return this.a.f(f);
    }

    @Override // defpackage.ox5
    public final int g() {
        return this.b.h();
    }
}
