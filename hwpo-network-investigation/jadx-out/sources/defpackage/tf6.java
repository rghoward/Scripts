package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tf6 extends vx6<xf6> {
    public final y08 B;
    public final xn6 t;
    public final zga u;
    public final float v = Float.NaN;
    public final boolean w = true;
    public final long x = 9205357640488583168L;
    public final float y = Float.NaN;
    public final float z = Float.NaN;
    public final boolean A = true;

    public tf6(xn6 xn6Var, zga zgaVar, y08 y08Var) {
        this.t = xn6Var;
        this.u = zgaVar;
        this.B = y08Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new xf6(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        xf6 xf6Var = (xf6) cVar;
        float f = xf6Var.J;
        long j = xf6Var.L;
        float f2 = xf6Var.M;
        boolean z = xf6Var.K;
        float f3 = xf6Var.N;
        boolean z2 = xf6Var.O;
        y08 y08Var = xf6Var.P;
        View view = xf6Var.Q;
        tx2 tx2Var = xf6Var.R;
        xf6Var.H = this.t;
        float f4 = this.v;
        xf6Var.J = f4;
        boolean z3 = this.w;
        xf6Var.K = z3;
        long j2 = this.x;
        xf6Var.L = j2;
        float f5 = this.y;
        xf6Var.M = f5;
        float f6 = this.z;
        xf6Var.N = f6;
        boolean z4 = this.A;
        xf6Var.O = z4;
        xf6Var.I = this.u;
        y08 y08Var2 = this.B;
        xf6Var.P = y08Var2;
        View viewA = fw2.a(xf6Var);
        tx2 tx2Var2 = ew2.f(xf6Var).R;
        if (xf6Var.S != null) {
            gc9<mh4<vf7>> gc9Var = yf6.a;
            if (((!Float.isNaN(f4) || !Float.isNaN(f)) && f4 != f && !y08Var2.a()) || j2 != j || !y43.e(f5, f2) || !y43.e(f6, f3) || z3 != z || z4 != z2 || !xj5.a(y08Var2, y08Var) || !viewA.equals(view) || !xj5.a(tx2Var2, tx2Var)) {
                xf6Var.d2();
            }
        }
        xf6Var.e2();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tf6) {
            tf6 tf6Var = (tf6) obj;
            if (this.t == tf6Var.t && this.v == tf6Var.v && this.w == tf6Var.w && this.x == tf6Var.x && y43.e(this.y, tf6Var.y) && y43.e(this.z, tf6Var.z) && this.A == tf6Var.A && this.u == tf6Var.u && xj5.a(this.B, tf6Var.B)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA = uo2.a(h44.a(h44.a(al.c(this.x, uo2.a(h44.a(this.t.hashCode() * 961, this.v, 31), this.w, 31), 31), this.y, 31), this.z, 31), this.A, 31);
        zga zgaVar = this.u;
        return this.B.hashCode() + ((iA + (zgaVar != null ? zgaVar.hashCode() : 0)) * 31);
    }
}
