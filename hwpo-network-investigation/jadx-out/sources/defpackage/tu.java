package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tu extends wp5 implements oh4<Integer, Integer> {
    public final /* synthetic */ oh4<Integer, Integer> u;
    public final /* synthetic */ su<Object> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu(su suVar, oh4 oh4Var) {
        super(1);
        this.u = oh4Var;
        this.v = suVar;
    }

    @Override // defpackage.oh4
    public final Integer invoke(Integer num) {
        int iIntValue = num.intValue();
        su<Object> suVar = this.v;
        long j = iIntValue;
        return this.u.invoke(Integer.valueOf(((int) (su.g(suVar) & 4294967295L)) - ((int) (suVar.b.a((j << 32) | (j & 4294967295L), su.g(suVar), tq5.t) & 4294967295L))));
    }
}
