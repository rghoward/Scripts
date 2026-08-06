package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.entry_details.challenge.ChallengeEntryDetailsViewModel$observeTrackingActions$2", f = "ChallengeEntryDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p71 extends p6a implements ci4<xd3<? extends Exception, ? extends rsa>, r02<? super g2b>, Object> {
    public final /* synthetic */ w71 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p71(w71 w71Var, r02<? super p71> r02Var) {
        super(2, r02Var);
        this.t = w71Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new p71(this.t, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(xd3<? extends Exception, ? extends rsa> xd3Var, r02<? super g2b> r02Var) {
        return ((p71) create(xd3Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        this.t.x.a();
        return g2b.a;
    }
}
