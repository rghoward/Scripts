package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vf6 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ ox6.c u;

    public /* synthetic */ vf6(ox6.c cVar, int i) {
        this.t = i;
        this.u = cVar;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        ox6.c cVar = this.u;
        switch (i) {
            case 0:
                return new vf7(((xf6) cVar).V);
            default:
                aa4 aa4Var = ((n79) cVar).i0;
                if (!aa4Var.q().G) {
                    return null;
                }
                w94 w94VarA0 = aa4Var.a0();
                if (!w94VarA0.a()) {
                    return null;
                }
                if (w94VarA0.e()) {
                    return ((ba4) aa4Var).f2(null);
                }
                ba4 ba4VarV = ew2.g(aa4Var).getFocusOwner().v();
                if (ba4VarV != null) {
                    return ba4VarV.f2(ew2.e(aa4Var));
                }
                return null;
        }
    }
}
