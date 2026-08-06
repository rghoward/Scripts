package defpackage;

import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class an0 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ an0(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return new gn0((fra) obj2);
            default:
                return CreateTicketContentScreenKt.CreateTicketContentScreen$lambda$4$lambda$3$lambda$2$lambda$1((QuestionState) obj2, (v94) obj);
        }
    }
}
