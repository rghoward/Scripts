package io.intercom.android.sdk.m5.conversation.ui.components;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.ah5;
import defpackage.b08;
import defpackage.bj4;
import defpackage.ci4;
import defpackage.dt6;
import defpackage.ek;
import defpackage.et6;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.it6;
import defpackage.jt1;
import defpackage.jz0;
import defpackage.l66;
import defpackage.mh4;
import defpackage.mia;
import defpackage.nr1;
import defpackage.oj;
import defpackage.xj8;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.data.MediaUploadRepository;
import io.intercom.android.sdk.m5.conversation.ui.components.UploadErrorDialogKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.Phrase;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class UploadErrorDialogKt {
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:75:0x0107  */
    /* JADX WARN: Code duplicated, block: B:78:0x010e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x0110  */
    /* JADX WARN: Code duplicated, block: B:83:0x0166  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public static final void UploadErrorDialog(final MediaUploadRepository.UploadError uploadError, mh4<g2b> mh4Var, mh4<g2b> mh4Var2, mh4<g2b> mh4Var3, jt1 jt1Var, final int i, final int i2) {
        int i3;
        mh4<g2b> mh4Var4;
        int i4;
        mh4<g2b> mh4Var5;
        int i5;
        int i6;
        mh4<g2b> mh4Var6;
        int i7;
        jt1.a.C0187a c0187a;
        int i8;
        mh4<g2b> mh4Var7;
        int i9;
        mh4<g2b> mh4Var8;
        mh4<g2b> mh4Var9;
        Object objF;
        bj4 bj4Var;
        final mh4<g2b> mh4Var10;
        final mh4<g2b> mh4Var11;
        final mh4<g2b> mh4Var12;
        Object objF2;
        Object objF3;
        Object objF4;
        xj8 xj8VarW;
        uploadError.getClass();
        bj4 bj4VarO = jt1Var.o(-444387334);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(uploadError) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                mh4Var4 = mh4Var;
                i3 |= bj4VarO.j(mh4Var4) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    mh4Var5 = mh4Var2;
                    if (bj4VarO.j(mh4Var5)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        mh4Var6 = mh4Var3;
                        if (bj4VarO.j(mh4Var6)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    if ((i3 & 1171) == 1170 || !bj4VarO.r()) {
                        c0187a = jt1.a.a;
                        i8 = 1;
                        if (i10 != 0) {
                            bj4VarO.K(980934010);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new et6(i8);
                                bj4VarO.C(objF4);
                            }
                            mh4Var7 = (mh4) objF4;
                            bj4VarO.U(false);
                        } else {
                            mh4Var7 = mh4Var4;
                        }
                        i9 = 3;
                        if (i4 != 0) {
                            bj4VarO.K(980935002);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new l66(i9);
                                bj4VarO.C(objF3);
                            }
                            mh4Var8 = (mh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            mh4Var8 = mh4Var5;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(980936026);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new b08(i8);
                                bj4VarO.C(objF2);
                            }
                            mh4Var9 = (mh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            mh4Var9 = mh4Var6;
                        }
                        long jM712getBase0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getBase().m712getBase0d7_KjU();
                        bj4VarO.K(980946683);
                        i8 = (i3 & 7168) != 2048 ? 0 : 1;
                        objF = bj4VarO.f();
                        if (i8 == 0 || objF == c0187a) {
                            objF = new oj(i9, mh4Var9);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        bj4Var = bj4VarO;
                        ek.a((mh4) objF, gr1.b(1477542978, new AnonymousClass5(uploadError, mh4Var7, mh4Var9), bj4VarO), null, gr1.b(2126135748, new AnonymousClass6(mh4Var8, mh4Var9), bj4VarO), null, null, gr1.b(951541255, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadErrorDialogKt.UploadErrorDialog.7
                            public final void invoke(jt1 jt1Var2, int i11) {
                                if ((i11 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                String errorMessage = UploadErrorDialogKt.getErrorMessage(uploadError, jt1Var2, 0);
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                int i12 = IntercomTheme.$stable;
                                mia.b(errorMessage, null, ah5.a(intercomTheme, jt1Var2, i12), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i12).getType04(), jt1Var2, 0, 0, 131066);
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), null, jM712getBase0d7_KjU, 0L, 0L, 0L, null, bj4Var, 1575984, 0, 16052);
                        mh4Var10 = mh4Var9;
                        mh4Var11 = mh4Var7;
                        mh4Var12 = mh4Var8;
                    } else {
                        bj4VarO.u();
                        bj4Var = bj4VarO;
                        mh4Var11 = mh4Var4;
                        mh4Var12 = mh4Var5;
                        mh4Var10 = mh4Var6;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: e4b
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return UploadErrorDialogKt.UploadErrorDialog$lambda$8(uploadError, mh4Var11, mh4Var12, mh4Var10, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 3072;
                mh4Var6 = mh4Var3;
                if ((i3 & 1171) == 1170) {
                    c0187a = jt1.a.a;
                    i8 = 1;
                    if (i10 != 0) {
                        bj4VarO.K(980934010);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new et6(i8);
                            bj4VarO.C(objF4);
                        }
                        mh4Var7 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var7 = mh4Var4;
                    }
                    i9 = 3;
                    if (i4 != 0) {
                        bj4VarO.K(980935002);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new l66(i9);
                            bj4VarO.C(objF3);
                        }
                        mh4Var8 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var8 = mh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(980936026);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new b08(i8);
                            bj4VarO.C(objF2);
                        }
                        mh4Var9 = (mh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        mh4Var9 = mh4Var6;
                    }
                    long jM712getBase0d7_KjU2 = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getBase().m712getBase0d7_KjU();
                    bj4VarO.K(980946683);
                    if ((i3 & 7168) != 2048) {
                    }
                    objF = bj4VarO.f();
                    if (i8 == 0) {
                        objF = new oj(i9, mh4Var9);
                        bj4VarO.C(objF);
                    } else {
                        objF = new oj(i9, mh4Var9);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    bj4Var = bj4VarO;
                    ek.a((mh4) objF, gr1.b(1477542978, new AnonymousClass5(uploadError, mh4Var7, mh4Var9), bj4VarO), null, gr1.b(2126135748, new AnonymousClass6(mh4Var8, mh4Var9), bj4VarO), null, null, gr1.b(951541255, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadErrorDialogKt.UploadErrorDialog.7
                        public final void invoke(jt1 jt1Var2, int i11) {
                            if ((i11 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            String errorMessage = UploadErrorDialogKt.getErrorMessage(uploadError, jt1Var2, 0);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i12 = IntercomTheme.$stable;
                            mia.b(errorMessage, null, ah5.a(intercomTheme, jt1Var2, i12), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i12).getType04(), jt1Var2, 0, 0, 131066);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, jM712getBase0d7_KjU2, 0L, 0L, 0L, null, bj4Var, 1575984, 0, 16052);
                    mh4Var10 = mh4Var9;
                    mh4Var11 = mh4Var7;
                    mh4Var12 = mh4Var8;
                } else {
                    c0187a = jt1.a.a;
                    i8 = 1;
                    if (i10 != 0) {
                        bj4VarO.K(980934010);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new et6(i8);
                            bj4VarO.C(objF4);
                        }
                        mh4Var7 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var7 = mh4Var4;
                    }
                    i9 = 3;
                    if (i4 != 0) {
                        bj4VarO.K(980935002);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new l66(i9);
                            bj4VarO.C(objF3);
                        }
                        mh4Var8 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var8 = mh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(980936026);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new b08(i8);
                            bj4VarO.C(objF2);
                        }
                        mh4Var9 = (mh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        mh4Var9 = mh4Var6;
                    }
                    long jM712getBase0d7_KjU3 = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getBase().m712getBase0d7_KjU();
                    bj4VarO.K(980946683);
                    if ((i3 & 7168) != 2048) {
                    }
                    objF = bj4VarO.f();
                    if (i8 == 0) {
                        objF = new oj(i9, mh4Var9);
                        bj4VarO.C(objF);
                    } else {
                        objF = new oj(i9, mh4Var9);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    bj4Var = bj4VarO;
                    ek.a((mh4) objF, gr1.b(1477542978, new AnonymousClass5(uploadError, mh4Var7, mh4Var9), bj4VarO), null, gr1.b(2126135748, new AnonymousClass6(mh4Var8, mh4Var9), bj4VarO), null, null, gr1.b(951541255, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadErrorDialogKt.UploadErrorDialog.7
                        public final void invoke(jt1 jt1Var2, int i11) {
                            if ((i11 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            String errorMessage = UploadErrorDialogKt.getErrorMessage(uploadError, jt1Var2, 0);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i12 = IntercomTheme.$stable;
                            mia.b(errorMessage, null, ah5.a(intercomTheme, jt1Var2, i12), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i12).getType04(), jt1Var2, 0, 0, 131066);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, jM712getBase0d7_KjU3, 0L, 0L, 0L, null, bj4Var, 1575984, 0, 16052);
                    mh4Var10 = mh4Var9;
                    mh4Var11 = mh4Var7;
                    mh4Var12 = mh4Var8;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: e4b
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return UploadErrorDialogKt.UploadErrorDialog$lambda$8(uploadError, mh4Var11, mh4Var12, mh4Var10, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 384;
            mh4Var5 = mh4Var2;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    mh4Var6 = mh4Var3;
                    if (bj4VarO.j(mh4Var6)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i3 & 1171) == 1170) {
                    c0187a = jt1.a.a;
                    i8 = 1;
                    if (i10 != 0) {
                        bj4VarO.K(980934010);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new et6(i8);
                            bj4VarO.C(objF4);
                        }
                        mh4Var7 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var7 = mh4Var4;
                    }
                    i9 = 3;
                    if (i4 != 0) {
                        bj4VarO.K(980935002);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new l66(i9);
                            bj4VarO.C(objF3);
                        }
                        mh4Var8 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var8 = mh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(980936026);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new b08(i8);
                            bj4VarO.C(objF2);
                        }
                        mh4Var9 = (mh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        mh4Var9 = mh4Var6;
                    }
                    long jM712getBase0d7_KjU4 = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getBase().m712getBase0d7_KjU();
                    bj4VarO.K(980946683);
                    if ((i3 & 7168) != 2048) {
                    }
                    objF = bj4VarO.f();
                    if (i8 == 0) {
                        objF = new oj(i9, mh4Var9);
                        bj4VarO.C(objF);
                    } else {
                        objF = new oj(i9, mh4Var9);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    bj4Var = bj4VarO;
                    ek.a((mh4) objF, gr1.b(1477542978, new AnonymousClass5(uploadError, mh4Var7, mh4Var9), bj4VarO), null, gr1.b(2126135748, new AnonymousClass6(mh4Var8, mh4Var9), bj4VarO), null, null, gr1.b(951541255, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadErrorDialogKt.UploadErrorDialog.7
                        public final void invoke(jt1 jt1Var2, int i11) {
                            if ((i11 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            String errorMessage = UploadErrorDialogKt.getErrorMessage(uploadError, jt1Var2, 0);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i12 = IntercomTheme.$stable;
                            mia.b(errorMessage, null, ah5.a(intercomTheme, jt1Var2, i12), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i12).getType04(), jt1Var2, 0, 0, 131066);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, jM712getBase0d7_KjU4, 0L, 0L, 0L, null, bj4Var, 1575984, 0, 16052);
                    mh4Var10 = mh4Var9;
                    mh4Var11 = mh4Var7;
                    mh4Var12 = mh4Var8;
                } else {
                    c0187a = jt1.a.a;
                    i8 = 1;
                    if (i10 != 0) {
                        bj4VarO.K(980934010);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new et6(i8);
                            bj4VarO.C(objF4);
                        }
                        mh4Var7 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var7 = mh4Var4;
                    }
                    i9 = 3;
                    if (i4 != 0) {
                        bj4VarO.K(980935002);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new l66(i9);
                            bj4VarO.C(objF3);
                        }
                        mh4Var8 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var8 = mh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(980936026);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new b08(i8);
                            bj4VarO.C(objF2);
                        }
                        mh4Var9 = (mh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        mh4Var9 = mh4Var6;
                    }
                    long jM712getBase0d7_KjU5 = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getBase().m712getBase0d7_KjU();
                    bj4VarO.K(980946683);
                    if ((i3 & 7168) != 2048) {
                    }
                    objF = bj4VarO.f();
                    if (i8 == 0) {
                        objF = new oj(i9, mh4Var9);
                        bj4VarO.C(objF);
                    } else {
                        objF = new oj(i9, mh4Var9);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    bj4Var = bj4VarO;
                    ek.a((mh4) objF, gr1.b(1477542978, new AnonymousClass5(uploadError, mh4Var7, mh4Var9), bj4VarO), null, gr1.b(2126135748, new AnonymousClass6(mh4Var8, mh4Var9), bj4VarO), null, null, gr1.b(951541255, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadErrorDialogKt.UploadErrorDialog.7
                        public final void invoke(jt1 jt1Var2, int i11) {
                            if ((i11 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            String errorMessage = UploadErrorDialogKt.getErrorMessage(uploadError, jt1Var2, 0);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i12 = IntercomTheme.$stable;
                            mia.b(errorMessage, null, ah5.a(intercomTheme, jt1Var2, i12), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i12).getType04(), jt1Var2, 0, 0, 131066);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, jM712getBase0d7_KjU5, 0L, 0L, 0L, null, bj4Var, 1575984, 0, 16052);
                    mh4Var10 = mh4Var9;
                    mh4Var11 = mh4Var7;
                    mh4Var12 = mh4Var8;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: e4b
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return UploadErrorDialogKt.UploadErrorDialog$lambda$8(uploadError, mh4Var11, mh4Var12, mh4Var10, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            mh4Var6 = mh4Var3;
            if ((i3 & 1171) == 1170) {
                c0187a = jt1.a.a;
                i8 = 1;
                if (i10 != 0) {
                    bj4VarO.K(980934010);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new et6(i8);
                        bj4VarO.C(objF4);
                    }
                    mh4Var7 = (mh4) objF4;
                    bj4VarO.U(false);
                } else {
                    mh4Var7 = mh4Var4;
                }
                i9 = 3;
                if (i4 != 0) {
                    bj4VarO.K(980935002);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new l66(i9);
                        bj4VarO.C(objF3);
                    }
                    mh4Var8 = (mh4) objF3;
                    bj4VarO.U(false);
                } else {
                    mh4Var8 = mh4Var5;
                }
                if (i6 != 0) {
                    bj4VarO.K(980936026);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new b08(i8);
                        bj4VarO.C(objF2);
                    }
                    mh4Var9 = (mh4) objF2;
                    bj4VarO.U(false);
                } else {
                    mh4Var9 = mh4Var6;
                }
                long jM712getBase0d7_KjU6 = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getBase().m712getBase0d7_KjU();
                bj4VarO.K(980946683);
                if ((i3 & 7168) != 2048) {
                }
                objF = bj4VarO.f();
                if (i8 == 0) {
                    objF = new oj(i9, mh4Var9);
                    bj4VarO.C(objF);
                } else {
                    objF = new oj(i9, mh4Var9);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                bj4Var = bj4VarO;
                ek.a((mh4) objF, gr1.b(1477542978, new AnonymousClass5(uploadError, mh4Var7, mh4Var9), bj4VarO), null, gr1.b(2126135748, new AnonymousClass6(mh4Var8, mh4Var9), bj4VarO), null, null, gr1.b(951541255, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadErrorDialogKt.UploadErrorDialog.7
                    public final void invoke(jt1 jt1Var2, int i11) {
                        if ((i11 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        String errorMessage = UploadErrorDialogKt.getErrorMessage(uploadError, jt1Var2, 0);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i12 = IntercomTheme.$stable;
                        mia.b(errorMessage, null, ah5.a(intercomTheme, jt1Var2, i12), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i12).getType04(), jt1Var2, 0, 0, 131066);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, jM712getBase0d7_KjU6, 0L, 0L, 0L, null, bj4Var, 1575984, 0, 16052);
                mh4Var10 = mh4Var9;
                mh4Var11 = mh4Var7;
                mh4Var12 = mh4Var8;
            } else {
                c0187a = jt1.a.a;
                i8 = 1;
                if (i10 != 0) {
                    bj4VarO.K(980934010);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new et6(i8);
                        bj4VarO.C(objF4);
                    }
                    mh4Var7 = (mh4) objF4;
                    bj4VarO.U(false);
                } else {
                    mh4Var7 = mh4Var4;
                }
                i9 = 3;
                if (i4 != 0) {
                    bj4VarO.K(980935002);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new l66(i9);
                        bj4VarO.C(objF3);
                    }
                    mh4Var8 = (mh4) objF3;
                    bj4VarO.U(false);
                } else {
                    mh4Var8 = mh4Var5;
                }
                if (i6 != 0) {
                    bj4VarO.K(980936026);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new b08(i8);
                        bj4VarO.C(objF2);
                    }
                    mh4Var9 = (mh4) objF2;
                    bj4VarO.U(false);
                } else {
                    mh4Var9 = mh4Var6;
                }
                long jM712getBase0d7_KjU7 = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getBase().m712getBase0d7_KjU();
                bj4VarO.K(980946683);
                if ((i3 & 7168) != 2048) {
                }
                objF = bj4VarO.f();
                if (i8 == 0) {
                    objF = new oj(i9, mh4Var9);
                    bj4VarO.C(objF);
                } else {
                    objF = new oj(i9, mh4Var9);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                bj4Var = bj4VarO;
                ek.a((mh4) objF, gr1.b(1477542978, new AnonymousClass5(uploadError, mh4Var7, mh4Var9), bj4VarO), null, gr1.b(2126135748, new AnonymousClass6(mh4Var8, mh4Var9), bj4VarO), null, null, gr1.b(951541255, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadErrorDialogKt.UploadErrorDialog.7
                    public final void invoke(jt1 jt1Var2, int i11) {
                        if ((i11 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        String errorMessage = UploadErrorDialogKt.getErrorMessage(uploadError, jt1Var2, 0);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i12 = IntercomTheme.$stable;
                        mia.b(errorMessage, null, ah5.a(intercomTheme, jt1Var2, i12), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i12).getType04(), jt1Var2, 0, 0, 131066);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, jM712getBase0d7_KjU7, 0L, 0L, 0L, null, bj4Var, 1575984, 0, 16052);
                mh4Var10 = mh4Var9;
                mh4Var11 = mh4Var7;
                mh4Var12 = mh4Var8;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: e4b
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return UploadErrorDialogKt.UploadErrorDialog$lambda$8(uploadError, mh4Var11, mh4Var12, mh4Var10, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        mh4Var4 = mh4Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                mh4Var5 = mh4Var2;
                if (bj4VarO.j(mh4Var5)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    mh4Var6 = mh4Var3;
                    if (bj4VarO.j(mh4Var6)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i3 & 1171) == 1170) {
                    c0187a = jt1.a.a;
                    i8 = 1;
                    if (i10 != 0) {
                        bj4VarO.K(980934010);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new et6(i8);
                            bj4VarO.C(objF4);
                        }
                        mh4Var7 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var7 = mh4Var4;
                    }
                    i9 = 3;
                    if (i4 != 0) {
                        bj4VarO.K(980935002);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new l66(i9);
                            bj4VarO.C(objF3);
                        }
                        mh4Var8 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var8 = mh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(980936026);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new b08(i8);
                            bj4VarO.C(objF2);
                        }
                        mh4Var9 = (mh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        mh4Var9 = mh4Var6;
                    }
                    long jM712getBase0d7_KjU8 = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getBase().m712getBase0d7_KjU();
                    bj4VarO.K(980946683);
                    if ((i3 & 7168) != 2048) {
                    }
                    objF = bj4VarO.f();
                    if (i8 == 0) {
                        objF = new oj(i9, mh4Var9);
                        bj4VarO.C(objF);
                    } else {
                        objF = new oj(i9, mh4Var9);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    bj4Var = bj4VarO;
                    ek.a((mh4) objF, gr1.b(1477542978, new AnonymousClass5(uploadError, mh4Var7, mh4Var9), bj4VarO), null, gr1.b(2126135748, new AnonymousClass6(mh4Var8, mh4Var9), bj4VarO), null, null, gr1.b(951541255, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadErrorDialogKt.UploadErrorDialog.7
                        public final void invoke(jt1 jt1Var2, int i11) {
                            if ((i11 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            String errorMessage = UploadErrorDialogKt.getErrorMessage(uploadError, jt1Var2, 0);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i12 = IntercomTheme.$stable;
                            mia.b(errorMessage, null, ah5.a(intercomTheme, jt1Var2, i12), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i12).getType04(), jt1Var2, 0, 0, 131066);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, jM712getBase0d7_KjU8, 0L, 0L, 0L, null, bj4Var, 1575984, 0, 16052);
                    mh4Var10 = mh4Var9;
                    mh4Var11 = mh4Var7;
                    mh4Var12 = mh4Var8;
                } else {
                    c0187a = jt1.a.a;
                    i8 = 1;
                    if (i10 != 0) {
                        bj4VarO.K(980934010);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new et6(i8);
                            bj4VarO.C(objF4);
                        }
                        mh4Var7 = (mh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        mh4Var7 = mh4Var4;
                    }
                    i9 = 3;
                    if (i4 != 0) {
                        bj4VarO.K(980935002);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new l66(i9);
                            bj4VarO.C(objF3);
                        }
                        mh4Var8 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var8 = mh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(980936026);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new b08(i8);
                            bj4VarO.C(objF2);
                        }
                        mh4Var9 = (mh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        mh4Var9 = mh4Var6;
                    }
                    long jM712getBase0d7_KjU9 = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getBase().m712getBase0d7_KjU();
                    bj4VarO.K(980946683);
                    if ((i3 & 7168) != 2048) {
                    }
                    objF = bj4VarO.f();
                    if (i8 == 0) {
                        objF = new oj(i9, mh4Var9);
                        bj4VarO.C(objF);
                    } else {
                        objF = new oj(i9, mh4Var9);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    bj4Var = bj4VarO;
                    ek.a((mh4) objF, gr1.b(1477542978, new AnonymousClass5(uploadError, mh4Var7, mh4Var9), bj4VarO), null, gr1.b(2126135748, new AnonymousClass6(mh4Var8, mh4Var9), bj4VarO), null, null, gr1.b(951541255, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadErrorDialogKt.UploadErrorDialog.7
                        public final void invoke(jt1 jt1Var2, int i11) {
                            if ((i11 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            String errorMessage = UploadErrorDialogKt.getErrorMessage(uploadError, jt1Var2, 0);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i12 = IntercomTheme.$stable;
                            mia.b(errorMessage, null, ah5.a(intercomTheme, jt1Var2, i12), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i12).getType04(), jt1Var2, 0, 0, 131066);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, jM712getBase0d7_KjU9, 0L, 0L, 0L, null, bj4Var, 1575984, 0, 16052);
                    mh4Var10 = mh4Var9;
                    mh4Var11 = mh4Var7;
                    mh4Var12 = mh4Var8;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: e4b
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return UploadErrorDialogKt.UploadErrorDialog$lambda$8(uploadError, mh4Var11, mh4Var12, mh4Var10, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            mh4Var6 = mh4Var3;
            if ((i3 & 1171) == 1170) {
                c0187a = jt1.a.a;
                i8 = 1;
                if (i10 != 0) {
                    bj4VarO.K(980934010);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new et6(i8);
                        bj4VarO.C(objF4);
                    }
                    mh4Var7 = (mh4) objF4;
                    bj4VarO.U(false);
                } else {
                    mh4Var7 = mh4Var4;
                }
                i9 = 3;
                if (i4 != 0) {
                    bj4VarO.K(980935002);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new l66(i9);
                        bj4VarO.C(objF3);
                    }
                    mh4Var8 = (mh4) objF3;
                    bj4VarO.U(false);
                } else {
                    mh4Var8 = mh4Var5;
                }
                if (i6 != 0) {
                    bj4VarO.K(980936026);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new b08(i8);
                        bj4VarO.C(objF2);
                    }
                    mh4Var9 = (mh4) objF2;
                    bj4VarO.U(false);
                } else {
                    mh4Var9 = mh4Var6;
                }
                long jM712getBase0d7_KjU10 = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getBase().m712getBase0d7_KjU();
                bj4VarO.K(980946683);
                if ((i3 & 7168) != 2048) {
                }
                objF = bj4VarO.f();
                if (i8 == 0) {
                    objF = new oj(i9, mh4Var9);
                    bj4VarO.C(objF);
                } else {
                    objF = new oj(i9, mh4Var9);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                bj4Var = bj4VarO;
                ek.a((mh4) objF, gr1.b(1477542978, new AnonymousClass5(uploadError, mh4Var7, mh4Var9), bj4VarO), null, gr1.b(2126135748, new AnonymousClass6(mh4Var8, mh4Var9), bj4VarO), null, null, gr1.b(951541255, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadErrorDialogKt.UploadErrorDialog.7
                    public final void invoke(jt1 jt1Var2, int i11) {
                        if ((i11 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        String errorMessage = UploadErrorDialogKt.getErrorMessage(uploadError, jt1Var2, 0);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i12 = IntercomTheme.$stable;
                        mia.b(errorMessage, null, ah5.a(intercomTheme, jt1Var2, i12), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i12).getType04(), jt1Var2, 0, 0, 131066);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, jM712getBase0d7_KjU10, 0L, 0L, 0L, null, bj4Var, 1575984, 0, 16052);
                mh4Var10 = mh4Var9;
                mh4Var11 = mh4Var7;
                mh4Var12 = mh4Var8;
            } else {
                c0187a = jt1.a.a;
                i8 = 1;
                if (i10 != 0) {
                    bj4VarO.K(980934010);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new et6(i8);
                        bj4VarO.C(objF4);
                    }
                    mh4Var7 = (mh4) objF4;
                    bj4VarO.U(false);
                } else {
                    mh4Var7 = mh4Var4;
                }
                i9 = 3;
                if (i4 != 0) {
                    bj4VarO.K(980935002);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new l66(i9);
                        bj4VarO.C(objF3);
                    }
                    mh4Var8 = (mh4) objF3;
                    bj4VarO.U(false);
                } else {
                    mh4Var8 = mh4Var5;
                }
                if (i6 != 0) {
                    bj4VarO.K(980936026);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new b08(i8);
                        bj4VarO.C(objF2);
                    }
                    mh4Var9 = (mh4) objF2;
                    bj4VarO.U(false);
                } else {
                    mh4Var9 = mh4Var6;
                }
                long jM712getBase0d7_KjU11 = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getBase().m712getBase0d7_KjU();
                bj4VarO.K(980946683);
                if ((i3 & 7168) != 2048) {
                }
                objF = bj4VarO.f();
                if (i8 == 0) {
                    objF = new oj(i9, mh4Var9);
                    bj4VarO.C(objF);
                } else {
                    objF = new oj(i9, mh4Var9);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                bj4Var = bj4VarO;
                ek.a((mh4) objF, gr1.b(1477542978, new AnonymousClass5(uploadError, mh4Var7, mh4Var9), bj4VarO), null, gr1.b(2126135748, new AnonymousClass6(mh4Var8, mh4Var9), bj4VarO), null, null, gr1.b(951541255, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadErrorDialogKt.UploadErrorDialog.7
                    public final void invoke(jt1 jt1Var2, int i11) {
                        if ((i11 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        String errorMessage = UploadErrorDialogKt.getErrorMessage(uploadError, jt1Var2, 0);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i12 = IntercomTheme.$stable;
                        mia.b(errorMessage, null, ah5.a(intercomTheme, jt1Var2, i12), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i12).getType04(), jt1Var2, 0, 0, 131066);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, jM712getBase0d7_KjU11, 0L, 0L, 0L, null, bj4Var, 1575984, 0, 16052);
                mh4Var10 = mh4Var9;
                mh4Var11 = mh4Var7;
                mh4Var12 = mh4Var8;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: e4b
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return UploadErrorDialogKt.UploadErrorDialog$lambda$8(uploadError, mh4Var11, mh4Var12, mh4Var10, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        mh4Var5 = mh4Var2;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                mh4Var6 = mh4Var3;
                if (bj4VarO.j(mh4Var6)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i3 & 1171) == 1170) {
                c0187a = jt1.a.a;
                i8 = 1;
                if (i10 != 0) {
                    bj4VarO.K(980934010);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new et6(i8);
                        bj4VarO.C(objF4);
                    }
                    mh4Var7 = (mh4) objF4;
                    bj4VarO.U(false);
                } else {
                    mh4Var7 = mh4Var4;
                }
                i9 = 3;
                if (i4 != 0) {
                    bj4VarO.K(980935002);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new l66(i9);
                        bj4VarO.C(objF3);
                    }
                    mh4Var8 = (mh4) objF3;
                    bj4VarO.U(false);
                } else {
                    mh4Var8 = mh4Var5;
                }
                if (i6 != 0) {
                    bj4VarO.K(980936026);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new b08(i8);
                        bj4VarO.C(objF2);
                    }
                    mh4Var9 = (mh4) objF2;
                    bj4VarO.U(false);
                } else {
                    mh4Var9 = mh4Var6;
                }
                long jM712getBase0d7_KjU12 = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getBase().m712getBase0d7_KjU();
                bj4VarO.K(980946683);
                if ((i3 & 7168) != 2048) {
                }
                objF = bj4VarO.f();
                if (i8 == 0) {
                    objF = new oj(i9, mh4Var9);
                    bj4VarO.C(objF);
                } else {
                    objF = new oj(i9, mh4Var9);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                bj4Var = bj4VarO;
                ek.a((mh4) objF, gr1.b(1477542978, new AnonymousClass5(uploadError, mh4Var7, mh4Var9), bj4VarO), null, gr1.b(2126135748, new AnonymousClass6(mh4Var8, mh4Var9), bj4VarO), null, null, gr1.b(951541255, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadErrorDialogKt.UploadErrorDialog.7
                    public final void invoke(jt1 jt1Var2, int i11) {
                        if ((i11 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        String errorMessage = UploadErrorDialogKt.getErrorMessage(uploadError, jt1Var2, 0);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i12 = IntercomTheme.$stable;
                        mia.b(errorMessage, null, ah5.a(intercomTheme, jt1Var2, i12), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i12).getType04(), jt1Var2, 0, 0, 131066);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, jM712getBase0d7_KjU12, 0L, 0L, 0L, null, bj4Var, 1575984, 0, 16052);
                mh4Var10 = mh4Var9;
                mh4Var11 = mh4Var7;
                mh4Var12 = mh4Var8;
            } else {
                c0187a = jt1.a.a;
                i8 = 1;
                if (i10 != 0) {
                    bj4VarO.K(980934010);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new et6(i8);
                        bj4VarO.C(objF4);
                    }
                    mh4Var7 = (mh4) objF4;
                    bj4VarO.U(false);
                } else {
                    mh4Var7 = mh4Var4;
                }
                i9 = 3;
                if (i4 != 0) {
                    bj4VarO.K(980935002);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new l66(i9);
                        bj4VarO.C(objF3);
                    }
                    mh4Var8 = (mh4) objF3;
                    bj4VarO.U(false);
                } else {
                    mh4Var8 = mh4Var5;
                }
                if (i6 != 0) {
                    bj4VarO.K(980936026);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new b08(i8);
                        bj4VarO.C(objF2);
                    }
                    mh4Var9 = (mh4) objF2;
                    bj4VarO.U(false);
                } else {
                    mh4Var9 = mh4Var6;
                }
                long jM712getBase0d7_KjU13 = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getBase().m712getBase0d7_KjU();
                bj4VarO.K(980946683);
                if ((i3 & 7168) != 2048) {
                }
                objF = bj4VarO.f();
                if (i8 == 0) {
                    objF = new oj(i9, mh4Var9);
                    bj4VarO.C(objF);
                } else {
                    objF = new oj(i9, mh4Var9);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                bj4Var = bj4VarO;
                ek.a((mh4) objF, gr1.b(1477542978, new AnonymousClass5(uploadError, mh4Var7, mh4Var9), bj4VarO), null, gr1.b(2126135748, new AnonymousClass6(mh4Var8, mh4Var9), bj4VarO), null, null, gr1.b(951541255, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadErrorDialogKt.UploadErrorDialog.7
                    public final void invoke(jt1 jt1Var2, int i11) {
                        if ((i11 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        String errorMessage = UploadErrorDialogKt.getErrorMessage(uploadError, jt1Var2, 0);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i12 = IntercomTheme.$stable;
                        mia.b(errorMessage, null, ah5.a(intercomTheme, jt1Var2, i12), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i12).getType04(), jt1Var2, 0, 0, 131066);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, jM712getBase0d7_KjU13, 0L, 0L, 0L, null, bj4Var, 1575984, 0, 16052);
                mh4Var10 = mh4Var9;
                mh4Var11 = mh4Var7;
                mh4Var12 = mh4Var8;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: e4b
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return UploadErrorDialogKt.UploadErrorDialog$lambda$8(uploadError, mh4Var11, mh4Var12, mh4Var10, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        mh4Var6 = mh4Var3;
        if ((i3 & 1171) == 1170) {
            c0187a = jt1.a.a;
            i8 = 1;
            if (i10 != 0) {
                bj4VarO.K(980934010);
                objF4 = bj4VarO.f();
                if (objF4 == c0187a) {
                    objF4 = new et6(i8);
                    bj4VarO.C(objF4);
                }
                mh4Var7 = (mh4) objF4;
                bj4VarO.U(false);
            } else {
                mh4Var7 = mh4Var4;
            }
            i9 = 3;
            if (i4 != 0) {
                bj4VarO.K(980935002);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new l66(i9);
                    bj4VarO.C(objF3);
                }
                mh4Var8 = (mh4) objF3;
                bj4VarO.U(false);
            } else {
                mh4Var8 = mh4Var5;
            }
            if (i6 != 0) {
                bj4VarO.K(980936026);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new b08(i8);
                    bj4VarO.C(objF2);
                }
                mh4Var9 = (mh4) objF2;
                bj4VarO.U(false);
            } else {
                mh4Var9 = mh4Var6;
            }
            long jM712getBase0d7_KjU14 = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getBase().m712getBase0d7_KjU();
            bj4VarO.K(980946683);
            if ((i3 & 7168) != 2048) {
            }
            objF = bj4VarO.f();
            if (i8 == 0) {
                objF = new oj(i9, mh4Var9);
                bj4VarO.C(objF);
            } else {
                objF = new oj(i9, mh4Var9);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            bj4Var = bj4VarO;
            ek.a((mh4) objF, gr1.b(1477542978, new AnonymousClass5(uploadError, mh4Var7, mh4Var9), bj4VarO), null, gr1.b(2126135748, new AnonymousClass6(mh4Var8, mh4Var9), bj4VarO), null, null, gr1.b(951541255, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadErrorDialogKt.UploadErrorDialog.7
                public final void invoke(jt1 jt1Var2, int i11) {
                    if ((i11 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    String errorMessage = UploadErrorDialogKt.getErrorMessage(uploadError, jt1Var2, 0);
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i12 = IntercomTheme.$stable;
                    mia.b(errorMessage, null, ah5.a(intercomTheme, jt1Var2, i12), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i12).getType04(), jt1Var2, 0, 0, 131066);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), null, jM712getBase0d7_KjU14, 0L, 0L, 0L, null, bj4Var, 1575984, 0, 16052);
            mh4Var10 = mh4Var9;
            mh4Var11 = mh4Var7;
            mh4Var12 = mh4Var8;
        } else {
            c0187a = jt1.a.a;
            i8 = 1;
            if (i10 != 0) {
                bj4VarO.K(980934010);
                objF4 = bj4VarO.f();
                if (objF4 == c0187a) {
                    objF4 = new et6(i8);
                    bj4VarO.C(objF4);
                }
                mh4Var7 = (mh4) objF4;
                bj4VarO.U(false);
            } else {
                mh4Var7 = mh4Var4;
            }
            i9 = 3;
            if (i4 != 0) {
                bj4VarO.K(980935002);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new l66(i9);
                    bj4VarO.C(objF3);
                }
                mh4Var8 = (mh4) objF3;
                bj4VarO.U(false);
            } else {
                mh4Var8 = mh4Var5;
            }
            if (i6 != 0) {
                bj4VarO.K(980936026);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new b08(i8);
                    bj4VarO.C(objF2);
                }
                mh4Var9 = (mh4) objF2;
                bj4VarO.U(false);
            } else {
                mh4Var9 = mh4Var6;
            }
            long jM712getBase0d7_KjU15 = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getBase().m712getBase0d7_KjU();
            bj4VarO.K(980946683);
            if ((i3 & 7168) != 2048) {
            }
            objF = bj4VarO.f();
            if (i8 == 0) {
                objF = new oj(i9, mh4Var9);
                bj4VarO.C(objF);
            } else {
                objF = new oj(i9, mh4Var9);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            bj4Var = bj4VarO;
            ek.a((mh4) objF, gr1.b(1477542978, new AnonymousClass5(uploadError, mh4Var7, mh4Var9), bj4VarO), null, gr1.b(2126135748, new AnonymousClass6(mh4Var8, mh4Var9), bj4VarO), null, null, gr1.b(951541255, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadErrorDialogKt.UploadErrorDialog.7
                public final void invoke(jt1 jt1Var2, int i11) {
                    if ((i11 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    String errorMessage = UploadErrorDialogKt.getErrorMessage(uploadError, jt1Var2, 0);
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i12 = IntercomTheme.$stable;
                    mia.b(errorMessage, null, ah5.a(intercomTheme, jt1Var2, i12), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i12).getType04(), jt1Var2, 0, 0, 131066);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), null, jM712getBase0d7_KjU15, 0L, 0L, 0L, null, bj4Var, 1575984, 0, 16052);
            mh4Var10 = mh4Var9;
            mh4Var11 = mh4Var7;
            mh4Var12 = mh4Var8;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: e4b
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return UploadErrorDialogKt.UploadErrorDialog$lambda$8(uploadError, mh4Var11, mh4Var12, mh4Var10, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b UploadErrorDialog$lambda$7$lambda$6(mh4 mh4Var) {
        mh4Var.invoke();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b UploadErrorDialog$lambda$8(MediaUploadRepository.UploadError uploadError, mh4 mh4Var, mh4 mh4Var2, mh4 mh4Var3, int i, int i2, jt1 jt1Var, int i3) {
        UploadErrorDialog(uploadError, mh4Var, mh4Var2, mh4Var3, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void UploadErrorDialogNetworkErrorPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1574681437);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$UploadErrorDialogKt.INSTANCE.m144getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new dt6(i, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b UploadErrorDialogNetworkErrorPreview$lambda$10(int i, jt1 jt1Var, int i2) {
        UploadErrorDialogNetworkErrorPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void UploadErrorDialogSizeLimitPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1575850437);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$UploadErrorDialogKt.INSTANCE.m143getLambda3$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new it6(i, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b UploadErrorDialogSizeLimitPreview$lambda$9(int i, jt1 jt1Var, int i2) {
        UploadErrorDialogSizeLimitPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getErrorMessage(MediaUploadRepository.UploadError uploadError, jt1 jt1Var, int i) {
        String strF;
        jt1Var.K(444064229);
        if (uploadError instanceof MediaUploadRepository.UploadError.SizeLimitExceeded) {
            jt1Var.K(-2051085905);
            strF = Phrase.from((Context) jt1Var.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_file_too_big).put("limit", ((MediaUploadRepository.UploadError.SizeLimitExceeded) uploadError).getLimitMB()).format().toString();
            jt1Var.B();
        } else {
            jt1Var.K(-2050895844);
            strF = nr1.f(jt1Var, R.string.intercom_upload_file_load_error);
            jt1Var.B();
        }
        jt1Var.B();
        return strF;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.UploadErrorDialogKt$UploadErrorDialog$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass6 implements ci4<jt1, Integer, g2b> {
        final /* synthetic */ mh4<g2b> $onDelete;
        final /* synthetic */ mh4<g2b> $onDismiss;

        public AnonymousClass6(mh4<g2b> mh4Var, mh4<g2b> mh4Var2) {
            this.$onDelete = mh4Var;
            this.$onDismiss = mh4Var2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$1$lambda$0(mh4 mh4Var, mh4 mh4Var2) {
            mh4Var.invoke();
            mh4Var2.invoke();
            return g2b.a;
        }

        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            jt1Var.K(1143598793);
            boolean zJ = jt1Var.J(this.$onDelete) | jt1Var.J(this.$onDismiss);
            final mh4<g2b> mh4Var = this.$onDelete;
            final mh4<g2b> mh4Var2 = this.$onDismiss;
            Object objF = jt1Var.f();
            if (zJ || objF == jt1.a.a) {
                objF = new mh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.m
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return UploadErrorDialogKt.AnonymousClass6.invoke$lambda$1$lambda$0(mh4Var, mh4Var2);
                    }
                };
                jt1Var.C(objF);
            }
            jt1Var.B();
            jz0.c((mh4) objF, null, false, null, null, null, ComposableSingletons$UploadErrorDialogKt.INSTANCE.m142getLambda2$intercom_sdk_base_release(), jt1Var, 805306368, 510);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.UploadErrorDialogKt$UploadErrorDialog$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass5 implements ci4<jt1, Integer, g2b> {
        final /* synthetic */ MediaUploadRepository.UploadError $error;
        final /* synthetic */ mh4<g2b> $onDismiss;
        final /* synthetic */ mh4<g2b> $onRetry;

        public AnonymousClass5(MediaUploadRepository.UploadError uploadError, mh4<g2b> mh4Var, mh4<g2b> mh4Var2) {
            this.$error = uploadError;
            this.$onRetry = mh4Var;
            this.$onDismiss = mh4Var2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$1$lambda$0(mh4 mh4Var, mh4 mh4Var2) {
            mh4Var.invoke();
            mh4Var2.invoke();
            return g2b.a;
        }

        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            if (this.$error.getCanRetry()) {
                jt1Var.K(1143582868);
                boolean zJ = jt1Var.J(this.$onRetry) | jt1Var.J(this.$onDismiss);
                final mh4<g2b> mh4Var = this.$onRetry;
                final mh4<g2b> mh4Var2 = this.$onDismiss;
                Object objF = jt1Var.f();
                if (zJ || objF == jt1.a.a) {
                    objF = new mh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.l
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return UploadErrorDialogKt.AnonymousClass5.invoke$lambda$1$lambda$0(mh4Var, mh4Var2);
                        }
                    };
                    jt1Var.C(objF);
                }
                jt1Var.B();
                jz0.c((mh4) objF, null, false, null, null, null, ComposableSingletons$UploadErrorDialogKt.INSTANCE.m141getLambda1$intercom_sdk_base_release(), jt1Var, 805306368, 510);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
