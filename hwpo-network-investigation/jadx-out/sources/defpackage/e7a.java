package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e7a extends Animation {
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ SwipeRefreshLayout v;

    public e7a(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.v = swipeRefreshLayout;
        this.t = i;
        this.u = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        jd1 jd1Var = this.v.S;
        int i = this.t;
        jd1Var.setAlpha((int) (((this.u - i) * f) + i));
    }
}
