package defpackage;

import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f32 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ f32(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return ConversationScreenKt.ConversationScreen$lambda$83$lambda$82((ConversationViewModel) obj2, (String) obj);
            default:
                to8 to8Var = (to8) obj2;
                gm3 gm3Var = (gm3) obj;
                to8.a aVar = to8.Companion;
                gm3Var.getClass();
                if (gm3Var instanceof ro8) {
                    to8Var.m(((ro8) gm3Var).b);
                }
                return g2b.a;
        }
    }
}
