package com.hwpo_training_app.leaderboards.filter.details.presentation.screen;

import com.hwpo_training_app.leaderboards.filter.details.presentation.screen.entity.AgeRangeStateUiEntity;
import com.hwpo_training_app.leaderboards.filter.details.presentation.screen.entity.GenderCheckboxesStateUiEntity;
import com.hwpo_training_app.leaderboards.filter.details.presentation.screen.entity.ScoreStatusCheckboxesStateUiEntity;
import com.hwpo_training_app.leaderboards.filter.presentation.SelectedGymFilterUiEntity;
import defpackage.el0;
import defpackage.uo2;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardDetailsFiltersViewState implements el0 {
    public final GenderCheckboxesStateUiEntity a;
    public final ScoreStatusCheckboxesStateUiEntity b;
    public final AgeRangeStateUiEntity c;
    public final SelectedGymFilterUiEntity d;
    public final boolean e;
    public final boolean f;

    public LeaderboardDetailsFiltersViewState(GenderCheckboxesStateUiEntity genderCheckboxesStateUiEntity, ScoreStatusCheckboxesStateUiEntity scoreStatusCheckboxesStateUiEntity, AgeRangeStateUiEntity ageRangeStateUiEntity, SelectedGymFilterUiEntity selectedGymFilterUiEntity, boolean z, boolean z2) {
        selectedGymFilterUiEntity.getClass();
        this.a = genderCheckboxesStateUiEntity;
        this.b = scoreStatusCheckboxesStateUiEntity;
        this.c = ageRangeStateUiEntity;
        this.d = selectedGymFilterUiEntity;
        this.e = z;
        this.f = z2;
    }

    public static LeaderboardDetailsFiltersViewState a(LeaderboardDetailsFiltersViewState leaderboardDetailsFiltersViewState, GenderCheckboxesStateUiEntity genderCheckboxesStateUiEntity, ScoreStatusCheckboxesStateUiEntity scoreStatusCheckboxesStateUiEntity, AgeRangeStateUiEntity ageRangeStateUiEntity, SelectedGymFilterUiEntity selectedGymFilterUiEntity, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            genderCheckboxesStateUiEntity = leaderboardDetailsFiltersViewState.a;
        }
        GenderCheckboxesStateUiEntity genderCheckboxesStateUiEntity2 = genderCheckboxesStateUiEntity;
        if ((i & 2) != 0) {
            scoreStatusCheckboxesStateUiEntity = leaderboardDetailsFiltersViewState.b;
        }
        ScoreStatusCheckboxesStateUiEntity scoreStatusCheckboxesStateUiEntity2 = scoreStatusCheckboxesStateUiEntity;
        if ((i & 4) != 0) {
            ageRangeStateUiEntity = leaderboardDetailsFiltersViewState.c;
        }
        AgeRangeStateUiEntity ageRangeStateUiEntity2 = ageRangeStateUiEntity;
        if ((i & 8) != 0) {
            selectedGymFilterUiEntity = leaderboardDetailsFiltersViewState.d;
        }
        SelectedGymFilterUiEntity selectedGymFilterUiEntity2 = selectedGymFilterUiEntity;
        if ((i & 16) != 0) {
            z = leaderboardDetailsFiltersViewState.e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = leaderboardDetailsFiltersViewState.f;
        }
        leaderboardDetailsFiltersViewState.getClass();
        selectedGymFilterUiEntity2.getClass();
        return new LeaderboardDetailsFiltersViewState(genderCheckboxesStateUiEntity2, scoreStatusCheckboxesStateUiEntity2, ageRangeStateUiEntity2, selectedGymFilterUiEntity2, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardDetailsFiltersViewState)) {
            return false;
        }
        LeaderboardDetailsFiltersViewState leaderboardDetailsFiltersViewState = (LeaderboardDetailsFiltersViewState) obj;
        return this.a.equals(leaderboardDetailsFiltersViewState.a) && xj5.a(this.b, leaderboardDetailsFiltersViewState.b) && this.c.equals(leaderboardDetailsFiltersViewState.c) && xj5.a(this.d, leaderboardDetailsFiltersViewState.d) && this.e == leaderboardDetailsFiltersViewState.e && this.f == leaderboardDetailsFiltersViewState.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ScoreStatusCheckboxesStateUiEntity scoreStatusCheckboxesStateUiEntity = this.b;
        return Boolean.hashCode(this.f) + uo2.a((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (scoreStatusCheckboxesStateUiEntity == null ? 0 : Boolean.hashCode(scoreStatusCheckboxesStateUiEntity.a))) * 31)) * 31)) * 31, this.e, 31);
    }

    public final String toString() {
        return "LeaderboardDetailsFiltersViewState(genderCheckboxesState=" + this.a + ", scoreStatusCheckboxesState=" + this.b + ", ageRangeState=" + this.c + ", selectedGymFilter=" + this.d + ", isScoreStatusFilterVisible=" + this.e + ", isApplyButtonEnabled=" + this.f + ")";
    }
}
