package defpackage;

import io.intercom.android.sdk.m5.conversation.reducers.ConversationReducer;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o22 implements mh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ o22(int i) {
        this.t = i;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                return ConversationReducer._init_$lambda$1();
            default:
                return UUID.randomUUID();
        }
    }
}
