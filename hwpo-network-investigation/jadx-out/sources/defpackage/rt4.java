package defpackage;

import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rt4 {
    public static final int a(u56 u56Var, long j, lgb lgbVar) {
        long j2;
        int iE;
        sia siaVarD = u56Var.d();
        if (siaVarD != null) {
            l07 l07Var = siaVarD.a.b;
            qq5 qq5VarC = u56Var.c();
            if (qq5VarC != null && (iE = e(l07Var, (j2 = qq5VarC.j(j)), lgbVar)) != -1) {
                return l07Var.g(vf7.a(j2, (l07Var.b(iE) + l07Var.f(iE)) / 2.0f, 1));
            }
        }
        return -1;
    }

    public static final long b(u56 u56Var, sk8 sk8Var, sk8 sk8Var2, int i) {
        long jF = f(u56Var, sk8Var, i);
        if (lja.c(jF)) {
            return lja.b;
        }
        long jF2 = f(u56Var, sk8Var2, i);
        if (lja.c(jF2)) {
            return lja.b;
        }
        int i2 = (int) (jF >> 32);
        int i3 = (int) (jF2 & 4294967295L);
        return ay.c(Math.min(i2, i2), Math.max(i3, i3));
    }

    public static final boolean c(ria riaVar, int i) {
        l07 l07Var = riaVar.b;
        int iD = l07Var.d(i);
        return i == riaVar.g(iD) || i == l07Var.c(iD, false) ? riaVar.h(i) != riaVar.a(i) : riaVar.a(i) != riaVar.a(i - 1);
    }

    public static final long d(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public static final int e(l07 l07Var, long j, lgb lgbVar) {
        float fG = lgbVar != null ? lgbVar.g() : 0.0f;
        int i = (int) (4294967295L & j);
        int iE = l07Var.e(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) < l07Var.f(iE) - fG || Float.intBitsToFloat(i) > l07Var.b(iE) + fG) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) < (-fG) || Float.intBitsToFloat(i2) > l07Var.d + fG) {
            return -1;
        }
        return iE;
    }

    public static final long f(u56 u56Var, sk8 sk8Var, int i) {
        sia siaVarD = u56Var.d();
        l07 l07Var = siaVarD != null ? siaVarD.a.b : null;
        qq5 qq5VarC = u56Var.c();
        return (l07Var == null || qq5VarC == null) ? lja.b : l07Var.h(sk8Var.i(qq5VarC.j(0L)), i, pha.a.b);
    }

    public static final boolean g(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean h(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    public static final boolean i(int i) {
        int type;
        return (!h(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }
}
