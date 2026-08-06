package io.intercom.android.sdk.m5.helpcenter.states;

import defpackage.ho2;
import defpackage.os2;
import defpackage.ru3;
import defpackage.th1;
import defpackage.xj5;
import defpackage.zc6;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.sections.Author;
import io.intercom.android.sdk.m5.components.ErrorState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface CollectionDetailsUiState {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Content implements CollectionDetailsUiState {
        public static final int $stable = 8;
        private final int articlesCount;
        private final List<Author> authors;
        private final List<CollectionDetailsRow> collectionDetailsRows;
        private final String id;
        private final String summary;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public Content(String str, String str2, String str3, int i, List<Author> list, List<? extends CollectionDetailsRow> list2) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            list.getClass();
            list2.getClass();
            this.id = str;
            this.title = str2;
            this.summary = str3;
            this.articlesCount = i;
            this.authors = list;
            this.collectionDetailsRows = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, String str, String str2, String str3, int i, List list, List list2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = content.id;
            }
            if ((i2 & 2) != 0) {
                str2 = content.title;
            }
            if ((i2 & 4) != 0) {
                str3 = content.summary;
            }
            if ((i2 & 8) != 0) {
                i = content.articlesCount;
            }
            if ((i2 & 16) != 0) {
                list = content.authors;
            }
            if ((i2 & 32) != 0) {
                list2 = content.collectionDetailsRows;
            }
            List list3 = list;
            List list4 = list2;
            return content.copy(str, str2, str3, i, list3, list4);
        }

        public final String component1() {
            return this.id;
        }

        public final String component2() {
            return this.title;
        }

        public final String component3() {
            return this.summary;
        }

        public final int component4() {
            return this.articlesCount;
        }

        public final List<Author> component5() {
            return this.authors;
        }

        public final List<CollectionDetailsRow> component6() {
            return this.collectionDetailsRows;
        }

        public final Content copy(String str, String str2, String str3, int i, List<Author> list, List<? extends CollectionDetailsRow> list2) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            list.getClass();
            list2.getClass();
            return new Content(str, str2, str3, i, list, list2);
        }

        public final Content copyWithSingleSendMessageRow(ArticleViewState.TeamPresenceState teamPresenceState) {
            teamPresenceState.getClass();
            boolean zHasSendMessageRow = hasSendMessageRow();
            List<CollectionDetailsRow> list = this.collectionDetailsRows;
            if (!zHasSendMessageRow) {
                return copy$default(this, null, null, null, 0, null, th1.L(list, new CollectionDetailsRow.SendMessageRow(teamPresenceState)), 31, null);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!(((CollectionDetailsRow) obj) instanceof CollectionDetailsRow.SendMessageRow)) {
                    arrayList.add(obj);
                }
            }
            return copy$default(this, null, null, null, 0, null, th1.L(arrayList, new CollectionDetailsRow.SendMessageRow(teamPresenceState)), 31, null);
        }

        public final Content copyWithoutSendMessageRow() {
            List<CollectionDetailsRow> list = this.collectionDetailsRows;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!(((CollectionDetailsRow) obj) instanceof CollectionDetailsRow.SendMessageRow)) {
                    arrayList.add(obj);
                }
            }
            return copy$default(this, null, null, null, 0, null, arrayList, 31, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return xj5.a(this.id, content.id) && xj5.a(this.title, content.title) && xj5.a(this.summary, content.summary) && this.articlesCount == content.articlesCount && xj5.a(this.authors, content.authors) && xj5.a(this.collectionDetailsRows, content.collectionDetailsRows);
        }

        public final int getArticlesCount() {
            return this.articlesCount;
        }

        public final List<Author> getAuthors() {
            return this.authors;
        }

        public final List<CollectionDetailsRow> getCollectionDetailsRows() {
            return this.collectionDetailsRows;
        }

        public final String getId() {
            return this.id;
        }

        public final String getSummary() {
            return this.summary;
        }

        public final String getTitle() {
            return this.title;
        }

        public final boolean hasSendMessageRow() {
            List<CollectionDetailsRow> list = this.collectionDetailsRows;
            if (list != null && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((CollectionDetailsRow) it.next()) instanceof CollectionDetailsRow.SendMessageRow) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.collectionDetailsRows.hashCode() + ho2.a(os2.a(this.articlesCount, ru3.c(ru3.c(this.id.hashCode() * 31, 31, this.title), 31, this.summary), 31), 31, this.authors);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Content(id=");
            sb.append(this.id);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", summary=");
            sb.append(this.summary);
            sb.append(", articlesCount=");
            sb.append(this.articlesCount);
            sb.append(", authors=");
            sb.append(this.authors);
            sb.append(", collectionDetailsRows=");
            return zc6.a(sb, this.collectionDetailsRows, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Error implements CollectionDetailsUiState {
        public static final int $stable = 0;
        private final ErrorState errorState;

        public Error(ErrorState errorState) {
            errorState.getClass();
            this.errorState = errorState;
        }

        public static /* synthetic */ Error copy$default(Error error, ErrorState errorState, int i, Object obj) {
            if ((i & 1) != 0) {
                errorState = error.errorState;
            }
            return error.copy(errorState);
        }

        public final ErrorState component1() {
            return this.errorState;
        }

        public final Error copy(ErrorState errorState) {
            errorState.getClass();
            return new Error(errorState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && xj5.a(this.errorState, ((Error) obj).errorState);
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }

        public int hashCode() {
            return this.errorState.hashCode();
        }

        public String toString() {
            return "Error(errorState=" + this.errorState + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Initial implements CollectionDetailsUiState {
        public static final int $stable = 0;
        public static final Initial INSTANCE = new Initial();

        private Initial() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Initial);
        }

        public int hashCode() {
            return -545067083;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Loading implements CollectionDetailsUiState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public int hashCode() {
            return 2138208685;
        }

        public String toString() {
            return "Loading";
        }
    }
}
