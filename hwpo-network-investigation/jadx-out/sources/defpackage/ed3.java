package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.edit_performance.presentation.EditPerformanceViewModel$onNotesTextChangedFlow$1", f = "EditPerformanceViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ed3 extends p6a implements ci4<String, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ pc3 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed3(pc3 pc3Var, r02<? super ed3> r02Var) {
        super(2, r02Var);
        this.u = pc3Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        ed3 ed3Var = new ed3(this.u, r02Var);
        ed3Var.t = obj;
        return ed3Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(String str, r02<? super g2b> r02Var) {
        return ((ed3) create(str, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str = (String) this.t;
        dv8.b(obj);
        pc3.a.d dVar = new pc3.a.d(str);
        pc3.b bVar = pc3.Companion;
        this.u.e(dVar);
        return g2b.a;
    }
}
