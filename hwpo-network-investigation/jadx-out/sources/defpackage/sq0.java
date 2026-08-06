package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sq0 implements kt8<Bitmap>, fc5 {
    public final Bitmap t;
    public final qq0 u;

    public sq0(qq0 qq0Var, Bitmap bitmap) {
        ov9.d(bitmap, "Bitmap must not be null");
        this.t = bitmap;
        ov9.d(qq0Var, "BitmapPool must not be null");
        this.u = qq0Var;
    }

    public static sq0 d(qq0 qq0Var, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new sq0(qq0Var, bitmap);
    }

    @Override // defpackage.kt8
    public final void a() {
        this.u.d(this.t);
    }

    @Override // defpackage.fc5
    public final void b() {
        this.t.prepareToDraw();
    }

    @Override // defpackage.kt8
    public final Class<Bitmap> c() {
        return Bitmap.class;
    }

    @Override // defpackage.kt8
    public final Bitmap get() {
        return this.t;
    }

    @Override // defpackage.kt8
    public final int getSize() {
        return l6b.c(this.t);
    }
}
