package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tx9 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ay9 t;
    public final /* synthetic */ View u;

    public tx9(ay9 ay9Var, View view) {
        this.t = ay9Var;
        this.u = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        mp2 mp2Var;
        ay9 ay9Var = this.t;
        if (ay9Var.f.a()) {
            return false;
        }
        this.u.getViewTreeObserver().removeOnPreDrawListener(this);
        dy9 dy9Var = ay9Var.h;
        if (dy9Var == null || (mp2Var = ay9Var.g) == null) {
            return true;
        }
        ay9Var.g = null;
        dy9Var.a.b().postOnAnimation(new sx9(dy9Var, mp2Var));
        return true;
    }
}
