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
@xm2(c = "com.hwpo_training_app.leaderboards.details.list.presentation.adapter.viewholders.MyEmptyResultViewHolder$bind$1$2", f = "AthleteResultsViewHolders.kt", l = {}, m = "invokeSuspend", v = 2)
final class MyEmptyResultViewHolder$bind$1$2 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ MyEmptyResultViewHolder t;
    public final /* synthetic */ AthleteResultUiEntity.MyEmptyResultUiEntity u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyEmptyResultViewHolder$bind$1$2(MyEmptyResultViewHolder myEmptyResultViewHolder, AthleteResultUiEntity.MyEmptyResultUiEntity myEmptyResultUiEntity, r02<? super MyEmptyResultViewHolder$bind$1$2> r02Var) {
        super(3, r02Var);
        this.t = myEmptyResultViewHolder;
        this.u = myEmptyResultUiEntity;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new MyEmptyResultViewHolder$bind$1$2(this.t, this.u, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        this.t.v.invoke(this.u);
        return g2b.a;
    }
}
