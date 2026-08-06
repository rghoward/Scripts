package io.intercom.android.sdk.m5.home.ui.components;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.aj1;
import defpackage.b47;
import defpackage.bj1;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ny8;
import defpackage.ob4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.qs5;
import defpackage.rd7;
import defpackage.we1;
import defpackage.ws0;
import defpackage.xj8;
import defpackage.yi1;
import defpackage.z2a;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.Link;
import io.intercom.android.sdk.m5.home.ui.components.ExternalLinkCardKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.LinkOpener;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ExternalLinkCardKt {
    public static final void ExternalLinkCard(final HomeCards.HomeExternalLinkData homeExternalLinkData, jt1 jt1Var, final int i) {
        int i2;
        homeExternalLinkData.getClass();
        bj4 bj4VarO = jt1Var.o(-1463768637);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(homeExternalLinkData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomCardKt.IntercomCard(null, null, gr1.b(1810723127, new AnonymousClass1(homeExternalLinkData, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)), bj4VarO), bj4VarO, 384, 3);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: fs3
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ExternalLinkCardKt.ExternalLinkCard$lambda$0(homeExternalLinkData, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ExternalLinkCard$lambda$0(HomeCards.HomeExternalLinkData homeExternalLinkData, int i, jt1 jt1Var, int i2) {
        ExternalLinkCard(homeExternalLinkData, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void ExternalLinkCardPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-144974605);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ExternalLinkCardKt.INSTANCE.m338getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: gs3
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ExternalLinkCardKt.ExternalLinkCardPreview$lambda$1(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ExternalLinkCardPreview$lambda$1(int i, jt1 jt1Var, int i2) {
        ExternalLinkCardPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.components.ExternalLinkCardKt$ExternalLinkCard$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass1 implements ei4<bj1, jt1, Integer, g2b> {
        final /* synthetic */ Context $context;
        final /* synthetic */ HomeCards.HomeExternalLinkData $homeExternalLinkData;

        public AnonymousClass1(HomeCards.HomeExternalLinkData homeExternalLinkData, Context context) {
            this.$homeExternalLinkData = homeExternalLinkData;
            this.$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$4$lambda$3$lambda$1$lambda$0(Link link, Context context) {
            Injector.get().getMetricTracker().clickedExternalLinkCard();
            LinkOpener.handleUrl(link.getUrl(), context, Injector.get().getApi());
            return g2b.a;
        }

        public final void invoke(bj1 bj1Var, jt1 jt1Var, int i) {
            Context context;
            HomeCards.HomeExternalLinkData homeExternalLinkData;
            ox6.a aVar;
            jt1 jt1Var2 = jt1Var;
            bj1Var.getClass();
            if ((i & 17) == 16 && jt1Var2.r()) {
                jt1Var2.u();
                return;
            }
            HomeCards.HomeExternalLinkData homeExternalLinkData2 = this.$homeExternalLinkData;
            Context context2 = this.$context;
            aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var2, 0);
            int iHashCode = Long.hashCode(jt1Var2.v());
            kw7 kw7VarY = jt1Var2.y();
            ox6.a aVar2 = ox6.a.t;
            ox6 ox6VarC = it1.c(jt1Var2, aVar2);
            bt1.c.getClass();
            qr5.a aVar3 = bt1.a.b;
            if (jt1Var2.s() == null) {
                ml5.c();
                throw null;
            }
            jt1Var2.q();
            if (jt1Var2.l()) {
                jt1Var2.k(aVar3);
            } else {
                jt1Var2.z();
            }
            rd7.d(jt1Var2, bt1.a.f, aj1VarA);
            rd7.d(jt1Var2, bt1.a.e, kw7VarY);
            rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(jt1Var2, bt1.a.h);
            rd7.d(jt1Var2, bt1.a.d, ox6VarC);
            jt1Var2.K(-433115947);
            String cardTitle = homeExternalLinkData2.getCardTitle();
            if (cardTitle == null || z2a.w(cardTitle)) {
                context = context2;
                homeExternalLinkData = homeExternalLinkData2;
                aVar = aVar2;
            } else {
                homeExternalLinkData = homeExternalLinkData2;
                context = context2;
                aVar = aVar2;
                mia.b(homeExternalLinkData2.getCardTitle(), eo7.m(eo7.k(aVar2, 16.0f, 0.0f, 2), 0.0f, 12.0f, 0.0f, 4.0f, 5), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04SemiBold(), jt1Var, 48, 0, 131068);
                jt1Var2 = jt1Var;
            }
            jt1Var2.B();
            jt1Var2.K(-433100991);
            int i2 = 0;
            for (Object obj : homeExternalLinkData.getLinks()) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    ws0.m();
                    throw null;
                }
                final Link link = (Link) obj;
                ox6.a aVar4 = aVar;
                ox6 ox6VarC2 = ir9.c(aVar4, 1.0f);
                jt1Var2.K(-626904077);
                final Context context3 = context;
                boolean zJ = jt1Var2.J(link) | jt1Var2.j(context3);
                Object objF = jt1Var2.f();
                if (zJ || objF == jt1.a.a) {
                    objF = new mh4() { // from class: io.intercom.android.sdk.m5.home.ui.components.f
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ExternalLinkCardKt.AnonymousClass1.invoke$lambda$4$lambda$3$lambda$1$lambda$0(link, context3);
                        }
                    };
                    jt1Var2.C(objF);
                }
                jt1Var2.B();
                ox6 ox6VarJ = eo7.j(16.0f, 12.0f, we1.c(ox6VarC2, false, null, (mh4) objF, 15));
                ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                int iHashCode2 = Long.hashCode(jt1Var2.v());
                kw7 kw7VarY2 = jt1Var2.y();
                ox6 ox6VarC3 = it1.c(jt1Var2, ox6VarJ);
                bt1.c.getClass();
                qr5.a aVar5 = bt1.a.b;
                if (jt1Var2.s() == null) {
                    ml5.c();
                    throw null;
                }
                jt1Var2.q();
                if (jt1Var2.l()) {
                    jt1Var2.k(aVar5);
                } else {
                    jt1Var2.z();
                }
                rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                rd7.d(jt1Var2, bt1.a.e, kw7VarY2);
                rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                rd7.c(jt1Var2, bt1.a.h);
                rd7.d(jt1Var2, bt1.a.d, ox6VarC3);
                int i4 = i2;
                context = context3;
                mia.b(link.getLabel(), new qs5(true, 1.0f), 0L, 0L, ob4.y, 0L, null, 0L, 2, false, 1, 0, null, null, jt1Var, 1572864, 24960, 241596);
                jt1Var2 = jt1Var;
                b47.b(jt1Var2, ir9.n(aVar4, 16.0f));
                m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(aVar4, 16.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).m752getActionContrastWhite0d7_KjU(), jt1Var2, 440, 0);
                jt1Var2.I();
                jt1Var2.K(-433061728);
                if (i4 != homeExternalLinkData.getLinks().size() - 1) {
                    IntercomDividerKt.IntercomDivider(eo7.k(ir9.c(aVar4, 1.0f), 16.0f, 0.0f, 2), jt1Var2, 6, 0);
                }
                jt1Var2.B();
                aVar = aVar4;
                i2 = i3;
            }
            jt1Var2.B();
            jt1Var2.I();
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var, Integer num) {
            invoke(bj1Var, jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
