package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pgb implements Interpolator {
    public final /* synthetic */ ogb a;

    public pgb(ogb ogbVar) {
        this.a = ogbVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.a.u.getInterpolation(f);
    }
}
