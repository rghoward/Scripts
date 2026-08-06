package com.hwpo_training_app.leaderboards.list.common.presentation.entity;

import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public enum TopValuePositionUiEntity {
    FIRST(R.color.badge_first_place),
    SECOND(R.color.badge_second_place),
    THIRD(R.color.badge_third_place),
    OTHER(R.color.badge_other_place),
    MY_OTHER(R.color.badge_my_other_place);

    public static final Companion Companion = new Companion(0);
    public final int t;

    TopValuePositionUiEntity(int i) {
        this.t = i;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
