package io.intercom.android.sdk.m5.preview.viewmodel;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.webkit.URLUtil;
import android.widget.Toast;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import defpackage.a0a;
import defpackage.aa0;
import defpackage.ag6;
import defpackage.b0a;
import defpackage.ci4;
import defpackage.co3;
import defpackage.ct1;
import defpackage.dv8;
import defpackage.eg1;
import defpackage.el5;
import defpackage.et2;
import defpackage.fg1;
import defpackage.g2b;
import defpackage.i23;
import defpackage.i37;
import defpackage.lb2;
import defpackage.ll8;
import defpackage.mhb;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.qq2;
import defpackage.r02;
import defpackage.rhb;
import defpackage.sd1;
import defpackage.t72;
import defpackage.th1;
import defpackage.thb;
import defpackage.u;
import defpackage.uh8;
import defpackage.uhb;
import defpackage.vhb;
import defpackage.whb;
import defpackage.wn5;
import defpackage.wr2;
import defpackage.wt4;
import defpackage.xj5;
import defpackage.xm2;
import defpackage.z2a;
import defpackage.z90;
import defpackage.zz9;
import io.intercom.android.sdk.m5.preview.data.DeleteType;
import io.intercom.android.sdk.m5.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.m5.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.m5.preview.model.PreviewUiState;
import io.intercom.android.sdk.m5.preview.util.MimeTypeResolverKt;
import io.intercom.android.sdk.ui.extension.ContentTypeExtensionKt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class PreviewViewModel extends mhb {
    private final i37<PreviewUiState> _state;
    private el5 downloadJob;
    private final IntercomPreviewArgs previewArgs;
    private final zz9<PreviewUiState> state;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.preview.viewmodel.PreviewViewModel$saveDocument$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.preview.viewmodel.PreviewViewModel$saveDocument$1", f = "PreviewViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ IntercomPreviewFile.NetworkFile $file;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IntercomPreviewFile.NetworkFile networkFile, Context context, r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
            this.$file = networkFile;
            this.$context = context;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return PreviewViewModel.this.new AnonymousClass1(this.$file, this.$context, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            if (this.label != 0) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            int i = Build.VERSION.SDK_INT;
            PreviewViewModel previewViewModel = PreviewViewModel.this;
            if (i >= 29) {
                previewViewModel.saveFileOnApi29Above(this.$file.getUrl(), this.$file.getMimeType(), this.$context);
            } else {
                String url = this.$file.getUrl();
                String mimeType = this.$file.getMimeType();
                Context context = this.$context;
                String str = Environment.DIRECTORY_DOWNLOADS;
                str.getClass();
                previewViewModel.saveFileLegacy(url, mimeType, context, str);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.preview.viewmodel.PreviewViewModel$saveImage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.preview.viewmodel.PreviewViewModel$saveImage$1", f = "PreviewViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class C03831 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ IntercomPreviewFile.NetworkFile $file;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03831(IntercomPreviewFile.NetworkFile networkFile, Context context, r02<? super C03831> r02Var) {
            super(2, r02Var);
            this.$file = networkFile;
            this.$context = context;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return PreviewViewModel.this.new C03831(this.$file, this.$context, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03831) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            if (this.label != 0) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            Bitmap bitmapPrepareBitmap = PreviewViewModel.this.prepareBitmap(this.$file.getUrl());
            if (bitmapPrepareBitmap == null) {
                PreviewViewModel.this.showFileSaveFailed(this.$context);
                return g2b.a;
            }
            int i = Build.VERSION.SDK_INT;
            PreviewViewModel previewViewModel = PreviewViewModel.this;
            if (i >= 29) {
                previewViewModel.saveImageOnApi29Above(bitmapPrepareBitmap, this.$file.getUrl(), this.$file.getMimeType(), this.$context);
            } else {
                previewViewModel.saveImageLegacy(bitmapPrepareBitmap, this.$file.getUrl(), this.$file.getMimeType(), this.$context);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.preview.viewmodel.PreviewViewModel$saveVideo$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.preview.viewmodel.PreviewViewModel$saveVideo$1", f = "PreviewViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class C03841 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ IntercomPreviewFile.NetworkFile $file;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03841(IntercomPreviewFile.NetworkFile networkFile, Context context, r02<? super C03841> r02Var) {
            super(2, r02Var);
            this.$file = networkFile;
            this.$context = context;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return PreviewViewModel.this.new C03841(this.$file, this.$context, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03841) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            if (this.label != 0) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            int i = Build.VERSION.SDK_INT;
            PreviewViewModel previewViewModel = PreviewViewModel.this;
            if (i >= 29) {
                previewViewModel.saveVideoOnApi29Above(this.$file.getUrl(), this.$file.getMimeType(), this.$context);
            } else {
                String url = this.$file.getUrl();
                String mimeType = this.$file.getMimeType();
                Context context = this.$context;
                String str = Environment.DIRECTORY_DOWNLOADS;
                str.getClass();
                previewViewModel.saveFileLegacy(url, mimeType, context, str);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.preview.viewmodel.PreviewViewModel$showFileSaveFailed$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.preview.viewmodel.PreviewViewModel$showFileSaveFailed$1", f = "PreviewViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class C03851 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ Context $context;
        int label;
        final /* synthetic */ PreviewViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03851(Context context, PreviewViewModel previewViewModel, r02<? super C03851> r02Var) {
            super(2, r02Var);
            this.$context = context;
            this.this$0 = previewViewModel;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new C03851(this.$context, this.this$0, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03851) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            if (this.label != 0) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            Toast.makeText(this.$context, ((PreviewUiState) this.this$0._state.getValue()).getSaveFailedText(), 0).show();
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.preview.viewmodel.PreviewViewModel$showFileSaveSuccess$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.preview.viewmodel.PreviewViewModel$showFileSaveSuccess$1", f = "PreviewViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class C03861 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ Context $context;
        int label;
        final /* synthetic */ PreviewViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03861(Context context, PreviewViewModel previewViewModel, r02<? super C03861> r02Var) {
            super(2, r02Var);
            this.$context = context;
            this.this$0 = previewViewModel;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new C03861(this.$context, this.this$0, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03861) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            if (this.label != 0) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            Toast.makeText(this.$context, ((PreviewUiState) this.this$0._state.getValue()).getFileSavedText(), 0).show();
            return g2b.a;
        }
    }

    public PreviewViewModel(IntercomPreviewArgs intercomPreviewArgs) {
        intercomPreviewArgs.getClass();
        this.previewArgs = intercomPreviewArgs;
        a0a a0aVarB = b0a.b(new PreviewUiState(null, 0, false, false, null, false, null, null, null, 511, null));
        this._state = a0aVarB;
        this.state = a0aVarB;
        a0aVarB.l(null, new PreviewUiState(intercomPreviewArgs.getUris(), intercomPreviewArgs.getUris().isEmpty() ? 0 : uh8.g(intercomPreviewArgs.getInitialIndex(), 0, intercomPreviewArgs.getUris().size() - 1), showDeleteAction(intercomPreviewArgs.getUris().size()), intercomPreviewArgs.getShowSendCTA(), intercomPreviewArgs.getCtaText(), intercomPreviewArgs.getDownloadState().getShowDownloadAction(), intercomPreviewArgs.getDownloadState().getFileSavingText(), intercomPreviewArgs.getDownloadState().getFileSavedText(), intercomPreviewArgs.getDownloadState().getSaveFailedText()));
    }

    private final String getNonExistingFileNameFromUrl(String str, Uri uri, String str2, Context context) throws IOException {
        String strGuessFileName = URLUtil.guessFileName(str, null, str2);
        strGuessFileName.getClass();
        List listI = z2a.I(strGuessFileName, new String[]{"."}, 2);
        int i = 0;
        String str3 = (String) th1.B(0, listI);
        if (str3 == null) {
            str3 = "fileName";
        }
        String str4 = (String) th1.B(1, listI);
        String[] strArr = {str3.concat("%"), ct1.a("%.", str4)};
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_display_name"}, "_display_name LIKE ? AND _display_name LIKE ?", strArr, null);
        if (cursorQuery != null) {
            try {
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_display_name");
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndexOrThrow);
                    string.getClass();
                    arrayList.add(string);
                }
                g2b g2bVar = g2b.a;
                cursorQuery.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    fg1.a(cursorQuery, th);
                    throw th2;
                }
            }
        }
        while (true) {
            i++;
            if (!arrayList.contains(strGuessFileName)) {
                return strGuessFileName;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str3 + " (" + i + ')');
            if (str4 != null) {
                sb.append(".".concat(str4));
            }
            strGuessFileName = sb.toString();
        }
    }

    private final String getNonExistingFileNameFromUrlLegacy(String str, File file, String str2) {
        String strGuessFileName = URLUtil.guessFileName(str, null, str2);
        strGuessFileName.getClass();
        List listI = z2a.I(strGuessFileName, new String[]{"."}, 2);
        int i = 0;
        String str3 = (String) th1.B(0, listI);
        if (str3 == null) {
            str3 = "fileName";
        }
        String str4 = (String) th1.B(1, listI);
        while (true) {
            i++;
            if (!new File(file, strGuessFileName).exists()) {
                return strGuessFileName;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str3 + " (" + i + ')');
            if (str4 != null) {
                sb.append(".".concat(str4));
            }
            strGuessFileName = sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap prepareBitmap(String str) {
        int i;
        try {
            int iC = new co3(((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection())).getInputStream()).c(1, "Orientation");
            if (iC == 3) {
                i = 180;
            } else if (iC != 6) {
                i = iC != 8 ? 0 : 270;
            } else {
                i = 90;
            }
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection())).getInputStream());
            bitmapDecodeStream.getClass();
            return rotate(bitmapDecodeStream, i);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private final Bitmap rotate(Bitmap bitmap, float f) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        bitmapCreateBitmap.getClass();
        return bitmapCreateBitmap;
    }

    private final void saveDocument(IntercomPreviewFile.NetworkFile networkFile, Context context) {
        eg1 eg1VarB = rhb.b(this);
        et2 et2Var = i23.a;
        this.downloadJob = oy0.d(eg1VarB, wr2.v, null, new AnonymousClass1(networkFile, context, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveFileLegacy(String str, String str2, Context context, String str3) throws IOException {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(str3);
        externalStoragePublicDirectory.mkdir();
        saveFileToStream(str, new FileOutputStream(new File(externalStoragePublicDirectory, getNonExistingFileNameFromUrlLegacy(str, externalStoragePublicDirectory, str2))));
        showFileSaveSuccess(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveFileOnApi29Above(String str, String str2, Context context) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            String strResolveFileMimeType = MimeTypeResolverKt.resolveFileMimeType(str, str2);
            Uri uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
            uri.getClass();
            String nonExistingFileNameFromUrl = getNonExistingFileNameFromUrl(str, uri, strResolveFileMimeType, context);
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", nonExistingFileNameFromUrl);
            contentValues.put("mime_type", strResolveFileMimeType);
            contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
            ContentResolver contentResolver = context.getContentResolver();
            Uri uriInsert = contentResolver.insert(MediaStore.Files.getContentUri("external"), contentValues);
            if (uriInsert == null || (parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uriInsert, "w")) == null) {
                return;
            }
            saveFileToStream(str, new FileOutputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()));
            parcelFileDescriptorOpenFileDescriptor.close();
            contentValues.clear();
            contentResolver.update(uriInsert, contentValues, null, null);
            showFileSaveSuccess(context);
        } catch (Exception e) {
            e.printStackTrace();
            showFileSaveFailed(context);
        }
    }

    private final void saveFileToStream(String str, OutputStream outputStream) throws IOException {
        InputStream inputStream = ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection())).getInputStream();
        if (inputStream != null) {
            byte[] bArr = new byte[8192];
            while (true) {
                int i = inputStream.read(bArr);
                if (i <= 0) {
                    break;
                } else {
                    outputStream.write(bArr, 0, i);
                }
            }
            inputStream.close();
        }
        outputStream.close();
    }

    private final void saveImage(IntercomPreviewFile.NetworkFile networkFile, Context context) {
        eg1 eg1VarB = rhb.b(this);
        et2 et2Var = i23.a;
        this.downloadJob = oy0.d(eg1VarB, wr2.v, null, new C03831(networkFile, context, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveImageLegacy(Bitmap bitmap, String str, String str2, Context context) throws IOException {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        externalStoragePublicDirectory.mkdir();
        saveImageToStream(bitmap, new FileOutputStream(new File(externalStoragePublicDirectory, getNonExistingFileNameFromUrlLegacy(str, externalStoragePublicDirectory, str2))));
        showFileSaveSuccess(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveImageOnApi29Above(Bitmap bitmap, String str, String str2, Context context) {
        OutputStream outputStreamOpenOutputStream;
        try {
            String strResolveImageMimeType = MimeTypeResolverKt.resolveImageMimeType(str, str2);
            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            uri.getClass();
            String nonExistingFileNameFromUrl = getNonExistingFileNameFromUrl(str, uri, strResolveImageMimeType, context);
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", nonExistingFileNameFromUrl);
            contentValues.put("mime_type", strResolveImageMimeType);
            contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
            contentValues.put("is_pending", (Integer) 1);
            Uri uriInsert = context.getContentResolver().insert(uri, contentValues);
            if (uriInsert == null || (outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriInsert)) == null) {
                return;
            }
            saveImageToStream(bitmap, outputStreamOpenOutputStream);
            contentValues.clear();
            contentValues.put("is_pending", (Integer) 0);
            context.getContentResolver().update(uriInsert, contentValues, null, null);
            showFileSaveSuccess(context);
        } catch (Exception e) {
            e.printStackTrace();
            showFileSaveFailed(context);
        }
    }

    private final void saveImageToStream(Bitmap bitmap, OutputStream outputStream) throws IOException {
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
        outputStream.close();
    }

    private final void saveVideo(IntercomPreviewFile.NetworkFile networkFile, Context context) {
        eg1 eg1VarB = rhb.b(this);
        et2 et2Var = i23.a;
        this.downloadJob = oy0.d(eg1VarB, wr2.v, null, new C03841(networkFile, context, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveVideoOnApi29Above(String str, String str2, Context context) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            String strResolveVideoMimeType = MimeTypeResolverKt.resolveVideoMimeType(str, str2);
            Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            uri.getClass();
            String nonExistingFileNameFromUrl = getNonExistingFileNameFromUrl(str, uri, strResolveVideoMimeType, context);
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", nonExistingFileNameFromUrl);
            contentValues.put("mime_type", strResolveVideoMimeType);
            contentValues.put("relative_path", Environment.DIRECTORY_MOVIES);
            contentValues.put("is_pending", (Integer) 1);
            ContentResolver contentResolver = context.getContentResolver();
            Uri uriInsert = contentResolver.insert(uri, contentValues);
            if (uriInsert == null || (parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uriInsert, "w")) == null) {
                return;
            }
            saveFileToStream(str, new FileOutputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()));
            parcelFileDescriptorOpenFileDescriptor.close();
            contentValues.clear();
            contentValues.put("is_pending", (Integer) 0);
            contentResolver.update(uriInsert, contentValues, null, null);
            showFileSaveSuccess(context);
        } catch (Exception e) {
            e.printStackTrace();
            showFileSaveFailed(context);
        }
    }

    private final boolean showDeleteAction(int i) {
        DeleteType deleteType = this.previewArgs.getDeleteType();
        if (xj5.a(deleteType, DeleteType.None.INSTANCE)) {
            return false;
        }
        if (xj5.a(deleteType, DeleteType.Delete.INSTANCE)) {
            return true;
        }
        if (xj5.a(deleteType, DeleteType.Remove.INSTANCE)) {
            return i > 1;
        }
        u.b();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFileSaveFailed(Context context) {
        eg1 eg1VarB = rhb.b(this);
        et2 et2Var = i23.a;
        oy0.d(eg1VarB, ag6.a, null, new C03851(context, this, null), 2);
    }

    private final void showFileSaveSuccess(Context context) {
        eg1 eg1VarB = rhb.b(this);
        et2 et2Var = i23.a;
        oy0.d(eg1VarB, ag6.a, null, new C03861(context, this, null), 2);
    }

    public final zz9<PreviewUiState> getState$intercom_sdk_base_release() {
        return this.state;
    }

    public final void onDeleteClicked$intercom_sdk_base_release(IntercomPreviewFile intercomPreviewFile) {
        PreviewUiState value;
        PreviewUiState previewUiState;
        ArrayList arrayListJ;
        intercomPreviewFile.getClass();
        i37<PreviewUiState> i37Var = this._state;
        do {
            value = i37Var.getValue();
            previewUiState = value;
            arrayListJ = th1.J(previewUiState.getFiles(), intercomPreviewFile);
        } while (!i37Var.c(value, PreviewUiState.copy$default(previewUiState, arrayListJ, 0, showDeleteAction(arrayListJ.size()), false, null, false, null, null, null, 506, null)));
    }

    public final void onPageNavigated$intercom_sdk_base_release(int i) {
        i37<PreviewUiState> i37Var = this._state;
        while (true) {
            PreviewUiState value = i37Var.getValue();
            int i2 = i;
            if (i37Var.c(value, PreviewUiState.copy$default(value, null, i2, false, false, null, false, null, null, null, 509, null))) {
                return;
            } else {
                i = i2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void saveFile$intercom_sdk_base_release(IntercomPreviewFile intercomPreviewFile, Context context) {
        boolean z;
        intercomPreviewFile.getClass();
        context.getClass();
        el5 el5Var = this.downloadJob;
        if (el5Var != null) {
            z = el5Var.h();
        }
        if (!(intercomPreviewFile instanceof IntercomPreviewFile.NetworkFile) || z) {
            return;
        }
        Toast.makeText(context, this._state.getValue().getFileSavingText(), 0).show();
        String mimeType = intercomPreviewFile.getMimeType(context);
        if (ContentTypeExtensionKt.isImage(mimeType)) {
            saveImage((IntercomPreviewFile.NetworkFile) intercomPreviewFile, context);
        } else if (ContentTypeExtensionKt.isVideo(mimeType)) {
            saveVideo((IntercomPreviewFile.NetworkFile) intercomPreviewFile, context);
        } else {
            saveDocument((IntercomPreviewFile.NetworkFile) intercomPreviewFile, context);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public final PreviewViewModel create$intercom_sdk_base_release(whb whbVar, IntercomPreviewArgs intercomPreviewArgs) {
            whbVar.getClass();
            intercomPreviewArgs.getClass();
            thb.c cVarFactory$intercom_sdk_base_release = factory$intercom_sdk_base_release(intercomPreviewArgs);
            cVarFactory$intercom_sdk_base_release.getClass();
            vhb viewModelStore = whbVar.getViewModelStore();
            lb2 defaultViewModelCreationExtras = whbVar instanceof wt4 ? ((wt4) whbVar).getDefaultViewModelCreationExtras() : lb2.a.b;
            viewModelStore.getClass();
            defaultViewModelCreationExtras.getClass();
            uhb uhbVar = new uhb(viewModelStore, cVarFactory$intercom_sdk_base_release, defaultViewModelCreationExtras);
            sd1 sd1VarA = ll8.a(PreviewViewModel.class);
            String strE = sd1VarA.e();
            if (strE != null) {
                return (PreviewViewModel) uhbVar.a(sd1VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strE));
            }
            z90.a("Local and anonymous classes can not be ViewModels");
            return null;
        }

        public final thb.c factory$intercom_sdk_base_release(final IntercomPreviewArgs intercomPreviewArgs) {
            intercomPreviewArgs.getClass();
            return new thb.c() { // from class: io.intercom.android.sdk.m5.preview.viewmodel.PreviewViewModel$Companion$factory$1
                @Override // thb.c
                public <T extends mhb> T create(Class<T> cls) {
                    cls.getClass();
                    return new PreviewViewModel(intercomPreviewArgs);
                }

                @Override // thb.c
                public /* bridge */ /* synthetic */ mhb create(Class cls, lb2 lb2Var) {
                    return super.create(cls, lb2Var);
                }

                @Override // thb.c
                public /* bridge */ /* synthetic */ mhb create(wn5 wn5Var, lb2 lb2Var) {
                    return super.create(wn5Var, lb2Var);
                }
            };
        }

        private Companion() {
        }
    }
}
