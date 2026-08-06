package com.hwpo_training_app.leaderboards.details.common.domain.actions;

import defpackage.os2;
import defpackage.ru3;
import defpackage.u43;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class LeaderboardDetailsAction {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class OpenEditPerformanceScreen extends LeaderboardDetailsAction {
        public static final OpenEditPerformanceScreen a = new OpenEditPerformanceScreen();

        private OpenEditPerformanceScreen() {
            super(0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class OpenLeaderboardValueCommentsScreen extends LeaderboardDetailsAction {
        public final int a;
        public final int b;
        public final String c;
        public final int d;

        public OpenLeaderboardValueCommentsScreen(int i, int i2, int i3, String str) {
            super(0);
            this.a = i;
            this.b = i2;
            this.c = str;
            this.d = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenLeaderboardValueCommentsScreen)) {
                return false;
            }
            OpenLeaderboardValueCommentsScreen openLeaderboardValueCommentsScreen = (OpenLeaderboardValueCommentsScreen) obj;
            return this.a == openLeaderboardValueCommentsScreen.a && this.b == openLeaderboardValueCommentsScreen.b && xj5.a(this.c, openLeaderboardValueCommentsScreen.c) && this.d == openLeaderboardValueCommentsScreen.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + ru3.c(os2.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbB = u43.b("OpenLeaderboardValueCommentsScreen(leaderboardId=", ", valueId=", ", resultText=", this.a, this.b);
            sbB.append(this.c);
            sbB.append(", attachmentsCount=");
            sbB.append(this.d);
            sbB.append(")");
            return sbB.toString();
        }
    }

    public /* synthetic */ LeaderboardDetailsAction(int i) {
        this();
    }

    private LeaderboardDetailsAction() {
    }
}
