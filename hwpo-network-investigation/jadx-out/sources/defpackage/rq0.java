package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class rq0 implements qq0 {
    @Override // defpackage.qq0
    public final Bitmap c(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.qq0
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.qq0
    public final Bitmap e(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.qq0
    public final void b() {
    }

    @Override // defpackage.qq0
    public final void a(int i) {
    }
}
