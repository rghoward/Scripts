package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {119}, m = "invokeSuspend", v = 1)
public final class s91 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ s54<Object> v;
    public final /* synthetic */ u91<Object> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s91(s54<Object> s54Var, u91<Object> u91Var, r02<? super s91> r02Var) {
        super(2, r02Var);
        this.v = s54Var;
        this.w = u91Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        s91 s91Var = new s91(this.v, this.w, r02Var);
        s91Var.u = obj;
        return s91Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((s91) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        t72 t72Var = (t72) this.u;
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            tj8<Object> tj8VarL = this.w.l(t72Var);
            this.u = null;
            this.t = 1;
            Object objA = e64.a(this.v, tj8VarL, true, this);
            Object obj2 = v72.t;
            if (objA != obj2) {
                objA = g2b.a;
            }
            if (objA == obj2) {
                return obj2;
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
