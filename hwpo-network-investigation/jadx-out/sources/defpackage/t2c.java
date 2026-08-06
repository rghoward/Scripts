package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t2c implements l68 {
    public static final xz1 b = new xz1();
    public final Object a;

    public t2c() {
        int i = h0c.a;
        this.a = new s2c(o1c.a, b);
    }

    @Override // defpackage.l68
    public long a(gg5 gg5Var, long j, tq5 tq5Var, long j2) {
        long j3 = ((bg5) ((mh4) this.a).invoke()).a;
        int iA = gnb.a(gg5Var.a + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), tq5Var == tq5.t);
        return (((long) gnb.a(gg5Var.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L) | (((long) iA) << 32);
    }

    public t2c(mh4 mh4Var) {
        this.a = mh4Var;
    }
}
