package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.chat.common.presentation.adapter.delegate.FileAttachmentDelegateKt$fileAttachmentDelegate$2$2$1$3", f = "FileAttachmentDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zv3 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ ya<w60.a, ea6> t;
    public final /* synthetic */ zj1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv3(ya yaVar, zj1 zj1Var, r02 r02Var) {
        super(3, r02Var);
        this.t = yaVar;
        this.u = zj1Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new zv3(this.t, this.u, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        ya<w60.a, ea6> yaVar = this.t;
        if (yaVar.t().k == xc9.v) {
            this.u.invoke(yaVar.t());
        }
        return g2b.a;
    }
}
