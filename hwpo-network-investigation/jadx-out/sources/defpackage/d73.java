package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface d73 extends tx2 {
    static /* synthetic */ void F1(d73 d73Var, fx0 fx0Var, long j, long j2, long j3, float f, e73 e73Var, wh1 wh1Var, int i) {
        long j4 = (i & 2) != 0 ? 0L : j;
        d73Var.y1(fx0Var, j4, (i & 4) != 0 ? J0(d73Var.c(), j4) : j2, j3, (i & 16) != 0 ? 1.0f : f, (i & 32) != 0 ? zy3.a : e73Var, (i & 64) != 0 ? null : wh1Var, (i & 128) != 0 ? 3 : 0);
    }

    static long J0(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    static /* synthetic */ void L1(d73 d73Var, l75 l75Var, long j, float f, wh1 wh1Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        d73Var.l1(l75Var, j2, f, zy3.a, wh1Var, (i & 32) != 0 ? 3 : 0);
    }

    static /* synthetic */ void N(d73 d73Var, long j, float f, long j2, int i, int i2) {
        if ((i2 & 2) != 0) {
            f = cr9.c(d73Var.c()) / 2.0f;
        }
        float f2 = f;
        if ((i2 & 4) != 0) {
            j2 = d73Var.u1();
        }
        long j3 = j2;
        zy3 zy3Var = zy3.a;
        if ((i2 & 64) != 0) {
            i = 3;
        }
        d73Var.r1(j, f2, j3, zy3Var, i);
    }

    static /* synthetic */ void Q(d73 d73Var, fx0 fx0Var, long j, long j2, float f, e73 e73Var, wh1 wh1Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        d73Var.J1(fx0Var, j3, (i & 4) != 0 ? J0(d73Var.c(), j3) : j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? zy3.a : e73Var, (i & 32) != 0 ? null : wh1Var, (i & 64) != 0 ? 3 : 0);
    }

    static /* synthetic */ void W0(d73 d73Var, long j, long j2, long j3, float f, int i) {
        long j4 = (i & 2) != 0 ? 0L : j2;
        d73Var.X(j, j4, (i & 4) != 0 ? J0(d73Var.c(), j4) : j3, (i & 8) != 0 ? 1.0f : f, zy3.a, (i & 64) != 0 ? 3 : 0);
    }

    static void b1(d73 d73Var, l75 l75Var, long j, long j2, long j3, long j4, float f, e73 e73Var, wh1 wh1Var, int i, int i2, int i3) {
        d73Var.Y(l75Var, (i3 & 2) != 0 ? 0L : j, j2, (i3 & 8) != 0 ? 0L : j3, (i3 & 16) != 0 ? j2 : j4, (i3 & 32) != 0 ? 1.0f : f, (i3 & 64) != 0 ? zy3.a : e73Var, wh1Var, (i3 & 256) != 0 ? 3 : i, (i3 & 512) != 0 ? 1 : i2);
    }

    static /* synthetic */ void c1(d73 d73Var, cu7 cu7Var, fx0 fx0Var, float f, b3a b3aVar, wh1 wh1Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        e73 e73Var = b3aVar;
        if ((i & 8) != 0) {
            e73Var = zy3.a;
        }
        e73 e73Var2 = e73Var;
        if ((i & 16) != 0) {
            wh1Var = null;
        }
        d73Var.m1(cu7Var, fx0Var, f2, e73Var2, wh1Var, (i & 32) != 0 ? 3 : 0);
    }

    static /* synthetic */ void o0(d73 d73Var, cu7 cu7Var, long j, e73 e73Var, wq0 wq0Var, int i) {
        if ((i & 8) != 0) {
            e73Var = zy3.a;
        }
        e73 e73Var2 = e73Var;
        if ((i & 16) != 0) {
            wq0Var = null;
        }
        d73Var.D(cu7Var, j, e73Var2, wq0Var);
    }

    void D(cu7 cu7Var, long j, e73 e73Var, wh1 wh1Var);

    void H1(long j, long j2, long j3, float f, int i, int i2);

    void J1(fx0 fx0Var, long j, long j2, float f, e73 e73Var, wh1 wh1Var, int i);

    void M1(long j, float f, float f2, long j2, long j3, e73 e73Var);

    void S0(long j, long j2, long j3, long j4, e73 e73Var);

    void T0(fx0 fx0Var, long j, long j2, float f, float f2);

    void X(long j, long j2, long j3, float f, e73 e73Var, int i);

    default void Y(l75 l75Var, long j, long j2, long j3, long j4, float f, e73 e73Var, wh1 wh1Var, int i, int i2) {
        b1(this, l75Var, j, j2, j3, j4, f, e73Var, wh1Var, i, 0, 512);
    }

    s41.b Y0();

    default long c() {
        return Y0().d();
    }

    tq5 getLayoutDirection();

    void l1(l75 l75Var, long j, float f, e73 e73Var, wh1 wh1Var, int i);

    void m1(cu7 cu7Var, fx0 fx0Var, float f, e73 e73Var, wh1 wh1Var, int i);

    void r1(long j, float f, long j2, e73 e73Var, int i);

    default long u1() {
        return p50.c(Y0().d());
    }

    void y1(fx0 fx0Var, long j, long j2, long j3, float f, e73 e73Var, wh1 wh1Var, int i);
}
