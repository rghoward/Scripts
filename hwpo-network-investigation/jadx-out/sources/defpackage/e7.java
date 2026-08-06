package defpackage;

import com.hwpo_training_app.settings.presentation.view.AccountSettingsView;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e7 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ e7(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                int i = AccountSettingsView.C;
                ((zlb) obj).getClass();
                return g2b.a;
            case 1:
                return ConversationScreenKt.ConversationScreenContent$lambda$146$lambda$145((String) obj);
            case 2:
                ec9.e((hc9) obj, 0);
                return g2b.a;
            default:
                return LazyMessageListKt.LazyMessageList$lambda$9$lambda$8((AttributeData) obj);
        }
    }
}
