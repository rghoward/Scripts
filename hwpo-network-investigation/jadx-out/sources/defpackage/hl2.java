package defpackage;

import android.view.View;
import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.core.presentation.horizontal_calendar.adapter.day.DayDelegateKt$dayDelegate$2$1", f = "DayDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
public final class hl2 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ oh4<LocalDate, g2b> t;
    public final /* synthetic */ ya<zl2, sq5> u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hl2(oh4<? super LocalDate, g2b> oh4Var, ya<zl2, sq5> yaVar, r02<? super hl2> r02Var) {
        super(3, r02Var);
        this.t = oh4Var;
        this.u = yaVar;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new hl2(this.t, this.u, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        this.t.invoke(this.u.t().a);
        return g2b.a;
    }
}
