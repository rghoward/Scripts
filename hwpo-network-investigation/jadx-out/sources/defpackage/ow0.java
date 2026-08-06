package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ow0 extends ox6.c implements xv0, nq5 {
    public dz1 H;
    public boolean I;

    public static final sk8 c2(ow0 ow0Var, mb7 mb7Var, yv0 yv0Var) {
        sk8 sk8Var;
        if (ow0Var.G && ow0Var.I) {
            mb7 mb7VarE = ew2.e(ow0Var);
            if (!mb7Var.g1().G) {
                mb7Var = null;
            }
            if (mb7Var != null && (sk8Var = (sk8) yv0Var.invoke()) != null) {
                return sk8Var.i(mb7VarE.Z(mb7Var, false).d());
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [mw0] */
    @Override // defpackage.xv0
    public final Object E0(final mb7 mb7Var, final yv0 yv0Var, u02 u02Var) {
        Object objD = u72.d(new nw0(this, mb7Var, yv0Var, new mh4() { // from class: mw0
            @Override // defpackage.mh4
            public final Object invoke() {
                mb7 mb7Var2 = mb7Var;
                yv0 yv0Var2 = yv0Var;
                ow0 ow0Var = this.t;
                sk8 sk8VarC2 = ow0.c2(ow0Var, mb7Var2, yv0Var2);
                if (sk8VarC2 == null) {
                    return null;
                }
                dz1 dz1Var = ow0Var.H;
                if (kg5.b(dz1Var.O, -1L)) {
                    xc5.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return sk8VarC2.i(dz1Var.g2(sk8VarC2, dz1Var.d2(), 0L) ^ (-9223372034707292160L));
            }
        }, null), u02Var);
        return objD == v72.t ? objD : g2b.a;
    }

    @Override // defpackage.nq5
    public final void F(qq5 qq5Var) {
        this.I = true;
    }

    @Override // ox6.c
    public final boolean R1() {
        return false;
    }
}
