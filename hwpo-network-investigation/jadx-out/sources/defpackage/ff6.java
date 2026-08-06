package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ff6 extends df6 implements cl6 {
    public final mb7 H;
    public LinkedHashMap J;
    public gl6 L;
    public long I = 0;
    public final gf6 K = new gf6(this);
    public final s27<ei> M = je7.a();

    public ff6(mb7 mb7Var) {
        this.H = mb7Var;
    }

    public static final void G0(ff6 ff6Var, gl6 gl6Var) {
        LinkedHashMap linkedHashMap;
        if (gl6Var != null) {
            ff6Var.l0((((long) gl6Var.h()) & 4294967295L) | (((long) gl6Var.j()) << 32));
        } else {
            ff6Var.l0(0L);
        }
        if (!xj5.a(ff6Var.L, gl6Var) && gl6Var != null && ((((linkedHashMap = ff6Var.J) != null && !linkedHashMap.isEmpty()) || !gl6Var.l().isEmpty()) && !xj5.a(gl6Var.l(), ff6Var.J))) {
            hf6 hf6Var = ff6Var.H.H.Z.q;
            hf6Var.getClass();
            hf6Var.L.g();
            LinkedHashMap linkedHashMap2 = ff6Var.J;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                ff6Var.J = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(gl6Var.l());
        }
        ff6Var.L = gl6Var;
    }

    @Override // defpackage.df6
    public final void E0() {
        i0(this.I, 0.0f, null);
    }

    public final long H0() {
        return (((long) this.t) << 32) | (((long) this.u) & 4294967295L);
    }

    public void K0() {
        v0().m();
    }

    public final void L0(long j) {
        if (!bg5.b(this.I, j)) {
            this.I = j;
            mb7 mb7Var = this.H;
            hf6 hf6Var = mb7Var.H.Z.q;
            if (hf6Var != null) {
                hf6Var.r0();
            }
            df6.C0(mb7Var);
        }
        if (this.D) {
            return;
        }
        r0(v0());
    }

    public final long M0(ff6 ff6Var, boolean z) {
        long jD = 0;
        while (!this.equals(ff6Var)) {
            if (!this.B || !z) {
                jD = bg5.d(jD, this.I);
            }
            mb7 mb7Var = this.H.L;
            mb7Var.getClass();
            this = mb7Var.e1();
            this.getClass();
        }
        return jD;
    }

    @Override // defpackage.tx2
    public final float N0() {
        return this.H.N0();
    }

    @Override // defpackage.df6, defpackage.qj5
    public final boolean P0() {
        return true;
    }

    @Override // defpackage.kl6, defpackage.pj5
    public final Object g() {
        return this.H.g();
    }

    @Override // defpackage.tx2
    public final float getDensity() {
        return this.H.getDensity();
    }

    @Override // defpackage.qj5
    public final tq5 getLayoutDirection() {
        return this.H.H.S;
    }

    @Override // defpackage.jz7
    public final void i0(long j, float f, oh4<? super ro4, g2b> oh4Var) {
        L0(j);
        if (this.C) {
            return;
        }
        K0();
    }

    @Override // defpackage.df6
    public final qq5 j0() {
        return this.K;
    }

    @Override // defpackage.df6
    public final df6 s0() {
        mb7 mb7Var = this.H.K;
        if (mb7Var != null) {
            return mb7Var.e1();
        }
        return null;
    }

    @Override // defpackage.df6
    public final boolean t0() {
        return this.L != null;
    }

    @Override // defpackage.df6
    public final gl6 v0() {
        gl6 gl6Var = this.L;
        if (gl6Var != null) {
            return gl6Var;
        }
        throw ik.a("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.df6
    public final df6 x0() {
        mb7 mb7Var = this.H.L;
        if (mb7Var != null) {
            return mb7Var.e1();
        }
        return null;
    }

    @Override // defpackage.df6, defpackage.il6
    public final qr5 x1() {
        return this.H.H;
    }

    @Override // defpackage.df6
    public final long z0() {
        return this.I;
    }
}
