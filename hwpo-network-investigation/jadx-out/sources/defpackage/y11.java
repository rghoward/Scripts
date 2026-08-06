package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class y11 implements x11 {
    public final float[] a;
    public final int[] b = new int[2];

    public y11(float[] fArr) {
        this.a = fArr;
    }

    @Override // defpackage.x11
    public final void a(View view, float[] fArr) {
        xk6.d(fArr);
        b(view, fArr);
    }

    public final void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z = parent instanceof View;
        float[] fArr2 = this.a;
        if (z) {
            b((View) parent, fArr);
            float f = -view.getScrollX();
            float f2 = -view.getScrollY();
            xk6.d(fArr2);
            xk6.f(fArr2, f, f2);
            ym.h(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            xk6.d(fArr2);
            xk6.f(fArr2, left, top);
            ym.h(fArr, fArr2);
        } else {
            int[] iArr = this.b;
            view.getLocationInWindow(iArr);
            float f3 = -view.getScrollX();
            float f4 = -view.getScrollY();
            xk6.d(fArr2);
            xk6.f(fArr2, f3, f4);
            ym.h(fArr, fArr2);
            float f5 = iArr[0];
            float f6 = iArr[1];
            xk6.d(fArr2);
            xk6.f(fArr2, f5, f6);
            ym.h(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        b23.i(matrix, fArr2);
        ym.h(fArr, fArr2);
    }
}
