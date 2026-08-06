package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.youtube_player.presentation.YoutubePlayerFragment$initView$1$1", f = "YoutubePlayerFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ctb extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ btb t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctb(btb btbVar, r02<? super ctb> r02Var) {
        super(3, r02Var);
        this.t = btbVar;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new ctb(this.t, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        this.t.k(false, false);
        return g2b.a;
    }
}
