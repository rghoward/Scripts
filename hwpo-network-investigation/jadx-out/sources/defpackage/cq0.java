package defpackage;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cq0 implements eu8<Bitmap, byte[]> {
    public final Bitmap.CompressFormat t = Bitmap.CompressFormat.JPEG;
    public final int u = 100;

    @Override // defpackage.eu8
    public final kt8<byte[]> a(kt8<Bitmap> kt8Var, xk7 xk7Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        kt8Var.get().compress(this.t, this.u, byteArrayOutputStream);
        kt8Var.a();
        return new h01(byteArrayOutputStream.toByteArray());
    }
}
