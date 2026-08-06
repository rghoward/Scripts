package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l57 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ l57(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                c67 c67Var = (c67) obj;
                c67Var.getClass();
                return Boolean.valueOf(!((q57) obj2).l.containsKey(Integer.valueOf(c67Var.u.d)));
            default:
                ((Integer) obj).getClass();
                ho5<Object>[] ho5VarArr = hta.D;
                ((sbb.a) obj2).invoke();
                return g2b.a;
        }
    }
}
