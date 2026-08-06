package com.hwpo_training_app.leaderboards.details.list.presentation;

import com.hwpo_training_app.leaderboards.details.list.presentation.entity.AthleteResultUiEntity;
import defpackage.g2b;
import defpackage.oh4;
import defpackage.oy0;
import defpackage.pi4;
import defpackage.rhb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AthletesListFragment$athletesAdapter$2$2 extends pi4 implements oh4<AthleteResultUiEntity, g2b> {
    public final void e(AthleteResultUiEntity athleteResultUiEntity) {
        boolean z;
        athleteResultUiEntity.getClass();
        AthletesListViewModel athletesListViewModel = (AthletesListViewModel) this.receiver;
        athletesListViewModel.getClass();
        AthleteResultUiEntity.OtherAthleteResultUiEntity otherAthleteResultUiEntity = athleteResultUiEntity instanceof AthleteResultUiEntity.OtherAthleteResultUiEntity ? (AthleteResultUiEntity.OtherAthleteResultUiEntity) athleteResultUiEntity : null;
        if (otherAthleteResultUiEntity != null) {
            z = otherAthleteResultUiEntity.k;
        } else {
            AthleteResultUiEntity.MyFilledResultUiEntity myFilledResultUiEntity = athleteResultUiEntity instanceof AthleteResultUiEntity.MyFilledResultUiEntity ? (AthleteResultUiEntity.MyFilledResultUiEntity) athleteResultUiEntity : null;
            if (myFilledResultUiEntity == null) {
                return;
            } else {
                z = myFilledResultUiEntity.l;
            }
        }
        oy0.d(rhb.b(athletesListViewModel), null, null, new AthletesListViewModel$onLikeClicked$1(athletesListViewModel, athleteResultUiEntity, z, null), 3);
    }

    @Override // defpackage.oh4
    public final /* bridge */ /* synthetic */ g2b invoke(AthleteResultUiEntity athleteResultUiEntity) {
        e(athleteResultUiEntity);
        return g2b.a;
    }
}
