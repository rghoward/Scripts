package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t20 implements r20, hl6 {
    public final mr5 t;
    public s20 u;
    public boolean v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements gl6 {
        public final int a;
        public final int b;
        public final Map<ei, Integer> c;
        public final oh4<wy8, g2b> d;
        public final /* synthetic */ oh4<jz7.a, g2b> e;
        public final /* synthetic */ t20 f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, int i2, Map<ei, Integer> map, oh4<? super wy8, g2b> oh4Var, oh4<? super jz7.a, g2b> oh4Var2, t20 t20Var) {
            this.e = oh4Var2;
            this.f = t20Var;
            this.a = i;
            this.b = i2;
            this.c = map;
            this.d = oh4Var;
        }

        @Override // defpackage.gl6
        public final int h() {
            return this.b;
        }

        @Override // defpackage.gl6
        public final int j() {
            return this.a;
        }

        @Override // defpackage.gl6
        public final Map<ei, Integer> l() {
            return this.c;
        }

        @Override // defpackage.gl6
        public final void m() {
            this.e.invoke(this.f.t.E);
        }

        @Override // defpackage.gl6
        public final oh4<wy8, g2b> n() {
            return this.d;
        }
    }

    public t20(mr5 mr5Var, s20 s20Var) {
        this.t = mr5Var;
        this.u = s20Var;
    }

    @Override // defpackage.tx2
    public final long A0(float f) {
        return this.t.A0(f);
    }

    @Override // defpackage.tx2
    public final float C1(long j) {
        return this.t.C1(j);
    }

    @Override // defpackage.tx2
    public final float F0(int i) {
        return this.t.F0(i);
    }

    @Override // defpackage.tx2
    public final float I0(float f) {
        return f / this.t.getDensity();
    }

    @Override // defpackage.tx2
    public final float N0() {
        return this.t.N0();
    }

    @Override // defpackage.tx2
    public final long O(float f) {
        return this.t.O(f);
    }

    @Override // defpackage.tx2
    public final long P(long j) {
        return this.t.P(j);
    }

    @Override // defpackage.qj5
    public final boolean P0() {
        return false;
    }

    @Override // defpackage.tx2
    public final float U0(float f) {
        return this.t.getDensity() * f;
    }

    @Override // defpackage.tx2
    public final float d0(long j) {
        return this.t.d0(j);
    }

    @Override // defpackage.tx2
    public final float getDensity() {
        return this.t.getDensity();
    }

    @Override // defpackage.qj5
    public final tq5 getLayoutDirection() {
        return this.t.H.S;
    }

    @Override // defpackage.hl6
    public final gl6 i1(int i, int i2, Map<ei, Integer> map, oh4<? super wy8, g2b> oh4Var, oh4<? super jz7.a, g2b> oh4Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            uc5.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(i, i2, map, oh4Var, oh4Var2, this);
    }

    @Override // defpackage.tx2
    public final int n1(float f) {
        return this.t.n1(f);
    }

    @Override // defpackage.tx2
    public final long w0(int i) {
        return this.t.w0(i);
    }

    @Override // defpackage.hl6
    public final gl6 y0(int i, int i2, Map<ei, Integer> map, oh4<? super jz7.a, g2b> oh4Var) {
        return this.t.i1(i, i2, map, null, oh4Var);
    }

    @Override // defpackage.tx2
    public final long z1(long j) {
        return this.t.z1(j);
    }
}
