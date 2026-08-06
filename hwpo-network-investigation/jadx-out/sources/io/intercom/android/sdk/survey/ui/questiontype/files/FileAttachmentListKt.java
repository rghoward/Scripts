package io.intercom.android.sdk.survey.ui.questiontype.files;

import defpackage.a30;
import defpackage.ae8;
import defpackage.aj1;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.dw3;
import defpackage.ei4;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.oy8;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.u;
import defpackage.we1;
import defpackage.xj5;
import defpackage.xj8;
import defpackage.yi1;
import io.intercom.android.sdk.models.FileType;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.files.FileAttachmentListKt;
import io.intercom.android.sdk.tickets.FIleAttachmentListKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class FileAttachmentListKt {
    public static final void FileAttachmentList(final List<Answer.MediaAnswer.MediaItem> list, final oh4<? super Answer.MediaAnswer.MediaItem, g2b> oh4Var, jt1 jt1Var, final int i) {
        String str;
        boolean z;
        list.getClass();
        oh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(-2107060022);
        int i2 = (i & 6) == 0 ? (bj4VarO.j(list) ? 4 : 2) | i : i;
        int i3 = 32;
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(oh4Var) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            boolean z2 = true;
            aj1 aj1VarA = yi1.a(new c30.h(8.0f, true, new a30()), di.a.m, bj4VarO, 6);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarC = it1.c(bj4VarO, aVar);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            String str2 = null;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(1339366288);
            for (final Answer.MediaAnswer.MediaItem mediaItem : list) {
                boolean z3 = mediaItem.getUploadStatus() instanceof Answer.MediaAnswer.FileUploadStatus.Error;
                jt1.a.C0187a c0187a = jt1.a.a;
                if (z3) {
                    bj4VarO.K(-582498571);
                    String fileName = mediaItem.getData().getFileName();
                    FileType fileType = FIleAttachmentListKt.getFileType(mediaItem.getData().getMimeType());
                    bj4VarO.K(1643783845);
                    boolean zJ = ((i2 & 112) == i3 ? z2 : false) | bj4VarO.j(mediaItem);
                    Object objF = bj4VarO.f();
                    if (zJ || objF == c0187a) {
                        objF = new mh4() { // from class: ew3
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return FileAttachmentListKt.FileAttachmentList$lambda$5$lambda$4$lambda$1$lambda$0(oh4Var, mediaItem);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    FIleAttachmentListKt.FailedFileAttached(we1.c(aVar, false, str2, (mh4) objF, 15), fileName, fileType, bj4VarO, 0, 0);
                    bj4VarO.U(false);
                    str = str2;
                    z = true;
                } else {
                    bj4VarO.K(-582188354);
                    String fileName2 = mediaItem.getData().getFileName();
                    FileType fileType2 = FIleAttachmentListKt.getFileType(mediaItem.getData().getMimeType());
                    bj4VarO.K(1643793349);
                    boolean zJ2 = ((i2 & 112) == i3) | bj4VarO.j(mediaItem);
                    Object objF2 = bj4VarO.f();
                    if (zJ2 || objF2 == c0187a) {
                        objF2 = new mh4() { // from class: fw3
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return FileAttachmentListKt.FileAttachmentList$lambda$5$lambda$4$lambda$3$lambda$2(oh4Var, mediaItem);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    str = str2;
                    z = true;
                    FIleAttachmentListKt.m525FileAttachmentvRFhKjU(we1.c(aVar, false, str2, (mh4) objF2, 15), fileName2, fileType2, 0L, 0L, null, gr1.b(2007803062, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.FileAttachmentListKt$FileAttachmentList$1$1$3
                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i4) {
                            oy8Var.getClass();
                            if ((i4 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            Answer.MediaAnswer.FileUploadStatus uploadStatus = mediaItem.getUploadStatus();
                            if (xj5.a(uploadStatus, Answer.MediaAnswer.FileUploadStatus.Uploading.INSTANCE)) {
                                ae8.a(ir9.j(ox6.a.t, 16.0f), 0L, 1.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                            } else {
                                if (xj5.a(uploadStatus, Answer.MediaAnswer.FileUploadStatus.None.INSTANCE) || (uploadStatus instanceof Answer.MediaAnswer.FileUploadStatus.Success) || (uploadStatus instanceof Answer.MediaAnswer.FileUploadStatus.Error) || (uploadStatus instanceof Answer.MediaAnswer.FileUploadStatus.Queued)) {
                                    return;
                                }
                                u.b();
                            }
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                            invoke(oy8Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4VarO, 1572864, 56);
                    bj4VarO.U(false);
                }
                i2 = i2;
                z2 = z;
                aVar = aVar;
                i3 = i3;
                str2 = str;
            }
            bj4VarO.U(false);
            bj4VarO.U(z2);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: gw3
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return FileAttachmentListKt.FileAttachmentList$lambda$6(list, oh4Var, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FileAttachmentList$lambda$5$lambda$4$lambda$1$lambda$0(oh4 oh4Var, Answer.MediaAnswer.MediaItem mediaItem) {
        oh4Var.invoke(mediaItem);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FileAttachmentList$lambda$5$lambda$4$lambda$3$lambda$2(oh4 oh4Var, Answer.MediaAnswer.MediaItem mediaItem) {
        oh4Var.invoke(mediaItem);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FileAttachmentList$lambda$6(List list, oh4 oh4Var, int i, jt1 jt1Var, int i2) {
        FileAttachmentList(list, oh4Var, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void FileAttachmentListErrorPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(232584117);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$FileAttachmentListKt.INSTANCE.m482getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new dw3(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FileAttachmentListErrorPreview$lambda$8(int i, jt1 jt1Var, int i2) {
        FileAttachmentListErrorPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void FileAttachmentListPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-1973696025);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$FileAttachmentListKt.INSTANCE.m480getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: hw3
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return FileAttachmentListKt.FileAttachmentListPreview$lambda$7(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FileAttachmentListPreview$lambda$7(int i, jt1 jt1Var, int i2) {
        FileAttachmentListPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
