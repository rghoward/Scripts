package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jz7 implements kl6 {
    public int t;
    public int u;
    public long v = 0;
    public long w = kz7.a;
    public long x = 0;

    public int f0() {
        return (int) (this.v & 4294967295L);
    }

    public int g0() {
        return (int) (this.v >> 32);
    }

    public final void h0() {
        this.t = uh8.g((int) (this.v >> 32), xx1.j(this.w), xx1.h(this.w));
        int iG = uh8.g((int) (this.v & 4294967295L), xx1.i(this.w), xx1.g(this.w));
        this.u = iG;
        int i = this.t;
        long j = this.v;
        this.x = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iG - ((int) (j & 4294967295L))) / 2)));
    }

    public abstract void i0(long j, float f, oh4<? super ro4, g2b> oh4Var);

    public void k0(long j, float f, ko4 ko4Var) {
        i0(j, f, null);
    }

    public final void l0(long j) {
        if (kg5.b(this.v, j)) {
            return;
        }
        this.v = j;
        h0();
    }

    public final void m0(long j) {
        if (xx1.b(this.w, j)) {
            return;
        }
        this.w = j;
        h0();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a implements tx2 {
        public boolean t;

        public static void A(a aVar, jz7 jz7Var, long j) {
            int i = kz7.b;
            aVar.getClass();
            e(jz7Var, aVar);
            jz7Var.i0(bg5.d(j, jz7Var.x), 0.0f, kz7.a.u);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void e(jz7 jz7Var, a aVar) {
            aVar.getClass();
            if (jz7Var instanceof ty6) {
                ((ty6) jz7Var).M(aVar.t);
            }
        }

        public static void q(a aVar, jz7 jz7Var, long j) {
            aVar.getClass();
            e(jz7Var, aVar);
            jz7Var.i0(bg5.d(j, jz7Var.x), 0.0f, null);
        }

        public static void t(a aVar, jz7 jz7Var, int i, int i2) {
            long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
            if (aVar.g() == tq5.t || aVar.j() == 0) {
                e(jz7Var, aVar);
                jz7Var.i0(bg5.d(j, jz7Var.x), 0.0f, null);
            } else {
                int iJ = (aVar.j() - jz7Var.t) - ((int) (j >> 32));
                e(jz7Var, aVar);
                jz7Var.i0(bg5.d((((long) iJ) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), jz7Var.x), 0.0f, null);
            }
        }

        public static void v(a aVar, jz7 jz7Var, int i, int i2) {
            int i3 = kz7.b;
            long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
            tq5 tq5VarG = aVar.g();
            tq5 tq5Var = tq5.t;
            kz7.a aVar2 = kz7.a.u;
            if (tq5VarG == tq5Var || aVar.j() == 0) {
                e(jz7Var, aVar);
                jz7Var.i0(bg5.d(j, jz7Var.x), 0.0f, aVar2);
            } else {
                int iJ = (aVar.j() - jz7Var.t) - ((int) (j >> 32));
                e(jz7Var, aVar);
                jz7Var.i0(bg5.d((((long) iJ) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), jz7Var.x), 0.0f, aVar2);
            }
        }

        public static void x(a aVar, jz7 jz7Var, long j) {
            int i = kz7.b;
            tq5 tq5VarG = aVar.g();
            tq5 tq5Var = tq5.t;
            kz7.a aVar2 = kz7.a.u;
            if (tq5VarG == tq5Var || aVar.j() == 0) {
                e(jz7Var, aVar);
                jz7Var.i0(bg5.d(j, jz7Var.x), 0.0f, aVar2);
            } else {
                int iJ = (aVar.j() - jz7Var.t) - ((int) (j >> 32));
                e(jz7Var, aVar);
                jz7Var.i0(bg5.d((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) iJ) << 32), jz7Var.x), 0.0f, aVar2);
            }
        }

        public static void y(a aVar, jz7 jz7Var, long j, ko4 ko4Var) {
            if (aVar.g() == tq5.t || aVar.j() == 0) {
                e(jz7Var, aVar);
                jz7Var.k0(bg5.d(j, jz7Var.x), 0.0f, ko4Var);
            } else {
                int iJ = (aVar.j() - jz7Var.t) - ((int) (j >> 32));
                e(jz7Var, aVar);
                jz7Var.k0(bg5.d((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) iJ) << 32), jz7Var.x), 0.0f, ko4Var);
            }
        }

        public static void z(a aVar, jz7 jz7Var, int i, int i2, oh4 oh4Var) {
            aVar.getClass();
            e(jz7Var, aVar);
            jz7Var.i0(bg5.d((((long) i2) & 4294967295L) | (((long) i) << 32), jz7Var.x), 0.0f, oh4Var);
        }

        @Override // defpackage.tx2
        public float N0() {
            return 1.0f;
        }

        public abstract tq5 g();

        @Override // defpackage.tx2
        public float getDensity() {
            return 1.0f;
        }

        public abstract int j();

        public final void l(jz7 jz7Var, int i, int i2, float f) {
            e(jz7Var, this);
            jz7Var.i0(bg5.d((((long) i2) & 4294967295L) | (((long) i) << 32), jz7Var.x), f, null);
        }

        public float f(uy8 uy8Var, float f) {
            return f;
        }
    }
}
