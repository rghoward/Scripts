package com.hwpo_training_app.leaderboards.common.presentation.entity;

import com.hwpo_training_app.R;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardMeasureType;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardScoreResultModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.TimeCapModel;
import com.intercom.twig.BuildConfig;
import defpackage.a30;
import defpackage.bu8;
import defpackage.cj2;
import defpackage.u;
import defpackage.wk6;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardScoreResultUiEntityMapperKt {
    public static final DecimalFormat a = new DecimalFormat("#.##");

    public static final String a(long j, bu8 bu8Var) {
        long j2 = j / 3600;
        long seconds = j - TimeUnit.HOURS.toSeconds(j2);
        long j3 = seconds / 60;
        long seconds2 = seconds - TimeUnit.MINUTES.toSeconds(j3);
        String str = String.format("%01d", Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1));
        String str2 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3)}, 1));
        String str3 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(seconds2)}, 1));
        if (j2 > 0 && j3 > 0) {
            return bu8Var.b(R.string.score_time_h_m_s, str, str2, str3);
        }
        if (j2 > 0) {
            return bu8Var.b(R.string.score_time_h_s, str, str3);
        }
        return j3 > 0 ? bu8Var.b(R.string.score_time_m_s, str2, str3) : bu8Var.b(R.string.score_time_s, str3);
    }

    public static final String b(LeaderboardScoreResultModel leaderboardScoreResultModel, bu8 bu8Var) {
        leaderboardScoreResultModel.getClass();
        bu8Var.getClass();
        boolean z = leaderboardScoreResultModel instanceof LeaderboardScoreResultModel.RoundReps;
        String strB = BuildConfig.FLAVOR;
        if (z) {
            LeaderboardScoreResultModel.RoundReps roundReps = (LeaderboardScoreResultModel.RoundReps) leaderboardScoreResultModel;
            int i = roundReps.b;
            int i2 = roundReps.c;
            if (i > 0 || i2 > 0) {
                strB = a30.b("(", "+", ")", i, i2);
            }
            int i3 = roundReps.a;
            if (strB.length() <= 0) {
                strB = null;
            }
            return i3 + (strB != null ? " ".concat(strB) : null);
        }
        if (!(leaderboardScoreResultModel instanceof LeaderboardScoreResultModel.TimeCap)) {
            if (!(leaderboardScoreResultModel instanceof LeaderboardScoreResultModel.Other)) {
                u.b();
                return null;
            }
            LeaderboardScoreResultModel.Other other = (LeaderboardScoreResultModel.Other) leaderboardScoreResultModel;
            LeaderboardMeasureType leaderboardMeasureType = other.c;
            float f = other.a;
            return leaderboardMeasureType == LeaderboardMeasureType.u ? a(wk6.c(f), bu8Var) : cj2.a(a.format(Float.valueOf(f)), " ", other.b);
        }
        TimeCapModel timeCapModel = ((LeaderboardScoreResultModel.TimeCap) leaderboardScoreResultModel).a;
        if (timeCapModel instanceof TimeCapModel.Time) {
            return a(((TimeCapModel.Time) timeCapModel).a, bu8Var);
        }
        if (!(timeCapModel instanceof TimeCapModel.RoundReps)) {
            u.b();
            return null;
        }
        TimeCapModel.RoundReps roundReps2 = (TimeCapModel.RoundReps) timeCapModel;
        int i4 = roundReps2.a;
        int i5 = roundReps2.b;
        if (i4 > 0 || i5 > 0) {
            strB = i4 + "+" + i5;
        }
        return strB + " (" + a(roundReps2.c, bu8Var) + ")";
    }
}
