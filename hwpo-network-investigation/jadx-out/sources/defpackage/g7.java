package defpackage;

import com.hwpo_training_app.settings.presentation.view.AccountSettingsView;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g7 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ g7(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                int i = AccountSettingsView.C;
                ((s10) obj).getClass();
                return g2b.a;
            case 1:
                return ConversationScreenKt.ConversationScreenContent$lambda$150$lambda$149((String) obj);
            default:
                return LazyMessageListKt.LazyMessageList$lambda$13$lambda$12((TicketType) obj);
        }
    }
}
