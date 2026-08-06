package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", l = {551}, m = "invokeSuspend", v = 1)
public final class er7 extends p6a implements ci4<t69, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ dr7 u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er7(dr7 dr7Var, int i, r02 r02Var) {
        super(2, r02Var);
        this.u = dr7Var;
        this.v = i;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new er7(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t69 t69Var, r02<? super g2b> r02Var) {
        return ((er7) create(t69Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        dr7 dr7Var = this.u;
        if (i == 0) {
            dv8.b(obj);
            this.t = 1;
            Object objI = dr7Var.i(this);
            v72 v72Var = v72.t;
            if (objI == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        dr7Var.u(0.0f, dr7Var.j(this.v), true);
        return g2b.a;
    }
}
