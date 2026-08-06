package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gf6 implements qq5 {
    public final ff6 t;

    public gf6(ff6 ff6Var) {
        this.t = ff6Var;
    }

    @Override // defpackage.qq5
    public final long F(long j) {
        return vf7.e(this.t.H.F(j), b());
    }

    @Override // defpackage.qq5
    public final qq5 G() {
        ff6 ff6VarE1;
        if (!e()) {
            uc5.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        mb7 mb7Var = this.t.H.H.Y.d.L;
        if (mb7Var == null || (ff6VarE1 = mb7Var.e1()) == null) {
            return null;
        }
        return ff6VarE1.K;
    }

    @Override // defpackage.qq5
    public final long T(qq5 qq5Var, long j) {
        return U(qq5Var, j);
    }

    @Override // defpackage.qq5
    public final long U(qq5 qq5Var, long j) {
        boolean z = qq5Var instanceof gf6;
        ff6 ff6Var = this.t;
        if (!z) {
            ff6 ff6VarH = z69.h(ff6Var);
            qq5 qq5Var2 = ff6VarH.H;
            long jU = U(ff6VarH.K, j);
            long j2 = ff6VarH.I;
            long jD = vf7.d(jU, (4294967295L & ((long) Float.floatToRawIntBits((int) (j2 & 4294967295L)))) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
            qq5 qq5VarV = qq5Var2.v();
            if (qq5VarV != null) {
                qq5Var2 = qq5VarV;
            }
            return vf7.e(jD, ((mb7) qq5Var2).U(qq5Var, 0L));
        }
        ff6 ff6Var2 = ((gf6) qq5Var).t;
        mb7 mb7Var = ff6Var2.H;
        mb7Var.I1();
        ff6 ff6VarE1 = ff6Var.H.X0(mb7Var).e1();
        if (ff6VarE1 != null) {
            long jC = bg5.c(bg5.d(ff6Var2.M0(ff6VarE1, false), cg5.c(j)), ff6Var.M0(ff6VarE1, false));
            return (((long) Float.floatToRawIntBits((int) (jC >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jC & 4294967295L))) & 4294967295L);
        }
        ff6 ff6VarH2 = z69.h(ff6Var2);
        long jD2 = bg5.d(bg5.d(ff6Var2.M0(ff6VarH2, false), ff6VarH2.I), cg5.c(j));
        ff6 ff6VarH3 = z69.h(ff6Var);
        long jC2 = bg5.c(jD2, bg5.d(ff6Var.M0(ff6VarH3, false), ff6VarH3.I));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jC2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jC2 & 4294967295L))) & 4294967295L;
        mb7 mb7Var2 = ff6VarH3.H.L;
        mb7Var2.getClass();
        mb7 mb7Var3 = ff6VarH2.H.L;
        mb7Var3.getClass();
        return mb7Var2.U(mb7Var3, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // defpackage.qq5
    public final sk8 Z(qq5 qq5Var, boolean z) {
        return this.t.H.Z(qq5Var, z);
    }

    @Override // defpackage.qq5
    public final long a() {
        ff6 ff6Var = this.t;
        return (((long) ff6Var.t) << 32) | (((long) ff6Var.u) & 4294967295L);
    }

    @Override // defpackage.qq5
    public final long a0(long j) {
        return this.t.H.a0(vf7.e(j, b()));
    }

    public final long b() {
        ff6 ff6Var = this.t;
        ff6 ff6VarH = z69.h(ff6Var);
        return vf7.d(U(ff6VarH.K, 0L), ff6Var.H.U(ff6VarH.H, 0L));
    }

    @Override // defpackage.qq5
    public final boolean e() {
        return this.t.H.g1().G;
    }

    @Override // defpackage.qq5
    public final long f(long j) {
        return this.t.H.f(vf7.e(0L, b()));
    }

    @Override // defpackage.qq5
    public final long j(long j) {
        return vf7.e(this.t.H.j(j), b());
    }

    @Override // defpackage.qq5
    public final long q(long j) {
        return this.t.H.q(vf7.e(j, b()));
    }

    @Override // defpackage.qq5
    public final qq5 v() {
        ff6 ff6VarE1;
        if (!e()) {
            uc5.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        mb7 mb7Var = this.t.H.L;
        if (mb7Var == null || (ff6VarE1 = mb7Var.e1()) == null) {
            return null;
        }
        return ff6VarE1.K;
    }

    @Override // defpackage.qq5
    public final void y(float[] fArr) {
        this.t.H.y(fArr);
    }

    @Override // defpackage.qq5
    public final void z(qq5 qq5Var, float[] fArr) {
        this.t.H.z(qq5Var, fArr);
    }
}
