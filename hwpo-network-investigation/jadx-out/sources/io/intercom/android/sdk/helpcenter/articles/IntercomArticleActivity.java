package io.intercom.android.sdk.helpcenter.articles;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.intercom.twig.BuildConfig;
import defpackage.ah5;
import defpackage.aj1;
import defpackage.al8;
import defpackage.anb;
import defpackage.bl7;
import defpackage.bnb;
import defpackage.bt1;
import defpackage.bt7;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.dnb;
import defpackage.dr;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.fnb;
import defpackage.fr1;
import defpackage.ft;
import defpackage.g27;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.go7;
import defpackage.gr1;
import defpackage.hnb;
import defpackage.ia3;
import defpackage.iq1;
import defpackage.ir9;
import defpackage.it1;
import defpackage.js7;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.mh4;
import defpackage.ml1;
import defpackage.ml5;
import defpackage.o7a;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.pi1;
import defpackage.q39;
import defpackage.q69;
import defpackage.qi6;
import defpackage.qq2;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.ru3;
import defpackage.ss5;
import defpackage.u;
import defpackage.uo2;
import defpackage.wd3;
import defpackage.x10;
import defpackage.xj5;
import defpackage.xr1;
import defpackage.yg5;
import defpackage.yi1;
import defpackage.yv9;
import defpackage.z;
import defpackage.zg5;
import defpackage.zmb;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.articles.ArticleWebViewClient;
import io.intercom.android.sdk.helpcenter.IntercomHelpCenterBaseActivity;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.IntercomErrorScreenKt;
import io.intercom.android.sdk.m5.components.LoadingScreenKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.component.IntercomTopBarIcon;
import io.intercom.android.sdk.ui.component.IntercomTopBarKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomArticleActivity extends IntercomHelpCenterBaseActivity {
    private static final String ARTICLE_ID = "ARTICLE_ID";
    private static final String IS_SEARCH_BROWSE = "IS_FROM_SEARCH_BROWSE";
    private static final String METRIC_PLACE = "METRIC_PLACE";
    private static final String SHOULD_HIDE_REACTIONS = "SHOULD_HIDE_REACTIONS";
    private final ss5 arguments$delegate = new o7a(new dr(2, this));
    private final g27 scrollBy = new bt7(0);
    private final ss5 viewModel$delegate = new o7a(new ml1(2, this));
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleActivityArguments arguments_delegate$lambda$0(IntercomArticleActivity intercomArticleActivity) {
        Companion companion = Companion;
        Intent intent = intercomArticleActivity.getIntent();
        intent.getClass();
        return companion.getArguments(intent);
    }

    public static final Intent buildIntent(Context context, ArticleActivityArguments articleActivityArguments) {
        return Companion.buildIntent(context, articleActivityArguments);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArticleActivityArguments getArguments() {
        return (ArticleActivityArguments) this.arguments$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArticleViewModel getViewModel() {
        return (ArticleViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCookies() {
        Injector injector = Injector.get();
        String str = "intercom-session-" + injector.getAppIdentity().appId();
        String encryptedUserId = injector.getUserIdentity().getEncryptedUserId();
        encryptedUserId.getClass();
        CookieManager.getInstance().setCookie(injector.getAppConfigProvider().get().getHelpCenterUrl(), str + '=' + encryptedUserId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleViewModel viewModel_delegate$lambda$2(IntercomArticleActivity intercomArticleActivity) {
        int i = 0;
        boolean z = (intercomArticleActivity.getResources().getConfiguration().uiMode & 48) == 32;
        ArticleViewModel.Companion companion = ArticleViewModel.Companion;
        HelpCenterApi helpCenterApi = Injector.get().getHelpCenterApi();
        helpCenterApi.getClass();
        return companion.create(intercomArticleActivity, helpCenterApi, ((AppConfig) z.a()).getHelpCenterUrl(), intercomArticleActivity.getArguments().getMetricPlace(), intercomArticleActivity.getArguments().isFromSearchBrowse(), intercomArticleActivity.getArguments().getShouldHideReactions(), new yg5(i, intercomArticleActivity), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b viewModel_delegate$lambda$2$lambda$1(IntercomArticleActivity intercomArticleActivity, int i) {
        intercomArticleActivity.scrollBy.j(i);
        return g2b.a;
    }

    @Override // io.intercom.android.sdk.helpcenter.IntercomHelpCenterBaseActivity, androidx.fragment.app.g, defpackage.dq1, defpackage.hq1, android.app.Activity
    public void onCreate(Bundle bundle) {
        ia3.b(this);
        super.onCreate(bundle);
        iq1.a(this, new fr1(true, 1674700077, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity.onCreate.1
            public final void invoke(jt1 jt1Var, int i) {
                if ((i & 3) == 2 && jt1Var.r()) {
                    jt1Var.u();
                } else {
                    final IntercomArticleActivity intercomArticleActivity = IntercomArticleActivity.this;
                    IntercomThemeKt.IntercomTheme(null, null, null, gr1.b(-199442729, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity.onCreate.1.1
                        public final void invoke(jt1 jt1Var2, int i2) {
                            x10 anbVar;
                            if ((i2 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            Window window = intercomArticleActivity.getWindow();
                            yv9 yv9Var = new yv9(intercomArticleActivity.getWindow().getDecorView());
                            int i3 = Build.VERSION.SDK_INT;
                            if (i3 >= 35) {
                                anbVar = new dnb(window, yv9Var);
                            } else if (i3 >= 30) {
                                anbVar = new bnb(window, yv9Var);
                            } else {
                                anbVar = i3 >= 26 ? new anb(window, yv9Var) : new zmb(window, yv9Var);
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i4 = IntercomTheme.$stable;
                            anbVar.h(ColorExtensionsKt.m840isLightColor8_81llA(intercomTheme.getColors(jt1Var2, i4).getBase().m712getBase0d7_KjU()));
                            g2b g2bVar = g2b.a;
                            jt1Var2.K(1553126697);
                            boolean zJ = jt1Var2.j(intercomArticleActivity);
                            IntercomArticleActivity intercomArticleActivity2 = intercomArticleActivity;
                            Object objF = jt1Var2.f();
                            if (zJ || objF == jt1.a.a) {
                                objF = new IntercomArticleActivity$onCreate$1$1$1$1(intercomArticleActivity2, null);
                                jt1Var2.C(objF);
                            }
                            jt1Var2.B();
                            wd3.d(jt1Var2, (ci4) objF, g2bVar);
                            ox6 ox6VarC = gi0.c(ox6.a.t, zg5.a(intercomTheme, jt1Var2, i4), al8.a);
                            WeakHashMap<View, fnb> weakHashMap = fnb.w;
                            q39.a(hnb.c(ox6VarC, fnb.a.c(jt1Var2).b), gr1.b(547021723, new AnonymousClass2(intercomArticleActivity), jt1Var2), null, null, null, 0, 0L, 0L, null, gr1.b(-494666138, new AnonymousClass3(intercomArticleActivity), jt1Var2), jt1Var2, 805306416, 508);
                        }

                        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1$1$2, reason: invalid class name */
                        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                        public static final class AnonymousClass2 implements ci4<jt1, Integer, g2b> {
                            final /* synthetic */ IntercomArticleActivity this$0;

                            public AnonymousClass2(IntercomArticleActivity intercomArticleActivity) {
                                this.this$0 = intercomArticleActivity;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final g2b invoke$lambda$1$lambda$0(IntercomArticleActivity intercomArticleActivity) {
                                intercomArticleActivity.finish();
                                return g2b.a;
                            }

                            public final void invoke(jt1 jt1Var, int i) {
                                if ((i & 3) == 2 && jt1Var.r()) {
                                    jt1Var.u();
                                    return;
                                }
                                int i2 = R.drawable.intercom_ic_close;
                                jt1Var.K(344428451);
                                boolean zJ = jt1Var.j(this.this$0);
                                final IntercomArticleActivity intercomArticleActivity = this.this$0;
                                Object objF = jt1Var.f();
                                if (zJ || objF == jt1.a.a) {
                                    objF = new mh4() { // from class: io.intercom.android.sdk.helpcenter.articles.j
                                        @Override // defpackage.mh4
                                        public final Object invoke() {
                                            return IntercomArticleActivity.AnonymousClass1.C01261.AnonymousClass2.invoke$lambda$1$lambda$0(intercomArticleActivity);
                                        }
                                    };
                                    jt1Var.C(objF);
                                }
                                jt1Var.B();
                                IntercomTopBarIcon intercomTopBarIcon = new IntercomTopBarIcon(i2, null, (mh4) objF);
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                int i3 = IntercomTheme.$stable;
                                IntercomTopBarKt.m589IntercomTopBarbogVsAg(null, null, intercomTopBarIcon, null, zg5.a(intercomTheme, jt1Var, i3), ah5.a(intercomTheme, jt1Var, i3), null, null, jt1Var, IntercomTopBarIcon.$stable << 6, 203);
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
                                invoke(jt1Var, num.intValue());
                                return g2b.a;
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }

                        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1$1$3, reason: invalid class name */
                        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                        public static final class AnonymousClass3 implements ei4<go7, jt1, Integer, g2b> {
                            final /* synthetic */ IntercomArticleActivity this$0;

                            public AnonymousClass3(IntercomArticleActivity intercomArticleActivity) {
                                this.this$0 = intercomArticleActivity;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final g2b invoke$lambda$11$lambda$10$lambda$9(IntercomArticleActivity intercomArticleActivity) {
                                intercomArticleActivity.getViewModel().happyReactionTapped();
                                return g2b.a;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final WebView invoke$lambda$11$lambda$2$lambda$1(IntercomArticleActivity intercomArticleActivity, String str, Map map, Context context) {
                                WebView webView;
                                context.getClass();
                                try {
                                    webView = new WebView(context);
                                } catch (Resources.NotFoundException unused) {
                                    webView = new WebView(intercomArticleActivity.getApplicationContext());
                                }
                                webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                webView.getSettings().setJavaScriptEnabled(true);
                                webView.getSettings().setDomStorageEnabled(true);
                                webView.getSettings().setMediaPlaybackRequiresUserGesture(true);
                                webView.getSettings().setMixedContentMode(2);
                                webView.getSettings().setAllowFileAccess(false);
                                webView.getSettings().setAllowContentAccess(false);
                                webView.getSettings().setGeolocationEnabled(false);
                                webView.setWebChromeClient(new WebChromeClient());
                                webView.setWebViewClient(new ArticleWebViewClient(str, new IntercomArticleActivity$onCreate$1$1$3$1$1$1$1$1(intercomArticleActivity, webView)));
                                intercomArticleActivity.setCookies();
                                webView.loadUrl(str, map);
                                return webView;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final g2b invoke$lambda$11$lambda$4$lambda$3(WebView webView) {
                                webView.getClass();
                                return g2b.a;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final g2b invoke$lambda$11$lambda$6$lambda$5(IntercomArticleActivity intercomArticleActivity) {
                                intercomArticleActivity.getViewModel().sadReactionTapped();
                                return g2b.a;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final g2b invoke$lambda$11$lambda$8$lambda$7(IntercomArticleActivity intercomArticleActivity) {
                                intercomArticleActivity.getViewModel().neutralReactionTapped();
                                return g2b.a;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final g2b invoke$lambda$13$lambda$12(IntercomArticleActivity intercomArticleActivity) {
                                intercomArticleActivity.getViewModel().fragmentLoaded(intercomArticleActivity.getArguments().getArticleId());
                                return g2b.a;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            public final void invoke(go7 go7Var, jt1 jt1Var, int i) {
                                int i2;
                                ErrorState withoutCTA;
                                jt1 jt1Var2 = jt1Var;
                                go7Var.getClass();
                                if ((i & 6) == 0) {
                                    i2 = i | (jt1Var2.J(go7Var) ? 4 : 2);
                                } else {
                                    i2 = i;
                                }
                                if ((i2 & 19) == 18 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                ArticleViewState articleViewState = (ArticleViewState) bl7.c(this.this$0.getViewModel().getState(), jt1Var2, 0).getValue();
                                boolean z = articleViewState instanceof ArticleViewState.Initial;
                                ox6.a aVar = ox6.a.t;
                                if (z) {
                                    jt1Var2.K(2087909018);
                                    LoadingScreenKt.LoadingScreen(eo7.h(aVar, go7Var), io.intercom.android.sdk.R.drawable.intercom_article_webview_loading_state, jt1Var2, 0, 0);
                                    jt1Var2.B();
                                    return;
                                }
                                boolean z2 = articleViewState instanceof ArticleViewState.Content;
                                jt1.a.C0187a c0187a = jt1.a.a;
                                if (!z2) {
                                    if (!(articleViewState instanceof ArticleViewState.Error)) {
                                        jt1Var2.K(344450862);
                                        jt1Var2.B();
                                        u.b();
                                        return;
                                    }
                                    jt1Var2.K(2095240301);
                                    ArticleViewState.Error error = (ArticleViewState.Error) articleViewState;
                                    boolean z3 = error.getRetryButtonVisibility() == 0;
                                    ox6 ox6VarH = eo7.h(aVar, go7Var);
                                    jt1Var2.K(344692366);
                                    if (z3) {
                                        int message = error.getMessage();
                                        jt1Var2.K(344698615);
                                        boolean zJ = jt1Var2.j(this.this$0);
                                        final IntercomArticleActivity intercomArticleActivity = this.this$0;
                                        Object objF = jt1Var2.f();
                                        if (zJ || objF == c0187a) {
                                            objF = new mh4() { // from class: io.intercom.android.sdk.helpcenter.articles.p
                                                @Override // defpackage.mh4
                                                public final Object invoke() {
                                                    return IntercomArticleActivity.AnonymousClass1.C01261.AnonymousClass3.invoke$lambda$13$lambda$12(intercomArticleActivity);
                                                }
                                            };
                                            jt1Var2.C(objF);
                                        }
                                        jt1Var2.B();
                                        withoutCTA = new ErrorState.WithCTA(0, message, null, 0, (mh4) objF, 13, null);
                                    } else {
                                        withoutCTA = new ErrorState.WithoutCTA(0, error.getMessage(), null, 5, null);
                                    }
                                    jt1Var2.B();
                                    IntercomErrorScreenKt.IntercomErrorScreen(withoutCTA, ox6VarH, jt1Var2, 0, 0);
                                    jt1Var2.B();
                                    return;
                                }
                                jt1Var2.K(2088448015);
                                ox6 ox6VarC = gi0.c(q69.h(eo7.h(aVar, go7Var), q69.f(jt1Var2), 14).H(ir9.c), zg5.a(IntercomTheme.INSTANCE, jt1Var2, IntercomTheme.$stable), al8.a);
                                final IntercomArticleActivity intercomArticleActivity2 = this.this$0;
                                aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var2, 0);
                                int iHashCode = Long.hashCode(jt1Var2.v());
                                kw7 kw7VarY = jt1Var2.y();
                                ox6 ox6VarC2 = it1.c(jt1Var2, ox6VarC);
                                bt1.c.getClass();
                                qr5.a aVar2 = bt1.a.b;
                                if (jt1Var2.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var2.q();
                                if (jt1Var2.l()) {
                                    jt1Var2.k(aVar2);
                                } else {
                                    jt1Var2.z();
                                }
                                rd7.d(jt1Var2, bt1.a.f, aj1VarA);
                                rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                                rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
                                rd7.c(jt1Var2, bt1.a.h);
                                rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                                ArticleViewState.Content content = (ArticleViewState.Content) articleViewState;
                                final String articleUrl = content.getArticleUrl();
                                final Map mapI = qi6.i(new js7("MobileClientDisplayType", "AndroidIntercomHeaderless"), new js7("MobileClient", "AndroidIntercomWebView"), new js7("MobileClientReactionsHidden", "true"));
                                jt1Var2.K(-286526353);
                                boolean zJ2 = jt1Var2.j(intercomArticleActivity2) | jt1Var2.J(articleUrl);
                                Object objF2 = jt1Var2.f();
                                if (zJ2 || objF2 == c0187a) {
                                    objF2 = new oh4() { // from class: io.intercom.android.sdk.helpcenter.articles.k
                                        @Override // defpackage.oh4
                                        public final Object invoke(Object obj) {
                                            return IntercomArticleActivity.AnonymousClass1.C01261.AnonymousClass3.invoke$lambda$11$lambda$2$lambda$1(intercomArticleActivity2, articleUrl, mapI, (Context) obj);
                                        }
                                    };
                                    jt1Var2.C(objF2);
                                }
                                oh4 oh4Var = (oh4) objF2;
                                Object objA = xr1.a(jt1Var2, -286391975);
                                if (objA == c0187a) {
                                    objA = new l();
                                    jt1Var2.C(objA);
                                }
                                jt1Var2.B();
                                ft.b(oh4Var, null, (oh4) objA, jt1Var2, 384, 2);
                                ArticleViewState.ReactionState reactionState = content.getReactionState();
                                boolean z4 = reactionState.getReactionComponentVisibility() == 0;
                                jt1Var2.K(-286378103);
                                if (z4) {
                                    ox6 ox6VarC3 = ir9.c(aVar, 1.0f);
                                    jt1Var2.K(-286369689);
                                    boolean zJ3 = jt1Var2.j(intercomArticleActivity2);
                                    Object objF3 = jt1Var2.f();
                                    if (zJ3 || objF3 == c0187a) {
                                        objF3 = new mh4() { // from class: io.intercom.android.sdk.helpcenter.articles.m
                                            @Override // defpackage.mh4
                                            public final Object invoke() {
                                                return IntercomArticleActivity.AnonymousClass1.C01261.AnonymousClass3.invoke$lambda$11$lambda$6$lambda$5(intercomArticleActivity2);
                                            }
                                        };
                                        jt1Var2.C(objF3);
                                    }
                                    mh4 mh4Var = (mh4) objF3;
                                    jt1Var2.B();
                                    jt1Var2.K(-286363829);
                                    boolean zJ4 = jt1Var2.j(intercomArticleActivity2);
                                    Object objF4 = jt1Var2.f();
                                    if (zJ4 || objF4 == c0187a) {
                                        objF4 = new mh4() { // from class: io.intercom.android.sdk.helpcenter.articles.n
                                            @Override // defpackage.mh4
                                            public final Object invoke() {
                                                return IntercomArticleActivity.AnonymousClass1.C01261.AnonymousClass3.invoke$lambda$11$lambda$8$lambda$7(intercomArticleActivity2);
                                            }
                                        };
                                        jt1Var2.C(objF4);
                                    }
                                    mh4 mh4Var2 = (mh4) objF4;
                                    jt1Var2.B();
                                    jt1Var2.K(-286357911);
                                    boolean zJ5 = jt1Var2.j(intercomArticleActivity2);
                                    Object objF5 = jt1Var2.f();
                                    if (zJ5 || objF5 == c0187a) {
                                        objF5 = new mh4() { // from class: io.intercom.android.sdk.helpcenter.articles.o
                                            @Override // defpackage.mh4
                                            public final Object invoke() {
                                                return IntercomArticleActivity.AnonymousClass1.C01261.AnonymousClass3.invoke$lambda$11$lambda$10$lambda$9(intercomArticleActivity2);
                                            }
                                        };
                                        jt1Var2.C(objF5);
                                    }
                                    jt1Var2.B();
                                    ReactionsComponentKt.ReactionsComponent(ox6VarC3, reactionState, mh4Var, mh4Var2, (mh4) objF5, jt1Var2, 6, 0);
                                    if (content.getReactionState().getTeamHelpVisibility() == 0) {
                                        jt1Var2 = jt1Var;
                                        TeamPresenceComponentKt.TeamPresenceComponent(content.getTeamPresenceState(), false, null, jt1Var2, 0, 6);
                                    } else {
                                        jt1Var2 = jt1Var;
                                    }
                                }
                                jt1Var2.B();
                                jt1Var2.I();
                                jt1Var2.B();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(go7 go7Var, jt1 jt1Var, Integer num) {
                                invoke(go7Var, jt1Var, num.intValue());
                                return g2b.a;
                            }
                        }
                    }, jt1Var), jt1Var, 3072, 7);
                }
            }

            @Override // defpackage.ci4
            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
                invoke(jt1Var, num.intValue());
                return g2b.a;
            }
        }));
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public final Intent buildIntent(Context context, ArticleActivityArguments articleActivityArguments) {
            context.getClass();
            articleActivityArguments.getClass();
            Intent intent = new Intent(context, (Class<?>) IntercomArticleActivity.class);
            intent.setFlags(268435456);
            intent.putExtra(IntercomArticleActivity.ARTICLE_ID, articleActivityArguments.getArticleId());
            intent.putExtra(IntercomArticleActivity.METRIC_PLACE, articleActivityArguments.getMetricPlace());
            intent.putExtra(IntercomArticleActivity.IS_SEARCH_BROWSE, articleActivityArguments.isFromSearchBrowse());
            intent.putExtra(IntercomArticleActivity.SHOULD_HIDE_REACTIONS, articleActivityArguments.getShouldHideReactions());
            return intent;
        }

        public final ArticleActivityArguments getArguments(Intent intent) {
            intent.getClass();
            String stringExtra = intent.getStringExtra(IntercomArticleActivity.ARTICLE_ID);
            String str = BuildConfig.FLAVOR;
            if (stringExtra == null) {
                stringExtra = BuildConfig.FLAVOR;
            }
            String stringExtra2 = intent.getStringExtra(IntercomArticleActivity.METRIC_PLACE);
            if (stringExtra2 != null) {
                str = stringExtra2;
            }
            return new ArticleActivityArguments(stringExtra, str, intent.getBooleanExtra(IntercomArticleActivity.IS_SEARCH_BROWSE, false), intent.getBooleanExtra(IntercomArticleActivity.SHOULD_HIDE_REACTIONS, false));
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ArticleActivityArguments {
        public static final int $stable = 0;
        private final String articleId;
        private final boolean isFromSearchBrowse;
        private final String metricPlace;
        private final boolean shouldHideReactions;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ArticleActivityArguments(String str, String str2) {
            this(str, str2, false, false, 12, null);
            str.getClass();
            str2.getClass();
        }

        public static /* synthetic */ ArticleActivityArguments copy$default(ArticleActivityArguments articleActivityArguments, String str, String str2, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = articleActivityArguments.articleId;
            }
            if ((i & 2) != 0) {
                str2 = articleActivityArguments.metricPlace;
            }
            if ((i & 4) != 0) {
                z = articleActivityArguments.isFromSearchBrowse;
            }
            if ((i & 8) != 0) {
                z2 = articleActivityArguments.shouldHideReactions;
            }
            return articleActivityArguments.copy(str, str2, z, z2);
        }

        public final String component1() {
            return this.articleId;
        }

        public final String component2() {
            return this.metricPlace;
        }

        public final boolean component3() {
            return this.isFromSearchBrowse;
        }

        public final boolean component4() {
            return this.shouldHideReactions;
        }

        public final ArticleActivityArguments copy(String str, String str2, boolean z, boolean z2) {
            str.getClass();
            str2.getClass();
            return new ArticleActivityArguments(str, str2, z, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArticleActivityArguments)) {
                return false;
            }
            ArticleActivityArguments articleActivityArguments = (ArticleActivityArguments) obj;
            return xj5.a(this.articleId, articleActivityArguments.articleId) && xj5.a(this.metricPlace, articleActivityArguments.metricPlace) && this.isFromSearchBrowse == articleActivityArguments.isFromSearchBrowse && this.shouldHideReactions == articleActivityArguments.shouldHideReactions;
        }

        public final String getArticleId() {
            return this.articleId;
        }

        public final String getMetricPlace() {
            return this.metricPlace;
        }

        public final boolean getShouldHideReactions() {
            return this.shouldHideReactions;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldHideReactions) + uo2.a(ru3.c(this.articleId.hashCode() * 31, 31, this.metricPlace), this.isFromSearchBrowse, 31);
        }

        public final boolean isFromSearchBrowse() {
            return this.isFromSearchBrowse;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ArticleActivityArguments(articleId=");
            sb.append(this.articleId);
            sb.append(", metricPlace=");
            sb.append(this.metricPlace);
            sb.append(", isFromSearchBrowse=");
            sb.append(this.isFromSearchBrowse);
            sb.append(", shouldHideReactions=");
            return pi1.a(sb, this.shouldHideReactions, ')');
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ArticleActivityArguments(String str, String str2, boolean z) {
            this(str, str2, z, false, 8, null);
            str.getClass();
            str2.getClass();
        }

        public ArticleActivityArguments(String str, String str2, boolean z, boolean z2) {
            str.getClass();
            str2.getClass();
            this.articleId = str;
            this.metricPlace = str2;
            this.isFromSearchBrowse = z;
            this.shouldHideReactions = z2;
        }

        public /* synthetic */ ArticleActivityArguments(String str, String str2, boolean z, boolean z2, int i, qq2 qq2Var) {
            this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
        }
    }
}
