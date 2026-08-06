package defpackage;

import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p32 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ p32(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return ConversationScreenKt.ConversationScreen$lambda$11$lambda$10((HeaderMenuItem) obj);
            case 1:
                c69 c69Var = new c69(new tj2(), new tj2());
                ho5<Object>[] ho5VarArr = ec9.a;
                gc9<c69> gc9Var = ac9.v;
                ho5<Object> ho5Var = ec9.a[12];
                ((hc9) obj).d(gc9Var, c69Var);
                return g2b.a;
            case 2:
                qg6.b bVar = qg6.Companion;
                return Integer.valueOf(((ch6) obj).a);
            default:
                int i = o9b.m0;
                return Boolean.valueOf(((gab) obj).h);
        }
    }
}
