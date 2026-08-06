package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ot1 implements ci4 {
    public final /* synthetic */ hm8 t;

    public /* synthetic */ ot1(hm8 hm8Var) {
        this.t = hm8Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        ((Integer) obj).getClass();
        boolean z = obj2 instanceof ls1;
        hm8 hm8Var = this.t;
        if (z) {
            ls1 ls1Var = (ls1) obj2;
            d37<ls1> d37VarA = hm8Var.h;
            if (d37VarA == null) {
                d37VarA = a49.a();
                hm8Var.h = d37VarA;
            }
            d37VarA.k(ls1Var);
            hm8Var.f.d(ls1Var);
        }
        if (obj2 instanceof jm8) {
            hm8Var.e((jm8) obj2);
        }
        if (obj2 instanceof xj8) {
            ((xj8) obj2).c();
        }
        return g2b.a;
    }
}
