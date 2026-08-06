package defpackage;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    public static final Bitmap a(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, Bitmap.Config config) {
        if (Build.VERSION.SDK_INT < 30) {
            return mediaMetadataRetriever.getFrameAtTime(j, i);
        }
        MediaMetadataRetriever.BitmapParams bitmapParams = new MediaMetadataRetriever.BitmapParams();
        bitmapParams.setPreferredConfig(config);
        return mediaMetadataRetriever.getFrameAtTime(j, i, bitmapParams);
    }

    public static final Bitmap b(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, Bitmap.Config config) {
        if (Build.VERSION.SDK_INT < 30) {
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, i2, i3);
        }
        MediaMetadataRetriever.BitmapParams bitmapParams = new MediaMetadataRetriever.BitmapParams();
        bitmapParams.setPreferredConfig(config);
        return mediaMetadataRetriever.getScaledFrameAtTime(j, i, i2, i3, bitmapParams);
    }

    public static final int c(s03 s03Var, s39 s39Var) {
        if (s03Var instanceof s03.a) {
            return ((s03.a) s03Var).a;
        }
        int iOrdinal = s39Var.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        u.b();
        return 0;
    }
}
