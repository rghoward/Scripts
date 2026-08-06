package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m94 extends wp5 implements oh4 {
    public static final m94 v;
    public static final m94 w;
    public final /* synthetic */ int u;

    static {
        int i = 1;
        v = new m94(i, 0);
        w = new m94(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m94(int i, int i2) {
        super(i);
        this.u = i2;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.u) {
            case 0:
                break;
            default:
                qr5 qr5Var = (qr5) obj;
                if (qr5Var.e()) {
                    qr5Var.R();
                }
                break;
        }
        return g2b.a;
    }
}
