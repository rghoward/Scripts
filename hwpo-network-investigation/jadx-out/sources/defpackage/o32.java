package defpackage;

import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.conversation.states.EventLabelSegment;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.EventRowKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o32 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ o32(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return ConversationScreenKt.ConversationScreen$lambda$9$lambda$8((TicketType) obj);
            case 1:
                return EventRowKt.EventRow$lambda$1$lambda$0((EventLabelSegment) obj);
            case 2:
                char cCharValue = ((Character) obj).charValue();
                return Boolean.valueOf('0' <= cCharValue && cCharValue < ':');
            default:
                int i = o9b.m0;
                return ((gab) obj).n;
        }
    }
}
