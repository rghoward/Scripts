package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ek7 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View t;
    public ViewTreeObserver u;
    public final Runnable v;

    public ek7(View view, Runnable runnable) {
        this.t = view;
        this.u = view.getViewTreeObserver();
        this.v = runnable;
    }

    public static ek7 a(View view, Runnable runnable) {
        if (view == null) {
            ac4.c("view == null");
            return null;
        }
        ek7 ek7Var = new ek7(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(ek7Var);
        view.addOnAttachStateChangeListener(ek7Var);
        return ek7Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.u.isAlive();
        View view = this.t;
        if (zIsAlive) {
            this.u.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.v.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.u = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.u.isAlive();
        View view2 = this.t;
        if (zIsAlive) {
            this.u.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
