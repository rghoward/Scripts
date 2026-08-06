package io.intercom.android.sdk.m5.preview.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.et2;
import defpackage.fg1;
import defpackage.g2b;
import defpackage.gl8;
import defpackage.i23;
import defpackage.ib7;
import defpackage.nt;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.u;
import defpackage.u02;
import defpackage.v72;
import defpackage.wr2;
import defpackage.xm2;
import io.intercom.android.sdk.m5.preview.data.IntercomPreviewFile;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class PdfUtilsKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.preview.util.PdfUtilsKt$openPdfFile$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.preview.util.PdfUtilsKt$openPdfFile$2", f = "PdfUtils.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends p6a implements ci4<t72, r02<? super PdfOpenResult>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ IntercomPreviewFile $file;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(IntercomPreviewFile intercomPreviewFile, Context context, r02<? super AnonymousClass2> r02Var) {
            super(2, r02Var);
            this.$file = intercomPreviewFile;
            this.$context = context;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$file, this.$context, r02Var);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super PdfOpenResult> r02Var) {
            return ((AnonymousClass2) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v16, types: [T, java.io.File] */
        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
            Object error;
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor2;
            ParcelFileDescriptor parcelFileDescriptor = null;
            if (this.label != 0) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            gl8 gl8Var = new gl8();
            try {
                IntercomPreviewFile intercomPreviewFile = this.$file;
                if (intercomPreviewFile instanceof IntercomPreviewFile.NetworkFile) {
                    gl8Var.t = File.createTempFile("pdf_", ".pdf", this.$context.getCacheDir());
                    InputStream inputStream = ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(((IntercomPreviewFile.NetworkFile) this.$file).getUrl()).openConnection())).getInputStream();
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream((File) gl8Var.t);
                        try {
                            inputStream.getClass();
                            nt.a(inputStream, fileOutputStream);
                            fileOutputStream.close();
                            inputStream.close();
                            parcelFileDescriptorOpenFileDescriptor = ParcelFileDescriptor.open((File) gl8Var.t, 268435456);
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
                            fg1.a(inputStream, th3);
                            throw th4;
                        }
                    }
                } else {
                    if (!(intercomPreviewFile instanceof IntercomPreviewFile.LocalFile)) {
                        throw new ib7();
                    }
                    parcelFileDescriptorOpenFileDescriptor = this.$context.getContentResolver().openFileDescriptor(this.$file.getUri(), "r");
                }
                parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                if (parcelFileDescriptor != null) {
                    IntercomPreviewFile intercomPreviewFile2 = this.$file;
                    Context context = this.$context;
                    try {
                        new PdfRenderer(parcelFileDescriptor).close();
                        parcelFileDescriptor.close();
                        if (intercomPreviewFile2 instanceof IntercomPreviewFile.NetworkFile) {
                            parcelFileDescriptorOpenFileDescriptor2 = ParcelFileDescriptor.open((File) gl8Var.t, 268435456);
                        } else {
                            if (!(intercomPreviewFile2 instanceof IntercomPreviewFile.LocalFile)) {
                                throw new ib7();
                            }
                            parcelFileDescriptorOpenFileDescriptor2 = context.getContentResolver().openFileDescriptor(intercomPreviewFile2.getUri(), "r");
                        }
                        if (parcelFileDescriptorOpenFileDescriptor2 != null) {
                            error = new PdfOpenResult.Success(parcelFileDescriptorOpenFileDescriptor2, (File) gl8Var.t);
                        } else {
                            File file = (File) gl8Var.t;
                            if (file != null) {
                                file.delete();
                            }
                            error = new PdfOpenResult.Error(new IllegalStateException("Failed to reopen file descriptor"));
                        }
                    } catch (SecurityException unused) {
                        parcelFileDescriptor.close();
                        File file2 = (File) gl8Var.t;
                        if (file2 != null) {
                            file2.delete();
                        }
                        error = PdfOpenResult.PasswordProtected.INSTANCE;
                    }
                    if (error != null) {
                        return error;
                    }
                }
                File file3 = (File) gl8Var.t;
                if (file3 != null) {
                    file3.delete();
                }
                return new PdfOpenResult.Error(new IllegalStateException("Failed to open file descriptor"));
            } catch (Exception e) {
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                }
                File file4 = (File) gl8Var.t;
                if (file4 != null) {
                    file4.delete();
                }
                return new PdfOpenResult.Error(e);
            }
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.preview.util.PdfUtilsKt$renderPdfPages$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.preview.util.PdfUtilsKt$renderPdfPages$2", f = "PdfUtils.kt", l = {}, m = "invokeSuspend")
    public static final class C03822 extends p6a implements ci4<t72, r02<? super List<Bitmap>>, Object> {
        final /* synthetic */ ParcelFileDescriptor $fileDescriptor;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03822(ParcelFileDescriptor parcelFileDescriptor, r02<? super C03822> r02Var) {
            super(2, r02Var);
            this.$fileDescriptor = parcelFileDescriptor;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new C03822(this.$fileDescriptor, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super List<Bitmap>> r02Var) {
            return ((C03822) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            if (this.label != 0) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            ArrayList arrayList = new ArrayList();
            PdfRenderer pdfRenderer = new PdfRenderer(this.$fileDescriptor);
            try {
                int pageCount = pdfRenderer.getPageCount();
                for (int i = 0; i < pageCount; i++) {
                    PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(i);
                    pageOpenPage.getClass();
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(pageOpenPage.getWidth(), pageOpenPage.getHeight(), Bitmap.Config.ARGB_8888);
                    new Canvas(bitmapCreateBitmap).drawColor(-1);
                    pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
                    arrayList.add(bitmapCreateBitmap);
                    pageOpenPage.close();
                }
                pdfRenderer.close();
                return arrayList;
            } catch (Throwable th) {
                pdfRenderer.close();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.preview.util.PdfUtilsKt$shouldOpenPdfInBrowser$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.preview.util.PdfUtilsKt", f = "PdfUtils.kt", l = {177}, m = "shouldOpenPdfInBrowser")
    public static final class AnonymousClass1 extends u02 {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PdfUtilsKt.shouldOpenPdfInBrowser(null, null, this);
        }
    }

    public static final Object openPdfFile(Context context, IntercomPreviewFile intercomPreviewFile, r02<? super PdfOpenResult> r02Var) {
        et2 et2Var = i23.a;
        return oy0.g(wr2.v, new AnonymousClass2(intercomPreviewFile, context, null), r02Var);
    }

    public static final Object renderPdfPages(ParcelFileDescriptor parcelFileDescriptor, r02<? super List<Bitmap>> r02Var) {
        et2 et2Var = i23.a;
        return oy0.g(wr2.v, new C03822(parcelFileDescriptor, null), r02Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object shouldOpenPdfInBrowser(Context context, IntercomPreviewFile intercomPreviewFile, r02<? super Boolean> r02Var) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (r02Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) r02Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(r02Var);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(r02Var);
        }
        Object objOpenPdfFile = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        boolean z = true;
        if (i2 == 0) {
            dv8.b(objOpenPdfFile);
            anonymousClass1.label = 1;
            objOpenPdfFile = openPdfFile(context, intercomPreviewFile, anonymousClass1);
            v72 v72Var = v72.t;
            if (objOpenPdfFile == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objOpenPdfFile);
        }
        PdfOpenResult pdfOpenResult = (PdfOpenResult) objOpenPdfFile;
        if (!(pdfOpenResult instanceof PdfOpenResult.PasswordProtected)) {
            if (pdfOpenResult instanceof PdfOpenResult.Success) {
                PdfOpenResult.Success success = (PdfOpenResult.Success) pdfOpenResult;
                success.getFileDescriptor().close();
                File tempFile = success.getTempFile();
                if (tempFile != null) {
                    tempFile.delete();
                }
                z = false;
            } else if (!(pdfOpenResult instanceof PdfOpenResult.Error)) {
                u.b();
                return null;
            }
        }
        return Boolean.valueOf(z);
    }
}
