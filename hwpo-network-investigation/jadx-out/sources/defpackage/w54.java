package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", l = {47}, m = "invokeSuspend", v = 1)
public final class w54 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ ei4<t72, s54<Object>, r02<? super g2b>, Object> v;
    public final /* synthetic */ s54<Object> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w54(ei4<? super t72, ? super s54<Object>, ? super r02<? super g2b>, ? extends Object> ei4Var, s54<Object> s54Var, r02<? super w54> r02Var) {
        super(2, r02Var);
        this.v = ei4Var;
        this.w = s54Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        w54 w54Var = new w54(this.v, this.w, r02Var);
        w54Var.u = obj;
        return w54Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((w54) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        t72 t72Var = (t72) this.u;
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            this.u = null;
            this.t = 1;
            Object objInvoke = this.v.invoke(t72Var, this.w, this);
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
