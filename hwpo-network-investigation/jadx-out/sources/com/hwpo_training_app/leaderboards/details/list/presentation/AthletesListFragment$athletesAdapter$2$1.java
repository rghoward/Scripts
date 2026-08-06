package com.hwpo_training_app.leaderboards.details.list.presentation;

import com.hwpo_training_app.leaderboards.details.list.presentation.entity.AthleteResultUiEntity;
import com.intercom.twig.BuildConfig;
import defpackage.g2b;
import defpackage.hf3;
import defpackage.oh4;
import defpackage.pi4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AthletesListFragment$athletesAdapter$2$1 extends pi4 implements oh4<AthleteResultUiEntity, g2b> {
    @Override // defpackage.oh4
    public final g2b invoke(AthleteResultUiEntity athleteResultUiEntity) {
        boolean z;
        String str;
        List list;
        AthleteResultUiEntity athleteResultUiEntity2 = athleteResultUiEntity;
        athleteResultUiEntity2.getClass();
        AthletesListViewModel athletesListViewModel = (AthletesListViewModel) this.receiver;
        athletesListViewModel.getClass();
        boolean z2 = athleteResultUiEntity2 instanceof AthleteResultUiEntity.OtherAthleteResultUiEntity;
        AthleteResultUiEntity.OtherAthleteResultUiEntity otherAthleteResultUiEntity = z2 ? (AthleteResultUiEntity.OtherAthleteResultUiEntity) athleteResultUiEntity2 : null;
        if (otherAthleteResultUiEntity == null) {
            AthleteResultUiEntity.MyFilledResultUiEntity myFilledResultUiEntity = athleteResultUiEntity2 instanceof AthleteResultUiEntity.MyFilledResultUiEntity ? (AthleteResultUiEntity.MyFilledResultUiEntity) athleteResultUiEntity2 : null;
            if (myFilledResultUiEntity != null) {
                z = myFilledResultUiEntity.j;
            }
            return g2b.a;
        }
        z = otherAthleteResultUiEntity.i;
        AthleteResultUiEntity.OtherAthleteResultUiEntity otherAthleteResultUiEntity2 = z2 ? (AthleteResultUiEntity.OtherAthleteResultUiEntity) athleteResultUiEntity2 : null;
        if (otherAthleteResultUiEntity2 == null || (str = otherAthleteResultUiEntity2.h) == null) {
            AthleteResultUiEntity.MyFilledResultUiEntity myFilledResultUiEntity2 = athleteResultUiEntity2 instanceof AthleteResultUiEntity.MyFilledResultUiEntity ? (AthleteResultUiEntity.MyFilledResultUiEntity) athleteResultUiEntity2 : null;
            str = myFilledResultUiEntity2 != null ? myFilledResultUiEntity2.i : null;
        }
        AthleteResultUiEntity.OtherAthleteResultUiEntity otherAthleteResultUiEntity3 = z2 ? (AthleteResultUiEntity.OtherAthleteResultUiEntity) athleteResultUiEntity2 : null;
        if (otherAthleteResultUiEntity3 == null || (list = otherAthleteResultUiEntity3.j) == null) {
            AthleteResultUiEntity.MyFilledResultUiEntity myFilledResultUiEntity3 = athleteResultUiEntity2 instanceof AthleteResultUiEntity.MyFilledResultUiEntity ? (AthleteResultUiEntity.MyFilledResultUiEntity) athleteResultUiEntity2 : null;
            list = myFilledResultUiEntity3 != null ? myFilledResultUiEntity3.k : hf3.t;
        }
        if (z) {
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            athletesListViewModel.f(new AthletesListEvents.ShowResultsDialog(str, list));
        }
        return g2b.a;
    }
}
