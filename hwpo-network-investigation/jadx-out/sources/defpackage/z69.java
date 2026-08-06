package defpackage;

import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z69 implements j13, jac {
    public static final /* synthetic */ int t = 0;
    public static final /* synthetic */ z69 u = new z69();

    public static final boolean d(a58 a58Var) {
        return (a58Var.b() || a58Var.h || !a58Var.d) ? false : true;
    }

    public static final boolean e(a58 a58Var) {
        return !a58Var.h && a58Var.d;
    }

    public static final boolean f(a58 a58Var) {
        return (a58Var.b() || !a58Var.h || a58Var.d) ? false : true;
    }

    public static final boolean g(a58 a58Var) {
        return a58Var.h && !a58Var.d;
    }

    public static final ff6 h(ff6 ff6Var) {
        qr5 qr5Var = ff6Var.H.H;
        while (true) {
            qr5 qr5VarI = qr5Var.I();
            qr5 qr5Var2 = null;
            if ((qr5VarI != null ? qr5VarI.A : null) == null) {
                ff6 ff6VarE1 = qr5Var.Y.d.e1();
                ff6VarE1.getClass();
                return ff6VarE1;
            }
            qr5 qr5VarI2 = qr5Var.I();
            if (qr5VarI2 != null) {
                qr5Var2 = qr5VarI2.A;
            }
            qr5Var2.getClass();
            qr5 qr5VarI3 = qr5Var.I();
            qr5VarI3.getClass();
            qr5Var = qr5VarI3.A;
            qr5Var.getClass();
        }
    }

    public static final boolean i(a58 a58Var, long j, long j2) {
        int i = a58Var.i == 1 ? 1 : 0;
        long j3 = a58Var.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat > f2) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final long j(a58 a58Var, boolean z) {
        long jD = vf7.d(a58Var.c, a58Var.g);
        if (z || !a58Var.b()) {
            return jD;
        }
        return 0L;
    }

    public static final ox6 k(ox6 ox6Var, s79 s79Var, fl7 fl7Var, in7 in7Var, boolean z, g44 g44Var, i27 i27Var, sp7 sp7Var) {
        fl7 fl7Var2 = fl7.t;
        ox6.a aVar = ox6.a.t;
        return ox6Var.H(fl7Var == fl7Var2 ? uma.a(aVar, leb.a) : uma.a(aVar, m15.a)).H(new y69(sp7Var, g44Var, i27Var, fl7Var, in7Var, s79Var, z, false));
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Integer.valueOf((int) u4c.u.get().x0());
    }

    @Override // defpackage.j13
    public File b(ko5 ko5Var) {
        return null;
    }

    @Override // defpackage.j13
    public void c(ko5 ko5Var, qe2 qe2Var) {
    }
}
