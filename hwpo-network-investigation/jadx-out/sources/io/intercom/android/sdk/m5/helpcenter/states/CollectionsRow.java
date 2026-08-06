package io.intercom.android.sdk.m5.helpcenter.states;

import defpackage.qq2;
import defpackage.xj5;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class CollectionsRow {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class BrowseAllHelpTopicsAsListRow extends CollectionsRow {
        public static final int $stable = 0;
        public static final BrowseAllHelpTopicsAsListRow INSTANCE = new BrowseAllHelpTopicsAsListRow();

        private BrowseAllHelpTopicsAsListRow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof BrowseAllHelpTopicsAsListRow);
        }

        public int hashCode() {
            return 164025713;
        }

        public String toString() {
            return "BrowseAllHelpTopicsAsListRow";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class CollectionRow extends CollectionsRow {
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
    public static final class FullHelpCenterRow extends CollectionsRow {
        public static final int $stable = 0;
        public static final FullHelpCenterRow INSTANCE = new FullHelpCenterRow();

        private FullHelpCenterRow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FullHelpCenterRow);
        }

        public int hashCode() {
            return 788964466;
        }

        public String toString() {
            return "FullHelpCenterRow";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class SendMessageRow extends CollectionsRow {
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

    public /* synthetic */ CollectionsRow(qq2 qq2Var) {
        this();
    }

    private CollectionsRow() {
    }
}
