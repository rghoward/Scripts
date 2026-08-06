package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p85<Z> extends oib<ImageView, Z> {
    public Animatable v;

    @Override // defpackage.k76
    public final void a() {
        Animatable animatable = this.v;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // defpackage.j9a
    public final void g(Drawable drawable) {
        l(null);
        this.v = null;
        ((ImageView) this.t).setImageDrawable(drawable);
    }

    @Override // defpackage.j9a
    public final void h(Drawable drawable) {
        l(null);
        this.v = null;
        ((ImageView) this.t).setImageDrawable(drawable);
    }

    @Override // defpackage.j9a
    public final void i(Z z, yva<? super Z> yvaVar) {
        if (yvaVar != null && yvaVar.a(z, this)) {
            if (!(z instanceof Animatable)) {
                this.v = null;
                return;
            }
            Animatable animatable = (Animatable) z;
            this.v = animatable;
            animatable.start();
            return;
        }
        l(z);
        if (!(z instanceof Animatable)) {
            this.v = null;
            return;
        }
        Animatable animatable2 = (Animatable) z;
        this.v = animatable2;
        animatable2.start();
    }

    @Override // defpackage.oib, defpackage.j9a
    public final void j(Drawable drawable) {
        super.j(drawable);
        Animatable animatable = this.v;
        if (animatable != null) {
            animatable.stop();
        }
        l(null);
        this.v = null;
        ((ImageView) this.t).setImageDrawable(drawable);
    }

    @Override // defpackage.k76
    public final void k() {
        Animatable animatable = this.v;
        if (animatable != null) {
            animatable.start();
        }
    }

    public abstract void l(Z z);
}
