package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {56}, m = "invokeSuspend", v = 1)
public final class t91 extends p6a implements ci4<ua8<Object>, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ u91<Object> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t91(u91<Object> u91Var, r02<? super t91> r02Var) {
        super(2, r02Var);
        this.v = u91Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        t91 t91Var = new t91(this.v, r02Var);
        t91Var.u = obj;
        return t91Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(ua8<Object> ua8Var, r02<? super g2b> r02Var) {
        return ((t91) create(ua8Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        ua8<? super Object> ua8Var = (ua8) this.u;
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            this.u = null;
            this.t = 1;
            Object objI = this.v.i(ua8Var, this);
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
        return g2b.a;
    }
}
