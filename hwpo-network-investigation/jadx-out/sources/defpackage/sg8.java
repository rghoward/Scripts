package defpackage;

import io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.QuickReply;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sg8 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ oh4 u;
    public final /* synthetic */ Object v;

    public /* synthetic */ sg8(int i, oh4 oh4Var, Object obj) {
        this.t = i;
        this.v = obj;
        this.u = oh4Var;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        oh4 oh4Var = this.u;
        Object obj2 = this.v;
        switch (i) {
            case 0:
                return QuickRepliesKt.ReplyOptions$lambda$5$lambda$4((List) obj2, oh4Var, (QuickReply) obj);
            default:
                r3b r3bVar = (r3b) obj2;
                ((Long) obj).getClass();
                float f = r3bVar.e;
                r3bVar.e = 0.0f;
                oh4Var.invoke(Float.valueOf(f));
                return g2b.a;
        }
    }
}
