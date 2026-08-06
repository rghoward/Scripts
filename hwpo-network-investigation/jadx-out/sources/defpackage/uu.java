package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uu extends wp5 implements oh4<Integer, Integer> {
    public final /* synthetic */ su<Object> u;
    public final /* synthetic */ oh4<Integer, Integer> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public uu(su<Object> suVar, oh4<? super Integer, Integer> oh4Var) {
        super(1);
        this.u = suVar;
        this.v = oh4Var;
    }

    @Override // defpackage.oh4
    public final Integer invoke(Integer num) {
        int iIntValue = num.intValue();
        su<Object> suVar = this.u;
        yz9<kg5> yz9VarD = suVar.d.d(suVar.a.d.getValue());
        long j = yz9VarD != null ? yz9VarD.getValue().a : 0L;
        long j2 = iIntValue;
        return this.v.invoke(Integer.valueOf((-((int) (suVar.b.a((j2 << 32) | (j2 & 4294967295L), j, tq5.t) & 4294967295L))) + ((int) (j & 4294967295L))));
    }
}
