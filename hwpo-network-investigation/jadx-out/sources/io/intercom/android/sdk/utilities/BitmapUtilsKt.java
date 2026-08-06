package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import defpackage.co3;
import defpackage.fg1;
import defpackage.g2b;
import defpackage.ws0;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class BitmapUtilsKt {
    public static final int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        options.getClass();
        Integer numValueOf = Integer.valueOf(options.outHeight);
        Integer numValueOf2 = Integer.valueOf(options.outWidth);
        int iIntValue = numValueOf.intValue();
        int iIntValue2 = numValueOf2.intValue();
        int i3 = 1;
        if (iIntValue <= i2 && iIntValue2 <= i) {
            return 1;
        }
        int i4 = iIntValue / 2;
        int i5 = iIntValue2 / 2;
        while (i4 / i3 >= i2 && i5 / i3 >= i) {
            i3 *= 2;
        }
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    public static final Bitmap determineBitmapRotation(Context context, Uri uri, Bitmap bitmap) {
        Bitmap bitmap2;
        Bitmap bitmap3;
        context.getClass();
        uri.getClass();
        bitmap.getClass();
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream != null) {
            int iC = new co3(inputStreamOpenInputStream).c(0, "Orientation");
            Matrix matrix = new Matrix();
            if (iC == 3) {
                matrix.postRotate(180.0f);
            } else if (iC == 6) {
                matrix.postRotate(90.0f);
            } else if (iC == 8) {
                matrix.postRotate(270.0f);
            }
            bitmap2 = bitmap;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            if (bitmapCreateBitmap != null) {
                bitmap3 = bitmapCreateBitmap;
            }
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream.close();
            }
            return bitmap3;
        }
        bitmap2 = bitmap;
        bitmap3 = bitmap2;
        if (inputStreamOpenInputStream != null) {
            inputStreamOpenInputStream.close();
        }
        return bitmap3;
    }

    public static final Bitmap drawableToBitmap(Drawable drawable, int i, int i2) {
        Bitmap bitmapCreateBitmap;
        drawable.getClass();
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                bitmap.getClass();
                return bitmap;
            }
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static final Map<String, String> extractExifData(Context context, Uri uri) {
        context.getClass();
        uri.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    co3 co3Var = new co3(inputStreamOpenInputStream);
                    for (String str : ws0.i("DateTime", "DateTimeOriginal", "DateTimeDigitized")) {
                        String strB = co3Var.b(str);
                        if (strB != null && strB.length() > 0) {
                            linkedHashMap.put(str, strB);
                        }
                    }
                    g2b g2bVar = g2b.a;
                    inputStreamOpenInputStream.close();
                    return linkedHashMap;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        fg1.a(inputStreamOpenInputStream, th);
                        throw th2;
                    }
                }
            }
        } catch (IOException e) {
            Log.w("ExifExtractor", "Failed to extract EXIF data: " + e.getMessage());
        } catch (NullPointerException e2) {
            Log.w("ExifExtractor", "Failed to extract EXIF data (null pointer): " + e2.getMessage());
        }
        return linkedHashMap;
    }
}
