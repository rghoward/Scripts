package defpackage;

import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.preview.ui.PreviewRootScreenKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t42 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ t42(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return ConversationScreenKt.ConversationScreenContent$lambda$118$lambda$117((List) obj);
            case 1:
                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$5$lambda$4((List) obj);
            default:
                int i = ct8.L;
                return Boolean.valueOf(((dt8) obj).d);
        }
    }
}
