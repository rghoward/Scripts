package defpackage;

import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.hwpo_training_app.R;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ej6<V extends View> {
    public final PathInterpolator a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
    public final V b;
    public final int c;
    public final int d;
    public final int e;
    public gh0 f;

    public ej6(V v) {
        this.b = v;
        Context context = v.getContext();
        this.c = az6.c(context, R.attr.motionDurationMedium2, CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS);
        this.d = az6.c(context, R.attr.motionDurationShort3, 150);
        this.e = az6.c(context, R.attr.motionDurationShort2, 100);
    }
}
