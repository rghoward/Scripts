package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1", f = "CancelableChannelFlow.kt", l = {31}, m = "invokeSuspend", v = 1)
public final class z31 extends p6a implements ci4<np9<Object>, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ gl5 v;
    public final /* synthetic */ ci4<np9<Object>, r02<? super g2b>, Object> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z31(gl5 gl5Var, ci4 ci4Var, r02 r02Var) {
        super(2, r02Var);
        this.v = gl5Var;
        this.w = ci4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        z31 z31Var = new z31(this.v, this.w, r02Var);
        z31Var.u = obj;
        return z31Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(np9<Object> np9Var, r02<? super g2b> r02Var) {
        return ((z31) create(np9Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            np9<Object> np9Var = (np9) this.u;
            this.v.j0(new y31(0, np9Var));
            this.t = 1;
            Object objInvoke = this.w.invoke(np9Var, this);
            v72 v72Var = v72.t;
            if (objInvoke == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}
