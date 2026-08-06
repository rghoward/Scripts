package defpackage;

import io.intercom.android.sdk.m5.conversation.ui.components.row.GroupedMediaKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.TeamIntroKt;
import io.intercom.android.sdk.m5.inbox.ui.InboxEmptyScreenKt;
import io.intercom.android.sdk.survey.ui.components.CircularAvatarComponentKt;
import io.intercom.android.sdk.tickets.RecentTicketsCardKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ed1 implements ci4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;

    public /* synthetic */ ed1(int i, int i2) {
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
                return CircularAvatarComponentKt.PreviewDefaultAvatar$lambda$7(i2, jt1Var, iIntValue);
            case 1:
                return GroupedMediaKt.GroupedMediaWith3ImagesPreview$lambda$22(i2, jt1Var, iIntValue);
            case 2:
                return InboxEmptyScreenKt.EmptyScreenWithoutActionPreview$lambda$3(i2, jt1Var, iIntValue);
            case 3:
                return RecentTicketsCardKt.RecentTicketsCardPreview$lambda$3(i2, jt1Var, iIntValue);
            default:
                return TeamIntroKt.TeamIntroPreview$lambda$1(i2, jt1Var, iIntValue);
        }
    }
}
