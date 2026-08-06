package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nr5 {
    public static final int a(df6 df6Var, ei eiVar) {
        df6 df6VarS0 = df6Var.s0();
        if (df6VarS0 == null) {
            uc5.b("Child of " + df6Var + " cannot be null when calculating alignment line");
        }
        if (df6Var.v0().l().containsKey(eiVar)) {
            Integer num = df6Var.v0().l().get(eiVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iR = df6VarS0.R(eiVar);
            if (iR != Integer.MIN_VALUE) {
                df6VarS0.C = true;
                df6Var.D = true;
                df6Var.E0();
                df6VarS0.C = false;
                df6Var.D = false;
                return iR + ((int) (eiVar instanceof e15 ? df6VarS0.z0() & 4294967295L : df6VarS0.z0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }
}
