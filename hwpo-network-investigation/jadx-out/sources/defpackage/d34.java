package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d34 implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ View t;
    public final /* synthetic */ e34 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Runnable {
        public final /* synthetic */ d34 t;

        public a(d34 d34Var) {
            this.t = d34Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            vt4 vt4VarA = vt4.a();
            vt4VarA.getClass();
            l6b.a();
            vt4VarA.d.set(true);
            d34.this.u.b = true;
            View view = d34.this.t;
            view.getViewTreeObserver().removeOnDrawListener(this.t);
            d34.this.u.a.clear();
        }
    }

    public d34(e34 e34Var, View view) {
        this.u = e34Var;
        this.t = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        l6b.f().post(new a(this));
    }
}
