package defpackage;

import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gp implements ci4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ gp(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.t;
        Object obj3 = this.u;
        switch (i) {
            case 0:
                ((h37) obj3).setValue(new ava(xr6.c((gg5) obj, (gg5) obj2)));
                return g2b.a;
            default:
                return ConversationScreenKt.ConversationScreen$lambda$95$lambda$94((ConversationViewModel) obj3, (List) obj, (List) obj2);
        }
    }
}
