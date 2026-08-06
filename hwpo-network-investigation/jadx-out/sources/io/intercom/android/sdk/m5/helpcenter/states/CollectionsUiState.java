package io.intercom.android.sdk.m5.helpcenter.states;

import defpackage.th1;
import defpackage.xj5;
import defpackage.zc6;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.m5.components.ErrorState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface CollectionsUiState {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Content implements CollectionsUiState {
        public static final int $stable = 8;
        private final List<CollectionsRow> collections;

        /* JADX WARN: Multi-variable type inference failed */
        public Content(List<? extends CollectionsRow> list) {
            list.getClass();
            this.collections = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = content.collections;
            }
            return content.copy(list);
        }

        public final List<CollectionsRow> component1() {
            return this.collections;
        }

        public final Content copy(List<? extends CollectionsRow> list) {
            list.getClass();
            return new Content(list);
        }

        public final Content copyWithSingleSendMessageRow(ArticleViewState.TeamPresenceState teamPresenceState) {
            teamPresenceState.getClass();
            boolean zHasSendMessageRow = hasSendMessageRow();
            List<CollectionsRow> list = this.collections;
            if (!zHasSendMessageRow) {
                return copy(th1.L(list, new CollectionsRow.SendMessageRow(teamPresenceState)));
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!(((CollectionsRow) obj) instanceof CollectionsRow.SendMessageRow)) {
                    arrayList.add(obj);
                }
            }
            return copy(th1.L(arrayList, new CollectionsRow.SendMessageRow(teamPresenceState)));
        }

        public final Content copyWithoutSendMessageRow() {
            List<CollectionsRow> list = this.collections;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!(((CollectionsRow) obj) instanceof CollectionsRow.SendMessageRow)) {
                    arrayList.add(obj);
                }
            }
            return copy(arrayList);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Content) && xj5.a(this.collections, ((Content) obj).collections);
        }

        public final List<CollectionsRow> getCollections() {
            return this.collections;
        }

        public final boolean hasSendMessageRow() {
            List<CollectionsRow> list = this.collections;
            if (list != null && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((CollectionsRow) it.next()) instanceof CollectionsRow.SendMessageRow) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.collections.hashCode();
        }

        public String toString() {
            return zc6.a(new StringBuilder("Content(collections="), this.collections, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Error implements CollectionsUiState {
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
    public static final class Initial implements CollectionsUiState {
        public static final int $stable = 0;
        public static final Initial INSTANCE = new Initial();

        private Initial() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Initial);
        }

        public int hashCode() {
            return 1088616516;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Loading implements CollectionsUiState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public int hashCode() {
            return -523075012;
        }

        public String toString() {
            return "Loading";
        }
    }
}
