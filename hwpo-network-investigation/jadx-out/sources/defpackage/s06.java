package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s06 implements ci4 {
    public final /* synthetic */ ko7 t;
    public final /* synthetic */ az9.a u;
    public final /* synthetic */ c30.e v;

    public /* synthetic */ s06(ko7 ko7Var, az9.a aVar, c30.e eVar) {
        this.t = ko7Var;
        this.u = aVar;
        this.v = eVar;
    }

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        tx2 tx2Var = (tx2) obj;
        xx1 xx1Var = (xx1) obj2;
        if (xx1.h(xx1Var.a) == Integer.MAX_VALUE) {
            xc5.a("LazyVerticalStaggeredGrid's width should be bound by parent.");
        }
        ko7 ko7Var = this.t;
        tq5 tq5Var = tq5.t;
        int iH = xx1.h(xx1Var.a) - tx2Var.n1(eo7.d(ko7Var, tq5Var) + eo7.e(ko7Var, tq5Var));
        c30.e eVar = this.v;
        int[] iArrA = this.u.a(iH, tx2Var.n1(eVar.mo1getSpacingD9Ej5fM()));
        int[] iArr = new int[3];
        eVar.a(tx2Var, iH, iArrA, tq5Var, iArr);
        return new x16(iArr, iArrA);
    }
}
