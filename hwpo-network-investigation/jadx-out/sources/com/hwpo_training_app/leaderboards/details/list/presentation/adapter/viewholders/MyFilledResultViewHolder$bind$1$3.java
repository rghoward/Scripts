package com.hwpo_training_app.leaderboards.details.list.presentation.adapter.viewholders;

import android.view.View;
import com.hwpo_training_app.leaderboards.details.list.presentation.entity.AthleteResultUiEntity;
import defpackage.dv8;
import defpackage.ei4;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.details.list.presentation.adapter.viewholders.MyFilledResultViewHolder$bind$1$3", f = "AthleteResultsViewHolders.kt", l = {}, m = "invokeSuspend", v = 2)
final class MyFilledResultViewHolder$bind$1$3 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ MyFilledResultViewHolder t;
    public final /* synthetic */ AthleteResultUiEntity.MyFilledResultUiEntity u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyFilledResultViewHolder$bind$1$3(MyFilledResultViewHolder myFilledResultViewHolder, AthleteResultUiEntity.MyFilledResultUiEntity myFilledResultUiEntity, r02<? super MyFilledResultViewHolder$bind$1$3> r02Var) {
        super(3, r02Var);
        this.t = myFilledResultViewHolder;
        this.u = myFilledResultUiEntity;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new MyFilledResultViewHolder$bind$1$3(this.t, this.u, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        this.t.w.invoke(this.u);
        return g2b.a;
    }
}
