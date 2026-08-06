package com.hwpo_training_app.leaderboards.filter.list.presentation.screen.entity;

import android.icu.text.SimpleDateFormat;
import com.hwpo_training_app.leaderboards.filter.list.domain.entity.LeaderboardFiltersModel;
import com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersViewState;
import com.hwpo_training_app.leaderboards.filter.presentation.ExtensionsKt;
import defpackage.yk2;
import j$.time.LocalDate;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardFiltersUiEntityMapperKt {
    public static final LeaderboardFiltersViewState a(LeaderboardFiltersModel leaderboardFiltersModel, boolean z) {
        leaderboardFiltersModel.getClass();
        ProgramTypeStateUiEntity programTypeStateUiEntity = new ProgramTypeStateUiEntity();
        boolean z2 = leaderboardFiltersModel.a;
        boolean z3 = leaderboardFiltersModel.b;
        LocalDate localDate = leaderboardFiltersModel.c;
        String str = localDate != null ? new SimpleDateFormat("dd MMM yyyy", Locale.getDefault()).format(Long.valueOf(yk2.v(localDate))) : null;
        LocalDate localDate2 = leaderboardFiltersModel.d;
        String str2 = localDate2 != null ? new SimpleDateFormat("dd MMM yyyy", Locale.getDefault()).format(Long.valueOf(yk2.v(localDate2))) : null;
        Integer num = leaderboardFiltersModel.e;
        String strValueOf = num != null ? String.valueOf(num.intValue()) : null;
        Integer num2 = leaderboardFiltersModel.f;
        return new LeaderboardFiltersViewState(programTypeStateUiEntity, z2, z3, ExtensionsKt.b(leaderboardFiltersModel.i, z, leaderboardFiltersModel.j), str, str2, strValueOf, num2 != null ? String.valueOf(num2.intValue()) : null, leaderboardFiltersModel.g, false, false);
    }
}
