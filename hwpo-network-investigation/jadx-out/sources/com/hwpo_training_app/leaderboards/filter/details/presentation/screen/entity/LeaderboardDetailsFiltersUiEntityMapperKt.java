package com.hwpo_training_app.leaderboards.filter.details.presentation.screen.entity;

import com.hwpo_training_app.leaderboards.filter.details.domain.entity.LeaderboardDetailsFiltersModel;
import com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersViewState;
import com.hwpo_training_app.leaderboards.filter.presentation.ExtensionsKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardDetailsFiltersUiEntityMapperKt {
    public static final LeaderboardDetailsFiltersViewState a(LeaderboardDetailsFiltersModel leaderboardDetailsFiltersModel, boolean z) {
        leaderboardDetailsFiltersModel.getClass();
        boolean z2 = leaderboardDetailsFiltersModel.c;
        boolean z3 = leaderboardDetailsFiltersModel.b;
        boolean z4 = leaderboardDetailsFiltersModel.a;
        Integer num = leaderboardDetailsFiltersModel.e;
        Integer num2 = leaderboardDetailsFiltersModel.d;
        boolean z5 = (num2 == null && num == null) ? false : true;
        Boolean bool = leaderboardDetailsFiltersModel.g;
        ScoreStatusCheckboxesStateUiEntity scoreStatusCheckboxesStateUiEntity = bool == null ? null : new ScoreStatusCheckboxesStateUiEntity(bool.booleanValue());
        return new LeaderboardDetailsFiltersViewState(new GenderCheckboxesStateUiEntity(z4, z3, z2), scoreStatusCheckboxesStateUiEntity, new AgeRangeStateUiEntity(num2 != null ? String.valueOf(num2.intValue()) : null, num != null ? String.valueOf(num.intValue()) : null, z5), ExtensionsKt.b(leaderboardDetailsFiltersModel.h, z, leaderboardDetailsFiltersModel.i), scoreStatusCheckboxesStateUiEntity != null, (z4 && z3 && z2 && !z5) ? false : true);
    }
}
