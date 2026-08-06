package com.hwpo_training_app.leaderboards.details.list.presentation.entity;

import com.hwpo_training_app.R;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardTopValueModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardUserModel;
import defpackage.bu8;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AthleteResultUiEntityMapperKt {
    public static final int a(LeaderboardTopValueModel leaderboardTopValueModel, bu8 bu8Var) {
        int i;
        LeaderboardUserModel leaderboardUserModel = leaderboardTopValueModel.n;
        int i2 = leaderboardTopValueModel.e;
        boolean z = leaderboardUserModel.f;
        if (z && i2 == 0) {
            i = R.color.iconSecondaryDefault;
        } else if (!z || i2 == 0) {
            i = (z || i2 != 0) ? R.color.iconSecondaryActive : R.color.iconPrimaryDefault;
        } else {
            i = R.color.iconTertiaryActive;
        }
        return bu8Var.a(i);
    }

    public static final int b(LeaderboardTopValueModel leaderboardTopValueModel, bu8 bu8Var) {
        int i;
        LeaderboardUserModel leaderboardUserModel = leaderboardTopValueModel.n;
        int i2 = leaderboardTopValueModel.d;
        boolean z = leaderboardUserModel.f;
        if (z && i2 == 0) {
            i = R.color.iconSecondaryDefault;
        } else if (!z || i2 == 0) {
            i = (z || i2 != 0) ? R.color.iconSecondaryActive : R.color.iconPrimaryDefault;
        } else {
            i = R.color.iconTertiaryActive;
        }
        return bu8Var.a(i);
    }

    public static final String c(LeaderboardTopValueModel leaderboardTopValueModel, bu8 bu8Var) {
        int i = leaderboardTopValueModel.f;
        if (i == 1000) {
            return bu8Var.b(R.string.likes_count, Integer.valueOf(i));
        }
        return i > 1000 ? bu8Var.b(R.string.likes_count, Integer.valueOf(i / 1000)) : String.valueOf(i);
    }

    public static final int d(LeaderboardTopValueModel leaderboardTopValueModel, bu8 bu8Var) {
        int i;
        boolean z = leaderboardTopValueModel.o;
        boolean z2 = leaderboardTopValueModel.n.f;
        if (z && z2) {
            i = R.color.iconTertiaryActive;
        } else if (z && !z2) {
            i = R.color.iconPrimaryActive;
        } else if (z || !z2) {
            i = (z || z2) ? R.color.heather : R.color.iconPrimaryDefault;
        } else {
            i = R.color.iconSecondaryDefault;
        }
        return bu8Var.a(i);
    }
}
