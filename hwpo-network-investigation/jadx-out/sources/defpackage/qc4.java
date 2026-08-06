package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qc4 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ hk0 u;

    public /* synthetic */ qc4(hk0 hk0Var, int i) {
        this.t = i;
        this.u = hk0Var;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        hk0 hk0Var = this.u;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ho5<Object>[] ho5VarArr = oc4.C;
                ((oc4) hk0Var).p().g.setEnabled(zBooleanValue);
                break;
            default:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                bf9.a aVar = bf9.Companion;
                ((bf9) hk0Var).p().h.setVisibility(!zBooleanValue2 ? 4 : 0);
                break;
        }
        return g2b.a;
    }
}
