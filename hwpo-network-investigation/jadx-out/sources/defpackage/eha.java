package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class eha {
    public static final boolean a(qga qgaVar, boolean z) {
        qq5 qq5VarC;
        u56 u56Var = qgaVar.d;
        if (u56Var == null || (qq5VarC = u56Var.c()) == null) {
            return false;
        }
        sk8 sk8VarA = fb9.a(qq5VarC);
        long jL = qgaVar.l(z);
        float f = sk8VarA.a;
        float f2 = sk8VarA.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jL >> 32));
        if (f > fIntBitsToFloat || fIntBitsToFloat > f2) {
            return false;
        }
        float f3 = sk8VarA.b;
        float f4 = sk8VarA.d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jL & 4294967295L));
        return f3 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f4;
    }
}
