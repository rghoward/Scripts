package io.intercom.android.sdk.m5.conversation.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.intercom.twig.BuildConfig;
import defpackage.co3;
import defpackage.fg1;
import defpackage.g2b;
import defpackage.js7;
import defpackage.v2a;
import defpackage.z2a;
import io.intercom.android.sdk.IntercomFileProviderKt;
import io.intercom.android.sdk.m5.upload.data.MediaData;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class URIExtensionsKt {
    private static final MediaData.Media.Image getImageData(Uri uri, ContentResolver contentResolver, String str, String str2, long j) throws IOException {
        int i;
        int i2;
        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
        if (inputStreamOpenInputStream != null) {
            try {
                co3 co3Var = new co3(inputStreamOpenInputStream);
                int iC = co3Var.c(480, "ImageLength");
                int iC2 = co3Var.c(640, "ImageWidth");
                int iC3 = co3Var.c(1, "Orientation");
                boolean z = iC3 == 6 || iC3 == 8;
                int i3 = z ? iC2 : iC;
                int i4 = z ? iC : iC2;
                g2b g2bVar = g2b.a;
                inputStreamOpenInputStream.close();
                i = i4;
                i2 = i3;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    fg1.a(inputStreamOpenInputStream, th);
                    throw th2;
                }
            }
        } else {
            i = 0;
            i2 = 0;
        }
        return new MediaData.Media.Image(str2, i, i2, j, str, uri, null, 64, null);
    }

    public static final MediaData.Media getMediaData(Uri uri, Context context, boolean z) throws IOException {
        String string;
        MediaData.Media other;
        uri.getClass();
        context.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = contentResolver.query(uri, null, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            cursorQuery.moveToFirst();
            String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
            if (cursorQuery.getColumnIndex("mime_type") != -1) {
                string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("mime_type"));
            } else {
                string2.getClass();
                if (z2a.o(string2, ".jpg", false)) {
                    string = "image/jpg";
                } else {
                    string = z2a.o(string2, ".mp4", false) ? "video/mp4" : BuildConfig.FLAVOR;
                }
            }
            String str = string;
            long j = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_size"));
            str.getClass();
            if (z2a.o(str, "video", false)) {
                string2.getClass();
                other = getVideoData(uri, context, string2, str, j, z);
            } else if (z2a.o(str, AppearanceType.IMAGE, false)) {
                string2.getClass();
                other = getImageData(uri, contentResolver, string2, str, j);
            } else {
                string2.getClass();
                other = new MediaData.Media.Other(str, j, string2, uri);
            }
            cursorQuery.close();
            return other;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fg1.a(cursorQuery, th);
                throw th2;
            }
        }
    }

    public static /* synthetic */ MediaData.Media getMediaData$default(Uri uri, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return getMediaData(uri, context, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final MediaData.Media.Video getVideoData(Uri uri, Context context, String str, String str2, long j, boolean z) throws Exception {
        boolean zIsTerminated;
        Integer numF;
        Integer numF2;
        Long lG;
        uri.getClass();
        context.getClass();
        str.getClass();
        str2.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(context, uri);
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
        long jLongValue = (strExtractMetadata == null || (lG = v2a.g(strExtractMetadata)) == null) ? 0L : lG.longValue();
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
        boolean z2 = false;
        int iIntValue = (strExtractMetadata2 == null || (numF2 = v2a.f(strExtractMetadata2)) == null) ? 0 : numF2.intValue();
        String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
        int iIntValue2 = (strExtractMetadata3 == null || (numF = v2a.f(strExtractMetadata3)) == null) ? 0 : numF.intValue();
        MediaData.Media.Image image = null;
        if (z) {
            String str3 = "thumbnail_" + z2a.P(str, ".") + ".jpg";
            js7 js7Var = iIntValue2 > iIntValue ? new js7(320, 240) : new js7(240, 320);
            Bitmap scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(0L, 2, Math.max(iIntValue / 2, ((Number) js7Var.u).intValue()), Math.max(iIntValue2 / 2, ((Number) js7Var.t).intValue()));
            if (scaledFrameAtTime != null) {
                File externalCacheDir = context.getExternalCacheDir();
                if (externalCacheDir == null) {
                    externalCacheDir = context.getCacheDir();
                }
                File file = new File(externalCacheDir, "images");
                file.mkdir();
                File file2 = new File(file, str3);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                scaledFrameAtTime.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                Uri uriForFile = FileProvider.getUriForFile(context, IntercomFileProviderKt.fileProviderAuthority(context), file2);
                uriForFile.getClass();
                image = new MediaData.Media.Image("image/jpg", scaledFrameAtTime.getWidth(), scaledFrameAtTime.getHeight(), file2.length(), str3, uriForFile, null, 64, null);
            }
        }
        if (mediaMetadataRetriever instanceof AutoCloseable) {
            mediaMetadataRetriever.close();
        } else if (mediaMetadataRetriever instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) mediaMetadataRetriever;
            if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                executorService.shutdown();
                while (!zIsTerminated) {
                    try {
                        zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                    } catch (InterruptedException unused) {
                        if (!z2) {
                            executorService.shutdownNow();
                            z2 = true;
                        }
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            }
        } else {
            mediaMetadataRetriever.release();
        }
        return new MediaData.Media.Video(str2, iIntValue, iIntValue2, j, str, uri, jLongValue, image);
    }
}
