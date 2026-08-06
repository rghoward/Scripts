package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.entry_details.challenge.ChallengeEntryDetailsViewModel$listenScoreUpdates$1", f = "ChallengeEntryDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l71 extends p6a implements ci4<js7<? extends Integer, ? extends bd8>, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ w71 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l71(w71 w71Var, r02<? super l71> r02Var) {
        super(2, r02Var);
        this.u = w71Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        l71 l71Var = new l71(this.u, r02Var);
        l71Var.t = obj;
        return l71Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(js7<? extends Integer, ? extends bd8> js7Var, r02<? super g2b> r02Var) {
        return ((l71) create(js7Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        js7 js7Var = (js7) this.t;
        dv8.b(obj);
        int iIntValue = ((Number) js7Var.t).intValue();
        bd8 bd8Var = (bd8) js7Var.u;
        int i = w71.O;
        w71 w71Var = this.u;
        d71 d71Var = w71Var.b().d;
        if (d71Var == null) {
            return g2b.a;
        }
        if (iIntValue != d71Var.a) {
            return g2b.a;
        }
        zc8 zc8VarA = w71Var.A.a(bd8Var);
        List<String> list = bd8Var.h;
        w71Var.e(new n61.b(d71.a(d71Var, cy.b(zc8VarA), cy.b(zc8VarA), false, false, false, zc8VarA.B, null, list, zc8VarA, null, null, null, 29415)));
        return g2b.a;
    }
}
