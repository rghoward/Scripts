package defpackage;

import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fu0 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ fu0(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                ro4 ro4Var = (ro4) obj;
                wj<in9> wjVar = ((hn9) obj2).d;
                float fH = wjVar.j.h();
                float fB = wjVar.e().b();
                float f = fH < fB ? fB - fH : 0.0f;
                ro4Var.k(f > 0.0f ? (Float.intBitsToFloat((int) (ro4Var.c() & 4294967295L)) + f) / Float.intBitsToFloat((int) (4294967295L & ro4Var.c())) : 1.0f);
                ro4Var.o1(sb4.b(0.5f, 0.0f));
                return g2b.a;
            default:
                return ConversationScreenKt.ConversationScreen$lambda$85$lambda$84((ConversationViewModel) obj2, (MetricData) obj);
        }
    }
}
