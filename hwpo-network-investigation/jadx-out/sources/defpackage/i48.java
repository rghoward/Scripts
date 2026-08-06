package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.player.presentation.PlayerViewModel$getCurrentLanguage$4", f = "PlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i48 extends p6a implements ci4<s10, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ k48 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i48(k48 k48Var, r02<? super i48> r02Var) {
        super(2, r02Var);
        this.u = k48Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        i48 i48Var = new i48(this.u, r02Var);
        i48Var.t = obj;
        return i48Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(s10 s10Var, r02<? super g2b> r02Var) {
        return ((i48) create(s10Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        s10 s10Var = (s10) this.t;
        dv8.b(obj);
        t28.a aVar = new t28.a(s10Var);
        int i = k48.D;
        this.u.e(aVar);
        return g2b.a;
    }
}
