package com.hwpo_training_app.leaderboards.details.list.presentation.entity;

import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public enum AthleteResultPositionUiEntity {
    v(R.color.hwpoWhite, "FIRST"),
    w(R.color.hwpoWhite, "SECOND"),
    x(R.color.hwpoWhite, "THIRD"),
    y(R.color.hwpoWhite, "OTHER"),
    z(R.color.light_taupe, "MY_OTHER");

    public static final Companion Companion = new Companion(0);
    public final int t;
    public final int u;

    AthleteResultPositionUiEntity(int i, String str) {
        this.t = i;
        this.u = i;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static AthleteResultPositionUiEntity a(Integer num, boolean z) {
            if (num != null && num.intValue() == 1) {
                return AthleteResultPositionUiEntity.v;
            }
            if (num != null && num.intValue() == 2) {
                return AthleteResultPositionUiEntity.w;
            }
            if (num != null && num.intValue() == 3) {
                return AthleteResultPositionUiEntity.x;
            }
            if (z) {
                if ((num != null ? num.intValue() : Integer.MAX_VALUE) > 3) {
                    return AthleteResultPositionUiEntity.z;
                }
            }
            return AthleteResultPositionUiEntity.y;
        }

        private Companion() {
        }
    }
}
