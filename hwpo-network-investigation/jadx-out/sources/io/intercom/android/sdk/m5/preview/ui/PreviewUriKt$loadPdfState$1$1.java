package io.intercom.android.sdk.m5.preview.ui;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.ra8;
import defpackage.u;
import defpackage.v72;
import defpackage.xm2;
import io.intercom.android.sdk.m5.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.m5.preview.util.PdfOpenResult;
import io.intercom.android.sdk.m5.preview.util.PdfUtilsKt;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.preview.ui.PreviewUriKt$loadPdfState$1$1", f = "PreviewUri.kt", l = {272, 276}, m = "invokeSuspend")
public final class PreviewUriKt$loadPdfState$1$1 extends p6a implements ci4<ra8<PdfLoadState>, r02<? super g2b>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ IntercomPreviewFile $file;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewUriKt$loadPdfState$1$1(Context context, IntercomPreviewFile intercomPreviewFile, r02<? super PreviewUriKt$loadPdfState$1$1> r02Var) {
        super(2, r02Var);
        this.$context = context;
        this.$file = intercomPreviewFile;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        PreviewUriKt$loadPdfState$1$1 previewUriKt$loadPdfState$1$1 = new PreviewUriKt$loadPdfState$1$1(this.$context, this.$file, r02Var);
        previewUriKt$loadPdfState$1$1.L$0 = obj;
        return previewUriKt$loadPdfState$1$1;
    }

    @Override // defpackage.ci4
    public final Object invoke(ra8<PdfLoadState> ra8Var, r02<? super g2b> r02Var) {
        return ((PreviewUriKt$loadPdfState$1$1) create(ra8Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0079 A[PHI: r7
      0x0079: PHI (r7v14 java.io.File) = (r7v11 java.io.File), (r7v17 java.io.File) binds: [B:30:0x0090, B:25:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v16, types: [io.intercom.android.sdk.m5.preview.util.PdfOpenResult] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v6, types: [io.intercom.android.sdk.m5.preview.util.PdfOpenResult, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        ra8 ra8Var;
        Object objOpenPdfFile;
        ra8 ra8Var2;
        File tempFile;
        ?? r0 = this.label;
        v72 v72Var = v72.t;
        try {
            if (r0 == 0) {
                dv8.b(obj);
                ra8Var = (ra8) this.L$0;
                Context context = this.$context;
                IntercomPreviewFile intercomPreviewFile = this.$file;
                this.L$0 = ra8Var;
                this.label = 1;
                objOpenPdfFile = PdfUtilsKt.openPdfFile(context, intercomPreviewFile, this);
                if (objOpenPdfFile != v72Var) {
                }
                return v72Var;
            }
            if (r0 != 1) {
                if (r0 != 2) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r0 = (PdfOpenResult) this.L$1;
                ra8Var2 = (ra8) this.L$0;
                try {
                    dv8.b(obj);
                    r0 = r0;
                    ra8Var2.setValue(new PdfLoadState.Success((List) obj));
                    PdfOpenResult.Success success = (PdfOpenResult.Success) r0;
                    success.getFileDescriptor().close();
                    tempFile = success.getTempFile();
                    if (tempFile != null) {
                        tempFile.delete();
                    }
                } catch (Exception unused) {
                    ra8Var2.setValue(PdfLoadState.Error.INSTANCE);
                    PdfOpenResult.Success success2 = (PdfOpenResult.Success) r0;
                    success2.getFileDescriptor().close();
                    tempFile = success2.getTempFile();
                    if (tempFile != null) {
                    }
                    return g2b.a;
                }
                return g2b.a;
            }
            ra8 ra8Var3 = (ra8) this.L$0;
            dv8.b(obj);
            objOpenPdfFile = obj;
            ra8Var = ra8Var3;
            r0 = (PdfOpenResult) objOpenPdfFile;
            if (r0 instanceof PdfOpenResult.Success) {
                try {
                    ParcelFileDescriptor fileDescriptor = ((PdfOpenResult.Success) r0).getFileDescriptor();
                    this.L$0 = ra8Var;
                    this.L$1 = r0;
                    this.label = 2;
                    Object objRenderPdfPages = PdfUtilsKt.renderPdfPages(fileDescriptor, this);
                    if (objRenderPdfPages != v72Var) {
                        ra8 ra8Var4 = ra8Var;
                        obj = objRenderPdfPages;
                        ra8Var2 = ra8Var4;
                        r0 = r0;
                        ra8Var2.setValue(new PdfLoadState.Success((List) obj));
                        PdfOpenResult.Success success3 = (PdfOpenResult.Success) r0;
                        success3.getFileDescriptor().close();
                        tempFile = success3.getTempFile();
                        if (tempFile != null) {
                            tempFile.delete();
                        }
                    }
                    return v72Var;
                } catch (Exception unused2) {
                    ra8Var2 = ra8Var;
                    ra8Var2.setValue(PdfLoadState.Error.INSTANCE);
                    PdfOpenResult.Success success4 = (PdfOpenResult.Success) r0;
                    success4.getFileDescriptor().close();
                    tempFile = success4.getTempFile();
                    if (tempFile != null) {
                    }
                    return g2b.a;
                }
            }
            if (!(r0 instanceof PdfOpenResult.PasswordProtected) && !(r0 instanceof PdfOpenResult.Error)) {
                u.b();
                return null;
            }
            ra8Var.setValue(PdfLoadState.Error.INSTANCE);
            return g2b.a;
        } catch (Throwable th) {
            PdfOpenResult.Success success5 = (PdfOpenResult.Success) r0;
            success5.getFileDescriptor().close();
            File tempFile2 = success5.getTempFile();
            if (tempFile2 != null) {
                tempFile2.delete();
            }
            throw th;
        }
    }
}
