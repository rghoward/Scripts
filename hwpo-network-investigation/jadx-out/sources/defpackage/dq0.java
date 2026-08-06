package defpackage;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dq0 {
    public static final a Companion = new a();
    public final ContentResolver a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public dq0(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ByteArrayOutputStream a(Uri uri) throws IOException {
        int i;
        Bitmap bitmapDecodeByteArray;
        uri.getClass();
        ContentResolver contentResolver = this.a;
        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
        if (inputStreamOpenInputStream == null) {
            ru3.d("Couldn't open input stream");
            return null;
        }
        InputStream inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
        switch (inputStreamOpenInputStream2 != null ? new co3(inputStreamOpenInputStream2).c(0, "Orientation") : 0) {
            case 3:
            case 4:
                i = 180;
                break;
            case 5:
            case 6:
                i = 90;
                break;
            case 7:
            case 8:
                i = 270;
                break;
            default:
                i = 0;
                break;
        }
        String type = contentResolver.getType(uri);
        if (type == null) {
            type = AppearanceType.IMAGE;
        }
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(type);
        if (extensionFromMimeType == null) {
            extensionFromMimeType = "jpg";
        }
        byte[] bArrB = nt.b(inputStreamOpenInputStream);
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i2 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArrB, 0, bArrB.length, options);
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        if (i3 > 2048 || i4 > 2048) {
            float f = (i3 > i4 ? i3 : i4) / 2048.0f;
            int i5 = (int) (i3 / f);
            int i6 = (int) (i4 / f);
            int i7 = options.outWidth;
            if (i4 > i6 || i7 > i5) {
                int i8 = i4 / 2;
                int i9 = i7 / 2;
                while (i8 / i2 >= i6 && i9 / i2 >= i5) {
                    i2 *= 2;
                }
            }
            options.inSampleSize = i2;
            options.inJustDecodeBounds = false;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrB, 0, bArrB.length, options);
        } else {
            options.inJustDecodeBounds = false;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrB, 0, bArrB.length, options);
        }
        Bitmap bitmap = bitmapDecodeByteArray;
        js7 js7Var = (extensionFromMimeType.equals("jpeg") || extensionFromMimeType.equals("jpg")) ? new js7(Bitmap.CompressFormat.JPEG, 90) : new js7(Bitmap.CompressFormat.PNG, 0);
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) js7Var.t;
        int iIntValue = ((Number) js7Var.u).intValue();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.getClass();
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            if (!bitmap.sameAs(bitmapCreateBitmap)) {
                bitmap = bitmapCreateBitmap;
            }
        } catch (OutOfMemoryError e) {
            rma.a.c(e.toString());
        }
        bitmap.getClass();
        bitmap.compress(compressFormat, iIntValue, byteArrayOutputStream);
        return byteArrayOutputStream;
    }
}
