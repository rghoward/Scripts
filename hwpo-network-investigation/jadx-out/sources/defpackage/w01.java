package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w01 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ w01(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                n01 n01Var = n01.n;
                return n01.b.a(((y01) obj).f);
            case 1:
                return ((u56) obj).d();
            default:
                String str = ((x57) obj).c;
                if (str != null) {
                    return new ol8(str, 0);
                }
                return null;
        }
    }
}
