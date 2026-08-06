package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w79 implements k97 {
    public final /* synthetic */ z79 a;

    public w79(z79 z79Var) {
        this.a = z79Var;
    }

    @Override // defpackage.k97
    public final long a(long j) {
        z79 z79Var = this.a;
        return z79Var.c(z79Var.k, j, 1);
    }

    @Override // defpackage.k97
    public final long b(int i, long j) {
        z79 z79Var = this.a;
        z79Var.j = i;
        in7 in7Var = z79Var.b;
        return (in7Var == null || !(z79Var.a.d() || z79Var.a.b())) ? z79Var.c(z79Var.k, j, i) : in7Var.b(j, z79Var.j, z79Var.m);
    }
}
