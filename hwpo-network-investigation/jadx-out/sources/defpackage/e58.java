package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e58 {
    public final qr5 a;
    public final uy4 b;
    public final b58 c = new b58();
    public final vy4 d = new vy4();
    public boolean e;

    public e58(qr5 qr5Var) {
        this.a = qr5Var;
        this.b = new uy4(qr5Var.Y.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a(c58 c58Var, cm cmVar, boolean z) {
        int i;
        Object[] objArr;
        uy4 uy4Var;
        int i2;
        int i3;
        vy4 vy4Var = this.d;
        if (this.e) {
            return 0;
        }
        try {
            this.e = true;
            ij5 ij5VarA = this.c.a(c58Var, cmVar);
            we6<a58> we6Var = ij5VarA.a;
            int iH = we6Var.h();
            while (true) {
                if (i >= iH) {
                    objArr = true;
                    break;
                }
                a58 a58VarI = we6Var.i(i);
                i = (a58VarI.d || a58VarI.h) ? 0 : i + 1;
                objArr = false;
                break;
            }
            int iH2 = we6Var.h();
            int i4 = 0;
            while (true) {
                uy4Var = this.b;
                if (i4 >= iH2) {
                    break;
                }
                a58 a58VarI2 = we6Var.i(i4);
                if (objArr != false || z69.e(a58VarI2)) {
                    this.a.M(a58VarI2.c, this.d, a58VarI2.i, true);
                    if (!vy4Var.t.d()) {
                        uy4Var.a(a58VarI2.a, vy4Var, z69.e(a58VarI2));
                        vy4Var.clear();
                    }
                }
                i4++;
            }
            boolean zB = uy4Var.b(ij5VarA, z);
            if (ij5VarA.c) {
                i2 = 0;
                break;
            }
            int iH3 = we6Var.h();
            int i5 = 0;
            while (true) {
                if (i5 >= iH3) {
                    i2 = 0;
                    break;
                }
                a58 a58VarI3 = we6Var.i(i5);
                if (!vf7.b(z69.j(a58VarI3, true), 0L) && a58VarI3.b()) {
                    i2 = 1;
                    break;
                }
                i5++;
            }
            int iH4 = we6Var.h();
            for (int i6 = 0; i6 < iH4; i6++) {
                if (we6Var.i(i6).b()) {
                    i3 = 1;
                    return (zB ? 1 : 0) | (i2 << 1) | (i3 << 2);
                }
            }
            i3 = 0;
            return (zB ? 1 : 0) | (i2 << 1) | (i3 << 2);
        } finally {
            this.e = false;
        }
    }
}
