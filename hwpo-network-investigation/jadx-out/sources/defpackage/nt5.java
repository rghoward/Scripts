package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nt5 implements ci4 {
    public final /* synthetic */ int t = 0;
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ nt5(ot5 ot5Var, int i, Object obj, int i2) {
        this.v = ot5Var;
        this.u = i;
        this.w = obj;
    }

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.t;
        int i2 = this.u;
        Object obj3 = this.w;
        Object obj4 = this.v;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((ot5) obj4).e(i2, obj3, (jt1) obj, gz3.s(1));
                break;
            default:
                ((Integer) obj2).getClass();
                p08.b((ox6) obj4, (fr1) obj3, (jt1) obj, gz3.s(i2 | 1));
                break;
        }
        return g2b.a;
    }

    public /* synthetic */ nt5(ox6 ox6Var, fr1 fr1Var, int i) {
        this.v = ox6Var;
        this.w = fr1Var;
        this.u = i;
    }
}
