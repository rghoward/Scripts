package defpackage;

import com.hwpo_training_app.notifications.presentation.NotificationsViewModel;
import com.hwpo_training_app.notifications.presentation.NotificationsViewState;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v56 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ v56(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return g2b.a;
            case 1:
                NotificationsViewModel.Companion companion = NotificationsViewModel.Companion;
                return Boolean.valueOf(((NotificationsViewState) obj).b);
            default:
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$7((ru) obj);
        }
    }
}
