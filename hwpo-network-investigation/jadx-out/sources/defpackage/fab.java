package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.value_details.ValueDetailsViewModel$requestScoreInfo$4", f = "ValueDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class fab extends p6a implements ci4<Exception, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ o9b u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fab(o9b o9bVar, r02<? super fab> r02Var) {
        super(2, r02Var);
        this.u = o9bVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        fab fabVar = new fab(this.u, r02Var);
        fabVar.t = obj;
        return fabVar;
    }

    @Override // defpackage.ci4
    public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
        return ((fab) create(exc, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Exception exc = (Exception) this.t;
        dv8.b(obj);
        o9b.g(this.u, exc, c13.v);
        return g2b.a;
    }
}
