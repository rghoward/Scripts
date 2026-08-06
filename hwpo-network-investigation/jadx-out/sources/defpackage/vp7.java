package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vp7 implements f11 {
    public final ib3 a;
    public pq7 b;
    public lx5 c;

    public vp7(ib3 ib3Var) {
        this.a = ib3Var;
    }

    @Override // defpackage.f11
    public final List<lx5.b> a(int i, ci4<? super Integer, ? super Integer, g2b> ci4Var) {
        long j = f().u;
        lx5 lx5Var = this.c;
        if (lx5Var != null) {
            return ws0.h(lx5Var.a(i, j, true, new up7(0, ci4Var, this)));
        }
        xj5.e("state");
        throw null;
    }

    public final int c() {
        if (f().a.isEmpty()) {
            return -1;
        }
        long j = ((long) ((ll6) th1.y(f().a)).a) - ((long) f().h);
        if (j < 0) {
            j = 0;
        }
        return (int) j;
    }

    public final boolean d() {
        return !f().a.isEmpty();
    }

    public final int e() {
        if (f().a.isEmpty()) {
            return -1;
        }
        long j = ((long) ((ll6) th1.G(f().a)).a) + ((long) f().h);
        long jI = ((long) i()) - 1;
        if (j > jI) {
            j = jI;
        }
        return (int) j;
    }

    public final pq7 f() {
        pq7 pq7Var = this.b;
        if (pq7Var != null) {
            return pq7Var;
        }
        xj5.e("layoutInfo");
        throw null;
    }

    public final int g() {
        if (f().a.isEmpty()) {
            return 0;
        }
        return Math.abs(((((ll6) th1.G(f().a)).k + f().b) + f().c) - f().g);
    }

    public final int h() {
        if (f().a.isEmpty()) {
            return 0;
        }
        int i = ((ll6) th1.y(f().a)).k + (-f().f);
        return Math.abs(i <= 0 ? i : 0);
    }

    public final int i() {
        return ((Number) this.a.invoke()).intValue();
    }

    @Override // defpackage.f11
    public final int b(int i) {
        return i;
    }
}
