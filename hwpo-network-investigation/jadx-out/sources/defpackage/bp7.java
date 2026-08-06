package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {648, 660, 422, 431, 682, 724, 484, 746, 508, 534, 758}, m = "doLoad", v = 1)
public final class bp7 extends u02 {
    public Object A;
    public Object B;
    public a47 C;
    public /* synthetic */ Object D;
    public final /* synthetic */ uo7<Object, Object> E;
    public int F;
    public wb6 t;
    public hk4 u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp7(uo7<Object, Object> uo7Var, r02<? super bp7> r02Var) {
        super(r02Var);
        this.E = uo7Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return uo7.b(this.E, null, null, this);
    }
}
