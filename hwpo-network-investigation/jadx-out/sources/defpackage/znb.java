package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class znb implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View t;
    public final /* synthetic */ gk8 u;

    public znb(View view, gk8 gk8Var) {
        this.t = view;
        this.u = gk8Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.t.removeOnAttachStateChangeListener(this);
        this.u.z();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
