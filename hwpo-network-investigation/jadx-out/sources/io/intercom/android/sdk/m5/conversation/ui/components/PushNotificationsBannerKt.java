package io.intercom.android.sdk.m5.conversation.ui.components;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.ba3;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.dv;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.es7;
import defpackage.fda;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h37;
import defpackage.h65;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.jt1;
import defpackage.jv;
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
import defpackage.qs5;
import defpackage.rd7;
import defpackage.v5a;
import defpackage.wd3;
import defpackage.ww9;
import defpackage.xj8;
import defpackage.xv;
import defpackage.zg3;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import io.intercom.android.sdk.m5.conversation.ui.components.PushNotificationsBannerKt;
import io.intercom.android.sdk.survey.block.BlockExtensionsKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class PushNotificationsBannerKt {
    @IntercomPreviews
    public static final void ContextualPushNotificationsReminderPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-119534126);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PushNotificationsBannerKt.INSTANCE.m138getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: bg8
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PushNotificationsBannerKt.ContextualPushNotificationsReminderPreview$lambda$5(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ContextualPushNotificationsReminderPreview$lambda$5(int i, jt1 jt1Var, int i2) {
        ContextualPushNotificationsReminderPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void PushNotificationsBanner(final mh4<g2b> mh4Var, final mh4<g2b> mh4Var2, jt1 jt1Var, final int i) {
        int i2;
        mh4Var.getClass();
        mh4Var2.getClass();
        bj4 bj4VarO = jt1Var.o(-2004591797);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(mh4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(mh4Var2) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            bj4VarO.K(-633266491);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = bl7.i(Boolean.FALSE);
                bj4VarO.C(objF);
            }
            h37 h37Var = (h37) objF;
            bj4VarO.U(false);
            g2b g2bVar = g2b.a;
            bj4VarO.K(-633262429);
            Object objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                objF2 = new PushNotificationsBannerKt$PushNotificationsBanner$1$1(h37Var, null);
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            wd3.d(bj4VarO, (ci4) objF2, g2bVar);
            dv.d(PushNotificationsBanner$lambda$1(h37Var), null, zg3.c(xv.c(CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS, 0, ba3.a, 2), 2), null, null, gr1.b(1923339635, new ei4<jv, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.PushNotificationsBannerKt.PushNotificationsBanner.2
                public final void invoke(jv jvVar, jt1 jt1Var2, int i3) {
                    jvVar.getClass();
                    mh4<g2b> mh4Var3 = mh4Var;
                    long jM794getNeutral0d7_KjU = IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).getContainer().m794getNeutral0d7_KjU();
                    final mh4<g2b> mh4Var4 = mh4Var2;
                    v5a.c(mh4Var3, null, false, null, jM794getNeutral0d7_KjU, 0L, 0.0f, 0.0f, null, null, gr1.b(-1181560824, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.PushNotificationsBannerKt.PushNotificationsBanner.2.1
                        public final void invoke(jt1 jt1Var3, int i4) {
                            if ((i4 & 3) == 2 && jt1Var3.r()) {
                                jt1Var3.u();
                                return;
                            }
                            ox6.a aVar = ox6.a.t;
                            ox6 ox6VarM = eo7.m(ir9.c(aVar, 1.0f), 16.0f, 0.0f, 0.0f, 0.0f, 14);
                            mh4<g2b> mh4Var5 = mh4Var4;
                            ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var3, 48);
                            int iHashCode = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY = jt1Var3.y();
                            ox6 ox6VarC = it1.c(jt1Var3, ox6VarM);
                            bt1.c.getClass();
                            qr5.a aVar2 = bt1.a.b;
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar2);
                            } else {
                                jt1Var3.z();
                            }
                            rd7.d(jt1Var3, bt1.a.f, ny8VarA);
                            rd7.d(jt1Var3, bt1.a.e, kw7VarY);
                            rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode));
                            rd7.c(jt1Var3, bt1.a.h);
                            rd7.d(jt1Var3, bt1.a.d, ox6VarC);
                            es7 es7VarA = is7.a(R.drawable.intercom_ticket_notification, jt1Var3, 0);
                            ox6 ox6VarJ = ir9.j(aVar, 16.0f);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i5 = IntercomTheme.$stable;
                            m65.b(es7VarA, null, ox6VarJ, intercomTheme.getColors(jt1Var3, i5).getIcon().m809getMuted0d7_KjU(), jt1Var3, 440, 0);
                            Spanned spannedFromHtml = Html.fromHtml(nr1.f(jt1Var3, R.string.intercom_notification_enable_prompt), 0);
                            spannedFromHtml.getClass();
                            mia.c(BlockExtensionsKt.toAnnotatedString(spannedFromHtml, (Context) jt1Var3.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null), eo7.i(new qs5(true, 1.0f), 8.0f), intercomTheme.getColors(jt1Var3, i5).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme.getTypography(jt1Var3, i5).getType04Point5(), jt1Var3, 0, 0, 262136);
                            h65.b(1572864, 62, jt1Var3, mh4Var5, ComposableSingletons$PushNotificationsBannerKt.INSTANCE.m137getLambda1$intercom_sdk_base_release(), null, null, null, false);
                            jt1Var3.I();
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var3, Integer num) {
                            invoke(jt1Var3, num.intValue());
                            return g2b.a;
                        }
                    }, jt1Var2), jt1Var2, 0, 1006);
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(jv jvVar, jt1 jt1Var2, Integer num) {
                    invoke(jvVar, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 196608, 26);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ag8
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PushNotificationsBannerKt.PushNotificationsBanner$lambda$4(mh4Var, mh4Var2, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    private static final boolean PushNotificationsBanner$lambda$1(h37<Boolean> h37Var) {
        return h37Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PushNotificationsBanner$lambda$2(h37<Boolean> h37Var, boolean z) {
        h37Var.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PushNotificationsBanner$lambda$4(mh4 mh4Var, mh4 mh4Var2, int i, jt1 jt1Var, int i2) {
        PushNotificationsBanner(mh4Var, mh4Var2, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
