package defpackage;

import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cb2 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ cb2(int i, Object obj, Object obj2) {
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
                return CreateTicketViewModel.onRetryFileClicked$lambda$9((CreateTicketViewModel) obj3, (AnswerClickData) obj2, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
            default:
                return MessageComposerKt.MessageComposer$lambda$40$lambda$39((ComposerState.TextInput) obj3, (oh4) obj2, (List) obj);
        }
    }
}
