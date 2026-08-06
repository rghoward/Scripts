package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lt8 implements pt8<Uri, Bitmap> {
    public final rt8 a;
    public final qq0 b;

    public lt8(rt8 rt8Var, qq0 qq0Var) {
        this.a = rt8Var;
        this.b = qq0Var;
    }

    @Override // defpackage.pt8
    public final kt8<Bitmap> a(Uri uri, int i, int i2, xk7 xk7Var) {
        kt8 kt8VarC = this.a.c(uri, xk7Var);
        if (kt8VarC == null) {
            return null;
        }
        return v73.a(this.b, (Drawable) ((t73) kt8VarC).get(), i, i2);
    }

    @Override // defpackage.pt8
    public final boolean b(Uri uri, xk7 xk7Var) {
        return "android.resource".equals(uri.getScheme());
    }
}
