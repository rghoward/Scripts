package defpackage;

import io.intercom.android.sdk.tickets.TicketProgressIndicatorKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w29 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ w29(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                we3 we3Var = null;
                Boolean bool = obj2 != null ? (Boolean) obj2 : null;
                bool.getClass();
                boolean zBooleanValue = bool.booleanValue();
                Object obj3 = list.get(1);
                boolean zA = xj5.a(obj3, Boolean.FALSE);
                au3 au3Var = d39.b;
                if (!zA && obj3 != null) {
                    we3Var = (we3) ((oh4) au3Var.u).invoke(obj3);
                }
                we3Var.getClass();
                return new h18(we3Var.a, zBooleanValue);
            case 1:
                return TicketProgressIndicatorKt.TicketProgressIndicator_3IgeMak$lambda$9$lambda$8$lambda$1$lambda$0((gp5.b) obj);
            default:
                return ((fnb) obj).g;
        }
    }
}
