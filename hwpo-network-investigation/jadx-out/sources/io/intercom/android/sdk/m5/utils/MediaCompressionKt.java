package io.intercom.android.sdk.m5.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import com.intercom.twig.Twig;
import defpackage.aa0;
import defpackage.al;
import defpackage.av8;
import defpackage.dv8;
import defpackage.js7;
import defpackage.nz8;
import defpackage.r02;
import defpackage.th0;
import defpackage.th1;
import defpackage.u;
import defpackage.u02;
import defpackage.v72;
import defpackage.ws0;
import defpackage.xm2;
import defpackage.z2a;
import io.intercom.android.sdk.lightcompressor.CompressionListener;
import io.intercom.android.sdk.lightcompressor.VideoCompressor;
import io.intercom.android.sdk.lightcompressor.VideoQuality;
import io.intercom.android.sdk.lightcompressor.config.AppSpecificStorageConfiguration;
import io.intercom.android.sdk.lightcompressor.config.Configuration;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.conversation.utils.URIExtensionsKt;
import io.intercom.android.sdk.m5.upload.data.MediaData;
import io.intercom.android.sdk.utilities.BitmapUtilsKt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class MediaCompressionKt {
    private static final String compressedImagesFolderName = "compressed_images";
    private static final String compressedVideosFolderName = "compressed_videos";

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.utils.MediaCompressionKt$getCompressedMediaData$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.utils.MediaCompressionKt", f = "MediaCompression.kt", l = {159}, m = "getCompressedMediaData")
    public static final class AnonymousClass1 extends u02 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MediaCompressionKt.getCompressedMediaData(null, null, 0, this);
        }
    }

    public static final void deleteCompressedMedia(Uri uri) {
        String path;
        uri.getClass();
        if ((uri.getPathSegments().contains(compressedVideosFolderName) || uri.getPathSegments().contains(compressedImagesFolderName)) && (path = uri.getPath()) != null) {
            new File(path).delete();
        }
    }

    private static final CompressedImageData getCompressedImageData(Uri uri, Context context, String str, int i) throws Throwable {
        Bitmap bitmapCreateBitmap;
        Throwable th;
        FileOutputStream fileOutputStream;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream.close();
            }
            options.inSampleSize = BitmapUtilsKt.calculateInSampleSize(options, 612, 816);
            options.inJustDecodeBounds = false;
            InputStream inputStreamOpenInputStream2 = context.getContentResolver().openInputStream(uri);
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options);
            if (inputStreamOpenInputStream2 != null) {
                inputStreamOpenInputStream2.close();
            }
            if (bitmapDecodeStream == null) {
                return null;
            }
            Bitmap bitmapDetermineBitmapRotation = BitmapUtilsKt.determineBitmapRotation(context, uri, bitmapDecodeStream);
            File file = new File(context.getCacheDir(), compressedImagesFolderName);
            file.mkdirs();
            File file2 = new File(file, str + ".jpg");
            if (bitmapDetermineBitmapRotation.hasAlpha()) {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapDetermineBitmapRotation.getWidth(), bitmapDetermineBitmapRotation.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.drawColor(i);
                canvas.drawBitmap(bitmapDetermineBitmapRotation, 0.0f, 0.0f, (Paint) null);
            } else {
                bitmapCreateBitmap = bitmapDetermineBitmapRotation;
            }
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                    Uri uriFromFile = Uri.fromFile(file2);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    if (uriFromFile != null) {
                        return new CompressedImageData(uriFromFile, bitmapDetermineBitmapRotation.getWidth(), bitmapDetermineBitmapRotation.getHeight(), file2.length());
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    if (fileOutputStream != null) {
                        fileOutputStream.flush();
                    }
                    if (fileOutputStream == null) {
                        throw th;
                    }
                    fileOutputStream.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (IOException e) {
            LumberMill.getLogger().internal("MediaCompression", "Failed to compress image: " + e.getMessage());
            return null;
        }
    }

    public static /* synthetic */ CompressedImageData getCompressedImageData$default(Uri uri, Context context, String str, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = -1;
        }
        return getCompressedImageData(uri, context, str, i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object getCompressedMediaData(MediaData.Media media, Context context, int i, r02<? super MediaData.Media> r02Var) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Object compressedVideoData;
        Context context2;
        String str;
        MediaData.Media.Video videoCopy$default;
        MediaData.Media media2 = media;
        if (r02Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) r02Var;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(r02Var);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(r02Var);
        }
        Object obj = anonymousClass1.result;
        int i3 = anonymousClass1.label;
        if (i3 == 0) {
            dv8.b(obj);
            if (!(media2 instanceof MediaData.Media.Video)) {
                if (media2 instanceof MediaData.Media.Image) {
                    MediaData.Media.Image image = (MediaData.Media.Image) media2;
                    String str2 = (String) th1.y(z2a.I(image.getFileName(), new String[]{"."}, 6));
                    CompressedImageData compressedImageData = getCompressedImageData(image.getUri(), context, str2, i);
                    return compressedImageData != null ? new MediaData.Media.Image("image/jpg", compressedImageData.getWidth(), compressedImageData.getHeight(), compressedImageData.getSize(), al.d(str2, ".jpg"), compressedImageData.getUri(), image.getExifData()) : image;
                }
                if (media2 instanceof MediaData.Media.Other) {
                    return media2;
                }
                u.b();
                return null;
            }
            try {
                String str3 = (String) th1.y(z2a.I(((MediaData.Media.Video) media2).getFileName(), new String[]{"."}, 6));
                Uri uri = ((MediaData.Media.Video) media2).getUri();
                anonymousClass1.L$0 = media2;
                anonymousClass1.L$1 = context;
                anonymousClass1.L$2 = str3;
                anonymousClass1.label = 1;
                compressedVideoData = getCompressedVideoData(uri, context, str3, anonymousClass1);
                v72 v72Var = v72.t;
                if (compressedVideoData == v72Var) {
                    return v72Var;
                }
                context2 = context;
                str = str3;
            } catch (Throwable unused) {
                return (MediaData.Media.Video) media2;
            }
        } else {
            if (i3 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str4 = (String) anonymousClass1.L$2;
            Context context3 = (Context) anonymousClass1.L$1;
            MediaData.Media media3 = (MediaData.Media) anonymousClass1.L$0;
            try {
                dv8.b(obj);
                str = str4;
                media2 = media3;
                compressedVideoData = obj;
                context2 = context3;
            } catch (Throwable unused2) {
                media2 = media3;
                return (MediaData.Media.Video) media2;
            }
        }
        js7 js7Var = (js7) compressedVideoData;
        Uri uri2 = (Uri) js7Var.t;
        if (uri2 != null) {
            MediaData.Media.Video videoData = URIExtensionsKt.getVideoData(uri2, context2, str + ".mp4", "video/mp4", ((Number) js7Var.u).longValue(), false);
            if (videoData != null && (videoCopy$default = MediaData.Media.Video.copy$default(videoData, null, 0, 0, 0L, null, null, 0L, ((MediaData.Media.Video) media2).getThumbnail(), 127, null)) != null) {
                return videoCopy$default;
            }
        }
        return (MediaData.Media.Video) media2;
    }

    public static /* synthetic */ Object getCompressedMediaData$default(MediaData.Media media, Context context, int i, r02 r02Var, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = -1;
        }
        return getCompressedMediaData(media, context, i, r02Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getCompressedVideoData(Uri uri, Context context, String str, r02<? super js7<? extends Uri, Long>> r02Var) {
        final nz8 nz8Var = new nz8(th0.e(r02Var), v72.u);
        final Twig logger = LumberMill.getLogger();
        VideoCompressor.start$default(context, ws0.h(uri), false, null, new AppSpecificStorageConfiguration(compressedVideosFolderName), new Configuration(VideoQuality.LOW, false, null, false, false, null, null, ws0.h(str), 126, null), new CompressionListener() { // from class: io.intercom.android.sdk.m5.utils.MediaCompressionKt$getCompressedVideoData$2$1
            @Override // io.intercom.android.sdk.lightcompressor.CompressionListener
            public void onCancelled(int i) {
                logger.internal("Video compression cancelled.");
                nz8Var.resumeWith(new av8.a(new CancellationException()));
            }

            @Override // io.intercom.android.sdk.lightcompressor.CompressionListener
            public void onFailure(int i, String str2) {
                str2.getClass();
                logger.internal("Video compression failed: " + str2 + '.');
                nz8Var.resumeWith(new av8.a(new Throwable(str2)));
            }

            @Override // io.intercom.android.sdk.lightcompressor.CompressionListener
            public void onProgress(int i, float f) {
                logger.internal("Video compression in progress: " + f + '.');
            }

            @Override // io.intercom.android.sdk.lightcompressor.CompressionListener
            public void onStart(int i) {
                logger.internal("Video compression started.");
            }

            @Override // io.intercom.android.sdk.lightcompressor.CompressionListener
            public void onSuccess(int i, long j, String str2) {
                logger.internal("Video compression succeeded. Video saved in " + str2 + '.');
                nz8Var.resumeWith(new js7(Uri.fromFile(str2 != null ? new File(str2) : null), Long.valueOf(j)));
            }
        }, 8, null);
        return nz8Var.a();
    }
}
