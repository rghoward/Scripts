package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class me implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ me(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                ((oe) obj2).f((String) obj);
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                rb3.a aVar = rb3.Companion;
                ((rb3) obj2).r().g.setVisibility(zBooleanValue ? 0 : 8);
                break;
        }
        return g2b.a;
    }
}
