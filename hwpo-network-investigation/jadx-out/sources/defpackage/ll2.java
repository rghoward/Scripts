package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ll2 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ ll2(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                ql2 ql2Var = (ql2) obj;
                om2 om2Var = ql2Var.A;
                if (om2Var == null) {
                    xj5.e("viewModelFactory");
                    throw null;
                }
                om2Var.j = ql2Var.requireArguments().getLong("DAY_KEY", -1L);
                whb parentFragment = ql2Var.getParentFragment();
                iy8 iy8Var = parentFragment instanceof iy8 ? (iy8) parentFragment : null;
                om2Var.k = iy8Var != null ? iy8Var.e() : null;
                return om2Var;
            case 1:
                return new vf7(((vf7) ((yz9) obj).getValue()).a);
            default:
                rbb.a aVar = rbb.Companion;
                ybb ybbVarQ = ((rbb) obj).q();
                ybbVarQ.g(ybbVarQ.E);
                return g2b.a;
        }
    }
}
