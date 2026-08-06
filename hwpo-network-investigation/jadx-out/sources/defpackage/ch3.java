package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ch3 extends wp5 implements oh4<ro4, g2b> {
    public final /* synthetic */ yz9<Float> u;
    public final /* synthetic */ yz9<Float> v;
    public final /* synthetic */ yz9<ava> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch3(tva.a.C0252a c0252a, tva.a.C0252a c0252a2, tva.a.C0252a c0252a3) {
        super(1);
        this.u = c0252a;
        this.v = c0252a2;
        this.w = c0252a3;
    }

    @Override // defpackage.oh4
    public final g2b invoke(ro4 ro4Var) {
        ro4 ro4Var2 = ro4Var;
        yz9<Float> yz9Var = this.u;
        ro4Var2.b(yz9Var != null ? yz9Var.getValue().floatValue() : 1.0f);
        yz9<Float> yz9Var2 = this.v;
        ro4Var2.r(yz9Var2 != null ? yz9Var2.getValue().floatValue() : 1.0f);
        ro4Var2.k(yz9Var2 != null ? yz9Var2.getValue().floatValue() : 1.0f);
        yz9<ava> yz9Var3 = this.w;
        ro4Var2.o1(yz9Var3 != null ? yz9Var3.getValue().a : ava.b);
        return g2b.a;
    }
}
