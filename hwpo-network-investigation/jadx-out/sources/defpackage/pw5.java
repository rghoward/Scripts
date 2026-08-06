package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pw5 implements b33 {
    public final /* synthetic */ lx5 a;

    public pw5(lx5 lx5Var) {
        this.a = lx5Var;
    }

    @Override // defpackage.b33
    public final void dispose() {
        lx5 lx5Var = this.a;
        c88 c88Var = lx5Var.d;
        if (c88Var != null) {
            c88Var.d = false;
        }
        lx5Var.d = null;
    }
}
