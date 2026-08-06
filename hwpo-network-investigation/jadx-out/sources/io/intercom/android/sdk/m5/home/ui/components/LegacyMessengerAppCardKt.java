package io.intercom.android.sdk.m5.home.ui.components;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import com.intercom.twig.BuildConfig;
import com.intercom.twig.Twig;
import defpackage.bj1;
import defpackage.bj4;
import defpackage.ci4;
import defpackage.ei4;
import defpackage.ft;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.jt1;
import defpackage.oh4;
import defpackage.xj8;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.messengercard.CardWebView;
import io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewClient;
import io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewPresenter;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.home.ui.components.LegacyMessengerAppCardKt;
import io.intercom.android.sdk.m5.home.ui.helpers.InMemoryWebViewCacheKt;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.utilities.ThemeUtils;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LegacyMessengerAppCardKt {
    private static final Twig twig;

    static {
        Twig logger = LumberMill.getLogger();
        logger.getClass();
        twig = logger;
    }

    public static final void LegacyMessengerAppCard(final String str, IntercomCardStyle.Style style, final boolean z, jt1 jt1Var, final int i) {
        int i2;
        final IntercomCardStyle.Style style2;
        str.getClass();
        style.getClass();
        bj4 bj4VarO = jt1Var.o(-1087658045);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bj4VarO.J(style) : bj4VarO.j(style) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.c(z) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && bj4VarO.r()) {
            bj4VarO.u();
            style2 = style;
        } else {
            style2 = style;
            IntercomCardKt.IntercomCard(null, style2, gr1.b(231006519, new AnonymousClass1(ThemeUtils.appendInterfaceStyleToUrl((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), str), z), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | 384 | (i2 & 112), 1);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: m56
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return LegacyMessengerAppCardKt.LegacyMessengerAppCard$lambda$0(str, style2, z, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b LegacyMessengerAppCard$lambda$0(String str, IntercomCardStyle.Style style, boolean z, int i, jt1 jt1Var, int i2) {
        LegacyMessengerAppCard(str, style, z, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardWebView getWebView(String str, Context context, boolean z) {
        CardWebView cardWebView;
        CardWebView cachedWebView = InMemoryWebViewCacheKt.getCachedWebView(str);
        if (cachedWebView != null) {
            return cachedWebView;
        }
        try {
            cardWebView = new CardWebView(context);
        } catch (Resources.NotFoundException e) {
            twig.w("CardWebView init failed with activity context, retrying with application context: " + e.getMessage(), new Object[0]);
            try {
                cardWebView = new CardWebView(Injector.get().getApplication());
            } catch (Resources.NotFoundException e2) {
                twig.w("CardWebView init failed with application context fallback: " + e2.getMessage(), new Object[0]);
                return null;
            }
        }
        cardWebView.setLayoutParams(new ViewGroup.LayoutParams(-1, 160));
        cardWebView.getSettings().setJavaScriptEnabled(true);
        cardWebView.getSettings().setUseWideViewPort(true);
        cardWebView.getSettings().setCacheMode(-1);
        cardWebView.getSettings().setMixedContentMode(0);
        cardWebView.setVerticalScrollBarEnabled(false);
        cardWebView.setHorizontalScrollBarEnabled(false);
        cardWebView.setWebViewClient(new MessengerCardWebViewClient(str));
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableSingletons$LegacyMessengerAppCardKt.INSTANCE.m340getLambda2$intercom_sdk_base_release());
        CardWebView cardWebView2 = cardWebView;
        new MessengerCardWebViewPresenter(cardWebView2, composeView, str, Injector.get().getAppConfigProvider().get().getPrimaryColor(), Injector.get().getGson(), Injector.get().getMetricTracker(), cardWebView.getContext().getCacheDir(), BuildConfig.FLAVOR, z, context).setUpWebView();
        cardWebView2.loadUrl(str);
        InMemoryWebViewCacheKt.cacheWebView(str, cardWebView2);
        return cardWebView2;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.components.LegacyMessengerAppCardKt$LegacyMessengerAppCard$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass1 implements ei4<bj1, jt1, Integer, g2b> {
        final /* synthetic */ boolean $isHomeScreen;
        final /* synthetic */ String $urlWithTheme;

        public AnonymousClass1(String str, boolean z) {
            this.$urlWithTheme = str;
            this.$isHomeScreen = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FrameLayout invoke$lambda$2$lambda$1(String str, boolean z, Context context) {
            context.getClass();
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            CardWebView webView = LegacyMessengerAppCardKt.getWebView(str, context, z);
            if (webView != null) {
                ViewParent parent = webView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                frameLayout.addView(webView);
            }
            return frameLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$4$lambda$3(String str, boolean z, FrameLayout frameLayout) {
            frameLayout.getClass();
            if (frameLayout.getChildCount() == 0) {
                Context context = frameLayout.getContext();
                context.getClass();
                CardWebView webView = LegacyMessengerAppCardKt.getWebView(str, context, z);
                if (webView != null) {
                    ViewParent parent = webView.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    frameLayout.addView(webView);
                }
            }
            return g2b.a;
        }

        public final void invoke(bj1 bj1Var, jt1 jt1Var, int i) {
            bj1Var.getClass();
            if ((i & 17) == 16 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            jt1Var.p(1530861526, this.$urlWithTheme);
            jt1Var.K(1530862965);
            boolean zJ = jt1Var.J(this.$urlWithTheme) | jt1Var.c(this.$isHomeScreen);
            final String str = this.$urlWithTheme;
            final boolean z = this.$isHomeScreen;
            Object objF = jt1Var.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (zJ || objF == c0187a) {
                objF = new oh4() { // from class: io.intercom.android.sdk.m5.home.ui.components.g
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return LegacyMessengerAppCardKt.AnonymousClass1.invoke$lambda$2$lambda$1(str, z, (Context) obj);
                    }
                };
                jt1Var.C(objF);
            }
            oh4 oh4Var = (oh4) objF;
            jt1Var.B();
            jt1Var.K(1530890951);
            boolean zJ2 = jt1Var.J(this.$urlWithTheme) | jt1Var.c(this.$isHomeScreen);
            final String str2 = this.$urlWithTheme;
            final boolean z2 = this.$isHomeScreen;
            Object objF2 = jt1Var.f();
            if (zJ2 || objF2 == c0187a) {
                objF2 = new oh4() { // from class: io.intercom.android.sdk.m5.home.ui.components.h
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return LegacyMessengerAppCardKt.AnonymousClass1.invoke$lambda$4$lambda$3(str2, z2, (FrameLayout) obj);
                    }
                };
                jt1Var.C(objF2);
            }
            jt1Var.B();
            ft.b(oh4Var, null, (oh4) objF2, jt1Var, 0, 2);
            jt1Var.G();
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var, Integer num) {
            invoke(bj1Var, jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
