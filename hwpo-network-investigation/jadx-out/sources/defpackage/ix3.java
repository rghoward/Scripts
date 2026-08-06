package defpackage;

import com.hwpo_training_app.notifications.presentation.NotificationsViewModel;
import com.hwpo_training_app.notifications.presentation.NotificationsViewState;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ix3 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ ix3(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                rc9 rc9Var = (rc9) obj;
                rc9Var.getClass();
                return rc9Var.c;
            case 1:
                return g2b.a;
            case 2:
                NotificationsViewModel.Companion companion = NotificationsViewModel.Companion;
                return ((NotificationsViewState) obj).a;
            default:
                obj.getClass();
                return new e86.c(((Integer) obj).intValue());
        }
    }
}
