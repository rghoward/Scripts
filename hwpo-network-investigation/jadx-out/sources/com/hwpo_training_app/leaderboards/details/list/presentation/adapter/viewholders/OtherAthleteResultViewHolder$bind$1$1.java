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
@xm2(c = "com.hwpo_training_app.leaderboards.details.list.presentation.adapter.viewholders.OtherAthleteResultViewHolder$bind$1$1", f = "AthleteResultsViewHolders.kt", l = {}, m = "invokeSuspend", v = 2)
final class OtherAthleteResultViewHolder$bind$1$1 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ OtherAthleteResultViewHolder t;
    public final /* synthetic */ AthleteResultUiEntity.OtherAthleteResultUiEntity u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtherAthleteResultViewHolder$bind$1$1(OtherAthleteResultViewHolder otherAthleteResultViewHolder, AthleteResultUiEntity.OtherAthleteResultUiEntity otherAthleteResultUiEntity, r02<? super OtherAthleteResultViewHolder$bind$1$1> r02Var) {
        super(3, r02Var);
        this.t = otherAthleteResultViewHolder;
        this.u = otherAthleteResultUiEntity;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new OtherAthleteResultViewHolder$bind$1$1(this.t, this.u, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        this.t.y.invoke(this.u);
        return g2b.a;
    }
}
