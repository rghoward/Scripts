package defpackage;

import io.intercom.android.sdk.m5.conversation.ui.components.row.FinAnswerRowKt;
import io.intercom.android.sdk.m5.inbox.reducers.InboxPagingItemsReducerKt;
import io.intercom.android.sdk.tickets.list.reducers.TicketsListReducerKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ca5 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ ca5(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                return InboxPagingItemsReducerKt.reduceToInboxUiState$lambda$2$lambda$1$lambda$0((a06) obj);
            case 1:
                return TicketsListReducerKt.reduceToTicketsScreenUiState$lambda$6$lambda$5((a06) obj);
            default:
                return FinAnswerRowKt.FinAnswerMetadata$lambda$14$lambda$13$lambda$10$lambda$9((h37) obj);
        }
    }
}
