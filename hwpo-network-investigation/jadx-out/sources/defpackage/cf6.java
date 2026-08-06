package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cf6 extends gi {
    @Override // defpackage.gi
    public final long b(mb7 mb7Var, long j) {
        ff6 ff6VarE1 = mb7Var.e1();
        ff6VarE1.getClass();
        long j2 = ff6VarE1.I;
        return vf7.e((((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32), j);
    }

    @Override // defpackage.gi
    public final Map<ei, Integer> c(mb7 mb7Var) {
        ff6 ff6VarE1 = mb7Var.e1();
        ff6VarE1.getClass();
        return ff6VarE1.v0().l();
    }

    @Override // defpackage.gi
    public final int d(mb7 mb7Var, ei eiVar) {
        ff6 ff6VarE1 = mb7Var.e1();
        ff6VarE1.getClass();
        return ff6VarE1.R(eiVar);
    }
}
