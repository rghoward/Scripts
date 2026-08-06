package defpackage;

import com.hwpo_training_app.settings.presentation.view.AccountSettingsView;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d7 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ d7(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                int i = AccountSettingsView.C;
                ((wj4) obj).getClass();
                return g2b.a;
            case 1:
                return ConversationScreenKt.ConversationScreenContent$lambda$144$lambda$143((TicketType) obj);
            default:
                return LazyMessageListKt.LazyMessageList$lambda$7$lambda$6((PendingMessage.FailedMediaUploadData) obj);
        }
    }
}
