package defpackage;

import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ky9 {
    public static final float a = ViewConfiguration.getScrollFriction();

    public static final an2 a(jt1 jt1Var) {
        tx2 tx2Var = (tx2) jt1Var.F(qu1.h);
        boolean zG = jt1Var.g(tx2Var.getDensity());
        Object objF = jt1Var.f();
        if (zG || objF == jt1.a.a) {
            objF = new bn2(new jy9(tx2Var));
            jt1Var.C(objF);
        }
        return (an2) objF;
    }
}
