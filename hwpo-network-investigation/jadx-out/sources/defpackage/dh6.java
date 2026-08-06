package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dh6 implements l68 {
    public final t2c a;
    public kg5 b;
    public tq5 c;
    public kg5 d;
    public bg5 e;

    public dh6(t2c t2cVar) {
        this.a = t2cVar;
    }

    @Override // defpackage.l68
    public final long a(gg5 gg5Var, long j, tq5 tq5Var, long j2) {
        bg5 bg5Var = this.e;
        if (bg5Var != null) {
            kg5 kg5Var = this.b;
            if ((kg5Var == null ? false : kg5.b(kg5Var.a, j)) && this.c == tq5Var) {
                kg5 kg5Var2 = this.d;
                if (kg5Var2 != null ? kg5.b(kg5Var2.a, j2) : false) {
                    return bg5Var.a;
                }
            }
        }
        long jA = this.a.a(gg5Var, j, tq5Var, j2);
        this.b = new kg5(j);
        this.c = tq5Var;
        this.d = new kg5(j2);
        this.e = new bg5(jA);
        return jA;
    }
}
