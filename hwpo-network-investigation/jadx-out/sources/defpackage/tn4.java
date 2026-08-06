package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.sessions.presentation.sessions_list.adapter.GoWodDelegateKt$goWodDelegate$2$2", f = "GoWodDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
public final class tn4 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ hi9.c t;
    public final /* synthetic */ ya<un4, w96> u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn4(hi9.c cVar, ya yaVar, r02 r02Var) {
        super(3, r02Var);
        this.t = cVar;
        this.u = yaVar;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new tn4(this.t, this.u, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        ya<un4, w96> yaVar = this.u;
        this.t.invoke(new Integer(yaVar.t().t), Boolean.valueOf(yaVar.t().u));
        return g2b.a;
    }
}
