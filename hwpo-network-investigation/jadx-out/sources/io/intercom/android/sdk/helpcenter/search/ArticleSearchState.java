package io.intercom.android.sdk.helpcenter.search;

import defpackage.qq2;
import defpackage.wu0;
import defpackage.xj5;
import defpackage.zc6;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ArticleSearchState {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Content extends ArticleSearchState {
        public static final int $stable = 8;
        private final List<ArticleSearchResultRow> searchResults;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Content(List<? extends ArticleSearchResultRow> list) {
            super(null);
            list.getClass();
            this.searchResults = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = content.searchResults;
            }
            return content.copy(list);
        }

        public final List<ArticleSearchResultRow> component1() {
            return this.searchResults;
        }

        public final Content copy(List<? extends ArticleSearchResultRow> list) {
            list.getClass();
            return new Content(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Content) && xj5.a(this.searchResults, ((Content) obj).searchResults);
        }

        public final List<ArticleSearchResultRow> getSearchResults() {
            return this.searchResults;
        }

        public int hashCode() {
            return this.searchResults.hashCode();
        }

        public String toString() {
            return zc6.a(new StringBuilder("Content(searchResults="), this.searchResults, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Error extends ArticleSearchState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Initial extends ArticleSearchState {
        public static final int $stable = 0;
        public static final Initial INSTANCE = new Initial();

        private Initial() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Initial);
        }

        public int hashCode() {
            return -498820373;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Loading extends ArticleSearchState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public int hashCode() {
            return -2110511901;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class NoResults extends ArticleSearchState {
        public static final int $stable = 0;
        private final String searchTerm;
        private final ArticleViewState.TeamPresenceState teamPresenceState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoResults(ArticleViewState.TeamPresenceState teamPresenceState, String str) {
            super(null);
            teamPresenceState.getClass();
            str.getClass();
            this.teamPresenceState = teamPresenceState;
            this.searchTerm = str;
        }

        public static /* synthetic */ NoResults copy$default(NoResults noResults, ArticleViewState.TeamPresenceState teamPresenceState, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                teamPresenceState = noResults.teamPresenceState;
            }
            if ((i & 2) != 0) {
                str = noResults.searchTerm;
            }
            return noResults.copy(teamPresenceState, str);
        }

        public final ArticleViewState.TeamPresenceState component1() {
            return this.teamPresenceState;
        }

        public final String component2() {
            return this.searchTerm;
        }

        public final NoResults copy(ArticleViewState.TeamPresenceState teamPresenceState, String str) {
            teamPresenceState.getClass();
            str.getClass();
            return new NoResults(teamPresenceState, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoResults)) {
                return false;
            }
            NoResults noResults = (NoResults) obj;
            return xj5.a(this.teamPresenceState, noResults.teamPresenceState) && xj5.a(this.searchTerm, noResults.searchTerm);
        }

        public final String getSearchTerm() {
            return this.searchTerm;
        }

        public final ArticleViewState.TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        public int hashCode() {
            return this.searchTerm.hashCode() + (this.teamPresenceState.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("NoResults(teamPresenceState=");
            sb.append(this.teamPresenceState);
            sb.append(", searchTerm=");
            return wu0.a(sb, this.searchTerm, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class NoResultsNoTeamHelp extends ArticleSearchState {
        public static final int $stable = 0;
        private final String searchTerm;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoResultsNoTeamHelp(String str) {
            super(null);
            str.getClass();
            this.searchTerm = str;
        }

        public static /* synthetic */ NoResultsNoTeamHelp copy$default(NoResultsNoTeamHelp noResultsNoTeamHelp, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = noResultsNoTeamHelp.searchTerm;
            }
            return noResultsNoTeamHelp.copy(str);
        }

        public final String component1() {
            return this.searchTerm;
        }

        public final NoResultsNoTeamHelp copy(String str) {
            str.getClass();
            return new NoResultsNoTeamHelp(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoResultsNoTeamHelp) && xj5.a(this.searchTerm, ((NoResultsNoTeamHelp) obj).searchTerm);
        }

        public final String getSearchTerm() {
            return this.searchTerm;
        }

        public int hashCode() {
            return this.searchTerm.hashCode();
        }

        public String toString() {
            return wu0.a(new StringBuilder("NoResultsNoTeamHelp(searchTerm="), this.searchTerm, ')');
        }
    }

    public /* synthetic */ ArticleSearchState(qq2 qq2Var) {
        this();
    }

    private ArticleSearchState() {
    }
}
