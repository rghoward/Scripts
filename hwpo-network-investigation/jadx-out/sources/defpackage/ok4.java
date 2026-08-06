package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ok4 implements oh4 {
    public final /* synthetic */ oh4 t;

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        txa txaVar = (txa) obj;
        if (!(txaVar instanceof nk4)) {
            aa0.c("Node is not a GestureNode instance");
            return null;
        }
        Boolean bool = (Boolean) this.t.invoke(((nk4) txaVar).H);
        bool.getClass();
        return bool;
    }
}
