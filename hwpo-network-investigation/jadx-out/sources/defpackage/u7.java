package defpackage;

import io.intercom.android.sdk.m5.conversation.states.MediaUploadItem;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u7 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ u7(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                e8.a aVar = e8.Companion;
                return Boolean.valueOf(((p8) obj).a);
            case 1:
                return BubbleMessageRowKt.BubbleMessageRow$lambda$3$lambda$2((PendingMessage.FailedMediaUploadData) obj);
            case 2:
                return ConversationScreenKt.ConversationScreenContent$lambda$166$lambda$165((MediaUploadItem) obj);
            case 3:
                ufa ufaVar = (ufa) obj;
                Integer numB = ufaVar.b();
                if (numB == null) {
                    return null;
                }
                int iIntValue = numB.intValue();
                long j = ufaVar.f;
                int i = lja.c;
                return new lx2(((int) (j & 4294967295L)) - iIntValue, 0);
            default:
                ((ya) obj).getClass();
                return g2b.a;
        }
    }
}
