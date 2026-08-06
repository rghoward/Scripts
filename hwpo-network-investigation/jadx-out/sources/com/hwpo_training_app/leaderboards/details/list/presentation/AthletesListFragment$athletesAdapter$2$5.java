package com.hwpo_training_app.leaderboards.details.list.presentation;

import com.hwpo_training_app.leaderboards.details.list.presentation.entity.AthleteResultUiEntity;
import defpackage.g2b;
import defpackage.oh4;
import defpackage.oy0;
import defpackage.pi4;
import defpackage.rhb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AthletesListFragment$athletesAdapter$2$5 extends pi4 implements oh4<AthleteResultUiEntity.OtherAthleteResultUiEntity, g2b> {
    public final void e(AthleteResultUiEntity.OtherAthleteResultUiEntity otherAthleteResultUiEntity) {
        otherAthleteResultUiEntity.getClass();
        AthletesListViewModel athletesListViewModel = (AthletesListViewModel) this.receiver;
        athletesListViewModel.getClass();
        oy0.d(rhb.b(athletesListViewModel), null, null, new AthletesListViewModel$onEyeClicked$1(otherAthleteResultUiEntity, athletesListViewModel, null), 3);
    }

    @Override // defpackage.oh4
    public final /* bridge */ /* synthetic */ g2b invoke(AthleteResultUiEntity.OtherAthleteResultUiEntity otherAthleteResultUiEntity) {
        e(otherAthleteResultUiEntity);
        return g2b.a;
    }
}
