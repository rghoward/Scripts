package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d7a extends Animation {
    public final /* synthetic */ SwipeRefreshLayout t;

    public d7a(SwipeRefreshLayout swipeRefreshLayout) {
        this.t = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.t.setAnimationProgress(1.0f - f);
    }
}
