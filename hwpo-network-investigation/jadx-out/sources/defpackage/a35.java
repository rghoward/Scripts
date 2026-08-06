package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a35 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ ViewGroup t;
    public final /* synthetic */ z25 u;
    public final /* synthetic */ ViewGroup v;

    public a35(ViewGroup viewGroup, z25 z25Var, ViewGroup viewGroup2) {
        this.t = viewGroup;
        this.u = z25Var;
        this.v = viewGroup2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.t.removeOnAttachStateChangeListener(this);
        z25 z25Var = this.u;
        z25Var.l = false;
        this.v.removeView(z25Var.a());
        z25Var.c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
