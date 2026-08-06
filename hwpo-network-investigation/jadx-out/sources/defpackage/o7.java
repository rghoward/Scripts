package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.hwpo_training_app.core.presentation.horizontal_calendar.DayItemView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o7 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ o7(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        char c = 1;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                r7 r7Var = (r7) obj2;
                m6.g gVar = new m6.g((h5b) obj);
                int i2 = r7.G;
                r7Var.e(gVar);
                r7Var.b();
                r7Var.e(new m6.f((r7Var.b().a == null || r7Var.b().b == null || r7Var.b().c == null) ? false : true));
                break;
            case 1:
                final mh4 mh4Var = (mh4) obj;
                View view = ((zr) obj2).a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    mh4Var.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new Runnable() { // from class: ur
                            @Override // java.lang.Runnable
                            public final void run() {
                                mh4Var.invoke();
                            }
                        });
                    }
                }
                break;
            case 2:
                ya yaVar = (ya) obj;
                yaVar.getClass();
                DayItemView dayItemView = ((sq5) yaVar.u).a;
                dayItemView.getClass();
                xgb.a(dayItemView, new hl2((oh4) obj2, yaVar, null));
                yaVar.s(new qr(c == true ? 1 : 0, yaVar));
                break;
            default:
                a58 a58Var = (a58) obj;
                ((lda) obj2).e(z69.j(a58Var, false));
                a58Var.a();
                break;
        }
        return g2b.a;
    }
}
