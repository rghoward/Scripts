package defpackage;

import io.intercom.android.sdk.m5.components.TicketHeaderKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tg8 implements ci4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ ox6 u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ tg8(ox6 ox6Var, Object obj, Object obj2, int i, int i2, int i3) {
        this.t = i3;
        this.u = ox6Var;
        this.x = obj;
        this.y = obj2;
        this.v = i;
        this.w = i2;
    }

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.t;
        Object obj3 = this.y;
        Object obj4 = this.x;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return QuickRepliesKt.ReplyOptions$lambda$6(this.u, (List) obj4, (oh4) obj3, this.v, this.w, (jt1) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return TicketHeaderKt.SimpleTicketHeader$lambda$2(this.u, (String) obj4, (ob4) obj3, this.v, this.w, (jt1) obj, iIntValue2);
        }
    }
}
