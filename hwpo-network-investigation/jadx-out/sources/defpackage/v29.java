package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v29 implements ci4 {
    public final /* synthetic */ int t;

    public /* synthetic */ v29(int i) {
        this.t = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        k19 k19Var = (k19) obj;
        switch (this.t) {
            case 0:
                h18 h18Var = (h18) obj2;
                Boolean boolValueOf = Boolean.valueOf(h18Var.a);
                au3 au3Var = t29.a;
                return ws0.c(boolValueOf, t29.a(new we3(h18Var.b), d39.b, k19Var));
            default:
                return (in9) ((hn9) obj2).d.g.getValue();
        }
    }
}
