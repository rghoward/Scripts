package defpackage;

import androidx.recyclerview.widget.y;
import com.hwpo_training_app.core.presentation.horizontal_calendar.WeeksCalendarView;
import com.hwpo_training_app.core.presentation.horizontal_calendar.WeeksCalendarView.a;
import io.intercom.android.sdk.AppIdentityInjector;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c10 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ c10(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                return AppIdentityInjector.retrofitWithoutHeaders_delegate$lambda$8((AppIdentityInjector) obj);
            case 1:
                dl9 dl9Var = (dl9) obj;
                dt7 dt7Var = dl9Var.v;
                if (((cr9) dt7Var.getValue()).a == 9205357640488583168L || cr9.e(((cr9) dt7Var.getValue()).a)) {
                    return null;
                }
                return dl9Var.t.b(((cr9) dt7Var.getValue()).a);
            default:
                WeeksCalendarView weeksCalendarView = (WeeksCalendarView) obj;
                int i2 = WeeksCalendarView.i1;
                y yVar = new y();
                weeksCalendarView.i(new eu9(yVar, weeksCalendarView.new a()));
                return yVar;
        }
    }
}
