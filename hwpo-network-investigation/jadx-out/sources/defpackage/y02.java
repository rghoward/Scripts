package defpackage;

import android.content.Context;
import io.intercom.android.sdk.api.ShutdownStore;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.ui.components.MessageMetadataKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ConversationBottomBarKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y02 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ y02(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return ConversationBottomBarKt.ConversationBottomBar_6KZKxL0$lambda$1$lambda$0((MetricData) obj);
            case 1:
                return MessageMetadataKt.MessageMetadata$lambda$6$lambda$5$lambda$4$lambda$3((hc9) obj);
            default:
                return ShutdownStore.shutdownDataStore_delegate$lambda$0((Context) obj);
        }
    }
}
