package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends Animatable2.AnimationCallback {
    public final /* synthetic */ mh4<g2b> a;
    public final /* synthetic */ mh4<g2b> b;

    public h(mh4<g2b> mh4Var, mh4<g2b> mh4Var2) {
        this.a = mh4Var;
        this.b = mh4Var2;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        mh4<g2b> mh4Var = this.b;
        if (mh4Var != null) {
            mh4Var.invoke();
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        mh4<g2b> mh4Var = this.a;
        if (mh4Var != null) {
            mh4Var.invoke();
        }
    }
}
