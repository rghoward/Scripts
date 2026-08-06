package io.intercom.android.sdk.m5.conversation.ui.components;

import defpackage.aj1;
import defpackage.ay8;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.gh5;
import defpackage.gi0;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.ny8;
import defpackage.ob4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.rw;
import defpackage.sw;
import defpackage.uw;
import defpackage.we1;
import defpackage.wja;
import defpackage.wn;
import defpackage.xj8;
import defpackage.yi1;
import defpackage.zg5;
import defpackage.zx8;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.ui.components.AnswerInfoDialogKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.models.AiAnswerInfo;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AnswerInfoDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void AnswerInfoButton(final String str, final mh4<g2b> mh4Var, ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        String str2;
        int i3;
        final ox6 ox6Var2;
        bj4 bj4VarO = jt1Var.o(8337655);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 6) == 0) {
                i3 = i | (bj4VarO.J(str2) ? 4 : 2);
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(mh4Var) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
            ox6Var2 = ox6Var;
        } else {
            int i4 = i2 & 4;
            ox6.a aVar = ox6.a.t;
            ox6 ox6Var3 = i4 != 0 ? aVar : ox6Var;
            bj4VarO.K(934769154);
            boolean z = (i3 & 112) == 32;
            Object objF = bj4VarO.f();
            if (z || objF == jt1.a.a) {
                objF = new mh4() { // from class: ww
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return AnswerInfoDialogKt.AnswerInfoButton$lambda$6$lambda$5(mh4Var);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ox6 ox6VarJ = eo7.j(24.0f, 16.0f, ir9.c(we1.c(aVar, false, null, (mh4) objF, 15), 1.0f));
            ny8 ny8VarA = ly8.a(c30.d, di.a.k, bj4VarO, 54);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarJ);
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
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i5 = IntercomTheme.$stable;
            mia.b(str2, null, gh5.a(intercomTheme, bj4VarO, i5), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(intercomTheme.getTypography(bj4VarO, i5).getType04(), 0L, 0L, ob4.A, null, 0L, 0L, null, null, 16777211), bj4VarO, i3 & 14, 0, 131066);
            bj4VarO.U(true);
            ox6Var2 = ox6Var3;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: xw
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AnswerInfoDialogKt.AnswerInfoButton$lambda$8(str, mh4Var, ox6Var2, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b AnswerInfoButton$lambda$6$lambda$5(mh4 mh4Var) {
        mh4Var.invoke();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b AnswerInfoButton$lambda$8(String str, mh4 mh4Var, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        AnswerInfoButton(str, mh4Var, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    public static final void AnswerInfoDialog(final AiAnswerInfo aiAnswerInfo, final boolean z, mh4<g2b> mh4Var, mh4<g2b> mh4Var2, jt1 jt1Var, final int i, final int i2) {
        int i3;
        final mh4<g2b> mh4Var3;
        aiAnswerInfo.getClass();
        bj4 bj4VarO = jt1Var.o(-1331432837);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(aiAnswerInfo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.c(z) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.j(mh4Var) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= bj4VarO.j(mh4Var2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i3 & 1171) == 1170 && bj4VarO.r()) {
            bj4VarO.u();
            mh4Var3 = mh4Var;
        } else {
            jt1.a.C0187a c0187a = jt1.a.a;
            if (i4 != 0) {
                bj4VarO.K(1808890605);
                Object objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = new rw();
                    bj4VarO.C(objF);
                }
                mh4Var = (mh4) objF;
                bj4VarO.U(false);
            }
            mh4<g2b> mh4Var4 = mh4Var;
            if (i5 != 0) {
                bj4VarO.K(1808891853);
                Object objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new sw();
                    bj4VarO.C(objF2);
                }
                mh4Var2 = (mh4) objF2;
                bj4VarO.U(false);
            }
            wn.a(mh4Var4, null, gr1.b(-1632439278, new AnonymousClass3(aiAnswerInfo, z, mh4Var4, mh4Var2), bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 384, 2);
            mh4Var3 = mh4Var4;
        }
        final mh4<g2b> mh4Var5 = mh4Var2;
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: tw
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AnswerInfoDialogKt.AnswerInfoDialog$lambda$4(aiAnswerInfo, z, mh4Var3, mh4Var5, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b AnswerInfoDialog$lambda$4(AiAnswerInfo aiAnswerInfo, boolean z, mh4 mh4Var, mh4 mh4Var2, int i, int i2, jt1 jt1Var, int i3) {
        AnswerInfoDialog(aiAnswerInfo, z, mh4Var, mh4Var2, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void AnswerInfoDialogPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1630534767);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AnswerInfoDialogKt.INSTANCE.m116getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: vw
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AnswerInfoDialogKt.AnswerInfoDialogPreview$lambda$9(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b AnswerInfoDialogPreview$lambda$9(int i, jt1 jt1Var, int i2) {
        AnswerInfoDialogPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void AnswerInfoDialogWithoutReportButtonPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-916076999);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AnswerInfoDialogKt.INSTANCE.m117getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new uw(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b AnswerInfoDialogWithoutReportButtonPreview$lambda$10(int i, jt1 jt1Var, int i2) {
        AnswerInfoDialogWithoutReportButtonPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.AnswerInfoDialogKt$AnswerInfoDialog$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass3 implements ci4<jt1, Integer, g2b> {
        final /* synthetic */ AiAnswerInfo $info;
        final /* synthetic */ mh4<g2b> $onDismiss;
        final /* synthetic */ mh4<g2b> $onReportAiAnswer;
        final /* synthetic */ boolean $showReportAiAnswerButton;

        public AnonymousClass3(AiAnswerInfo aiAnswerInfo, boolean z, mh4<g2b> mh4Var, mh4<g2b> mh4Var2) {
            this.$info = aiAnswerInfo;
            this.$showReportAiAnswerButton = z;
            this.$onDismiss = mh4Var;
            this.$onReportAiAnswer = mh4Var2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$2$lambda$1$lambda$0(mh4 mh4Var, mh4 mh4Var2) {
            mh4Var.invoke();
            mh4Var2.invoke();
            return g2b.a;
        }

        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i2 = IntercomTheme.$stable;
            long jA = zg5.a(intercomTheme, jt1Var, i2);
            zx8 zx8VarB = ay8.b(10.0f);
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarC = gi0.c(aVar, jA, zx8VarB);
            AiAnswerInfo aiAnswerInfo = this.$info;
            boolean z = this.$showReportAiAnswerButton;
            final mh4<g2b> mh4Var = this.$onDismiss;
            final mh4<g2b> mh4Var2 = this.$onReportAiAnswer;
            aj1 aj1VarA = yi1.a(c30.c, di.a.n, jt1Var, 48);
            int iHashCode = Long.hashCode(jt1Var.v());
            kw7 kw7VarY = jt1Var.y();
            ox6 ox6VarC2 = it1.c(jt1Var, ox6VarC);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            if (jt1Var.s() == null) {
                ml5.c();
                throw null;
            }
            jt1Var.q();
            if (jt1Var.l()) {
                jt1Var.k(aVar2);
            } else {
                jt1Var.z();
            }
            rd7.d(jt1Var, bt1.a.f, aj1VarA);
            rd7.d(jt1Var, bt1.a.e, kw7VarY);
            rd7.d(jt1Var, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(jt1Var, bt1.a.h);
            rd7.d(jt1Var, bt1.a.d, ox6VarC2);
            mia.b(aiAnswerInfo.getText(), eo7.j(24.0f, 16.0f, aVar), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var, i2).getType04(), jt1Var, 48, 0, 131068);
            jt1Var.K(1930845605);
            if (z) {
                IntercomDividerKt.IntercomDivider(null, jt1Var, 0, 1);
                String strF = nr1.f(jt1Var, R.string.intercom_report_ai_answer);
                jt1Var.K(1930852539);
                boolean zJ = jt1Var.J(mh4Var) | jt1Var.J(mh4Var2);
                Object objF = jt1Var.f();
                if (zJ || objF == jt1.a.a) {
                    objF = new mh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.a
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return AnswerInfoDialogKt.AnonymousClass3.invoke$lambda$2$lambda$1$lambda$0(mh4Var, mh4Var2);
                        }
                    };
                    jt1Var.C(objF);
                }
                jt1Var.B();
                AnswerInfoDialogKt.AnswerInfoButton(strF, (mh4) objF, null, jt1Var, 0, 4);
            }
            jt1Var.B();
            jt1Var.I();
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
