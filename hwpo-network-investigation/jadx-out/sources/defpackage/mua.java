package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mua implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ mua(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                int i = nua.B;
                return Boolean.valueOf(((qua) obj).c);
            default:
                cw cwVar = (cw) obj;
                return new bg5((((long) Math.round(cwVar.b)) & 4294967295L) | (((long) Math.round(cwVar.a)) << 32));
        }
    }
}
