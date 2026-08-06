package io.intercom.android.sdk.lightcompressor;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import defpackage.aa0;
import defpackage.al;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.el5;
import defpackage.et2;
import defpackage.fg1;
import defpackage.g2b;
import defpackage.gl8;
import defpackage.h72;
import defpackage.i23;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.u72;
import defpackage.v72;
import defpackage.vv2;
import defpackage.wr2;
import defpackage.xj5;
import defpackage.xm2;
import defpackage.z2a;
import io.intercom.android.sdk.lightcompressor.compressor.Compressor;
import io.intercom.android.sdk.lightcompressor.config.AppSpecificStorageConfiguration;
import io.intercom.android.sdk.lightcompressor.config.Configuration;
import io.intercom.android.sdk.lightcompressor.config.SaveLocation;
import io.intercom.android.sdk.lightcompressor.config.SharedStorageConfiguration;
import io.intercom.android.sdk.lightcompressor.video.Result;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class VideoCompressor implements t72 {
    public static final VideoCompressor INSTANCE = new VideoCompressor();
    private static el5 job;
    private final /* synthetic */ t72 $$delegate_0 = u72.b();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SaveLocation.values().length];
            try {
                iArr[SaveLocation.downloads.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SaveLocation.pictures.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.lightcompressor.VideoCompressor$doVideoCompression$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.lightcompressor.VideoCompressor$doVideoCompression$1", f = "VideoCompressor.kt", l = {123, 150}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ AppSpecificStorageConfiguration $appSpecificStorageConfiguration;
        final /* synthetic */ Configuration $configuration;
        final /* synthetic */ Context $context;
        final /* synthetic */ int $i;
        final /* synthetic */ boolean $isStreamable;
        final /* synthetic */ CompressionListener $listener;
        final /* synthetic */ SharedStorageConfiguration $sharedStorageConfiguration;
        final /* synthetic */ gl8<File> $streamableFile;
        final /* synthetic */ List<Uri> $uris;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Context context, SharedStorageConfiguration sharedStorageConfiguration, AppSpecificStorageConfiguration appSpecificStorageConfiguration, boolean z, Configuration configuration, int i, gl8<File> gl8Var, List<? extends Uri> list, CompressionListener compressionListener, r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
            this.$context = context;
            this.$sharedStorageConfiguration = sharedStorageConfiguration;
            this.$appSpecificStorageConfiguration = appSpecificStorageConfiguration;
            this.$isStreamable = z;
            this.$configuration = configuration;
            this.$i = i;
            this.$streamableFile = gl8Var;
            this.$uris = list;
            this.$listener = compressionListener;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.$sharedStorageConfiguration, this.$appSpecificStorageConfiguration, this.$isStreamable, this.$configuration, this.$i, this.$streamableFile, this.$uris, this.$listener, r02Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x010b  */
        /* JADX WARN: Code duplicated, block: B:29:0x0131  */
        /* JADX WARN: Code duplicated, block: B:30:0x0136  */
        /* JADX WARN: Code duplicated, block: B:32:0x013b  */
        /* JADX WARN: Code duplicated, block: B:34:0x0141  */
        /* JADX WARN: Type inference failed for: r4v8, types: [T, java.io.File] */
        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objW;
            boolean z;
            int i;
            Object objStartCompression;
            Context context;
            Configuration configuration;
            CompressionListener compressionListener;
            SharedStorageConfiguration sharedStorageConfiguration;
            AppSpecificStorageConfiguration appSpecificStorageConfiguration;
            Result result;
            String failureMessage;
            File fileSaveVideoFile;
            String path;
            int i2 = this.label;
            v72 v72Var = v72.t;
            if (i2 == 0) {
                dv8.b(obj);
                vv2 vv2VarB = oy0.b((t72) this.L$0, null, new VideoCompressor$doVideoCompression$1$job$1(this.$context, this.$uris, this.$i, null), 3);
                this.label = 1;
                objW = vv2VarB.w(this);
                if (objW != v72Var) {
                }
                return v72Var;
            }
            if (i2 == 1) {
                dv8.b(obj);
                objW = obj;
            } else {
                if (i2 != 2) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z2 = this.Z$0;
                i = this.I$0;
                AppSpecificStorageConfiguration appSpecificStorageConfiguration2 = (AppSpecificStorageConfiguration) this.L$4;
                SharedStorageConfiguration sharedStorageConfiguration2 = (SharedStorageConfiguration) this.L$3;
                configuration = (Configuration) this.L$2;
                Context context2 = (Context) this.L$1;
                CompressionListener compressionListener2 = (CompressionListener) this.L$0;
                dv8.b(obj);
                sharedStorageConfiguration = sharedStorageConfiguration2;
                context = context2;
                z = z2;
                compressionListener = compressionListener2;
                objStartCompression = obj;
                appSpecificStorageConfiguration = appSpecificStorageConfiguration2;
            }
            result = (Result) objStartCompression;
            if (result.getSuccess()) {
                fileSaveVideoFile = VideoCompressor.INSTANCE.saveVideoFile(context, result.getPath(), sharedStorageConfiguration, appSpecificStorageConfiguration, Boolean.valueOf(z), configuration.getVideoNames().get(i), Boolean.TRUE);
                long size = result.getSize();
                if (fileSaveVideoFile != null) {
                    path = fileSaveVideoFile.getPath();
                } else {
                    path = null;
                }
                compressionListener.onSuccess(i, size, path);
            } else {
                failureMessage = result.getFailureMessage();
                if (failureMessage == null) {
                    failureMessage = "An error has occurred!";
                }
                compressionListener.onFailure(i, failureMessage);
            }
            return g2b.a;
            String str = (String) objW;
            VideoCompressor videoCompressor = VideoCompressor.INSTANCE;
            Context context3 = this.$context;
            SharedStorageConfiguration sharedStorageConfiguration3 = this.$sharedStorageConfiguration;
            AppSpecificStorageConfiguration appSpecificStorageConfiguration3 = this.$appSpecificStorageConfiguration;
            Boolean boolValueOf = Boolean.valueOf(this.$isStreamable);
            String str2 = this.$configuration.getVideoNames().get(this.$i);
            Boolean bool = Boolean.FALSE;
            File fileSaveVideoFile2 = videoCompressor.saveVideoFile(context3, str, sharedStorageConfiguration3, appSpecificStorageConfiguration3, boolValueOf, str2, bool);
            if (this.$isStreamable) {
                this.$streamableFile.t = videoCompressor.saveVideoFile(this.$context, str, this.$sharedStorageConfiguration, this.$appSpecificStorageConfiguration, null, this.$configuration.getVideoNames().get(this.$i), bool);
            }
            if (fileSaveVideoFile2 != null) {
                CompressionListener compressionListener3 = this.$listener;
                int i3 = this.$i;
                Context context4 = this.$context;
                List<Uri> list = this.$uris;
                gl8<File> gl8Var = this.$streamableFile;
                Configuration configuration2 = this.$configuration;
                SharedStorageConfiguration sharedStorageConfiguration4 = this.$sharedStorageConfiguration;
                AppSpecificStorageConfiguration appSpecificStorageConfiguration4 = this.$appSpecificStorageConfiguration;
                z = this.$isStreamable;
                Compressor.INSTANCE.setRunning(true);
                compressionListener3.onStart(i3);
                Uri uri = list.get(i3);
                String path2 = fileSaveVideoFile2.getPath();
                path2.getClass();
                File file = gl8Var.t;
                String path3 = file != null ? file.getPath() : null;
                this.L$0 = compressionListener3;
                this.L$1 = context4;
                this.L$2 = configuration2;
                this.L$3 = sharedStorageConfiguration4;
                this.L$4 = appSpecificStorageConfiguration4;
                this.I$0 = i3;
                this.Z$0 = z;
                this.label = 2;
                i = i3;
                objStartCompression = videoCompressor.startCompression(i, context4, uri, path2, path3, configuration2, compressionListener3, this);
                if (objStartCompression != v72Var) {
                    context = context4;
                    configuration = configuration2;
                    compressionListener = compressionListener3;
                    sharedStorageConfiguration = sharedStorageConfiguration4;
                    appSpecificStorageConfiguration = appSpecificStorageConfiguration4;
                    result = (Result) objStartCompression;
                    if (result.getSuccess()) {
                        fileSaveVideoFile = VideoCompressor.INSTANCE.saveVideoFile(context, result.getPath(), sharedStorageConfiguration, appSpecificStorageConfiguration, Boolean.valueOf(z), configuration.getVideoNames().get(i), Boolean.TRUE);
                        long size2 = result.getSize();
                        if (fileSaveVideoFile != null) {
                            path = fileSaveVideoFile.getPath();
                        } else {
                            path = null;
                        }
                        compressionListener.onSuccess(i, size2, path);
                    } else {
                        failureMessage = result.getFailureMessage();
                        if (failureMessage == null) {
                            failureMessage = "An error has occurred!";
                        }
                        compressionListener.onFailure(i, failureMessage);
                    }
                }
                return v72Var;
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.lightcompressor.VideoCompressor$startCompression$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.lightcompressor.VideoCompressor$startCompression$2", f = "VideoCompressor.kt", l = {190}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends p6a implements ci4<t72, r02<? super Result>, Object> {
        final /* synthetic */ Configuration $configuration;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $destPath;
        final /* synthetic */ int $index;
        final /* synthetic */ CompressionListener $listener;
        final /* synthetic */ Uri $srcUri;
        final /* synthetic */ String $streamableFile;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, Context context, Uri uri, String str, String str2, Configuration configuration, CompressionListener compressionListener, r02<? super AnonymousClass2> r02Var) {
            super(2, r02Var);
            this.$index = i;
            this.$context = context;
            this.$srcUri = uri;
            this.$destPath = str;
            this.$streamableFile = str2;
            this.$configuration = configuration;
            this.$listener = compressionListener;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new AnonymousClass2(this.$index, this.$context, this.$srcUri, this.$destPath, this.$streamableFile, this.$configuration, this.$listener, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super Result> r02Var) {
            return ((AnonymousClass2) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    dv8.b(obj);
                    return obj;
                }
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            Compressor compressor = Compressor.INSTANCE;
            int i2 = this.$index;
            Context context = this.$context;
            Uri uri = this.$srcUri;
            String str = this.$destPath;
            String str2 = this.$streamableFile;
            Configuration configuration = this.$configuration;
            final CompressionListener compressionListener = this.$listener;
            CompressionProgressListener compressionProgressListener = new CompressionProgressListener() { // from class: io.intercom.android.sdk.lightcompressor.VideoCompressor.startCompression.2.1
                @Override // io.intercom.android.sdk.lightcompressor.CompressionProgressListener
                public void onProgressCancelled(int i3) {
                    compressionListener.onCancelled(i3);
                }

                @Override // io.intercom.android.sdk.lightcompressor.CompressionProgressListener
                public void onProgressChanged(int i3, float f) {
                    compressionListener.onProgress(i3, f);
                }
            };
            this.label = 1;
            Object objCompressVideo = compressor.compressVideo(i2, context, uri, str, str2, configuration, compressionProgressListener, this);
            v72 v72Var = v72.t;
            return objCompressVideo == v72Var ? v72Var : objCompressVideo;
        }
    }

    private VideoCompressor() {
    }

    public static final void cancel() {
        el5 el5Var = job;
        if (el5Var != null) {
            el5Var.k(null);
        }
        Compressor.INSTANCE.setRunning(false);
    }

    private final void doVideoCompression(Context context, List<? extends Uri> list, boolean z, SharedStorageConfiguration sharedStorageConfiguration, AppSpecificStorageConfiguration appSpecificStorageConfiguration, Configuration configuration, CompressionListener compressionListener) {
        gl8 gl8Var = new gl8();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            et2 et2Var = i23.a;
            job = oy0.d(this, wr2.v, null, new AnonymousClass1(context, sharedStorageConfiguration, appSpecificStorageConfiguration, z, configuration, i, gl8Var, list, compressionListener, null), 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getMediaPath(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = contentResolver.query(uri, new String[]{"_data"}, null, null, null);
                if (cursorQuery == null) {
                    throw new Exception();
                }
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_data");
                cursorQuery.moveToFirst();
                String string = cursorQuery.getString(columnIndexOrThrow);
                string.getClass();
                cursorQuery.close();
                return string;
            } catch (Exception unused) {
                File file = new File(context.getApplicationInfo().dataDir + File.separator + System.currentTimeMillis());
                InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                if (inputStreamOpenInputStream != null) {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = inputStreamOpenInputStream.read(bArr);
                                if (i <= 0) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i);
                            }
                            g2b g2bVar = g2b.a;
                            fileOutputStream.close();
                            inputStreamOpenInputStream.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                fg1.a(fileOutputStream, th);
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            fg1.a(inputStreamOpenInputStream, th3);
                            throw th4;
                        }
                    }
                }
                String absolutePath = file.getAbsolutePath();
                absolutePath.getClass();
                if (0 != 0) {
                    cursor.close();
                }
                return absolutePath;
            }
        } catch (Throwable th5) {
            if (0 == 0) {
                throw th5;
            }
            cursor.close();
            throw th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File saveVideoFile(Context context, String str, SharedStorageConfiguration sharedStorageConfiguration, AppSpecificStorageConfiguration appSpecificStorageConfiguration, Boolean bool, String str2, Boolean bool2) throws FileNotFoundException {
        String str3;
        String path;
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if (sharedStorageConfiguration == null) {
            String strValidatedFileName = INSTANCE.validatedFileName(str2, bool);
            appSpecificStorageConfiguration.getClass();
            if (appSpecificStorageConfiguration.getSubFolderName() != null) {
                strValidatedFileName = appSpecificStorageConfiguration.getSubFolderName() + '/' + strValidatedFileName;
            }
            if (!new File(context.getFilesDir() + '/' + strValidatedFileName).exists()) {
                File parentFile = new File(context.getFilesDir() + '/' + strValidatedFileName).getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
            }
            return new File(context.getFilesDir(), strValidatedFileName);
        }
        VideoCompressor videoCompressor = INSTANCE;
        String strValidatedFileName2 = videoCompressor.validatedFileName(str2, bool);
        SaveLocation saveAt = sharedStorageConfiguration.getSaveAt();
        int i = saveAt == null ? -1 : WhenMappings.$EnumSwitchMapping$0[saveAt.ordinal()];
        if (i != 1) {
            str3 = i != 2 ? Environment.DIRECTORY_MOVIES : Environment.DIRECTORY_PICTURES;
        } else {
            str3 = Environment.DIRECTORY_DOWNLOADS;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (sharedStorageConfiguration.getSubFolderName() != null) {
                str3 = str3 + '/' + sharedStorageConfiguration.getSubFolderName();
            }
            if (!xj5.a(bool2, Boolean.TRUE)) {
                return new File(context.getFilesDir(), strValidatedFileName2);
            }
            str3.getClass();
            videoCompressor.saveVideoInExternal(context, strValidatedFileName2, str3, file);
            new File(context.getFilesDir(), strValidatedFileName2).delete();
            return new File("/storage/emulated/0/".concat(str3), strValidatedFileName2);
        }
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(str3);
        if (sharedStorageConfiguration.getSubFolderName() != null) {
            path = externalStoragePublicDirectory + '/' + sharedStorageConfiguration.getSubFolderName();
        } else {
            path = externalStoragePublicDirectory.getPath();
        }
        File file2 = new File(path, strValidatedFileName2);
        if (!file2.exists()) {
            try {
                File parentFile2 = file2.getParentFile();
                if (parentFile2 != null) {
                    parentFile2.mkdirs();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (xj5.a(bool2, Boolean.TRUE)) {
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(strValidatedFileName2, 0);
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i2 = fileInputStream.read(bArr);
                        if (i2 <= 0) {
                            break;
                        }
                        fileOutputStreamOpenFileOutput.write(bArr, 0, i2);
                        try {
                            throw th;
                        } catch (Throwable th) {
                            fg1.a(fileOutputStreamOpenFileOutput, th);
                            throw th;
                        }
                    }
                    g2b g2bVar = g2b.a;
                    fileInputStream.close();
                    fg1.a(fileOutputStreamOpenFileOutput, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        fg1.a(fileInputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return file2;
    }

    private final void saveVideoInExternal(Context context, String str, String str2, File file) throws FileNotFoundException {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", "video/mp4");
        contentValues.put("relative_path", str2);
        contentValues.put("is_pending", (Integer) 1);
        Uri contentUri = MediaStore.Video.Media.getContentUri("external_primary");
        if (xj5.a(str2, Environment.DIRECTORY_DOWNLOADS)) {
            contentUri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
        }
        Uri uriInsert = context.getContentResolver().insert(contentUri, contentValues);
        if (uriInsert != null) {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uriInsert, "rw");
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = fileInputStream.read(bArr);
                                if (i <= 0) {
                                    break;
                                } else {
                                    fileOutputStream.write(bArr, 0, i);
                                }
                                try {
                                    throw th;
                                } catch (Throwable th) {
                                    fg1.a(fileOutputStream, th);
                                    throw th;
                                }
                            }
                            g2b g2bVar = g2b.a;
                            fileInputStream.close();
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                fg1.a(fileInputStream, th2);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        fg1.a(parcelFileDescriptorOpenFileDescriptor, th5);
                        throw th6;
                    }
                }
            }
            fg1.a(parcelFileDescriptorOpenFileDescriptor, null);
            contentValues.clear();
            contentValues.put("is_pending", (Integer) 0);
            context.getContentResolver().update(uriInsert, contentValues, null, null);
        }
    }

    public static final void start(Context context, List<? extends Uri> list, boolean z, SharedStorageConfiguration sharedStorageConfiguration, AppSpecificStorageConfiguration appSpecificStorageConfiguration, Configuration configuration, CompressionListener compressionListener) {
        context.getClass();
        list.getClass();
        configuration.getClass();
        compressionListener.getClass();
        configuration.getVideoNames().size();
        list.size();
        INSTANCE.doVideoCompression(context, list, z, sharedStorageConfiguration, appSpecificStorageConfiguration, configuration, compressionListener);
    }

    public static /* synthetic */ void start$default(Context context, List list, boolean z, SharedStorageConfiguration sharedStorageConfiguration, AppSpecificStorageConfiguration appSpecificStorageConfiguration, Configuration configuration, CompressionListener compressionListener, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        start(context, list, z, (i & 8) != 0 ? null : sharedStorageConfiguration, (i & 16) != 0 ? null : appSpecificStorageConfiguration, configuration, compressionListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object startCompression(int i, Context context, Uri uri, String str, String str2, Configuration configuration, CompressionListener compressionListener, r02<? super Result> r02Var) {
        return oy0.g(i23.a, new AnonymousClass2(i, context, uri, str, str2, configuration, compressionListener, null), r02Var);
    }

    public static /* synthetic */ Object startCompression$default(VideoCompressor videoCompressor, int i, Context context, Uri uri, String str, String str2, Configuration configuration, CompressionListener compressionListener, r02 r02Var, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            str2 = null;
        }
        return videoCompressor.startCompression(i, context, uri, str, str2, configuration, compressionListener, r02Var);
    }

    private final String validatedFileName(String str, Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            str = al.d(str, "_temp");
        }
        return !z2a.o(str, "mp4", false) ? str.concat(".mp4") : str;
    }

    @Override // defpackage.t72
    public h72 getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    public static final void start(Context context, List<? extends Uri> list, boolean z, Configuration configuration, CompressionListener compressionListener) {
        context.getClass();
        list.getClass();
        configuration.getClass();
        compressionListener.getClass();
        start$default(context, list, z, null, null, configuration, compressionListener, 24, null);
    }

    public static final void start(Context context, List<? extends Uri> list, boolean z, SharedStorageConfiguration sharedStorageConfiguration, Configuration configuration, CompressionListener compressionListener) {
        context.getClass();
        list.getClass();
        configuration.getClass();
        compressionListener.getClass();
        start$default(context, list, z, sharedStorageConfiguration, null, configuration, compressionListener, 16, null);
    }

    public static final void start(Context context, List<? extends Uri> list, Configuration configuration, CompressionListener compressionListener) {
        context.getClass();
        list.getClass();
        configuration.getClass();
        compressionListener.getClass();
        start$default(context, list, false, null, null, configuration, compressionListener, 28, null);
    }
}
