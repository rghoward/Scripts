package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.comments.presentation.CommentsViewModel$onLeaderboardValueHeaderClicked$1", f = "CommentsViewModel.kt", l = {203}, m = "invokeSuspend", v = 2)
public final class do1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ qn1 u;
    public final /* synthetic */ am1.b.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public do1(qn1 qn1Var, am1.b.a aVar, r02<? super do1> r02Var) {
        super(2, r02Var);
        this.u = qn1Var;
        this.v = aVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new do1(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((do1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            dm9 dm9Var = this.u.L;
            a87.d dVar = new a87.d(this.v.u);
            this.t = 1;
            Object objA = dm9Var.a(dVar, this);
            v72 v72Var = v72.t;
            if (objA == v72Var) {
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
