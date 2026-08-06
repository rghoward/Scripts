package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class em7 {
    public static final void a(vp vpVar, dm7 dm7Var) {
        if (dm7Var instanceof dm7.b) {
            vpVar.p(((dm7.b) dm7Var).a);
            return;
        }
        if (dm7Var instanceof dm7.c) {
            vpVar.q(((dm7.c) dm7Var).a);
        } else if (dm7Var instanceof dm7.a) {
            vpVar.o(((dm7.a) dm7Var).a, 0L);
        } else {
            u.b();
        }
    }

    public static void b(d73 d73Var, dm7 dm7Var, fx0 fx0Var, float f, int i) {
        float f2 = (i & 4) != 0 ? 1.0f : f;
        zy3 zy3Var = zy3.a;
        if (dm7Var instanceof dm7.b) {
            sk8 sk8Var = ((dm7.b) dm7Var).a;
            float f3 = sk8Var.a;
            d73Var.J1(fx0Var, (((long) Float.floatToRawIntBits(sk8Var.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32), d(sk8Var), f2, zy3Var, null, 3);
            return;
        }
        if (!(dm7Var instanceof dm7.c)) {
            if (dm7Var instanceof dm7.a) {
                d73Var.m1(((dm7.a) dm7Var).a, fx0Var, f2, zy3Var, null, 3);
                return;
            } else {
                u.b();
                return;
            }
        }
        dm7.c cVar = (dm7.c) dm7Var;
        vp vpVar = cVar.b;
        if (vpVar != null) {
            d73Var.m1(vpVar, fx0Var, f2, zy3Var, null, 3);
            return;
        }
        vx8 vx8Var = cVar.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (vx8Var.h >> 32));
        float f4 = vx8Var.a;
        d73Var.y1(fx0Var, (((long) Float.floatToRawIntBits(vx8Var.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(f4)) << 32), (((long) Float.floatToRawIntBits(vx8Var.b())) << 32) | (((long) Float.floatToRawIntBits(vx8Var.a())) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), f2, zy3Var, null, 3);
    }

    public static void c(d73 d73Var, dm7 dm7Var, long j) {
        zy3 zy3Var = zy3.a;
        if (dm7Var instanceof dm7.b) {
            sk8 sk8Var = ((dm7.b) dm7Var).a;
            float f = sk8Var.a;
            d73Var.X(j, (((long) Float.floatToRawIntBits(sk8Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), d(sk8Var), 1.0f, zy3Var, 3);
            return;
        }
        if (!(dm7Var instanceof dm7.c)) {
            if (dm7Var instanceof dm7.a) {
                d73Var.D(((dm7.a) dm7Var).a, j, zy3Var, null);
                return;
            } else {
                u.b();
                return;
            }
        }
        dm7.c cVar = (dm7.c) dm7Var;
        vp vpVar = cVar.b;
        if (vpVar != null) {
            d73Var.D(vpVar, j, zy3Var, null);
            return;
        }
        vx8 vx8Var = cVar.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (vx8Var.h >> 32));
        float f2 = vx8Var.a;
        d73Var.S0(j, (((long) Float.floatToRawIntBits(vx8Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), (((long) Float.floatToRawIntBits(vx8Var.b())) << 32) | (((long) Float.floatToRawIntBits(vx8Var.a())) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), zy3Var);
    }

    public static final long d(sk8 sk8Var) {
        float f = sk8Var.c - sk8Var.a;
        return (((long) Float.floatToRawIntBits(sk8Var.d - sk8Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }
}
