package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1", f = "PageFetcherSnapshot.kt", l = {647, 660, 126, 672, 129, 684, 697, 126, 709, 129, 721, 734, 126, 746, 129, 758}, m = "emit", v = 1)
public final class dp7 extends u02 {
    public uo7 A;
    public /* synthetic */ Object B;
    public final /* synthetic */ cp7.c.a<Object> C;
    public int D;
    public Object t;
    public Object u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp7(cp7.c.a<Object> aVar, r02<? super dp7> r02Var) {
        super(r02Var);
        this.C = aVar;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(this);
    }
}
