package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.core.widget.performance_view.adapter.PerformanceMediaAttachmentDelegateKt$performanceMediaAttachmentDelegate$2$1$1$1", f = "PerformanceMediaAttachmentDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wv7 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ zv7 t;
    public final /* synthetic */ ya<l89, ia6> u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv7(zv7 zv7Var, ya yaVar, r02 r02Var) {
        super(3, r02Var);
        this.t = zv7Var;
        this.u = yaVar;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new wv7(this.t, this.u, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        this.t.invoke(this.u.t());
        return g2b.a;
    }
}
