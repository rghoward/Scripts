package defpackage;

import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt;
import io.intercom.android.sdk.m5.navigation.HelpCenterDestinationKt;
import io.intercom.android.sdk.models.ReplyOption;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d42 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ d42(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return ConversationScreenKt.ConversationScreenContent$lambda$142$lambda$141((HeaderMenuItem) obj);
            case 1:
                return HelpCenterDestinationKt.helpCenterDestination$lambda$4((ru) obj);
            default:
                return LazyMessageListKt.LazyMessageList$lambda$3$lambda$2((ReplyOption) obj);
        }
    }
}
