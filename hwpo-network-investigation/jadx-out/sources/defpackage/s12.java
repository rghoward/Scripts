package defpackage;

import io.intercom.android.sdk.m5.components.ConversationEndedCardKt;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState;
import io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s12 implements ci4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ s12(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        this.t = i3;
        this.w = obj;
        this.x = obj2;
        this.y = obj3;
        this.u = i;
        this.v = i2;
    }

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.t;
        Object obj3 = this.y;
        Object obj4 = this.x;
        Object obj5 = this.w;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ConversationEndedCardKt.ConversationEndedCard$lambda$0((ox6) obj5, (mh4) obj4, (ComposerState.ConversationEnded) obj3, this.u, this.v, (jt1) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return TicketsScreenKt.TicketsScreenContent$lambda$7((TicketsScreenUiState.Content) obj5, (go7) obj4, (oh4) obj3, this.u, this.v, (jt1) obj, iIntValue2);
        }
    }
}
