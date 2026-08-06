package defpackage;

import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b8 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ b8(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                e8.a aVar = e8.Companion;
                return ((p8) obj).h;
            case 1:
                return ConversationScreenKt.ConversationScreenContent$lambda$110$lambda$109((ComposerInputType) obj);
            default:
                int i = ct8.L;
                return Integer.valueOf(((dt8) obj).c);
        }
    }
}
