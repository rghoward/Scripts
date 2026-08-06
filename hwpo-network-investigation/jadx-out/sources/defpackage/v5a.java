package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class v5a {
    public static final u93 a = new u93(new ky(2));

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements ci4<jt1, Integer, g2b> {
        public final /* synthetic */ ox6 t;
        public final /* synthetic */ jl9 u;
        public final /* synthetic */ long v;
        public final /* synthetic */ float w;
        public final /* synthetic */ vs0 x;
        public final /* synthetic */ float y;
        public final /* synthetic */ ci4<jt1, Integer, g2b> z;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ox6 ox6Var, jl9 jl9Var, long j, float f, vs0 vs0Var, float f2, ci4<? super jt1, ? super Integer, g2b> ci4Var) {
            this.t = ox6Var;
            this.u = jl9Var;
            this.v = j;
            this.w = f;
            this.x = vs0Var;
            this.y = f2;
            this.z = ci4Var;
        }

        @Override // defpackage.ci4
        public final g2b invoke(jt1 jt1Var, Integer num) {
            jt1 jt1Var2 = jt1Var;
            int iIntValue = num.intValue();
            if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                ox6 ox6VarD = v5a.d(this.t, this.u, v5a.e(this.v, this.w, jt1Var2), this.x, ((tx2) jt1Var2.F(qu1.h)).U0(this.y));
                Object objF = jt1Var2.f();
                jt1.a.C0187a c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = new e71(1);
                    jt1Var2.C(objF);
                }
                ox6 ox6VarB = pb9.b(ox6VarD, false, (oh4) objF);
                g2b g2bVar = g2b.a;
                Object objF2 = jt1Var2.f();
                if (objF2 == c0187a) {
                    objF2 = u5a.a;
                    jt1Var2.C(objF2);
                }
                ox6 ox6VarB2 = t6a.b(ox6VarB, g2bVar, (PointerInputEventHandler) objF2);
                fl6 fl6VarD = dv0.d(di.a.a, true);
                int iD = jt1Var2.D();
                kw7 kw7VarY = jt1Var2.y();
                ox6 ox6VarC = it1.c(jt1Var2, ox6VarB2);
                bt1.c.getClass();
                qr5.a aVar = bt1.a.b;
                if (jt1Var2.s() == null) {
                    ml5.c();
                    throw null;
                }
                jt1Var2.q();
                if (jt1Var2.l()) {
                    jt1Var2.k(aVar);
                } else {
                    jt1Var2.z();
                }
                rd7.d(jt1Var2, bt1.a.f, fl6VarD);
                rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                bt1.a.b bVar = bt1.a.g;
                if (jt1Var2.l() || !xj5.a(jt1Var2.f(), Integer.valueOf(iD))) {
                    rh.b(iD, jt1Var2, iD, bVar);
                }
                rd7.d(jt1Var2, bt1.a.d, ox6VarC);
                sh.a(this.z, jt1Var2, 0);
            } else {
                jt1Var2.u();
            }
            return g2b.a;
        }
    }

    public static final void a(ox6 ox6Var, jl9 jl9Var, long j, long j2, float f, float f2, vs0 vs0Var, ci4<? super jt1, ? super Integer, g2b> ci4Var, jt1 jt1Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            ox6Var = ox6.a.t;
        }
        if ((i2 & 2) != 0) {
            jl9Var = al8.a;
        }
        if ((i2 & 4) != 0) {
            j = ((fi1) jt1Var.F(hi1.a)).p;
        }
        if ((i2 & 8) != 0) {
            j2 = hi1.b(j, jt1Var);
        }
        if ((i2 & 16) != 0) {
            f = 0.0f;
        }
        if ((i2 & 32) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 64) != 0) {
            vs0Var = null;
        }
        u93 u93Var = a;
        float f3 = f + ((y43) jt1Var.F(u93Var)).t;
        nu1.b(new kf8[]{zy1.a.a(new uh1(j2)), u93Var.a(new y43(f3))}, gr1.b(421772006, new a(ox6Var, jl9Var, j, f3, vs0Var, f2, ci4Var), jt1Var), jt1Var, 56);
    }

    public static final void b(boolean z, mh4 mh4Var, ox6 ox6Var, boolean z2, jl9 jl9Var, long j, vs0 vs0Var, fr1 fr1Var, jt1 jt1Var, int i, int i2) {
        boolean z3 = (i2 & 8) != 0 ? true : z2;
        long jB = hi1.b(j, jt1Var);
        vs0 vs0Var2 = (i2 & 512) != 0 ? null : vs0Var;
        jt1Var.K(1528143336);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new i27();
            jt1Var.C(objF);
        }
        h27 h27Var = (h27) objF;
        jt1Var.B();
        u93 u93Var = a;
        float f = ((y43) jt1Var.F(u93Var)).t + 0.0f;
        nu1.b(new kf8[]{zy1.a.a(new uh1(jB)), u93Var.a(new y43(f))}, gr1.b(1508735219, new x5a(ox6Var, jl9Var, j, f, vs0Var2, z, h27Var, z3, mh4Var, fr1Var), jt1Var), jt1Var, 56);
    }

    public static final void c(mh4 mh4Var, ox6 ox6Var, boolean z, jl9 jl9Var, long j, long j2, float f, float f2, vs0 vs0Var, h27 h27Var, fr1 fr1Var, jt1 jt1Var, int i, int i2) {
        ox6 ox6Var2 = (i2 & 2) != 0 ? ox6.a.t : ox6Var;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        jl9 jl9Var2 = (i2 & 8) != 0 ? al8.a : jl9Var;
        long jB = (i2 & 32) != 0 ? hi1.b(j, jt1Var) : j2;
        float f3 = (i2 & 64) != 0 ? 0.0f : f;
        float f4 = (i2 & 128) != 0 ? 0.0f : f2;
        vs0 vs0Var2 = (i2 & 256) != 0 ? null : vs0Var;
        h27 h27Var2 = (i2 & 512) == 0 ? h27Var : null;
        if (h27Var2 == null) {
            jt1Var.K(-1701037204);
            Object objF = jt1Var.f();
            if (objF == jt1.a.a) {
                objF = new i27();
                jt1Var.C(objF);
            }
            h27Var2 = (h27) objF;
        } else {
            jt1Var.K(2023337163);
        }
        jt1Var.B();
        u93 u93Var = a;
        float f5 = f3 + ((y43) jt1Var.F(u93Var)).t;
        nu1.b(new kf8[]{zy1.a.a(new uh1(jB)), u93Var.a(new y43(f5))}, gr1.b(849208527, new w5a(ox6Var2, jl9Var2, j, f5, vs0Var2, h27Var2, z2, mh4Var, f4, fr1Var), jt1Var), jt1Var, 56);
    }

    public static final ox6 d(ox6 ox6Var, jl9 jl9Var, long j, vs0 vs0Var, float f) {
        jl9 jl9Var2;
        ox6 ox6VarB;
        ox6 ox6VarB2 = ox6.a.t;
        if (f > 0.0f) {
            jl9Var2 = jl9Var;
            ox6VarB = po4.b(ox6VarB2, 0.0f, 0.0f, 0.0f, f, jl9Var2, 124895);
        } else {
            jl9Var2 = jl9Var;
            ox6VarB = ox6VarB2;
        }
        ox6 ox6VarH = ox6Var.H(ox6VarB);
        if (vs0Var != null) {
            ox6VarB2 = ns0.b(ox6VarB2, vs0Var.a, vs0Var.b, jl9Var2);
        }
        return uma.a(gi0.c(ox6VarH.H(ox6VarB2), j, jl9Var2), jl9Var2);
    }

    public static final long e(long j, float f, jt1 jt1Var) {
        fi1 fi1Var = (fi1) jt1Var.F(hi1.a);
        boolean zBooleanValue = ((Boolean) jt1Var.F(hi1.b)).booleanValue();
        long j2 = fi1Var.p;
        if (uh1.c(j, j2) && zBooleanValue) {
            return y43.e(f, 0.0f) ? j2 : u7d.i(uh1.b(((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, fi1Var.t), j2);
        }
        return j;
    }
}
