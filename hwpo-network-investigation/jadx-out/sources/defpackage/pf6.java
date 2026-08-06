package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pf6 extends mf6<ko5, kt8<?>> {
    public hg3 d;

    @Override // defpackage.mf6
    public final int b(kt8<?> kt8Var) {
        kt8<?> kt8Var2 = kt8Var;
        if (kt8Var2 == null) {
            return 1;
        }
        return kt8Var2.getSize();
    }

    @Override // defpackage.mf6
    public final void c(ko5 ko5Var, kt8<?> kt8Var) {
        kt8<?> kt8Var2 = kt8Var;
        hg3 hg3Var = this.d;
        if (hg3Var == null || kt8Var2 == null) {
            return;
        }
        hg3Var.e.a(kt8Var2, true);
    }
}
