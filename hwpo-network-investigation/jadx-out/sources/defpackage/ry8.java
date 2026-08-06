package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ry8 implements Comparator<ub9> {
    public static final ry8 t = new ry8();

    @Override // java.util.Comparator
    public final int compare(ub9 ub9Var, ub9 ub9Var2) {
        sk8 sk8VarH = ub9Var.h();
        sk8 sk8VarH2 = ub9Var2.h();
        int iCompare = Float.compare(sk8VarH2.c, sk8VarH.c);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Float.compare(sk8VarH.b, sk8VarH2.b);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Float.compare(sk8VarH.d, sk8VarH2.d);
        return iCompare3 != 0 ? iCompare3 : Float.compare(sk8VarH2.a, sk8VarH.a);
    }
}
