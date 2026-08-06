package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class v7a implements View.OnAttachStateChangeListener {
    public final /* synthetic */ ViewGroup t;
    public final /* synthetic */ u7a.a u;

    public v7a(ViewGroup viewGroup, u7a.a aVar) {
        this.t = viewGroup;
        this.u = aVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.t.addView(this.u, 0);
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.t.addView(this.u, 0);
        view.removeOnAttachStateChangeListener(this);
    }
}
