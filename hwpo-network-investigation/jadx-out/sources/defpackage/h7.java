package defpackage;

import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h7 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ h7(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                int i = r7.G;
                return ((t7) obj).a;
            case 1:
                return BubbleMessageRowKt.BubbleMessageRow$lambda$5$lambda$4((TicketType) obj);
            default:
                return LazyMessageListKt.LazyMessageList$lambda$15$lambda$14((String) obj);
        }
    }
}
