package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q85 implements pib<ImageView>, uwa, as2 {
    public boolean t;
    public final ImageView u;

    public q85(ImageView imageView) {
        this.u = imageView;
    }

    @Override // defpackage.pib
    public final View a() {
        return this.u;
    }

    @Override // defpackage.uwa
    public final Drawable b() {
        return this.u.getDrawable();
    }

    public final void c() {
        Object drawable = this.u.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.t) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public final void d(Drawable drawable) {
        ImageView imageView = this.u;
        Object drawable2 = imageView.getDrawable();
        Animatable animatable = drawable2 instanceof Animatable ? (Animatable) drawable2 : null;
        if (animatable != null) {
            animatable.stop();
        }
        imageView.setImageDrawable(drawable);
        c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q85) {
            return xj5.a(this.u, ((q85) obj).u);
        }
        return false;
    }

    public final int hashCode() {
        return this.u.hashCode();
    }

    @Override // defpackage.k9a
    public final void onError(Drawable drawable) {
        d(drawable);
    }

    @Override // defpackage.as2
    public final void onStart(m76 m76Var) {
        this.t = true;
        c();
    }

    @Override // defpackage.as2
    public final void onStop(m76 m76Var) {
        this.t = false;
        c();
    }

    @Override // defpackage.k9a
    public final void onSuccess(Drawable drawable) {
        d(drawable);
    }

    @Override // defpackage.k9a
    public final void onStart(Drawable drawable) {
        d(drawable);
    }
}
