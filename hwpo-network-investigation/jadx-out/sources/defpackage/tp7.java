package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tp7 extends e11 {
    public final lx5 n;
    public final vp7 o;

    public tp7(ar7 ar7Var, lx5 lx5Var, ib3 ib3Var) {
        super(ar7Var);
        this.n = lx5Var;
        this.o = new vp7(ib3Var);
    }

    public final void h(float f, pq7 pq7Var) {
        e11 e11Var;
        boolean z;
        int i;
        int i2;
        int i3;
        vp7 vp7Var = this.o;
        vp7Var.b = pq7Var;
        vp7Var.c = this.n;
        float f2 = -f;
        g();
        if (vp7Var.d()) {
            oq3.b(vp7Var.f());
            vp7Var.f();
            this.m = vp7Var.i();
            int iC = vp7Var.c();
            int iE = vp7Var.e();
            int i4 = vp7Var.i();
            int iH = vp7Var.h();
            int iG = vp7Var.g();
            e27<h11> e27Var = this.e;
            if (f2 <= 0.0f) {
                this.j = 0 - iH;
                this.h = iC;
                while (this.j > 0 && (i3 = this.h) > 0 && e27Var.a(i3 - 1)) {
                    h11 h11VarB = e27Var.b(this.h - 1);
                    h11VarB.getClass();
                    int i5 = h11VarB.b;
                    this.h--;
                    this.j -= i5;
                }
                e(0, this.h - 1);
            } else {
                this.k = 0 - iG;
                this.i = iE;
                while (this.k > 0 && (i2 = this.i) < i4 - 1 && e27Var.a(i2 + 1)) {
                    h11 h11VarB2 = e27Var.b(this.i + 1);
                    h11VarB2.getClass();
                    int i6 = h11VarB2.b;
                    this.i++;
                    this.k -= i6;
                }
                e(this.i + 1, i4 - 1);
            }
        }
        if (vp7Var.d()) {
            oq3.b(vp7Var.f());
            if (vp7Var.f().t != null) {
                i = this.a.a.o;
                z = false;
            } else {
                z = false;
                i = 0;
            }
            e11Var = this;
            e11Var.d(vp7Var, vp7Var.c(), vp7Var.e(), i, vp7Var.g(), vp7Var.h(), f2, f2 <= 0.0f ? true : z);
        } else {
            e11Var = this;
        }
        e11Var.f = f2;
        e11Var.g();
    }
}
