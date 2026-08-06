package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ux9 implements View.OnLayoutChangeListener {
    public final /* synthetic */ ay9 a;
    public final /* synthetic */ dy9 b;

    public ux9(ay9 ay9Var, dy9 dy9Var) {
        this.a = ay9Var;
        this.b = dy9Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.getClass();
        if (view.isAttachedToWindow()) {
            view.removeOnLayoutChangeListener(this);
            ay9 ay9Var = this.a;
            boolean zA = ay9Var.f.a();
            dy9 dy9Var = this.b;
            if (zA) {
                ay9Var.h = dy9Var;
                return;
            }
            mp2 mp2Var = ay9Var.g;
            if (mp2Var == null) {
                return;
            }
            ay9Var.g = null;
            dy9Var.a.b().postOnAnimation(new sx9(dy9Var, mp2Var));
        }
    }
}
