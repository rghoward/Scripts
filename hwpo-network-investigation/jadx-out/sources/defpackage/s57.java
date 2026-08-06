package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s57 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ s57(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                ((lb2) obj).getClass();
                return new r57();
            default:
                b53 b53Var = (b53) obj;
                return new cw(b53.a(b53Var.a), b53.b(b53Var.a));
        }
    }
}
