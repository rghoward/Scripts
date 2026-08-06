package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w68 implements ViewTreeObserver.OnPreDrawListener {
    public final Handler t = new Handler(Looper.getMainLooper());
    public final AtomicReference<View> u;
    public final b20 v;
    public final c20 w;

    public w68(View view, b20 b20Var, c20 c20Var) {
        this.u = new AtomicReference<>(view);
        this.v = b20Var;
        this.w = c20Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View andSet = this.u.getAndSet(null);
        if (andSet == null) {
            return true;
        }
        andSet.getViewTreeObserver().removeOnPreDrawListener(this);
        b20 b20Var = this.v;
        Handler handler = this.t;
        handler.post(b20Var);
        handler.postAtFrontOfQueue(this.w);
        return true;
    }
}
