package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vb implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ vb(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                xb.a aVar = xb.Companion;
                gd gdVarQ = ((xb) obj).q();
                oy0.d(rhb.b(gdVarQ), null, null, new ld(gdVarQ, null), 3);
                return g2b.a;
            case 1:
                return dq1.fullyDrawnReporter_delegate$lambda$0$0((dq1) obj);
            case 2:
                return null;
            default:
                return Boolean.valueOf(!((qga) obj).B);
        }
    }
}
