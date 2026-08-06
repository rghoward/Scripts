package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ej4 implements ci4 {
    public final /* synthetic */ hm8 t;
    public final /* synthetic */ cs9 u;

    public /* synthetic */ ej4(hm8 hm8Var, cs9 cs9Var) {
        this.t = hm8Var;
        this.u = cs9Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        boolean z = obj2 instanceof ls1;
        hm8 hm8Var = this.t;
        if (z) {
            hm8Var.f.d((ls1) obj2);
        } else if (!(obj2 instanceof rv8)) {
            boolean z2 = obj2 instanceof jm8;
            cs9 cs9Var = this.u;
            if (z2) {
                ty.f(cs9Var, iIntValue, obj2);
                hm8Var.e((jm8) obj2);
            } else if (obj2 instanceof xj8) {
                ty.f(cs9Var, iIntValue, obj2);
                ((xj8) obj2).c();
            }
        }
        return g2b.a;
    }
}
