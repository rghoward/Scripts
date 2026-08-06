package io.intercom.android.sdk.helpcenter.search;

import com.intercom.twig.BuildConfig;
import defpackage.e44;
import defpackage.fk;
import defpackage.qq2;
import defpackage.ru3;
import defpackage.xj5;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ArticleSearchResultRow {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class TeammateHelpRow extends ArticleSearchResultRow {
        public static final int $stable = 0;
        private final ArticleViewState.TeamPresenceState teamPresenceState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TeammateHelpRow(ArticleViewState.TeamPresenceState teamPresenceState) {
            super(null);
            teamPresenceState.getClass();
            this.teamPresenceState = teamPresenceState;
        }

        public static /* synthetic */ TeammateHelpRow copy$default(TeammateHelpRow teammateHelpRow, ArticleViewState.TeamPresenceState teamPresenceState, int i, Object obj) {
            if ((i & 1) != 0) {
                teamPresenceState = teammateHelpRow.teamPresenceState;
            }
            return teammateHelpRow.copy(teamPresenceState);
        }

        public final ArticleViewState.TeamPresenceState component1() {
            return this.teamPresenceState;
        }

        public final TeammateHelpRow copy(ArticleViewState.TeamPresenceState teamPresenceState) {
            teamPresenceState.getClass();
            return new TeammateHelpRow(teamPresenceState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TeammateHelpRow) && xj5.a(this.teamPresenceState, ((TeammateHelpRow) obj).teamPresenceState);
        }

        public final ArticleViewState.TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        public int hashCode() {
            return this.teamPresenceState.hashCode();
        }

        public String toString() {
            return "TeammateHelpRow(teamPresenceState=" + this.teamPresenceState + ')';
        }
    }

    public /* synthetic */ ArticleSearchResultRow(qq2 qq2Var) {
        this();
    }

    private ArticleSearchResultRow() {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ArticleResultRow extends ArticleSearchResultRow {
        public static final int $stable = 0;
        private final String id;
        private final String summaryText;
        private final int summaryVisibility;
        private final String titleText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArticleResultRow(String str, String str2, String str3, int i) {
            super(null);
            fk.b(str, str2, str3);
            this.id = str;
            this.titleText = str2;
            this.summaryText = str3;
            this.summaryVisibility = i;
        }

        public static /* synthetic */ ArticleResultRow copy$default(ArticleResultRow articleResultRow, String str, String str2, String str3, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = articleResultRow.id;
            }
            if ((i2 & 2) != 0) {
                str2 = articleResultRow.titleText;
            }
            if ((i2 & 4) != 0) {
                str3 = articleResultRow.summaryText;
            }
            if ((i2 & 8) != 0) {
                i = articleResultRow.summaryVisibility;
            }
            return articleResultRow.copy(str, str2, str3, i);
        }

        public final String component1() {
            return this.id;
        }

        public final String component2() {
            return this.titleText;
        }

        public final String component3() {
            return this.summaryText;
        }

        public final int component4() {
            return this.summaryVisibility;
        }

        public final ArticleResultRow copy(String str, String str2, String str3, int i) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            return new ArticleResultRow(str, str2, str3, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArticleResultRow)) {
                return false;
            }
            ArticleResultRow articleResultRow = (ArticleResultRow) obj;
            return xj5.a(this.id, articleResultRow.id) && xj5.a(this.titleText, articleResultRow.titleText) && xj5.a(this.summaryText, articleResultRow.summaryText) && this.summaryVisibility == articleResultRow.summaryVisibility;
        }

        public final String getId() {
            return this.id;
        }

        public final String getSummaryText() {
            return this.summaryText;
        }

        public final int getSummaryVisibility() {
            return this.summaryVisibility;
        }

        public final String getTitleText() {
            return this.titleText;
        }

        public int hashCode() {
            return Integer.hashCode(this.summaryVisibility) + ru3.c(ru3.c(this.id.hashCode() * 31, 31, this.titleText), 31, this.summaryText);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ArticleResultRow(id=");
            sb.append(this.id);
            sb.append(", titleText=");
            sb.append(this.titleText);
            sb.append(", summaryText=");
            sb.append(this.summaryText);
            sb.append(", summaryVisibility=");
            return e44.a(sb, this.summaryVisibility, ')');
        }

        public /* synthetic */ ArticleResultRow(String str, String str2, String str3, int i, int i2, qq2 qq2Var) {
            this(str, str2, (i2 & 4) != 0 ? BuildConfig.FLAVOR : str3, (i2 & 8) != 0 ? 8 : i);
        }
    }
}
