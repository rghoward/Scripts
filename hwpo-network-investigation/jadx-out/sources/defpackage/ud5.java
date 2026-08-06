package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ud5 implements pt8<InputStream, Bitmap> {
    public final nq0 a = new nq0();

    @Override // defpackage.pt8
    public final kt8<Bitmap> a(InputStream inputStream, int i, int i2, xk7 xk7Var) {
        return this.a.c(ImageDecoder.createSource(yz0.b(inputStream)), i, i2, xk7Var);
    }

    @Override // defpackage.pt8
    public final /* bridge */ /* synthetic */ boolean b(InputStream inputStream, xk7 xk7Var) {
        return true;
    }
}
