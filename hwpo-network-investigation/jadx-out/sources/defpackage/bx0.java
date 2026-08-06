package defpackage;

import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt;
import io.intercom.android.sdk.m5.navigation.HelpCenterDestinationKt;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bx0 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ bx0(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                int i = cx0.z;
                return ((ex0) obj).a;
            case 1:
                return ConversationScreenKt.ConversationScreenContent$lambda$106$lambda$105((ReplyOption) obj);
            case 2:
                return HelpCenterDestinationKt.helpCenterDestination$lambda$5((ru) obj);
            default:
                return LazyMessageListKt.LazyMessageList$lambda$5$lambda$4((Part) obj);
        }
    }
}
