package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ejb extends djb {
    @Override // defpackage.ajb
    public final float a(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.ajb
    public final void b(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.bjb
    public final void c(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.bjb
    public final void d(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // defpackage.cjb
    public final void e(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.djb
    public final void f(int i, View view) {
        view.setTransitionVisibility(i);
    }
}
