package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1", f = "PageFetcherSnapshotState.kt", l = {}, m = "invokeSuspend", v = 1)
public final class ip7 extends p6a implements ci4<s54<? super Integer>, r02<? super g2b>, Object> {
    public final /* synthetic */ hp7<Object, Object> t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip7(hp7<Object, Object> hp7Var, r02<? super ip7> r02Var) {
        super(2, r02Var);
        this.t = hp7Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new ip7(this.t, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(s54<? super Integer> s54Var, r02<? super g2b> r02Var) {
        return ((ip7) create(s54Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        this.t.f.n(new Integer(0));
        return g2b.a;
    }
}
