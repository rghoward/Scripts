package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wu {
    public final ArrayList a;
    public final o30 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements kt8<Drawable> {
        public final AnimatedImageDrawable t;

        public a(AnimatedImageDrawable animatedImageDrawable) {
            this.t = animatedImageDrawable;
        }

        @Override // defpackage.kt8
        public final void a() {
            this.t.stop();
            this.t.clearAnimationCallbacks();
        }

        @Override // defpackage.kt8
        public final Class<Drawable> c() {
            return Drawable.class;
        }

        @Override // defpackage.kt8
        public final Drawable get() {
            return this.t;
        }

        @Override // defpackage.kt8
        public final int getSize() {
            return l6b.d(Bitmap.Config.ARGB_8888) * this.t.getIntrinsicHeight() * this.t.getIntrinsicWidth() * 2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements pt8<ByteBuffer, Drawable> {
        public final wu a;

        public b(wu wuVar) {
            this.a = wuVar;
        }

        @Override // defpackage.pt8
        public final kt8<Drawable> a(ByteBuffer byteBuffer, int i, int i2, xk7 xk7Var) {
            return wu.a(ImageDecoder.createSource(byteBuffer), i, i2, xk7Var);
        }

        @Override // defpackage.pt8
        public final boolean b(ByteBuffer byteBuffer, xk7 xk7Var) {
            ImageHeaderParser.ImageType imageTypeC = com.bumptech.glide.load.a.c(this.a.a, byteBuffer);
            if (imageTypeC != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return Build.VERSION.SDK_INT >= 31 && imageTypeC == ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements pt8<InputStream, Drawable> {
        public final wu a;

        public c(wu wuVar) {
            this.a = wuVar;
        }

        @Override // defpackage.pt8
        public final kt8<Drawable> a(InputStream inputStream, int i, int i2, xk7 xk7Var) {
            return wu.a(ImageDecoder.createSource(yz0.b(inputStream)), i, i2, xk7Var);
        }

        @Override // defpackage.pt8
        public final boolean b(InputStream inputStream, xk7 xk7Var) throws IOException {
            wu wuVar = this.a;
            ImageHeaderParser.ImageType imageTypeB = com.bumptech.glide.load.a.b(wuVar.a, inputStream, wuVar.b);
            if (imageTypeB != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return Build.VERSION.SDK_INT >= 31 && imageTypeB == ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            return true;
        }
    }

    public wu(ArrayList arrayList, o30 o30Var) {
        this.a = arrayList;
        this.b = o30Var;
    }

    public static a a(ImageDecoder.Source source, int i, int i2, xk7 xk7Var) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new ss2(i, i2, xk7Var));
        if (drawableDecodeDrawable instanceof AnimatedImageDrawable) {
            return new a((AnimatedImageDrawable) drawableDecodeDrawable);
        }
        i34.c(drawableDecodeDrawable, "Received unexpected drawable type for animated image, failing: ");
        return null;
    }
}
