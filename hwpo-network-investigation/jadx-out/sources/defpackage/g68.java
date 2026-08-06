package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g68 extends wp5 implements oh4<mh4<? extends g2b>, g2b> {
    public final /* synthetic */ d68 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g68(d68 d68Var) {
        super(1);
        this.u = d68Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(mh4<? extends g2b> mh4Var) {
        final mh4<? extends g2b> mh4Var2 = mh4Var;
        d68 d68Var = this.u;
        Handler handler = d68Var.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            mh4Var2.invoke();
        } else {
            Handler handler2 = d68Var.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: f68
                    @Override // java.lang.Runnable
                    public final void run() {
                        mh4Var2.invoke();
                    }
                });
            }
        }
        return g2b.a;
    }
}
