package io.intercom.android.sdk.m5.helpcenter.states;

import defpackage.qq2;
import defpackage.wu0;
import defpackage.xj5;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class CollectionDetailsRow {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ArticleRow extends CollectionDetailsRow {
        public static final int $stable = 0;
        private final String id;
        private final String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArticleRow(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.id = str;
            this.title = str2;
        }

        public static /* synthetic */ ArticleRow copy$default(ArticleRow articleRow, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = articleRow.id;
            }
            if ((i & 2) != 0) {
                str2 = articleRow.title;
            }
            return articleRow.copy(str, str2);
        }

        public final String component1() {
            return this.id;
        }

        public final String component2() {
            return this.title;
        }

        public final ArticleRow copy(String str, String str2) {
            str.getClass();
            str2.getClass();
            return new ArticleRow(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArticleRow)) {
                return false;
            }
            ArticleRow articleRow = (ArticleRow) obj;
            return xj5.a(this.id, articleRow.id) && xj5.a(this.title, articleRow.title);
        }

        public final String getId() {
            return this.id;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ArticleRow(id=");
            sb.append(this.id);
            sb.append(", title=");
            return wu0.a(sb, this.title, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class CollectionRow extends CollectionDetailsRow {
        public static final int $stable = 0;
        private final CollectionRowData rowData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CollectionRow(CollectionRowData collectionRowData) {
            super(null);
            collectionRowData.getClass();
            this.rowData = collectionRowData;
        }

        public static /* synthetic */ CollectionRow copy$default(CollectionRow collectionRow, CollectionRowData collectionRowData, int i, Object obj) {
            if ((i & 1) != 0) {
                collectionRowData = collectionRow.rowData;
            }
            return collectionRow.copy(collectionRowData);
        }

        public final CollectionRowData component1() {
            return this.rowData;
        }

        public final CollectionRow copy(CollectionRowData collectionRowData) {
            collectionRowData.getClass();
            return new CollectionRow(collectionRowData);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CollectionRow) && xj5.a(this.rowData, ((CollectionRow) obj).rowData);
        }

        public final CollectionRowData getRowData() {
            return this.rowData;
        }

        public int hashCode() {
            return this.rowData.hashCode();
        }

        public String toString() {
            return "CollectionRow(rowData=" + this.rowData + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class FullHelpCenterRow extends CollectionDetailsRow {
        public static final int $stable = 0;
        public static final FullHelpCenterRow INSTANCE = new FullHelpCenterRow();

        private FullHelpCenterRow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FullHelpCenterRow);
        }

        public int hashCode() {
            return -1758362845;
        }

        public String toString() {
            return "FullHelpCenterRow";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class SendMessageRow extends CollectionDetailsRow {
        public static final int $stable = 0;
        private final ArticleViewState.TeamPresenceState teamPresenceState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendMessageRow(ArticleViewState.TeamPresenceState teamPresenceState) {
            super(null);
            teamPresenceState.getClass();
            this.teamPresenceState = teamPresenceState;
        }

        public static /* synthetic */ SendMessageRow copy$default(SendMessageRow sendMessageRow, ArticleViewState.TeamPresenceState teamPresenceState, int i, Object obj) {
            if ((i & 1) != 0) {
                teamPresenceState = sendMessageRow.teamPresenceState;
            }
            return sendMessageRow.copy(teamPresenceState);
        }

        public final ArticleViewState.TeamPresenceState component1() {
            return this.teamPresenceState;
        }

        public final SendMessageRow copy(ArticleViewState.TeamPresenceState teamPresenceState) {
            teamPresenceState.getClass();
            return new SendMessageRow(teamPresenceState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SendMessageRow) && xj5.a(this.teamPresenceState, ((SendMessageRow) obj).teamPresenceState);
        }

        public final ArticleViewState.TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        public int hashCode() {
            return this.teamPresenceState.hashCode();
        }

        public String toString() {
            return "SendMessageRow(teamPresenceState=" + this.teamPresenceState + ')';
        }
    }

    public /* synthetic */ CollectionDetailsRow(qq2 qq2Var) {
        this();
    }

    private CollectionDetailsRow() {
    }
}
