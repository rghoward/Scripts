package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ep0 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ ep0(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                int i = fp0.K;
                return ((fp0.b) obj).b;
            case 1:
                txa txaVar = (txa) obj;
                txaVar.getClass();
                it7 it7Var = (it7) txaVar;
                it7Var.I = false;
                ew2.f(it7Var).R();
                return Boolean.FALSE;
            default:
                obj.getClass();
                return new c86(((Integer) obj).intValue());
        }
    }
}
