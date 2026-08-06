package defpackage;

import io.intercom.android.sdk.m5.conversation.states.MediaUploadItem;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ConversationBottomBarKt;
import io.intercom.android.sdk.m5.navigation.MessagesDestinationKt;
import io.intercom.android.sdk.m5.navigation.TicketsDestinationKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e12 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ e12(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return ConversationBottomBarKt.ConversationBottomBar_6KZKxL0$lambda$11$lambda$10((MediaUploadItem) obj);
            case 1:
                return MessagesDestinationKt.messagesDestination$lambda$3((ru) obj);
            default:
                return TicketsDestinationKt.ticketsDestination$lambda$4((ru) obj);
        }
    }
}
