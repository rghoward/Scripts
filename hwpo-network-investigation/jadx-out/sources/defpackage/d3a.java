package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d3a implements wu9, jac {
    public static final /* synthetic */ int v = 0;
    public final /* synthetic */ int t;
    public static final d3a u = new d3a(0);
    public static final /* synthetic */ d3a w = new d3a(3);

    public /* synthetic */ d3a(int i) {
        this.t = i;
    }

    public static a51 c(long j, long j2, jt1 jt1Var, int i, int i2) {
        long jB = (i2 & 2) != 0 ? hi1.b(j, jt1Var) : j2;
        long j3 = uh1.k;
        long jB2 = uh1.b(0.38f, jB);
        fi1 fi1Var = (fi1) jt1Var.F(hi1.a);
        a51 a51Var = fi1Var.Z;
        if (a51Var == null) {
            gi1 gi1Var = d.b;
            a51 a51Var2 = new a51(hi1.c(fi1Var, gi1Var), hi1.a(fi1Var, hi1.c(fi1Var, gi1Var)), u7d.i(uh1.b(d.d, hi1.c(fi1Var, d.c)), hi1.c(fi1Var, gi1Var)), uh1.b(0.38f, hi1.a(fi1Var, hi1.c(fi1Var, gi1Var))));
            fi1Var.Z = a51Var2;
            a51Var = a51Var2;
        }
        long j4 = j != 16 ? j : a51Var.a;
        long j5 = jB != 16 ? jB : a51Var.b;
        if (j3 == 16) {
            j3 = a51Var.c;
        }
        long j6 = j3;
        if (jB2 == 16) {
            jB2 = a51Var.d;
        }
        return new a51(j4, j5, j6, jB2);
    }

    public static d51 d(float f, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        return new d51(f, d.f, d.e);
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Boolean.valueOf(o6c.u.get().b());
    }

    @Override // defpackage.wu9
    public boolean b(Object obj, Object obj2) {
        return xj5.a(obj, obj2);
    }

    public String toString() {
        switch (this.t) {
            case 0:
                return "StructuralEqualityPolicy";
            default:
                return super.toString();
        }
    }
}
