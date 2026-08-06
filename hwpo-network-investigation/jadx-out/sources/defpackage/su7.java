package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class su7 extends n72 {
    public final z13 v = new z13();

    @Override // defpackage.n72
    public final void t0(h72 h72Var, Runnable runnable) {
        h72Var.getClass();
        runnable.getClass();
        z13 z13Var = this.v;
        z13Var.getClass();
        et2 et2Var = i23.a;
        gt4 gt4VarX0 = ag6.a.x0();
        if (gt4VarX0.v0(h72Var) || z13Var.b || !z13Var.a) {
            gt4VarX0.t0(h72Var, new y13(0, z13Var, runnable));
        } else if (z13Var.d.offer(runnable)) {
            z13Var.a();
        } else {
            aa0.c("cannot enqueue any more runnables");
        }
    }

    @Override // defpackage.n72
    public final boolean v0(h72 h72Var) {
        h72Var.getClass();
        et2 et2Var = i23.a;
        if (ag6.a.x0().v0(h72Var)) {
            return true;
        }
        z13 z13Var = this.v;
        return !(z13Var.b || !z13Var.a);
    }
}
