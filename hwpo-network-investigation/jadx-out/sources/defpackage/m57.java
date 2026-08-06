package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m57 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ m57(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                c67 c67Var = (c67) obj;
                c67Var.getClass();
                h67 h67Var = c67Var.v;
                if (h67Var == null || h67Var.y.c != c67Var.u.d) {
                    return null;
                }
                return h67Var;
            default:
                return new bw(((Integer) obj).intValue());
        }
    }
}
