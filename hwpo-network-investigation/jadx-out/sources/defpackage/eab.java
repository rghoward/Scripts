package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.value_details.ValueDetailsViewModel$requestScoreInfo$3", f = "ValueDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class eab extends p6a implements ci4<t59, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ o9b u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eab(o9b o9bVar, r02<? super eab> r02Var) {
        super(2, r02Var);
        this.u = o9bVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        eab eabVar = new eab(this.u, r02Var);
        eabVar.t = obj;
        return eabVar;
    }

    @Override // defpackage.ci4
    public final Object invoke(t59 t59Var, r02<? super g2b> r02Var) {
        return ((eab) create(t59Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        t59 t59Var = (t59) this.t;
        dv8.b(obj);
        d8b.m mVar = new d8b.m(t59Var);
        int i = o9b.m0;
        this.u.e(mVar);
        return g2b.a;
    }
}
