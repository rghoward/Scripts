package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {66}, m = "invokeSuspend", v = 1)
public final class rb5 extends p6a implements oh4<r02<Object>, Object> {
    public int t;

    @Override // defpackage.ak0
    public final r02<g2b> create(r02<?> r02Var) {
        return new rb5(1, r02Var);
    }

    @Override // defpackage.oh4
    public final Object invoke(r02<Object> r02Var) {
        return ((rb5) create(r02Var)).invokeSuspend(g2b.a);
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
        this.t = 1;
        Object objU = zx6.a(getContext()).u(lq.a.u, this);
        v72 v72Var = v72.t;
        return objU == v72Var ? v72Var : objU;
    }
}
