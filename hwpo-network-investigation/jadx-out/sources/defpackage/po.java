package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class po implements l75 {
    public final Bitmap a;

    public po(Bitmap bitmap) {
        this.a = bitmap;
    }

    public final int a() {
        Bitmap.Config config = this.a.getConfig();
        config.getClass();
        return so.c(config);
    }

    public final void b() {
        this.a.prepareToDraw();
    }

    @Override // defpackage.l75
    public final int h() {
        return this.a.getHeight();
    }

    @Override // defpackage.l75
    public final int j() {
        return this.a.getWidth();
    }
}
