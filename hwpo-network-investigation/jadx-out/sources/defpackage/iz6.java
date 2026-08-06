package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2", f = "MouseWheelScrollingLogic.kt", l = {201}, m = "invokeSuspend", v = 1)
public final class iz6 extends p6a implements ci4<t72, r02<? super dz6.a>, Object> {
    public int t;
    public final /* synthetic */ dz6 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz6(dz6 dz6Var, r02<? super iz6> r02Var) {
        super(2, r02Var);
        this.u = dz6Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new iz6(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super dz6.a> r02Var) {
        return ((iz6) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i != 0) {
            if (i == 1) {
                dv8.b(obj);
                return obj;
            }
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        zx0 zx0Var = this.u.g;
        this.t = 1;
        Object objD = u72.d(new fc7(zx0Var, null), this);
        v72 v72Var = v72.t;
        return objD == v72Var ? v72Var : objD;
    }
}
