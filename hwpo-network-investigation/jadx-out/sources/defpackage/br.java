package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class br implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ br(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                return Boolean.valueOf((((cg7) obj).a() & 9223372034707292159L) != 9205357640488583168L);
            default:
                am1.a aVar = am1.Companion;
                ((kx3) ((am1) obj).E.getValue()).b();
                return g2b.a;
        }
    }
}
