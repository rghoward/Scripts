package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.c;
import androidx.fragment.app.u;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.presentation.horizontal_calendar.WeeksCalendarView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pt2 implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ pt2(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.t;
        Object obj = this.v;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                ((c) obj2).a((u.c) obj);
                break;
            case 1:
                ey7 ey7Var = (ey7) obj;
                ey7.a aVar = ey7.Companion;
                ConstraintLayout constraintLayout = ((d03) obj2).a;
                constraintLayout.getClass();
                ey7Var.p().K(ey7Var.v().a.getHeight() + ((int) constraintLayout.getResources().getDimension(R.dimen.bottom_sheet_top_padding)));
                break;
            default:
                WeeksCalendarView.t0((WeeksCalendarView) obj2, (List) obj);
                break;
        }
    }
}
