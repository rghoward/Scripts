package defpackage;

import android.graphics.PathMeasure;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wp implements iu7 {
    public final PathMeasure a;

    public wp(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    @Override // defpackage.iu7
    public final float a() {
        return this.a.getLength();
    }

    @Override // defpackage.iu7
    public final boolean b(float f, float f2, vp vpVar) {
        if (vpVar != null) {
            return this.a.getSegment(f, f2, vpVar.a, true);
        }
        ru3.f("Unable to obtain android.graphics.Path");
        return false;
    }

    @Override // defpackage.iu7
    public final void c(vp vpVar) {
        this.a.setPath(vpVar != null ? vpVar.a : null, false);
    }
}
