package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class am0 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ am0(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return g2b.a;
            case 1:
                t76 t76Var = ((wa7.a) obj).a;
                if (t76Var != null) {
                    t76Var.invoke();
                }
                return g2b.a;
            default:
                obj.getClass();
                return new gl0(((Float) obj).floatValue());
        }
    }
}
