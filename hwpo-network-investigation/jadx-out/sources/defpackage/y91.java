package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {148}, m = "invokeSuspend", v = 1)
public final class y91 extends p6a implements ci4<s54<Object>, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ z91<Object, Object> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y91(z91<Object, Object> z91Var, r02<? super y91> r02Var) {
        super(2, r02Var);
        this.v = z91Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        y91 y91Var = new y91(this.v, r02Var);
        y91Var.u = obj;
        return y91Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(s54<Object> s54Var, r02<? super g2b> r02Var) {
        return ((y91) create(s54Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        s54<? super Object> s54Var = (s54) this.u;
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            this.u = null;
            this.t = 1;
            Object objM = this.v.m(s54Var, this);
            v72 v72Var = v72.t;
            if (objM == v72Var) {
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
