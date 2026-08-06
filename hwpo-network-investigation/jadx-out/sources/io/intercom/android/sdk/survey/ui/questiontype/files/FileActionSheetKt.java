package io.intercom.android.sdk.survey.ui.questiontype.files;

import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.aa0;
import defpackage.al8;
import defpackage.anb;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bnb;
import defpackage.c33;
import defpackage.ci4;
import defpackage.cv3;
import defpackage.dnb;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h37;
import defpackage.ir9;
import defpackage.jt1;
import defpackage.l03;
import defpackage.mh4;
import defpackage.ny;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.u;
import defpackage.uh1;
import defpackage.v5a;
import defpackage.wd3;
import defpackage.ws0;
import defpackage.x10;
import defpackage.xj5;
import defpackage.xj8;
import defpackage.xl0;
import defpackage.xr1;
import defpackage.xu3;
import defpackage.yv9;
import defpackage.zmb;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.preview.data.DeleteType;
import io.intercom.android.sdk.m5.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.m5.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.m5.preview.ui.PreviewRootScreenKt;
import io.intercom.android.sdk.m5.upload.data.MediaData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.files.FileActionSheetKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class FileActionSheetKt {
    public static final void FileActionSheet(final Answer.MediaAnswer.MediaItem mediaItem, final mh4<g2b> mh4Var, mh4<g2b> mh4Var2, final mh4<g2b> mh4Var3, final mh4<g2b> mh4Var4, jt1 jt1Var, final int i) {
        int i2;
        mh4<g2b> mh4Var5;
        final mh4<g2b> mh4Var6 = mh4Var2;
        mediaItem.getClass();
        mh4Var.getClass();
        mh4Var6.getClass();
        mh4Var3.getClass();
        mh4Var4.getClass();
        bj4 bj4VarO = jt1Var.o(592767504);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bj4VarO.J(mediaItem) : bj4VarO.j(mediaItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            mh4Var5 = mh4Var;
            i2 |= bj4VarO.j(mh4Var5) ? 32 : 16;
        } else {
            mh4Var5 = mh4Var;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(mh4Var6) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bj4VarO.j(mh4Var3) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bj4VarO.j(mh4Var4) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            bj4VarO.K(-984101712);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = bl7.i(mediaItem.getUploadStatus());
                bj4VarO.C(objF);
            }
            h37 h37Var = (h37) objF;
            int i4 = 0;
            bj4VarO.U(false);
            if (!xj5.a(h37Var.getValue(), mediaItem.getUploadStatus())) {
                mh4Var4.invoke();
            }
            h37Var.setValue(mediaItem.getUploadStatus());
            Answer.MediaAnswer.FileUploadStatus uploadStatus = mediaItem.getUploadStatus();
            if (uploadStatus instanceof Answer.MediaAnswer.FileUploadStatus.Error) {
                bj4VarO.K(-442090195);
                FileUploadErrorComponentKt.FileUploadErrorComponent(mediaItem.getData().getFileName(), ((Answer.MediaAnswer.FileUploadStatus.Error) uploadStatus).getError(), mh4Var5, mh4Var6, bj4VarO, (i2 << 3) & 8064);
                mh4Var6 = mh4Var6;
                bj4VarO.U(false);
            } else if (uploadStatus instanceof Answer.MediaAnswer.FileUploadStatus.Success) {
                bj4VarO.K(-441803104);
                View view = (View) bj4VarO.F(AndroidCompositionLocals_androidKt.f);
                ViewParent parent = view.getParent();
                l03 l03Var = parent instanceof l03 ? (l03) parent : null;
                Window window = l03Var != null ? l03Var.getWindow() : null;
                bj4VarO.K(-984075083);
                if (window != null) {
                    bj4VarO.K(-130938661);
                    boolean zJ = bj4VarO.j(window) | bj4VarO.j(view);
                    Object objF2 = bj4VarO.f();
                    if (zJ || objF2 == c0187a) {
                        objF2 = new xu3(i4, window, view);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    c33 c33Var = wd3.a;
                    bj4VarO.w((mh4) objF2);
                    g2b g2bVar = g2b.a;
                }
                bj4VarO.U(false);
                ox6 ox6VarC = gi0.c(ir9.c, uh1.b, al8.a);
                IntercomPreviewArgs intercomPreviewArgs = new IntercomPreviewArgs(ws0.h(new IntercomPreviewFile.LocalFile(mediaItem.getData().getUri())), DeleteType.Delete.INSTANCE, null, false, 0, null, 60, null);
                bj4VarO.K(-984057297);
                int i5 = 1;
                boolean z = (57344 & i2) == 16384;
                Object objF3 = bj4VarO.f();
                if (z || objF3 == c0187a) {
                    objF3 = new oh4() { // from class: yu3
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return FileActionSheetKt.FileActionSheet$lambda$5$lambda$4(mh4Var4, (List) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                oh4 oh4Var = (oh4) objF3;
                bj4VarO.U(false);
                bj4VarO.K(-984055787);
                boolean z2 = (i2 & 896) == 256;
                Object objF4 = bj4VarO.f();
                if (z2 || objF4 == c0187a) {
                    objF4 = new ny(mh4Var6, i5);
                    bj4VarO.C(objF4);
                }
                oh4 oh4Var2 = (oh4) objF4;
                Object objB = aa0.b(bj4VarO, false, -984054171);
                if (objB == c0187a) {
                    objB = new xl0(i3);
                    bj4VarO.C(objB);
                }
                bj4VarO.U(false);
                PreviewRootScreenKt.PreviewRootScreen(ox6VarC, intercomPreviewArgs, null, oh4Var, oh4Var2, (oh4) objB, bj4VarO, 196614, 4);
                bj4VarO.U(false);
            } else if (xj5.a(uploadStatus, Answer.MediaAnswer.FileUploadStatus.Uploading.INSTANCE)) {
                bj4VarO.K(-440852737);
                FileUploadProgressComponentKt.FileUploadProgressComponent(mediaItem.getData().getFileName(), mh4Var3, bj4VarO, (i2 >> 6) & 112);
                bj4VarO.U(false);
            } else {
                if (!xj5.a(uploadStatus, Answer.MediaAnswer.FileUploadStatus.None.INSTANCE) && !xj5.a(uploadStatus, Answer.MediaAnswer.FileUploadStatus.Queued.INSTANCE)) {
                    bj4VarO.K(-984093143);
                    bj4VarO.U(false);
                    u.b();
                    return;
                }
                bj4VarO.K(-440672162);
                bj4VarO.U(false);
            }
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: zu3
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return FileActionSheetKt.FileActionSheet$lambda$10(mediaItem, mh4Var, mh4Var6, mh4Var3, mh4Var4, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FileActionSheet$lambda$10(Answer.MediaAnswer.MediaItem mediaItem, mh4 mh4Var, mh4 mh4Var2, mh4 mh4Var3, mh4 mh4Var4, int i, jt1 jt1Var, int i2) {
        FileActionSheet(mediaItem, mh4Var, mh4Var2, mh4Var3, mh4Var4, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FileActionSheet$lambda$3$lambda$2$lambda$1(Window window, View view) {
        x10 anbVar;
        yv9 yv9Var = new yv9(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            anbVar = new dnb(window, yv9Var);
        } else if (i >= 30) {
            anbVar = new bnb(window, yv9Var);
        } else {
            anbVar = i >= 26 ? new anb(window, yv9Var) : new zmb(window, yv9Var);
        }
        anbVar.h(false);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FileActionSheet$lambda$5$lambda$4(mh4 mh4Var, List list) {
        list.getClass();
        mh4Var.invoke();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FileActionSheet$lambda$7$lambda$6(mh4 mh4Var, IntercomPreviewFile intercomPreviewFile) {
        intercomPreviewFile.getClass();
        mh4Var.invoke();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FileActionSheet$lambda$9$lambda$8(List list) {
        list.getClass();
        return g2b.a;
    }

    private static final void FileActionSheetPreviewForStatus(final Answer.MediaAnswer.FileUploadStatus fileUploadStatus, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(-915176137);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(fileUploadStatus) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(193945980, new AnonymousClass1(fileUploadStatus), bj4VarO), bj4VarO, 12582912, 127);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: av3
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return FileActionSheetKt.FileActionSheetPreviewForStatus$lambda$13(fileUploadStatus, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FileActionSheetPreviewForStatus$lambda$13(Answer.MediaAnswer.FileUploadStatus fileUploadStatus, int i, jt1 jt1Var, int i2) {
        FileActionSheetPreviewForStatus(fileUploadStatus, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @IntercomPreviews
    private static final void FileActionSheetQueuedPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-61695068);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            FileActionSheetPreviewForStatus(new Answer.MediaAnswer.FileUploadStatus.Error(new Answer.MediaAnswer.FileUploadError.FileLimitExceeded(ws0.h(new StringProvider.StringRes(R.string.intercom_inbox_error_state_title, null, 2, 0 == true ? 1 : 0)))), bj4VarO, 0);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: bv3
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return FileActionSheetKt.FileActionSheetQueuedPreview$lambda$12(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FileActionSheetQueuedPreview$lambda$12(int i, jt1 jt1Var, int i2) {
        FileActionSheetQueuedPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void FileActionSheetUploadingPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(31049684);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            FileActionSheetPreviewForStatus(Answer.MediaAnswer.FileUploadStatus.Uploading.INSTANCE, bj4VarO, 6);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new cv3(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FileActionSheetUploadingPreview$lambda$11(int i, jt1 jt1Var, int i2) {
        FileActionSheetUploadingPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.files.FileActionSheetKt$FileActionSheetPreviewForStatus$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass1 implements ci4<jt1, Integer, g2b> {
        final /* synthetic */ Answer.MediaAnswer.FileUploadStatus $uploadStatus;

        public AnonymousClass1(Answer.MediaAnswer.FileUploadStatus fileUploadStatus) {
            this.$uploadStatus = fileUploadStatus;
        }

        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            Uri uri = Uri.EMPTY;
            uri.getClass();
            Answer.MediaAnswer.MediaItem mediaItem = new Answer.MediaAnswer.MediaItem(new MediaData.Media.Image("image/png", 0, 0, 0L, "google.png", uri, null, 64, null));
            mediaItem.setUploadStatus(this.$uploadStatus);
            jt1Var.K(-1862993994);
            Object objF = jt1Var.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = new i();
                jt1Var.C(objF);
            }
            mh4 mh4Var = (mh4) objF;
            Object objA = xr1.a(jt1Var, -1862992970);
            if (objA == c0187a) {
                objA = new j();
                jt1Var.C(objA);
            }
            mh4 mh4Var2 = (mh4) objA;
            Object objA2 = xr1.a(jt1Var, -1862991882);
            if (objA2 == c0187a) {
                objA2 = new k();
                jt1Var.C(objA2);
            }
            mh4 mh4Var3 = (mh4) objA2;
            Object objA3 = xr1.a(jt1Var, -1862991050);
            if (objA3 == c0187a) {
                objA3 = new l();
                jt1Var.C(objA3);
            }
            jt1Var.B();
            FileActionSheetKt.FileActionSheet(mediaItem, mh4Var, mh4Var2, mh4Var3, (mh4) objA3, jt1Var, 28080);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
