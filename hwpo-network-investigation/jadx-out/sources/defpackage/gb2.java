package defpackage;

import android.widget.ImageView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.notifications.presentation.NotificationsEvents;
import com.hwpo_training_app.notifications.presentation.NotificationsFragment;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gb2 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ gb2(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return CreateTicketViewModel.getAttributeRequest$lambda$6((ArrayList) obj2, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
            case 1:
                ya yaVar = (ya) obj2;
                ((List) obj).getClass();
                y96 y96Var = (y96) yaVar.u;
                y96Var.c.setVisibility(0);
                ImageView imageView = y96Var.d;
                imageView.setImageDrawable(null);
                y96Var.b.setImageResource(R.drawable.img_program_without_image_gradient);
                y96Var.e.setText(((hq5) yaVar.t()).t);
                String str = ((hq5) yaVar.t()).u;
                if (str == null) {
                    return g2b.a;
                }
                xgb.f(imageView, str, new a10(1, y96Var));
                return g2b.a;
            default:
                NotificationsFragment notificationsFragment = (NotificationsFragment) obj2;
                gm3 gm3Var = (gm3) obj;
                ho5<Object>[] ho5VarArr = NotificationsFragment.E;
                gm3Var.getClass();
                if (gm3Var instanceof NotificationsEvents.StopRefreshing) {
                    notificationsFragment.p().c.setRefreshing(false);
                } else if (gm3Var instanceof NotificationsEvents.ShowError) {
                    notificationsFragment.m(((NotificationsEvents.ShowError) gm3Var).b);
                }
                return g2b.a;
        }
    }
}
