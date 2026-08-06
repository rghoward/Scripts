package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.comments.presentation.CommentsViewModel$onCommentStopLoadingClick$1", f = "CommentsViewModel.kt", l = {346}, m = "invokeSuspend", v = 2)
public final class co1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ qn1 u;
    public final /* synthetic */ sk1 v;
    public final /* synthetic */ w60 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co1(qn1 qn1Var, sk1 sk1Var, w60 w60Var, r02<? super co1> r02Var) {
        super(2, r02Var);
        this.u = qn1Var;
        this.v = sk1Var;
        this.w = w60Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new co1(this.u, this.v, this.w, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((co1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            qn1 qn1Var = this.u;
            hn8 hn8Var = qn1Var.E;
            hn8.a aVar = new hn8.a(qn1Var.U, this.v.a(), this.w.b());
            this.t = 1;
            hn8Var.getClass();
            Object objB = g5b.b(hn8Var, aVar, this);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
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
