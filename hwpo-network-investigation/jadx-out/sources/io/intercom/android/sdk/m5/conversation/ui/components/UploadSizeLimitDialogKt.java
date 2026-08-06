package io.intercom.android.sdk.m5.conversation.ui.components;

import defpackage.ah5;
import defpackage.bj4;
import defpackage.ci4;
import defpackage.ek;
import defpackage.f03;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.jt1;
import defpackage.jy3;
import defpackage.jz0;
import defpackage.kk;
import defpackage.mh4;
import defpackage.mia;
import defpackage.nt6;
import defpackage.pt5;
import defpackage.wja;
import defpackage.xj8;
import io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class UploadSizeLimitDialogKt {
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Code duplicated, block: B:50:0x00af  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:58:0x010b  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public static final void UploadSizeLimitDialog(final String str, final String str2, mh4<g2b> mh4Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        mh4<g2b> mh4Var2;
        jt1.a.C0187a c0187a;
        int i4;
        mh4<g2b> mh4Var3;
        Object objF;
        bj4 bj4Var;
        final mh4<g2b> mh4Var4;
        Object objF2;
        xj8 xj8VarW;
        str.getClass();
        str2.getClass();
        bj4 bj4VarO = jt1Var.o(-2057533015);
        int i5 = 2;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.J(str2) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                mh4Var2 = mh4Var;
                i3 |= bj4VarO.j(mh4Var2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !bj4VarO.r()) {
                c0187a = jt1.a.a;
                i4 = 1;
                if (i6 != 0) {
                    bj4VarO.K(-537331028);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new nt6(i4);
                        bj4VarO.C(objF2);
                    }
                    mh4Var3 = (mh4) objF2;
                    bj4VarO.U(false);
                } else {
                    mh4Var3 = mh4Var2;
                }
                long jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                f03 f03Var = new f03(5);
                bj4VarO.K(-537314227);
                i4 = (i3 & 896) != 256 ? 0 : 1;
                objF = bj4VarO.f();
                if (i4 == 0 || objF == c0187a) {
                    objF = new pt5(i5, mh4Var3);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                bj4Var = bj4VarO;
                ek.a((mh4) objF, gr1.b(582096881, new AnonymousClass3(mh4Var3), bj4VarO), null, null, null, gr1.b(-905132043, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt.UploadSizeLimitDialog.4
                    public final void invoke(jt1 jt1Var2, int i7) {
                        if ((i7 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i8 = IntercomTheme.$stable;
                        wja type03 = intercomTheme.getTypography(jt1Var2, i8).getType03();
                        mia.b(str, null, ah5.a(intercomTheme, jt1Var2, i8), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type03, jt1Var2, 0, 0, 131066);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), gr1.b(-203197450, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt.UploadSizeLimitDialog.5
                    public final void invoke(jt1 jt1Var2, int i7) {
                        if ((i7 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i8 = IntercomTheme.$stable;
                        wja type04 = intercomTheme.getTypography(jt1Var2, i8).getType04();
                        mia.b(str2, null, ah5.a(intercomTheme, jt1Var2, i8), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04, jt1Var2, 0, 0, 131066);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, jA, 0L, 0L, 0L, f03Var, bj4Var, 1769520, 3072, 7836);
                mh4Var4 = mh4Var3;
            } else {
                bj4VarO.u();
                bj4Var = bj4VarO;
                mh4Var4 = mh4Var2;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: i4b
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return UploadSizeLimitDialogKt.UploadSizeLimitDialog$lambda$4(str, str2, mh4Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        mh4Var2 = mh4Var;
        if ((i3 & 147) == 146) {
            c0187a = jt1.a.a;
            i4 = 1;
            if (i6 != 0) {
                bj4VarO.K(-537331028);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new nt6(i4);
                    bj4VarO.C(objF2);
                }
                mh4Var3 = (mh4) objF2;
                bj4VarO.U(false);
            } else {
                mh4Var3 = mh4Var2;
            }
            long jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
            f03 f03Var2 = new f03(5);
            bj4VarO.K(-537314227);
            if ((i3 & 896) != 256) {
            }
            objF = bj4VarO.f();
            if (i4 == 0) {
                objF = new pt5(i5, mh4Var3);
                bj4VarO.C(objF);
            } else {
                objF = new pt5(i5, mh4Var3);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            bj4Var = bj4VarO;
            ek.a((mh4) objF, gr1.b(582096881, new AnonymousClass3(mh4Var3), bj4VarO), null, null, null, gr1.b(-905132043, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt.UploadSizeLimitDialog.4
                public final void invoke(jt1 jt1Var2, int i7) {
                    if ((i7 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i8 = IntercomTheme.$stable;
                    wja type03 = intercomTheme.getTypography(jt1Var2, i8).getType03();
                    mia.b(str, null, ah5.a(intercomTheme, jt1Var2, i8), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type03, jt1Var2, 0, 0, 131066);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), gr1.b(-203197450, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt.UploadSizeLimitDialog.5
                public final void invoke(jt1 jt1Var2, int i7) {
                    if ((i7 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i8 = IntercomTheme.$stable;
                    wja type04 = intercomTheme.getTypography(jt1Var2, i8).getType04();
                    mia.b(str2, null, ah5.a(intercomTheme, jt1Var2, i8), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04, jt1Var2, 0, 0, 131066);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), null, jA2, 0L, 0L, 0L, f03Var2, bj4Var, 1769520, 3072, 7836);
            mh4Var4 = mh4Var3;
        } else {
            c0187a = jt1.a.a;
            i4 = 1;
            if (i6 != 0) {
                bj4VarO.K(-537331028);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new nt6(i4);
                    bj4VarO.C(objF2);
                }
                mh4Var3 = (mh4) objF2;
                bj4VarO.U(false);
            } else {
                mh4Var3 = mh4Var2;
            }
            long jA3 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
            f03 f03Var3 = new f03(5);
            bj4VarO.K(-537314227);
            if ((i3 & 896) != 256) {
            }
            objF = bj4VarO.f();
            if (i4 == 0) {
                objF = new pt5(i5, mh4Var3);
                bj4VarO.C(objF);
            } else {
                objF = new pt5(i5, mh4Var3);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            bj4Var = bj4VarO;
            ek.a((mh4) objF, gr1.b(582096881, new AnonymousClass3(mh4Var3), bj4VarO), null, null, null, gr1.b(-905132043, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt.UploadSizeLimitDialog.4
                public final void invoke(jt1 jt1Var2, int i7) {
                    if ((i7 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i8 = IntercomTheme.$stable;
                    wja type03 = intercomTheme.getTypography(jt1Var2, i8).getType03();
                    mia.b(str, null, ah5.a(intercomTheme, jt1Var2, i8), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type03, jt1Var2, 0, 0, 131066);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), gr1.b(-203197450, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt.UploadSizeLimitDialog.5
                public final void invoke(jt1 jt1Var2, int i7) {
                    if ((i7 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i8 = IntercomTheme.$stable;
                    wja type04 = intercomTheme.getTypography(jt1Var2, i8).getType04();
                    mia.b(str2, null, ah5.a(intercomTheme, jt1Var2, i8), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04, jt1Var2, 0, 0, 131066);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), null, jA3, 0L, 0L, 0L, f03Var3, bj4Var, 1769520, 3072, 7836);
            mh4Var4 = mh4Var3;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: i4b
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return UploadSizeLimitDialogKt.UploadSizeLimitDialog$lambda$4(str, str2, mh4Var4, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b UploadSizeLimitDialog$lambda$3$lambda$2(mh4 mh4Var) {
        mh4Var.invoke();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b UploadSizeLimitDialog$lambda$4(String str, String str2, mh4 mh4Var, int i, int i2, jt1 jt1Var, int i3) {
        UploadSizeLimitDialog(str, str2, mh4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void UploadSizeLimitDialogPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-532105575);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$UploadSizeLimitDialogKt.INSTANCE.m146getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new jy3(i, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b UploadSizeLimitDialogPreview$lambda$5(int i, jt1 jt1Var, int i2) {
        UploadSizeLimitDialogPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt$UploadSizeLimitDialog$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass3 implements ci4<jt1, Integer, g2b> {
        final /* synthetic */ mh4<g2b> $onDismiss;

        public AnonymousClass3(mh4<g2b> mh4Var) {
            this.$onDismiss = mh4Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$1$lambda$0(mh4 mh4Var) {
            mh4Var.invoke();
            return g2b.a;
        }

        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            jt1Var.K(-891282052);
            boolean zJ = jt1Var.J(this.$onDismiss);
            final mh4<g2b> mh4Var = this.$onDismiss;
            Object objF = jt1Var.f();
            if (zJ || objF == jt1.a.a) {
                objF = new mh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.n
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return UploadSizeLimitDialogKt.AnonymousClass3.invoke$lambda$1$lambda$0(mh4Var);
                    }
                };
                jt1Var.C(objF);
            }
            jt1Var.B();
            jz0.c((mh4) objF, null, false, null, null, null, ComposableSingletons$UploadSizeLimitDialogKt.INSTANCE.m145getLambda1$intercom_sdk_base_release(), jt1Var, 805306368, 510);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
