package com.hwpo_training_app.leaderboards.details.list.presentation;

import com.hwpo_training_app.leaderboards.details.list.presentation.entity.AthleteResultUiEntity;
import com.intercom.twig.BuildConfig;
import defpackage.g2b;
import defpackage.oh4;
import defpackage.oy0;
import defpackage.pi4;
import defpackage.rhb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AthletesListFragment$athletesAdapter$2$3 extends pi4 implements oh4<AthleteResultUiEntity, g2b> {
    public final void e(AthleteResultUiEntity athleteResultUiEntity) {
        int i;
        String str;
        athleteResultUiEntity.getClass();
        AthletesListViewModel athletesListViewModel = (AthletesListViewModel) this.receiver;
        athletesListViewModel.getClass();
        boolean z = athleteResultUiEntity instanceof AthleteResultUiEntity.OtherAthleteResultUiEntity;
        if (z) {
            i = ((AthleteResultUiEntity.OtherAthleteResultUiEntity) athleteResultUiEntity).m;
        } else {
            i = athleteResultUiEntity instanceof AthleteResultUiEntity.MyFilledResultUiEntity ? ((AthleteResultUiEntity.MyFilledResultUiEntity) athleteResultUiEntity).m : 0;
        }
        int i2 = i;
        if (z) {
            str = ((AthleteResultUiEntity.OtherAthleteResultUiEntity) athleteResultUiEntity).h;
        } else {
            str = athleteResultUiEntity instanceof AthleteResultUiEntity.MyFilledResultUiEntity ? ((AthleteResultUiEntity.MyFilledResultUiEntity) athleteResultUiEntity).i : null;
        }
        int i3 = athletesListViewModel.E;
        int iA = athleteResultUiEntity.a();
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        oy0.d(rhb.b(athletesListViewModel), null, null, new AthletesListViewModel$goToLeaderboardValueComments$1(athletesListViewModel, i3, iA, str, i2, null), 3);
    }

    @Override // defpackage.oh4
    public final /* bridge */ /* synthetic */ g2b invoke(AthleteResultUiEntity athleteResultUiEntity) {
        e(athleteResultUiEntity);
        return g2b.a;
    }
}
