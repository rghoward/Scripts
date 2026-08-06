package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "androidx.paging.Pager$flow$2", f = "Pager.kt", l = {}, m = "invokeSuspend", v = 1)
public final class op7 extends p6a implements oh4<r02<? super zr7<Object, Object>>, Object> {
    public final /* synthetic */ mh4<zr7<Object, Object>> t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public op7(mh4<? extends zr7<Object, Object>> mh4Var, r02<? super op7> r02Var) {
        super(1, r02Var);
        this.t = mh4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(r02<?> r02Var) {
        return new op7(this.t, r02Var);
    }

    @Override // defpackage.oh4
    public final Object invoke(r02<? super zr7<Object, Object>> r02Var) {
        return ((op7) create(r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        return this.t.invoke();
    }
}
