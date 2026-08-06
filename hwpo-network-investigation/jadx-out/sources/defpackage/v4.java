package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v4 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ v4(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return g2b.a;
            case 1:
                ho5<Object>[] ho5VarArr = ec9.a;
                gc9<Boolean> gc9Var = ac9.m;
                ho5<Object> ho5Var = ec9.a[5];
                ((hc9) obj).d(gc9Var, Boolean.TRUE);
                return g2b.a;
            default:
                n58 n58Var = (n58) obj;
                boolean z = false;
                if (n58Var != null && n58Var.a == 2) {
                    z = true;
                }
                return Boolean.valueOf(true ^ z);
        }
    }
}
