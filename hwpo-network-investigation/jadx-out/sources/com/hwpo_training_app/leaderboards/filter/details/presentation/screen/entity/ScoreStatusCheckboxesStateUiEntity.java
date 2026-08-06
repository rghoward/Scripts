package com.hwpo_training_app.leaderboards.filter.details.presentation.screen.entity;

import defpackage.cq2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ScoreStatusCheckboxesStateUiEntity {
    public final boolean a;

    public ScoreStatusCheckboxesStateUiEntity(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScoreStatusCheckboxesStateUiEntity) && this.a == ((ScoreStatusCheckboxesStateUiEntity) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return cq2.a("ScoreStatusCheckboxesStateUiEntity(hidden=", ")", this.a);
    }
}
