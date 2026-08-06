package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yx9 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ zx9 t;
    public final /* synthetic */ View u;

    public yx9(zx9 zx9Var, View view) {
        this.t = zx9Var;
        this.u = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (this.t.f.a()) {
            return false;
        }
        this.u.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
