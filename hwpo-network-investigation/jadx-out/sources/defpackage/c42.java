package defpackage;

import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.navigation.HelpCenterDestinationKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c42 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ c42(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return ConversationScreenKt.ConversationScreenContent$lambda$140$lambda$139((String) obj);
            case 1:
                return HelpCenterDestinationKt.helpCenterDestination$lambda$3((ru) obj);
            case 2:
                int i = wl7.G;
                return Boolean.valueOf(((zl7) obj).b);
            case 3:
                jr8.a aVar = jr8.Companion;
                return Boolean.valueOf(((or8) obj).d);
            default:
                ho5<Object>[] ho5VarArr = ec9.a;
                gc9<g2b> gc9Var = ac9.e;
                g2b g2bVar = g2b.a;
                ((hc9) obj).d(gc9Var, g2bVar);
                return g2bVar;
        }
    }
}
