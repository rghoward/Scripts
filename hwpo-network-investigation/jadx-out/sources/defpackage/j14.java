package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j14 extends gv7 {
    public final tj4 b;

    public j14(tj4 tj4Var) {
        this.b = tj4Var;
    }

    @Override // defpackage.gv7
    public final boolean a() {
        tj4 tj4Var = this.b;
        if (!tj4Var.H()) {
            return false;
        }
        if (tj4Var.D() > 0 || tj4Var.C() > 0) {
            return true;
        }
        return tj4Var.G() && tj4Var.F().C();
    }
}
