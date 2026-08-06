package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hn implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ hn(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                ((hc9) obj).d(ab9.a, new za9(ys4.t, ((cg7) obj2).a(), ya9.u, true));
                break;
            default:
                ((mh4) obj2).invoke();
                break;
        }
        return g2b.a;
    }
}
