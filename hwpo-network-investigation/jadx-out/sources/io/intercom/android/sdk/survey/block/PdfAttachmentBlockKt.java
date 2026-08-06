package io.intercom.android.sdk.survey.block;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.a4a;
import defpackage.aj1;
import defpackage.ar6;
import defpackage.ay8;
import defpackage.b47;
import defpackage.b85;
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
import defpackage.it1;
import defpackage.jt1;
import defpackage.k85;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.ny8;
import defpackage.ox6;
import defpackage.oy8;
import defpackage.py8;
import defpackage.qr5;
import defpackage.qu1;
import defpackage.rd7;
import defpackage.th1;
import defpackage.tx2;
import defpackage.uma;
import defpackage.we1;
import defpackage.ws0;
import defpackage.xj8;
import defpackage.yi1;
import defpackage.z2a;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.preview.data.DownloadState;
import io.intercom.android.sdk.m5.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.m5.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.m5.preview.ui.IntercomPreviewActivity;
import io.intercom.android.sdk.survey.block.PdfAttachmentBlockKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class PdfAttachmentBlockKt {
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x0110  */
    /* JADX WARN: Code duplicated, block: B:67:0x0112  */
    /* JADX WARN: Code duplicated, block: B:70:0x012f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0133  */
    /* JADX WARN: Code duplicated, block: B:75:0x0158  */
    /* JADX WARN: Code duplicated, block: B:76:0x015a  */
    /* JADX WARN: Code duplicated, block: B:78:0x015d  */
    /* JADX WARN: Code duplicated, block: B:79:0x015f  */
    /* JADX WARN: Code duplicated, block: B:82:0x018a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0191  */
    /* JADX WARN: Code duplicated, block: B:85:0x0195  */
    /* JADX WARN: Code duplicated, block: B:88:0x01be  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:94:0x0235  */
    /* JADX WARN: Code duplicated, block: B:96:0x0243  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: PdfAttachmentBlock-ww6aTOc, reason: not valid java name */
    public static final void m441PdfAttachmentBlockww6aTOc(final BlockAttachment blockAttachment, final boolean z, ox6 ox6Var, long j, jt1 jt1Var, final int i, final int i2) {
        BlockAttachment blockAttachment2;
        int i3;
        ox6 ox6Var2;
        long jA;
        int i4;
        ox6.a aVar;
        final Context context;
        tx2 tx2Var;
        final String strF;
        final String strF2;
        final String strF3;
        final String strF4;
        int i5;
        String str;
        boolean z2;
        boolean zJ;
        Object objF;
        float f;
        float f2;
        ny8 ny8VarA;
        long j2;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        py8 py8Var;
        final ox6 ox6Var3;
        final long j3;
        xj8 xj8VarW;
        int i6;
        blockAttachment.getClass();
        bj4 bj4VarO = jt1Var.o(369048797);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            blockAttachment2 = blockAttachment;
        } else {
            blockAttachment2 = blockAttachment;
            if ((i & 6) == 0) {
                i3 = (bj4VarO.J(blockAttachment2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.c(z) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                jA = j;
                if ((i2 & 8) == 0 || !bj4VarO.i(jA)) {
                    i6 = 1024;
                } else {
                    i6 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                }
                i3 |= i6;
            } else {
                jA = j;
            }
            if ((i3 & 1171) == 1170 || !bj4VarO.r()) {
                bj4VarO.v0();
                i4 = i & 1;
                aVar = ox6.a.t;
                if (i4 != 0 || bj4VarO.c0()) {
                    if (i7 != 0) {
                        ox6Var2 = aVar;
                    }
                    if ((i2 & 8) != 0) {
                        jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        i3 &= -7169;
                    }
                } else {
                    bj4VarO.u();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                }
                bj4VarO.V();
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                tx2Var = (tx2) bj4VarO.F(qu1.h);
                strF = nr1.f(bj4VarO, R.string.intercom_permission_denied);
                strF2 = nr1.f(bj4VarO, R.string.intercom_file_saved);
                strF3 = nr1.f(bj4VarO, R.string.intercom_something_went_wrong_try_again);
                strF4 = nr1.f(bj4VarO, R.string.intercom_saving);
                i5 = i3;
                str = (String) th1.y(z2a.I(blockAttachment2.getUrl(), new String[]{"?"}, 6));
                ox6 ox6VarQ = ir9.q(ox6Var2);
                bj4VarO.K(888414527);
                boolean zJ2 = bj4VarO.j(context);
                if ((i5 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zJ = zJ2 | z2 | bj4VarO.J(strF4) | bj4VarO.J(strF2) | bj4VarO.J(strF3) | bj4VarO.J(strF);
                objF = bj4VarO.f();
                if (zJ || objF == jt1.a.a) {
                    final BlockAttachment blockAttachment3 = blockAttachment2;
                    mh4 mh4Var = new mh4() { // from class: xu7
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return PdfAttachmentBlockKt.PdfAttachmentBlock_ww6aTOc$lambda$1$lambda$0(context, blockAttachment3, strF4, strF2, strF3, strF);
                        }
                    };
                    bj4VarO.C(mh4Var);
                    objF = mh4Var;
                }
                bj4VarO.U(false);
                ox6 ox6VarC2 = we1.c(ox6VarQ, false, null, (mh4) objF, 15);
                if (z) {
                    f = 16.0f;
                } else {
                    f = 4.0f;
                }
                if (z) {
                    f2 = 4.0f;
                } else {
                    f2 = 16.0f;
                }
                ox6 ox6VarL = eo7.l(ox6VarC2, f, 4.0f, f2, 4.0f);
                ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
                j2 = jA;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarL);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
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
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                py8Var = py8.a;
                if (z) {
                    bj4VarO.K(189345698);
                    m442PdfDetailsFNF3uiM(py8Var, blockAttachment, j2, true, bj4VarO, 3078 | ((i5 << 3) & 112) | ((i5 >> 3) & 896));
                    b47.b(bj4VarO, ir9.n(aVar, 16.0f));
                    m443PdfThumbnail3xixttE(context, str, blockAttachment, tx2Var, 90.0f, bj4VarO, ((i5 << 6) & 896) | 24576);
                    bj4VarO.U(false);
                    jA = j2;
                } else {
                    bj4VarO.K(189550081);
                    m443PdfThumbnail3xixttE(context, str, blockAttachment, tx2Var, 90.0f, bj4VarO, ((i5 << 6) & 896) | 24576);
                    b47.b(bj4VarO, ir9.n(aVar, 16.0f));
                    jA = j2;
                    m442PdfDetailsFNF3uiM(py8Var, blockAttachment, jA, false, bj4VarO, 3078 | ((i5 << 3) & 112) | ((i5 >> 3) & 896));
                    bj4VarO.U(false);
                }
                bj4VarO.U(true);
            } else {
                bj4VarO.u();
            }
            ox6Var3 = ox6Var2;
            j3 = jA;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: yu7
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return PdfAttachmentBlockKt.PdfAttachmentBlock_ww6aTOc$lambda$3(blockAttachment, z, ox6Var3, j3, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        ox6Var2 = ox6Var;
        if ((i & 3072) == 0) {
            jA = j;
            if ((i2 & 8) == 0) {
                i6 = 1024;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        } else {
            jA = j;
        }
        if ((i3 & 1171) == 1170) {
            bj4VarO.v0();
            i4 = i & 1;
            aVar = ox6.a.t;
            if (i4 != 0) {
                if (i7 != 0) {
                    ox6Var2 = aVar;
                }
                if ((i2 & 8) != 0) {
                    jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    i3 &= -7169;
                }
            } else {
                if (i7 != 0) {
                    ox6Var2 = aVar;
                }
                if ((i2 & 8) != 0) {
                    jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    i3 &= -7169;
                }
            }
            bj4VarO.V();
            context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            tx2Var = (tx2) bj4VarO.F(qu1.h);
            strF = nr1.f(bj4VarO, R.string.intercom_permission_denied);
            strF2 = nr1.f(bj4VarO, R.string.intercom_file_saved);
            strF3 = nr1.f(bj4VarO, R.string.intercom_something_went_wrong_try_again);
            strF4 = nr1.f(bj4VarO, R.string.intercom_saving);
            i5 = i3;
            str = (String) th1.y(z2a.I(blockAttachment2.getUrl(), new String[]{"?"}, 6));
            ox6 ox6VarQ2 = ir9.q(ox6Var2);
            bj4VarO.K(888414527);
            boolean zJ3 = bj4VarO.j(context);
            if ((i5 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            zJ = zJ3 | z2 | bj4VarO.J(strF4) | bj4VarO.J(strF2) | bj4VarO.J(strF3) | bj4VarO.J(strF);
            objF = bj4VarO.f();
            if (zJ) {
                final BlockAttachment blockAttachment4 = blockAttachment2;
                mh4 mh4Var2 = new mh4() { // from class: xu7
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return PdfAttachmentBlockKt.PdfAttachmentBlock_ww6aTOc$lambda$1$lambda$0(context, blockAttachment4, strF4, strF2, strF3, strF);
                    }
                };
                bj4VarO.C(mh4Var2);
                objF = mh4Var2;
            } else {
                final BlockAttachment blockAttachment5 = blockAttachment2;
                mh4 mh4Var3 = new mh4() { // from class: xu7
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return PdfAttachmentBlockKt.PdfAttachmentBlock_ww6aTOc$lambda$1$lambda$0(context, blockAttachment5, strF4, strF2, strF3, strF);
                    }
                };
                bj4VarO.C(mh4Var3);
                objF = mh4Var3;
            }
            bj4VarO.U(false);
            ox6 ox6VarC3 = we1.c(ox6VarQ2, false, null, (mh4) objF, 15);
            if (z) {
                f = 16.0f;
            } else {
                f = 4.0f;
            }
            if (z) {
                f2 = 4.0f;
            } else {
                f2 = 16.0f;
            }
            ox6 ox6VarL2 = eo7.l(ox6VarC3, f, 4.0f, f2, 4.0f);
            ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
            j2 = jA;
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarL2);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
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
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            py8Var = py8.a;
            if (z) {
                bj4VarO.K(189345698);
                m442PdfDetailsFNF3uiM(py8Var, blockAttachment, j2, true, bj4VarO, 3078 | ((i5 << 3) & 112) | ((i5 >> 3) & 896));
                b47.b(bj4VarO, ir9.n(aVar, 16.0f));
                m443PdfThumbnail3xixttE(context, str, blockAttachment, tx2Var, 90.0f, bj4VarO, ((i5 << 6) & 896) | 24576);
                bj4VarO.U(false);
                jA = j2;
            } else {
                bj4VarO.K(189550081);
                m443PdfThumbnail3xixttE(context, str, blockAttachment, tx2Var, 90.0f, bj4VarO, ((i5 << 6) & 896) | 24576);
                b47.b(bj4VarO, ir9.n(aVar, 16.0f));
                jA = j2;
                m442PdfDetailsFNF3uiM(py8Var, blockAttachment, jA, false, bj4VarO, 3078 | ((i5 << 3) & 112) | ((i5 >> 3) & 896));
                bj4VarO.U(false);
            }
            bj4VarO.U(true);
        } else {
            bj4VarO.v0();
            i4 = i & 1;
            aVar = ox6.a.t;
            if (i4 != 0) {
                if (i7 != 0) {
                    ox6Var2 = aVar;
                }
                if ((i2 & 8) != 0) {
                    jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    i3 &= -7169;
                }
            } else {
                if (i7 != 0) {
                    ox6Var2 = aVar;
                }
                if ((i2 & 8) != 0) {
                    jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    i3 &= -7169;
                }
            }
            bj4VarO.V();
            context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            tx2Var = (tx2) bj4VarO.F(qu1.h);
            strF = nr1.f(bj4VarO, R.string.intercom_permission_denied);
            strF2 = nr1.f(bj4VarO, R.string.intercom_file_saved);
            strF3 = nr1.f(bj4VarO, R.string.intercom_something_went_wrong_try_again);
            strF4 = nr1.f(bj4VarO, R.string.intercom_saving);
            i5 = i3;
            str = (String) th1.y(z2a.I(blockAttachment2.getUrl(), new String[]{"?"}, 6));
            ox6 ox6VarQ3 = ir9.q(ox6Var2);
            bj4VarO.K(888414527);
            boolean zJ4 = bj4VarO.j(context);
            if ((i5 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            zJ = zJ4 | z2 | bj4VarO.J(strF4) | bj4VarO.J(strF2) | bj4VarO.J(strF3) | bj4VarO.J(strF);
            objF = bj4VarO.f();
            if (zJ) {
                final BlockAttachment blockAttachment6 = blockAttachment2;
                mh4 mh4Var4 = new mh4() { // from class: xu7
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return PdfAttachmentBlockKt.PdfAttachmentBlock_ww6aTOc$lambda$1$lambda$0(context, blockAttachment6, strF4, strF2, strF3, strF);
                    }
                };
                bj4VarO.C(mh4Var4);
                objF = mh4Var4;
            } else {
                final BlockAttachment blockAttachment7 = blockAttachment2;
                mh4 mh4Var5 = new mh4() { // from class: xu7
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return PdfAttachmentBlockKt.PdfAttachmentBlock_ww6aTOc$lambda$1$lambda$0(context, blockAttachment7, strF4, strF2, strF3, strF);
                    }
                };
                bj4VarO.C(mh4Var5);
                objF = mh4Var5;
            }
            bj4VarO.U(false);
            ox6 ox6VarC4 = we1.c(ox6VarQ3, false, null, (mh4) objF, 15);
            if (z) {
                f = 16.0f;
            } else {
                f = 4.0f;
            }
            if (z) {
                f2 = 4.0f;
            } else {
                f2 = 16.0f;
            }
            ox6 ox6VarL3 = eo7.l(ox6VarC4, f, 4.0f, f2, 4.0f);
            ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
            j2 = jA;
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarL3);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
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
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            py8Var = py8.a;
            if (z) {
                bj4VarO.K(189345698);
                m442PdfDetailsFNF3uiM(py8Var, blockAttachment, j2, true, bj4VarO, 3078 | ((i5 << 3) & 112) | ((i5 >> 3) & 896));
                b47.b(bj4VarO, ir9.n(aVar, 16.0f));
                m443PdfThumbnail3xixttE(context, str, blockAttachment, tx2Var, 90.0f, bj4VarO, ((i5 << 6) & 896) | 24576);
                bj4VarO.U(false);
                jA = j2;
            } else {
                bj4VarO.K(189550081);
                m443PdfThumbnail3xixttE(context, str, blockAttachment, tx2Var, 90.0f, bj4VarO, ((i5 << 6) & 896) | 24576);
                b47.b(bj4VarO, ir9.n(aVar, 16.0f));
                jA = j2;
                m442PdfDetailsFNF3uiM(py8Var, blockAttachment, jA, false, bj4VarO, 3078 | ((i5 << 3) & 112) | ((i5 >> 3) & 896));
                bj4VarO.U(false);
            }
            bj4VarO.U(true);
        }
        ox6Var3 = ox6Var2;
        j3 = jA;
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: yu7
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PdfAttachmentBlockKt.PdfAttachmentBlock_ww6aTOc$lambda$3(blockAttachment, z, ox6Var3, j3, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    @IntercomPreviews
    private static final void PdfAttachmentBlockPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1883421095);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PdfAttachmentBlockKt.INSTANCE.m435getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: wu7
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PdfAttachmentBlockKt.PdfAttachmentBlockPreview$lambda$9(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PdfAttachmentBlockPreview$lambda$9(int i, jt1 jt1Var, int i2) {
        PdfAttachmentBlockPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PdfAttachmentBlock_ww6aTOc$lambda$1$lambda$0(Context context, BlockAttachment blockAttachment, String str, String str2, String str3, String str4) {
        context.startActivity(IntercomPreviewActivity.Companion.createIntent(context, new IntercomPreviewArgs(ws0.h(IntercomPreviewFile.Companion.fromUrl(blockAttachment.getUrl(), "application/pdf")), null, null, false, 0, new DownloadState(blockAttachment.getUrl().length() > 0, str, str2, str3, str4), 30, null)));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PdfAttachmentBlock_ww6aTOc$lambda$3(BlockAttachment blockAttachment, boolean z, ox6 ox6Var, long j, int i, int i2, jt1 jt1Var, int i3) {
        m441PdfAttachmentBlockww6aTOc(blockAttachment, z, ox6Var, j, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: renamed from: PdfDetails-FNF3uiM, reason: not valid java name */
    private static final void m442PdfDetailsFNF3uiM(final oy8 oy8Var, BlockAttachment blockAttachment, final long j, final boolean z, jt1 jt1Var, final int i) {
        int i2;
        BlockAttachment blockAttachment2;
        bj4 bj4Var;
        bj4 bj4VarO = jt1Var.o(-1205911716);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(oy8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            blockAttachment2 = blockAttachment;
            i2 |= bj4VarO.J(blockAttachment2) ? 32 : 16;
        } else {
            blockAttachment2 = blockAttachment;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.i(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bj4VarO.c(z) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i2 & 1171) == 1170 && bj4VarO.r()) {
            bj4VarO.u();
            bj4Var = bj4VarO;
        } else {
            ox6 ox6VarA = oy8Var.a(ox6.a.t, 1.0f, false);
            aj1 aj1VarA = yi1.a(c30.d, z ? di.a.m : di.a.o, bj4VarO, 6);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarA);
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
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            String name = blockAttachment2.getName();
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i3 = IntercomTheme.$stable;
            int i4 = i2 & 896;
            mia.b(name, null, j, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i3).getType04(), bj4VarO, i4, 24960, 110586);
            bj4Var = bj4VarO;
            mia.b(blockAttachment2.getHumanFileSize(), null, j, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4Var, i3).getType05(), bj4VarO, i4, 24960, 110586);
            bj4Var.U(true);
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            final BlockAttachment blockAttachment3 = blockAttachment2;
            xj8VarW.d = new ci4() { // from class: vu7
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PdfAttachmentBlockKt.PdfDetails_FNF3uiM$lambda$5(oy8Var, blockAttachment3, j, z, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PdfDetails_FNF3uiM$lambda$5(oy8 oy8Var, BlockAttachment blockAttachment, long j, boolean z, int i, jt1 jt1Var, int i2) {
        m442PdfDetailsFNF3uiM(oy8Var, blockAttachment, j, z, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: renamed from: PdfThumbnail-3xixttE, reason: not valid java name */
    private static final void m443PdfThumbnail3xixttE(final Context context, final String str, BlockAttachment blockAttachment, final tx2 tx2Var, final float f, jt1 jt1Var, final int i) {
        int i2;
        BlockAttachment blockAttachment2;
        bj4 bj4Var;
        bj4 bj4VarO = jt1Var.o(1296049859);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(context) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.J(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            blockAttachment2 = blockAttachment;
            i2 |= bj4VarO.J(blockAttachment2) ? 256 : 128;
        } else {
            blockAttachment2 = blockAttachment;
        }
        if ((i & 3072) == 0) {
            i2 |= bj4VarO.J(tx2Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bj4VarO.g(f) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && bj4VarO.r()) {
            bj4VarO.u();
            bj4Var = bj4VarO;
        } else {
            k85.a aVar = new k85.a(context);
            aVar.f = str != null ? new ar6.a(str) : null;
            aVar.g = str;
            aVar.c = blockAttachment2.getUrl();
            aVar.e((int) tx2Var.U0(f), (int) tx2Var.U0(f));
            aVar.b();
            aVar.c(R.drawable.intercom_image_load_failed);
            k85 k85VarA = aVar.a();
            b85 imageLoader = IntercomImageLoaderKt.getImageLoader(context);
            String name = blockAttachment2.getName();
            ox6 ox6VarJ = ir9.j(uma.a(ox6.a.t, ay8.b(5.0f)), f);
            ComposableSingletons$PdfAttachmentBlockKt composableSingletons$PdfAttachmentBlockKt = ComposableSingletons$PdfAttachmentBlockKt.INSTANCE;
            bj4Var = bj4VarO;
            a4a.a(k85VarA, name, imageLoader, ox6VarJ, composableSingletons$PdfAttachmentBlockKt.m432getLambda1$intercom_sdk_base_release(), composableSingletons$PdfAttachmentBlockKt.m433getLambda2$intercom_sdk_base_release(), null, null, null, bj4Var, 12779520, 384, 257872);
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            final BlockAttachment blockAttachment3 = blockAttachment2;
            xj8VarW.d = new ci4() { // from class: uu7
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PdfAttachmentBlockKt.PdfThumbnail_3xixttE$lambda$8(context, str, blockAttachment3, tx2Var, f, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PdfThumbnail_3xixttE$lambda$8(Context context, String str, BlockAttachment blockAttachment, tx2 tx2Var, float f, int i, jt1 jt1Var, int i2) {
        m443PdfThumbnail3xixttE(context, str, blockAttachment, tx2Var, f, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
