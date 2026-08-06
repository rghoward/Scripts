package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d35 implements View.OnLayoutChangeListener {
    public final /* synthetic */ z25 a;

    public d35(z25 z25Var) {
        this.a = z25Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        float f = -view.getHeight();
        z25 z25Var = this.a;
        float f2 = z25Var.d + z25Var.e;
        ObjectAnimator objectAnimator = z25Var.j;
        if (objectAnimator == null) {
            xj5.e("startAnimator");
            throw null;
        }
        objectAnimator.setFloatValues(f, f2);
        ObjectAnimator objectAnimator2 = z25Var.k;
        if (objectAnimator2 == null) {
            xj5.e("endAnimator");
            throw null;
        }
        objectAnimator2.setFloatValues(f2, f);
        ObjectAnimator objectAnimator3 = z25Var.j;
        if (objectAnimator3 == null) {
            xj5.e("startAnimator");
            throw null;
        }
        objectAnimator3.start();
        xgb.b(view, new e35(z25Var));
        z25Var.l = true;
    }
}
