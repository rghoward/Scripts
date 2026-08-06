package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ft5 implements ci4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ ft5(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.t;
        Object obj3 = this.v;
        Object obj4 = this.u;
        switch (i) {
            case 0:
                wo4.a aVar = (wo4.a) obj4;
                c30.e eVar = (c30.e) obj3;
                tx2 tx2Var = (tx2) obj;
                xx1 xx1Var = (xx1) obj2;
                if (xx1.h(xx1Var.a) == Integer.MAX_VALUE) {
                    xc5.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int iH = xx1.h(xx1Var.a);
                int[] iArrS = th1.S(aVar.a(iH, tx2Var.n1(eVar.mo1getSpacingD9Ej5fM())));
                int[] iArr = new int[iArrS.length];
                eVar.a(tx2Var, iH, iArrS, tq5.t, iArr);
                return new nu5(iArrS, iArr);
            default:
                float fFloatValue = ((Float) obj).floatValue();
                ((ej) obj4).a(fFloatValue, ((Float) obj2).floatValue());
                ((dl8) obj3).t = fFloatValue;
                return g2b.a;
        }
    }
}
