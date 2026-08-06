package com.hwpo_training_app.leaderboards.list.common.presentation;

import defpackage.g2b;
import defpackage.gm3;
import defpackage.sk0;
import defpackage.xj5;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseLeaderboardsListEvents extends gm3<g2b> {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ShowError extends gm3<String> {
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowError(String str) {
            super(str);
            str.getClass();
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowError) && xj5.a(this.b, ((ShowError) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return sk0.c("ShowError(error=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ShowResultsDialog extends BaseLeaderboardsListEvents {
        public final String b;
        public final ArrayList c;

        public ShowResultsDialog(String str, ArrayList arrayList) {
            super(0);
            this.b = str;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowResultsDialog)) {
                return false;
            }
            ShowResultsDialog showResultsDialog = (ShowResultsDialog) obj;
            return xj5.a(this.b, showResultsDialog.b) && xj5.a(this.c, showResultsDialog.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "ShowResultsDialog(primaryResultText=" + this.b + ", additionalResultsList=" + this.c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class StopRefreshing extends gm3<g2b> {
        public static final StopRefreshing b = new StopRefreshing();

        private StopRefreshing() {
            super(g2b.a);
        }
    }

    private BaseLeaderboardsListEvents() {
        super(g2b.a);
    }

    public /* synthetic */ BaseLeaderboardsListEvents(int i) {
        this();
    }
}
