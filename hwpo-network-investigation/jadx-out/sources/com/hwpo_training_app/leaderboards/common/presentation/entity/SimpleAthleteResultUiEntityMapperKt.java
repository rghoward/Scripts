package com.hwpo_training_app.leaderboards.common.presentation.entity;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardScoreSubValueModel;
import defpackage.bu8;
import defpackage.ws0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SimpleAthleteResultUiEntityMapperKt {
    public static final ArrayList a(List list, bu8 bu8Var) {
        bu8Var.getClass();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                ws0.m();
                throw null;
            }
            LeaderboardScoreSubValueModel leaderboardScoreSubValueModel = (LeaderboardScoreSubValueModel) obj;
            String str = i2 + ".";
            CharSequence charSequenceB = LeaderboardScoreResultUiEntityMapperKt.b(leaderboardScoreSubValueModel.d, bu8Var);
            if (leaderboardScoreSubValueModel.c) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                StyleSpan styleSpan = new StyleSpan(1);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append(charSequenceB);
                spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
                charSequenceB = new SpannedString(spannableStringBuilder);
            }
            arrayList.add(new SimpleAthleteResultUiEntity(str, charSequenceB));
            i = i2;
        }
        return arrayList;
    }
}
