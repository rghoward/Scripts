package com.hwpo_training_app.leaderboards.filter.list.presentation.screen.entity;

import defpackage.uo2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ProgramTypeStateUiEntity {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ProgramTypeStateUiEntity);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + uo2.a(Boolean.hashCode(true) * 31, true, 31);
    }

    public final String toString() {
        return "ProgramTypeStateUiEntity(isFixedLengthChecked=true, isGroupRollingChecked=true, isFirstSessionDayChecked=true)";
    }
}
