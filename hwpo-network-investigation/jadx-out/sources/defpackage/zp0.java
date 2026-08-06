package defpackage;

import io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.GroupedFilesKt;
import io.intercom.android.sdk.survey.ui.questiontype.choice.ChoicePillKt;
import io.intercom.android.sdk.tickets.TicketTimelineCardKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zp0 implements ci4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;

    public /* synthetic */ zp0(int i, int i2) {
        this.t = i2;
        this.u = i;
    }

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.t;
        jt1 jt1Var = (jt1) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i2 = this.u;
        switch (i) {
            case 0:
                return BigTicketCardKt.BigTicketCardWaitingPreview$lambda$6(i2, jt1Var, iIntValue);
            case 1:
                return ChoicePillKt.SelectedPill$lambda$7(i2, jt1Var, iIntValue);
            case 2:
                return GroupedFilesKt.GroupedFilesWith3FilesPreview$lambda$11(i2, jt1Var, iIntValue);
            default:
                return TicketTimelineCardKt.WaitingOnCustomerTicketTimelinePreview$lambda$3(i2, jt1Var, iIntValue);
        }
    }
}
