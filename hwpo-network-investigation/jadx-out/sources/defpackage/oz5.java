package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", l = {}, m = "invokeSuspend", v = 1)
public final class oz5 extends p6a implements ci4<t69, r02<? super g2b>, Object> {
    public final /* synthetic */ nz5 t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz5(nz5 nz5Var, int i, r02 r02Var) {
        super(2, r02Var);
        this.t = nz5Var;
        this.u = i;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new oz5(this.t, this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t69 t69Var, r02<? super g2b> r02Var) {
        return ((oz5) create(t69Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        this.t.l(this.u, 0);
        return g2b.a;
    }
}
