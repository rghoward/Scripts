package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h2b implements pt8<Bitmap, Bitmap> {
    @Override // defpackage.pt8
    public final kt8<Bitmap> a(Bitmap bitmap, int i, int i2, xk7 xk7Var) {
        return new a(bitmap);
    }

    @Override // defpackage.pt8
    public final /* bridge */ /* synthetic */ boolean b(Bitmap bitmap, xk7 xk7Var) {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements kt8<Bitmap> {
        public final Bitmap t;

        public a(Bitmap bitmap) {
            this.t = bitmap;
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

        @Override // defpackage.kt8
        public final void a() {
        }
    }
}
