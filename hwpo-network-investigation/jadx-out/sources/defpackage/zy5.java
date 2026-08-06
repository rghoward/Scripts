package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zy5 extends l4c {
    public final iy5 b;
    public final tw5 c;
    public final long d;

    public zy5(long j, boolean z, iy5 iy5Var, tw5 tw5Var) {
        super(2);
        this.b = iy5Var;
        this.c = tw5Var;
        this.d = zx1.b(0, z ? xx1.h(j) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : xx1.g(j), 5);
    }

    public static yy5 v(qy5 qy5Var, int i) {
        long j = qy5Var.d;
        iy5 iy5Var = qy5Var.b;
        return qy5Var.u(i, iy5Var.f(i), iy5Var.g(i), qy5Var.c(qy5Var.c, i, j), j);
    }

    @Override // defpackage.l4c
    public final uw5 a(int i, int i2, int i3, long j) {
        iy5 iy5Var = this.b;
        return u(i, iy5Var.f(i), iy5Var.g(i), c(this.c, i, j), j);
    }

    public abstract yy5 u(int i, Object obj, Object obj2, List<? extends jz7> list, long j);
}
