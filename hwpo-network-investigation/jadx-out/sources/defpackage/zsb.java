package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.hwpo_library.presentation.adapter.delegate.YoutubeAttachmentDelegateKt$youtubeAttachmentDelegate$2$1", f = "YoutubeAttachmentDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zsb extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ vo6.c t;
    public final /* synthetic */ ya<x60.d, da6> u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsb(vo6.c cVar, ya yaVar, r02 r02Var) {
        super(3, r02Var);
        this.t = cVar;
        this.u = yaVar;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new zsb(this.t, this.u, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        this.t.invoke(this.u.t());
        return g2b.a;
    }
}
