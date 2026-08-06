package io.intercom.android.sdk.survey.ui.questiontype.files;

import defpackage.a30;
import defpackage.aj1;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.gh5;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.jt1;
import defpackage.jy3;
import defpackage.kc1;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.ny8;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.u;
import defpackage.we1;
import defpackage.xj8;
import defpackage.yi1;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.files.FileUploadErrorComponentKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.component.ErrorMessageLayoutKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class FileUploadErrorComponentKt {
    /* JADX INFO: renamed from: ActionRow-FHprtrg, reason: not valid java name */
    public static final void m491ActionRowFHprtrg(ox6 ox6Var, final int i, final int i2, int i3, long j, final mh4<g2b> mh4Var, jt1 jt1Var, final int i4, final int i5) {
        final ox6 ox6Var2;
        int i6;
        int i7;
        long jA;
        ox6 ox6Var3;
        final int i8;
        final long j2;
        mh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(-1845655864);
        int i9 = i5 & 1;
        if (i9 != 0) {
            i6 = i4 | 6;
            ox6Var2 = ox6Var;
        } else if ((i4 & 6) == 0) {
            ox6Var2 = ox6Var;
            i6 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i4;
        } else {
            ox6Var2 = ox6Var;
            i6 = i4;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            i6 |= bj4VarO.h(i) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i6 |= 384;
        } else if ((i4 & 384) == 0) {
            i6 |= bj4VarO.h(i2) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            if ((i5 & 8) == 0) {
                i7 = i3;
                int i10 = bj4VarO.h(i7) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
                i6 |= i10;
            } else {
                i7 = i3;
            }
            i6 |= i10;
        } else {
            i7 = i3;
        }
        if ((i4 & 24576) == 0) {
            jA = j;
            i6 |= ((i5 & 16) == 0 && bj4VarO.i(jA)) ? 16384 : 8192;
        } else {
            jA = j;
        }
        if ((i5 & 32) != 0) {
            i6 |= 196608;
        } else if ((i4 & 196608) == 0) {
            i6 |= bj4VarO.j(mh4Var) ? 131072 : 65536;
        }
        if ((74899 & i6) == 74898 && bj4VarO.r()) {
            bj4VarO.u();
            i8 = i7;
            j2 = jA;
        } else {
            bj4VarO.v0();
            if ((i4 & 1) == 0 || bj4VarO.c0()) {
                ox6Var3 = i9 != 0 ? ox6.a.t : ox6Var2;
                if ((i5 & 8) != 0) {
                    i6 &= -7169;
                    i7 = i2;
                }
                if ((i5 & 16) != 0) {
                    jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    i6 &= -57345;
                }
            } else {
                bj4VarO.u();
                if ((i5 & 8) != 0) {
                    i6 &= -7169;
                }
                if ((i5 & 16) != 0) {
                    i6 &= -57345;
                }
                ox6Var3 = ox6Var2;
            }
            long j3 = jA;
            bj4VarO.V();
            ox6 ox6VarC = ir9.c(ox6Var3, 1.0f);
            bj4VarO.K(1130566658);
            boolean z = (458752 & i6) == 131072;
            Object objF = bj4VarO.f();
            if (z || objF == jt1.a.a) {
                objF = new mh4() { // from class: ky3
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return FileUploadErrorComponentKt.ActionRow_FHprtrg$lambda$3$lambda$2(mh4Var);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ox6 ox6VarJ = eo7.j(16.0f, 16.0f, we1.c(ox6VarC, false, null, (mh4) objF, 15));
            ny8 ny8VarA = ly8.a(new c30.h(16.0f, true, new a30()), di.a.k, bj4VarO, 54);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC2 = it1.c(bj4VarO, ox6VarJ);
            bt1.c.getClass();
            qr5.a aVar = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC2);
            int i11 = i6 >> 3;
            m65.b(is7.a(i, bj4VarO, i11 & 14), nr1.f(bj4VarO, i7), null, j3, bj4VarO, 8 | (i11 & 7168), 4);
            mia.b(nr1.f(bj4VarO, i2), null, j3, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04(), bj4VarO, (i6 >> 6) & 896, 0, 131066);
            bj4VarO = bj4VarO;
            bj4VarO.U(true);
            ox6Var2 = ox6Var3;
            i8 = i7;
            j2 = j3;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ly3
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return FileUploadErrorComponentKt.ActionRow_FHprtrg$lambda$5(ox6Var2, i, i2, i8, j2, mh4Var, i4, i5, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ActionRow_FHprtrg$lambda$3$lambda$2(mh4 mh4Var) {
        mh4Var.invoke();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ActionRow_FHprtrg$lambda$5(ox6 ox6Var, int i, int i2, int i3, long j, mh4 mh4Var, int i4, int i5, jt1 jt1Var, int i6) {
        m491ActionRowFHprtrg(ox6Var, i, i2, i3, j, mh4Var, jt1Var, gz3.s(i4 | 1), i5);
        return g2b.a;
    }

    @IntercomPreviews
    private static final void ErrorActionSheetContentPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(2121321299);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$FileUploadErrorComponentKt.INSTANCE.m484getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new jy3(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ErrorActionSheetContentPreview$lambda$6(int i, jt1 jt1Var, int i2) {
        ErrorActionSheetContentPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void FileUploadErrorComponent(final String str, final Answer.MediaAnswer.FileUploadError fileUploadError, final mh4<g2b> mh4Var, final mh4<g2b> mh4Var2, jt1 jt1Var, final int i) {
        int i2;
        boolean z;
        str.getClass();
        fileUploadError.getClass();
        mh4Var.getClass();
        mh4Var2.getClass();
        bj4 bj4VarO = jt1Var.o(725182893);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(fileUploadError) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(mh4Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bj4VarO.j(mh4Var2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i2 & 1171) == 1170 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarC = ir9.c(aVar, 1.0f);
            aj1 aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC2 = it1.c(bj4VarO, ox6VarC);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
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
            rd7.d(bj4VarO, bt1.a.d, ox6VarC2);
            int i3 = i2;
            mia.b(str, eo7.m(ir9.c(aVar, 1.0f), 16.0f, 16.0f, 16.0f, 0.0f, 8), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04(), bj4VarO, i2 & 14, 0, 131068);
            bj4VarO = bj4VarO;
            ErrorMessageLayoutKt.ErrorMessageLayout(eo7.j(16.0f, 8.0f, ir9.c(aVar, 1.0f)), fileUploadError.getErrorMessages(), bj4VarO, 6, 0);
            IntercomDividerKt.IntercomDivider(eo7.k(ir9.c(aVar, 1.0f), 0.0f, 4.0f, 1), bj4VarO, 6, 0);
            if ((fileUploadError instanceof Answer.MediaAnswer.FileUploadError.FileLimitExceeded) || (fileUploadError instanceof Answer.MediaAnswer.FileUploadError.UnsupportedFileType) || (fileUploadError instanceof Answer.MediaAnswer.FileUploadError.FileTooLarge)) {
                z = true;
                bj4VarO.K(157589913);
                m491ActionRowFHprtrg(null, R.drawable.intercom_ic_delete, io.intercom.android.sdk.R.string.intercom_delete_attachment, 0, 0L, mh4Var2, bj4VarO, (i3 << 6) & 458752, 25);
                bj4VarO.U(false);
            } else if (!(fileUploadError instanceof Answer.MediaAnswer.FileUploadError.UploadFailed)) {
                bj4VarO.K(-549109013);
                bj4VarO.U(false);
                u.b();
                return;
            } else {
                bj4VarO.K(157902703);
                z = true;
                m491ActionRowFHprtrg(null, io.intercom.android.sdk.R.drawable.intercom_ic_reload, io.intercom.android.sdk.R.string.intercom_try_again, 0, 0L, mh4Var, bj4VarO, (i3 << 9) & 458752, 25);
                IntercomDividerKt.IntercomDivider(eo7.k(ir9.c(aVar, 1.0f), 0.0f, 4.0f, 1), bj4VarO, 6, 0);
                m491ActionRowFHprtrg(null, R.drawable.intercom_ic_delete, io.intercom.android.sdk.R.string.intercom_delete_attachment, 0, 0L, mh4Var2, bj4VarO, (i3 << 6) & 458752, 25);
                bj4VarO.U(false);
            }
            bj4VarO.U(z);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: iy3
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return FileUploadErrorComponentKt.FileUploadErrorComponent$lambda$1(str, fileUploadError, mh4Var, mh4Var2, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FileUploadErrorComponent$lambda$1(String str, Answer.MediaAnswer.FileUploadError fileUploadError, mh4 mh4Var, mh4 mh4Var2, int i, jt1 jt1Var, int i2) {
        FileUploadErrorComponent(str, fileUploadError, mh4Var, mh4Var2, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void UploadFailedErrorActionSheetPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(2130831888);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$FileUploadErrorComponentKt.INSTANCE.m486getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new kc1(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b UploadFailedErrorActionSheetPreview$lambda$7(int i, jt1 jt1Var, int i2) {
        UploadFailedErrorActionSheetPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
