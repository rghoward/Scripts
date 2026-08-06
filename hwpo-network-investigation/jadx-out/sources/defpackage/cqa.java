package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.sessions.presentation.sessions_list.adapter.TodayTipsDelegateKt$todayTipsDelegate$2$1", f = "TodayTipsDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
public final class cqa extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ ya<zpa, pa6> t;
    public final /* synthetic */ hi9.d u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqa(ya yaVar, hi9.d dVar, r02 r02Var) {
        super(3, r02Var);
        this.t = yaVar;
        this.u = dVar;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new cqa(this.t, this.u, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        w60 w60Var = this.t.t().w;
        if (w60Var != null) {
            this.u.invoke(w60Var);
        }
        return g2b.a;
    }
}
