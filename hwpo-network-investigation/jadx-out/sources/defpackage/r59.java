package defpackage;

import android.view.View;
import com.hwpo_training_app.tracking.presentation.widget.ScoreInfoExpandableLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.widget.ScoreInfoExpandableLayout$initListeners$1$1", f = "ScoreInfoExpandableLayout.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r59 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ ScoreInfoExpandableLayout t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r59(ScoreInfoExpandableLayout scoreInfoExpandableLayout, r02<? super r59> r02Var) {
        super(3, r02Var);
        this.t = scoreInfoExpandableLayout;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new r59(this.t, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        mh4<g2b> onExpandActionClick = this.t.getOnExpandActionClick();
        if (onExpandActionClick != null) {
            onExpandActionClick.invoke();
        }
        return g2b.a;
    }
}
