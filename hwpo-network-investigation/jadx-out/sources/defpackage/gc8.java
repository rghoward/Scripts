package defpackage;

import android.animation.AnimatorSet;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.workouts.presentation.day_workouts.adapter.ProgramDelegateKt$programDelegate$2$1", f = "ProgramDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gc8 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ AnimatorSet t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc8(AnimatorSet animatorSet, r02<? super gc8> r02Var) {
        super(3, r02Var);
        this.t = animatorSet;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new gc8(this.t, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        this.t.start();
        return g2b.a;
    }
}
