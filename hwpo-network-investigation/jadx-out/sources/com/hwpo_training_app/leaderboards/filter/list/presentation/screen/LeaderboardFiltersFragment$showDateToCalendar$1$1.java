package com.hwpo_training_app.leaderboards.filter.list.presentation.screen;

import com.hwpo_training_app.leaderboards.filter.list.domain.entity.LeaderboardFiltersModel;
import defpackage.g2b;
import defpackage.oh4;
import defpackage.pi4;
import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class LeaderboardFiltersFragment$showDateToCalendar$1$1 extends pi4 implements oh4<LocalDate, g2b> {
    @Override // defpackage.oh4
    public final g2b invoke(LocalDate localDate) {
        LocalDate localDate2 = localDate;
        localDate2.getClass();
        LeaderboardFiltersViewModel leaderboardFiltersViewModel = (LeaderboardFiltersViewModel) this.receiver;
        leaderboardFiltersViewModel.getClass();
        leaderboardFiltersViewModel.C = LeaderboardFiltersModel.d(leaderboardFiltersViewModel.C, false, false, null, localDate2, null, null, false, null, null, false, 8127);
        leaderboardFiltersViewModel.g();
        return g2b.a;
    }
}
