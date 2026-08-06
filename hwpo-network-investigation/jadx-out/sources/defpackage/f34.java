package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f34 extends tq0 {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(ko5.a);

    @Override // defpackage.ko5
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.tq0
    public final Bitmap c(qq0 qq0Var, Bitmap bitmap, int i, int i2) {
        return hva.b(qq0Var, bitmap, i, i2);
    }

    @Override // defpackage.ko5
    public final boolean equals(Object obj) {
        return obj instanceof f34;
    }

    @Override // defpackage.ko5
    public final int hashCode() {
        return 1572326941;
    }
}
