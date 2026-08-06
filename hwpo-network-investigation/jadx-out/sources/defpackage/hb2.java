package defpackage;

import io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hb2 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ hb2(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.v;
        Object obj3 = this.u;
        switch (i) {
            case 0:
                return CreateTicketViewModel.onAnswerUpdated$lambda$3((String) obj3, (CreateTicketViewModel) obj2, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
            default:
                return MessageComposerKt.MessageComposer$lambda$66$lambda$56$lambda$53$lambda$52$lambda$51((mh4) obj3, (h37) obj2, (kha) obj);
        }
    }
}
