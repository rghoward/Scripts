package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nn implements b33 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oq1 b;

    public /* synthetic */ nn(oq1 oq1Var, int i) {
        this.a = i;
        this.b = oq1Var;
    }

    @Override // defpackage.b33
    public final void dispose() {
        int i = this.a;
        oq1 oq1Var = this.b;
        switch (i) {
            case 0:
                m03 m03Var = (m03) oq1Var;
                m03Var.dismiss();
                m03Var.A.disposeComposition();
                break;
            default:
                rv6 rv6Var = (rv6) oq1Var;
                rv6Var.dismiss();
                rv6Var.B.disposeComposition();
                break;
        }
    }
}
