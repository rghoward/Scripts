package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m73 implements yva<Drawable> {
    public final boolean a;

    public m73(boolean z) {
        this.a = z;
    }

    @Override // defpackage.yva
    public final boolean a(Object obj, p85 p85Var) {
        Drawable drawable = (Drawable) obj;
        T t = p85Var.t;
        Drawable drawable2 = ((ImageView) t).getDrawable();
        if (drawable2 == null) {
            drawable2 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        transitionDrawable.setCrossFadeEnabled(this.a);
        transitionDrawable.startTransition(CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS);
        ((ImageView) t).setImageDrawable(transitionDrawable);
        return true;
    }
}
