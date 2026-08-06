package defpackage;

import io.intercom.android.sdk.carousel.CarouselScreenFragment;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xv {
    public static ub5 a(m93 m93Var, qn8 qn8Var, int i) {
        if ((i & 2) != 0) {
            qn8Var = qn8.t;
        }
        return new ub5(m93Var, qn8Var, 0L);
    }

    public static ty9 b(float f, float f2, Object obj, int i) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new ty9(f, f2, obj);
    }

    public static xya c(int i, int i2, aa3 aa3Var, int i3) {
        if ((i3 & 1) != 0) {
            i = CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            aa3Var = ca3.a;
        }
        return new xya(i, i2, aa3Var);
    }
}
