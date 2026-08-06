package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class at4 implements l68 {
    public final di a;
    public final cg7 b;
    public long c = 0;

    public at4(di diVar, cg7 cg7Var) {
        this.a = diVar;
        this.b = cg7Var;
    }

    @Override // defpackage.l68
    public final long a(gg5 gg5Var, long j, tq5 tq5Var, long j2) {
        long jA = this.b.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.c;
        }
        this.c = jA;
        return bg5.d(bg5.d(gg5Var.c(), cg5.c(jA)), this.a.a(j2, 0L, tq5Var));
    }
}
