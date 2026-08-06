package defpackage;

import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.states.MediaUploadItem;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qx0 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ qx0(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return BubbleMessageRowKt.BubbleMessageRow$lambda$1$lambda$0((AttributeData) obj);
            case 1:
                return ConversationScreenKt.ConversationScreenContent$lambda$164$lambda$163((MediaUploadItem) obj);
            default:
                ufa ufaVar = (ufa) obj;
                Integer numC = ufaVar.c();
                if (numC == null) {
                    return null;
                }
                int iIntValue = numC.intValue();
                long j = ufaVar.f;
                int i = lja.c;
                return new lx2(0, iIntValue - ((int) (j & 4294967295L)));
        }
    }
}
