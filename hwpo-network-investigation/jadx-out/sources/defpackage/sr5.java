package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sr5 extends gi {
    @Override // defpackage.gi
    public final long b(mb7 mb7Var, long j) {
        ln7 ln7Var = mb7Var.g0;
        if (ln7Var != null) {
            j = ln7Var.e(j, false);
        }
        return cg5.b(j, mb7Var.U);
    }

    @Override // defpackage.gi
    public final Map<ei, Integer> c(mb7 mb7Var) {
        return mb7Var.v0().l();
    }

    @Override // defpackage.gi
    public final int d(mb7 mb7Var, ei eiVar) {
        return mb7Var.R(eiVar);
    }
}
