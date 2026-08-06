package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nq0 implements pt8<ImageDecoder.Source, Bitmap> {
    public final rq0 a = new rq0();

    @Override // defpackage.pt8
    public final /* bridge */ /* synthetic */ kt8<Bitmap> a(ImageDecoder.Source source, int i, int i2, xk7 xk7Var) {
        return c(yk.a(source), i, i2, xk7Var);
    }

    @Override // defpackage.pt8
    public final /* bridge */ /* synthetic */ boolean b(ImageDecoder.Source source, xk7 xk7Var) {
        yk.a(source);
        return true;
    }

    public final sq0 c(ImageDecoder.Source source, int i, int i2, xk7 xk7Var) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new ss2(i, i2, xk7Var));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new sq0(this.a, bitmapDecodeBitmap);
    }
}
