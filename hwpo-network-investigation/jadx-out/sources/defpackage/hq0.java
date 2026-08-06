package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hq0 implements st8<Bitmap> {
    public static final mk7<Integer> b = mk7.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
    public static final mk7<Bitmap.CompressFormat> c = new mk7<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, mk7.e);
    public final o30 a;

    public hq0(o30 o30Var) {
        this.a = o30Var;
    }

    @Override // defpackage.st8
    public final uf3 a(xk7 xk7Var) {
        return uf3.u;
    }

    @Override // defpackage.xf3
    public final boolean b(Object obj, File file, xk7 xk7Var) throws Throwable {
        boolean z;
        Bitmap bitmap = (Bitmap) ((kt8) obj).get();
        mk7<Bitmap.CompressFormat> mk7Var = c;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) xk7Var.c(mk7Var);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = vd6.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) xk7Var.c(b)).intValue();
        OutputStream ey0Var = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    o30 o30Var = this.a;
                    if (o30Var != null) {
                        try {
                            ey0Var = new ey0(fileOutputStream, o30Var);
                        } catch (IOException e) {
                            e = e;
                            ey0Var = fileOutputStream;
                            if (Log.isLoggable("BitmapEncoder", 3)) {
                                Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                            }
                            if (ey0Var != null) {
                                try {
                                    ey0Var.close();
                                } catch (IOException unused) {
                                }
                            }
                            z = false;
                        } catch (Throwable th) {
                            th = th;
                            ey0Var = fileOutputStream;
                            if (ey0Var != null) {
                                try {
                                    ey0Var.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        ey0Var = fileOutputStream;
                    }
                    bitmap.compress(compressFormat, iIntValue, ey0Var);
                    ey0Var.close();
                    try {
                        ey0Var.close();
                    } catch (IOException unused3) {
                    }
                    z = true;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e2) {
                e = e2;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + l6b.c(bitmap) + " in " + vd6.a(jElapsedRealtimeNanos) + ", options format: " + xk7Var.c(mk7Var) + ", hasAlpha: " + bitmap.hasAlpha());
            }
            return z;
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
