package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vp1 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ vp1(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                return dq1.onBackPressedInput_delegate$lambda$0((dq1) obj);
            case 1:
                String string = ((z6b) obj).next().toString();
                string.getClass();
                return string;
            default:
                mh4<g2b> mh4Var = ((qga) obj).f;
                if (mh4Var != null) {
                    mh4Var.invoke();
                }
                return g2b.a;
        }
    }
}
