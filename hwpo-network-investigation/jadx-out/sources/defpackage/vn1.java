package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.comments.presentation.CommentsViewModel$listenInputField$1", f = "CommentsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class vn1 extends p6a implements ci4<String, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ qn1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn1(qn1 qn1Var, r02<? super vn1> r02Var) {
        super(2, r02Var);
        this.u = qn1Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        vn1 vn1Var = new vn1(this.u, r02Var);
        vn1Var.t = obj;
        return vn1Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(String str, r02<? super g2b> r02Var) {
        return ((vn1) create(str, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str = (String) this.t;
        dv8.b(obj);
        qn1.a.g gVar = new qn1.a.g(str);
        int i = qn1.a0;
        this.u.e(gVar);
        return g2b.a;
    }
}
