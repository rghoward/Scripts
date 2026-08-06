package io.intercom.android.sdk.tickets.list.data;

import defpackage.a06;
import defpackage.qq2;
import defpackage.uo2;
import defpackage.wu0;
import defpackage.xj5;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.tickets.list.ui.TicketRowData;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class TicketsScreenUiState {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Empty extends TicketsScreenUiState {
        public static final int $stable = 0;
        private final EmptyState emptyState;
        private final String screenLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Empty(EmptyState emptyState, String str) {
            super(null);
            emptyState.getClass();
            str.getClass();
            this.emptyState = emptyState;
            this.screenLabel = str;
        }

        public static /* synthetic */ Empty copy$default(Empty empty, EmptyState emptyState, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                emptyState = empty.emptyState;
            }
            if ((i & 2) != 0) {
                str = empty.screenLabel;
            }
            return empty.copy(emptyState, str);
        }

        public final EmptyState component1() {
            return this.emptyState;
        }

        public final String component2() {
            return this.screenLabel;
        }

        public final Empty copy(EmptyState emptyState, String str) {
            emptyState.getClass();
            str.getClass();
            return new Empty(emptyState, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Empty)) {
                return false;
            }
            Empty empty = (Empty) obj;
            return xj5.a(this.emptyState, empty.emptyState) && xj5.a(this.screenLabel, empty.screenLabel);
        }

        public final EmptyState getEmptyState() {
            return this.emptyState;
        }

        @Override // io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState
        public String getScreenLabel() {
            return this.screenLabel;
        }

        public int hashCode() {
            return this.screenLabel.hashCode() + (this.emptyState.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Empty(emptyState=");
            sb.append(this.emptyState);
            sb.append(", screenLabel=");
            return wu0.a(sb, this.screenLabel, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Error extends TicketsScreenUiState {
        public static final int $stable = 0;
        private final ErrorState errorState;
        private final String screenLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(ErrorState errorState, String str) {
            super(null);
            errorState.getClass();
            str.getClass();
            this.errorState = errorState;
            this.screenLabel = str;
        }

        public static /* synthetic */ Error copy$default(Error error, ErrorState errorState, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                errorState = error.errorState;
            }
            if ((i & 2) != 0) {
                str = error.screenLabel;
            }
            return error.copy(errorState, str);
        }

        public final ErrorState component1() {
            return this.errorState;
        }

        public final String component2() {
            return this.screenLabel;
        }

        public final Error copy(ErrorState errorState, String str) {
            errorState.getClass();
            str.getClass();
            return new Error(errorState, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return xj5.a(this.errorState, error.errorState) && xj5.a(this.screenLabel, error.screenLabel);
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }

        @Override // io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState
        public String getScreenLabel() {
            return this.screenLabel;
        }

        public int hashCode() {
            return this.screenLabel.hashCode() + (this.errorState.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Error(errorState=");
            sb.append(this.errorState);
            sb.append(", screenLabel=");
            return wu0.a(sb, this.screenLabel, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Initial extends TicketsScreenUiState {
        public static final int $stable = 0;
        private final String screenLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initial(String str) {
            super(null);
            str.getClass();
            this.screenLabel = str;
        }

        public static /* synthetic */ Initial copy$default(Initial initial, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = initial.screenLabel;
            }
            return initial.copy(str);
        }

        public final String component1() {
            return this.screenLabel;
        }

        public final Initial copy(String str) {
            str.getClass();
            return new Initial(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Initial) && xj5.a(this.screenLabel, ((Initial) obj).screenLabel);
        }

        @Override // io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState
        public String getScreenLabel() {
            return this.screenLabel;
        }

        public int hashCode() {
            return this.screenLabel.hashCode();
        }

        public String toString() {
            return wu0.a(new StringBuilder("Initial(screenLabel="), this.screenLabel, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Loading extends TicketsScreenUiState {
        public static final int $stable = 0;
        private final String screenLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(String str) {
            super(null);
            str.getClass();
            this.screenLabel = str;
        }

        public static /* synthetic */ Loading copy$default(Loading loading, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loading.screenLabel;
            }
            return loading.copy(str);
        }

        public final String component1() {
            return this.screenLabel;
        }

        public final Loading copy(String str) {
            str.getClass();
            return new Loading(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && xj5.a(this.screenLabel, ((Loading) obj).screenLabel);
        }

        @Override // io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState
        public String getScreenLabel() {
            return this.screenLabel;
        }

        public int hashCode() {
            return this.screenLabel.hashCode();
        }

        public String toString() {
            return wu0.a(new StringBuilder("Loading(screenLabel="), this.screenLabel, ')');
        }
    }

    public /* synthetic */ TicketsScreenUiState(qq2 qq2Var) {
        this();
    }

    public abstract String getScreenLabel();

    private TicketsScreenUiState() {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Content extends TicketsScreenUiState {
        public static final int $stable = 8;
        private final ErrorState errorState;
        private final boolean isLoadingMore;
        private final a06<TicketRowData> lazyPagingTickets;
        private final String screenLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(a06<TicketRowData> a06Var, boolean z, ErrorState errorState, String str) {
            super(null);
            a06Var.getClass();
            str.getClass();
            this.lazyPagingTickets = a06Var;
            this.isLoadingMore = z;
            this.errorState = errorState;
            this.screenLabel = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, a06 a06Var, boolean z, ErrorState errorState, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                a06Var = content.lazyPagingTickets;
            }
            if ((i & 2) != 0) {
                z = content.isLoadingMore;
            }
            if ((i & 4) != 0) {
                errorState = content.errorState;
            }
            if ((i & 8) != 0) {
                str = content.screenLabel;
            }
            return content.copy(a06Var, z, errorState, str);
        }

        public final a06<TicketRowData> component1() {
            return this.lazyPagingTickets;
        }

        public final boolean component2() {
            return this.isLoadingMore;
        }

        public final ErrorState component3() {
            return this.errorState;
        }

        public final String component4() {
            return this.screenLabel;
        }

        public final Content copy(a06<TicketRowData> a06Var, boolean z, ErrorState errorState, String str) {
            a06Var.getClass();
            str.getClass();
            return new Content(a06Var, z, errorState, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return xj5.a(this.lazyPagingTickets, content.lazyPagingTickets) && this.isLoadingMore == content.isLoadingMore && xj5.a(this.errorState, content.errorState) && xj5.a(this.screenLabel, content.screenLabel);
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }

        public final a06<TicketRowData> getLazyPagingTickets() {
            return this.lazyPagingTickets;
        }

        @Override // io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState
        public String getScreenLabel() {
            return this.screenLabel;
        }

        public int hashCode() {
            int iA = uo2.a(this.lazyPagingTickets.hashCode() * 31, this.isLoadingMore, 31);
            ErrorState errorState = this.errorState;
            return this.screenLabel.hashCode() + ((iA + (errorState == null ? 0 : errorState.hashCode())) * 31);
        }

        public final boolean isLoadingMore() {
            return this.isLoadingMore;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Content(lazyPagingTickets=");
            sb.append(this.lazyPagingTickets);
            sb.append(", isLoadingMore=");
            sb.append(this.isLoadingMore);
            sb.append(", errorState=");
            sb.append(this.errorState);
            sb.append(", screenLabel=");
            return wu0.a(sb, this.screenLabel, ')');
        }

        public /* synthetic */ Content(a06 a06Var, boolean z, ErrorState errorState, String str, int i, qq2 qq2Var) {
            this(a06Var, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : errorState, str);
        }
    }
}
