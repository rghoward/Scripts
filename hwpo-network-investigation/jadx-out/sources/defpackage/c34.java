package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c34 implements ViewTreeObserver.OnDrawListener {
    public final Handler t = new Handler(Looper.getMainLooper());
    public final AtomicReference<View> u;
    public final a20 v;

    public c34(View view, a20 a20Var) {
        this.u = new AtomicReference<>(view);
        this.v = a20Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View andSet = this.u.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: a34
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                andSet.getViewTreeObserver().removeOnDrawListener(this.t);
            }
        });
        this.t.postAtFrontOfQueue(this.v);
    }
}
