package io.intercom.android.sdk.helpcenter.search;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import defpackage.aa0;
import defpackage.aj1;
import defpackage.al8;
import defpackage.anb;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bnb;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.dnb;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.go7;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h37;
import defpackage.i37;
import defpackage.ia3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kk;
import defpackage.kw7;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.o7a;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.pi1;
import defpackage.q39;
import defpackage.qq2;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.ss5;
import defpackage.u;
import defpackage.x10;
import defpackage.xj8;
import defpackage.yi1;
import defpackage.yv9;
import defpackage.zg5;
import defpackage.zmb;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.databinding.IntercomActivityArticleSearchBinding;
import io.intercom.android.sdk.helpcenter.IntercomHelpCenterBaseActivity;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConfigurableIntercomThemeKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomArticleSearchActivity extends IntercomHelpCenterBaseActivity {
    private static final String IS_FROM_SEARCH_BROWSE = "IS_SEARCH_BROWSE";
    private IntercomActivityArticleSearchBinding _binding;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final ss5 viewModel$delegate = new o7a(new mh4() { // from class: ch5
        @Override // defpackage.mh4
        public final Object invoke() {
            return IntercomArticleSearchActivity.viewModel_delegate$lambda$0(this.t);
        }
    });
    private final ss5 args$delegate = new o7a(new mh4() { // from class: dh5
        @Override // defpackage.mh4
        public final Object invoke() {
            return IntercomArticleSearchActivity.args_delegate$lambda$1(this.t);
        }
    });

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeMode.values().length];
            try {
                iArr[ThemeMode.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeMode.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThemeMode.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void SearchScreenContent(final ArticleSearchState articleSearchState, final mh4<g2b> mh4Var, final oh4<? super i37<String>, g2b> oh4Var, final oh4<? super String, g2b> oh4Var2, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4Var;
        bj4 bj4VarO = jt1Var.o(865873108);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(articleSearchState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(mh4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(oh4Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bj4VarO.j(oh4Var2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i2 & 1171) == 1170 && bj4VarO.r()) {
            bj4VarO.u();
            bj4Var = bj4VarO;
        } else {
            bj4Var = bj4VarO;
            q39.a(null, gr1.b(-1018273896, new AnonymousClass1(mh4Var, oh4Var), bj4VarO), null, null, null, 0, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0L, null, gr1.b(955713763, new AnonymousClass2(articleSearchState, oh4Var2), bj4VarO), bj4Var, 805306416, 445);
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: eh5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomArticleSearchActivity.SearchScreenContent$lambda$3(this.t, articleSearchState, mh4Var, oh4Var, oh4Var2, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SearchScreenContent$lambda$3(IntercomArticleSearchActivity intercomArticleSearchActivity, ArticleSearchState articleSearchState, mh4 mh4Var, oh4 oh4Var, oh4 oh4Var2, int i, jt1 jt1Var, int i2) {
        intercomArticleSearchActivity.SearchScreenContent(articleSearchState, mh4Var, oh4Var, oh4Var2, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleSearchArgs args_delegate$lambda$1(IntercomArticleSearchActivity intercomArticleSearchActivity) {
        Companion companion = Companion;
        Intent intent = intercomArticleSearchActivity.getIntent();
        intent.getClass();
        return companion.getArguments(intent);
    }

    public static final Intent buildIntent(Context context, boolean z) {
        return Companion.buildIntent(context, z);
    }

    private final ArticleSearchArgs getArgs() {
        return (ArticleSearchArgs) this.args$delegate.getValue();
    }

    private final IntercomActivityArticleSearchBinding getBinding() {
        IntercomActivityArticleSearchBinding intercomActivityArticleSearchBinding = this._binding;
        if (intercomActivityArticleSearchBinding != null) {
            return intercomActivityArticleSearchBinding;
        }
        aa0.c("Required value was null.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArticleSearchViewModel getViewModel() {
        return (ArticleSearchViewModel) this.viewModel$delegate.getValue();
    }

    private final void setupInsets() {
        x10 anbVar;
        ia3.b(this);
        Window window = getWindow();
        yv9 yv9Var = new yv9(getWindow().getDecorView());
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            anbVar = new dnb(window, yv9Var);
        } else if (i >= 30) {
            anbVar = new bnb(window, yv9Var);
        } else {
            anbVar = i >= 26 ? new anb(window, yv9Var) : new zmb(window, yv9Var);
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
        boolean z = false;
        if (i2 != 1) {
            if (i2 == 2) {
                z = true;
            } else if (i2 != 3) {
                u.b();
                return;
            }
        }
        anbVar.h(z);
    }

    private final void subscribeToStates() {
        getBinding().articleSearchComposeView.setContent(new fr1(true, -779899693, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity.subscribeToStates.1
            public final void invoke(jt1 jt1Var, int i) {
                if ((i & 3) == 2 && jt1Var.r()) {
                    jt1Var.u();
                    return;
                }
                AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                appConfig.getClass();
                ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig, gr1.b(-1191058574, new C01281(IntercomArticleSearchActivity.this), jt1Var), jt1Var, 48);
            }

            @Override // defpackage.ci4
            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
                invoke(jt1Var, num.intValue());
                return g2b.a;
            }

            /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity$subscribeToStates$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class C01281 implements ci4<jt1, Integer, g2b> {
                final /* synthetic */ IntercomArticleSearchActivity this$0;

                public C01281(IntercomArticleSearchActivity intercomArticleSearchActivity) {
                    this.this$0 = intercomArticleSearchActivity;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final g2b invoke$lambda$1$lambda$0(IntercomArticleSearchActivity intercomArticleSearchActivity) {
                    intercomArticleSearchActivity.getOnBackPressedDispatcher().c().a();
                    return g2b.a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final g2b invoke$lambda$3$lambda$2(IntercomArticleSearchActivity intercomArticleSearchActivity, i37 i37Var) {
                    i37Var.getClass();
                    intercomArticleSearchActivity.getViewModel().searchForArticles(i37Var);
                    return g2b.a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final g2b invoke$lambda$5$lambda$4(IntercomArticleSearchActivity intercomArticleSearchActivity, String str) {
                    str.getClass();
                    intercomArticleSearchActivity.getViewModel().addTeammateHelpRow();
                    intercomArticleSearchActivity.getViewModel().sendClickOnSearchResultMetric();
                    intercomArticleSearchActivity.startActivity(IntercomArticleActivity.Companion.buildIntent(intercomArticleSearchActivity, new IntercomArticleActivity.ArticleActivityArguments(str, MetricTracker.Place.SEARCH_RESULTS, false, false, 12, null)));
                    return g2b.a;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void invoke(jt1 jt1Var, int i) {
                    if ((i & 3) == 2 && jt1Var.r()) {
                        jt1Var.u();
                        return;
                    }
                    h37 h37VarC = bl7.c(this.this$0.getViewModel().getState(), jt1Var, 0);
                    IntercomArticleSearchActivity intercomArticleSearchActivity = this.this$0;
                    ArticleSearchState articleSearchState = (ArticleSearchState) h37VarC.getValue();
                    jt1Var.K(903375816);
                    boolean zJ = jt1Var.j(this.this$0);
                    final IntercomArticleSearchActivity intercomArticleSearchActivity2 = this.this$0;
                    Object objF = jt1Var.f();
                    jt1.a.C0187a c0187a = jt1.a.a;
                    if (zJ || objF == c0187a) {
                        objF = new mh4() { // from class: io.intercom.android.sdk.helpcenter.search.f
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return IntercomArticleSearchActivity.C03231.C01281.invoke$lambda$1$lambda$0(intercomArticleSearchActivity2);
                            }
                        };
                        jt1Var.C(objF);
                    }
                    mh4 mh4Var = (mh4) objF;
                    jt1Var.B();
                    jt1Var.K(903378418);
                    boolean zJ2 = jt1Var.j(this.this$0);
                    final IntercomArticleSearchActivity intercomArticleSearchActivity3 = this.this$0;
                    Object objF2 = jt1Var.f();
                    if (zJ2 || objF2 == c0187a) {
                        objF2 = new oh4() { // from class: io.intercom.android.sdk.helpcenter.search.g
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return IntercomArticleSearchActivity.C03231.C01281.invoke$lambda$3$lambda$2(intercomArticleSearchActivity3, (i37) obj);
                            }
                        };
                        jt1Var.C(objF2);
                    }
                    oh4 oh4Var = (oh4) objF2;
                    jt1Var.B();
                    jt1Var.K(903381940);
                    boolean zJ3 = jt1Var.j(this.this$0);
                    final IntercomArticleSearchActivity intercomArticleSearchActivity4 = this.this$0;
                    Object objF3 = jt1Var.f();
                    if (zJ3 || objF3 == c0187a) {
                        objF3 = new oh4() { // from class: io.intercom.android.sdk.helpcenter.search.h
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return IntercomArticleSearchActivity.C03231.C01281.invoke$lambda$5$lambda$4(intercomArticleSearchActivity4, (String) obj);
                            }
                        };
                        jt1Var.C(objF3);
                    }
                    jt1Var.B();
                    intercomArticleSearchActivity.SearchScreenContent(articleSearchState, mh4Var, oh4Var, (oh4) objF3, jt1Var, 0);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
                    invoke(jt1Var, num.intValue());
                    return g2b.a;
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleSearchViewModel viewModel_delegate$lambda$0(IntercomArticleSearchActivity intercomArticleSearchActivity) {
        ArticleSearchViewModel.Companion companion = ArticleSearchViewModel.Companion;
        HelpCenterApi helpCenterApi = Injector.get().getHelpCenterApi();
        helpCenterApi.getClass();
        return companion.create(intercomArticleSearchActivity, helpCenterApi, intercomArticleSearchActivity.getArgs().isFromSearchBrowse());
    }

    @Override // io.intercom.android.sdk.helpcenter.IntercomHelpCenterBaseActivity, androidx.fragment.app.g, defpackage.dq1, defpackage.hq1, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this._binding = IntercomActivityArticleSearchBinding.inflate(getLayoutInflater());
        setContentView(getBinding().getRoot());
        setupInsets();
        subscribeToStates();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public final Intent buildIntent(Context context, boolean z) {
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) IntercomArticleSearchActivity.class);
            intent.setFlags(268435456);
            intent.putExtra(IntercomArticleSearchActivity.IS_FROM_SEARCH_BROWSE, z);
            return intent;
        }

        public final ArticleSearchArgs getArguments(Intent intent) {
            intent.getClass();
            return new ArticleSearchArgs(intent.getBooleanExtra(IntercomArticleSearchActivity.IS_FROM_SEARCH_BROWSE, false));
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ArticleSearchArgs {
        public static final int $stable = 0;
        private final boolean isFromSearchBrowse;

        public /* synthetic */ ArticleSearchArgs(boolean z, int i, qq2 qq2Var) {
            this((i & 1) != 0 ? false : z);
        }

        public static /* synthetic */ ArticleSearchArgs copy$default(ArticleSearchArgs articleSearchArgs, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = articleSearchArgs.isFromSearchBrowse;
            }
            return articleSearchArgs.copy(z);
        }

        public final boolean component1() {
            return this.isFromSearchBrowse;
        }

        public final ArticleSearchArgs copy(boolean z) {
            return new ArticleSearchArgs(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ArticleSearchArgs) && this.isFromSearchBrowse == ((ArticleSearchArgs) obj).isFromSearchBrowse;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isFromSearchBrowse);
        }

        public final boolean isFromSearchBrowse() {
            return this.isFromSearchBrowse;
        }

        public String toString() {
            return pi1.a(new StringBuilder("ArticleSearchArgs(isFromSearchBrowse="), this.isFromSearchBrowse, ')');
        }

        public ArticleSearchArgs(boolean z) {
            this.isFromSearchBrowse = z;
        }

        public ArticleSearchArgs() {
            this(false, 1, null);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity$SearchScreenContent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass1 implements ci4<jt1, Integer, g2b> {
        final /* synthetic */ mh4<g2b> $onBackClick;
        final /* synthetic */ oh4<i37<String>, g2b> $onTextChanged;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(mh4<g2b> mh4Var, oh4<? super i37<String>, g2b> oh4Var) {
            this.$onBackClick = mh4Var;
            this.$onTextChanged = oh4Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$1$lambda$0(String str) {
            str.getClass();
            return g2b.a;
        }

        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            mh4<g2b> mh4Var = this.$onBackClick;
            oh4<i37<String>, g2b> oh4Var = this.$onTextChanged;
            jt1Var.K(-1252036924);
            Object objF = jt1Var.f();
            if (objF == jt1.a.a) {
                objF = new d();
                jt1Var.C(objF);
            }
            jt1Var.B();
            HelpCenterSearchTopBarKt.HelpCenterSearchTopBar(mh4Var, oh4Var, (oh4) objF, jt1Var, 384);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity$SearchScreenContent$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass2 implements ei4<go7, jt1, Integer, g2b> {
        final /* synthetic */ ArticleSearchState $articleSearchState;
        final /* synthetic */ oh4<String, g2b> $onArticleClicked;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(ArticleSearchState articleSearchState, oh4<? super String, g2b> oh4Var) {
            this.$articleSearchState = articleSearchState;
            this.$onArticleClicked = oh4Var;
        }

        public final void invoke(go7 go7Var, jt1 jt1Var, int i) {
            go7Var.getClass();
            if ((i & 6) == 0) {
                i |= jt1Var.J(go7Var) ? 4 : 2;
            }
            if ((i & 19) == 18 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            ox6 ox6VarH = eo7.h(gi0.c(ir9.c, zg5.a(IntercomTheme.INSTANCE, jt1Var, IntercomTheme.$stable), al8.a), go7Var);
            ArticleSearchState articleSearchState = this.$articleSearchState;
            oh4<String, g2b> oh4Var = this.$onArticleClicked;
            aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var, 0);
            int iHashCode = Long.hashCode(jt1Var.v());
            kw7 kw7VarY = jt1Var.y();
            ox6 ox6VarC = it1.c(jt1Var, ox6VarH);
            bt1.c.getClass();
            qr5.a aVar = bt1.a.b;
            if (jt1Var.s() == null) {
                ml5.c();
                throw null;
            }
            jt1Var.q();
            if (jt1Var.l()) {
                jt1Var.k(aVar);
            } else {
                jt1Var.z();
            }
            rd7.d(jt1Var, bt1.a.f, aj1VarA);
            rd7.d(jt1Var, bt1.a.e, kw7VarY);
            rd7.d(jt1Var, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(jt1Var, bt1.a.h);
            rd7.d(jt1Var, bt1.a.d, ox6VarC);
            jt1Var.K(-1961415711);
            Object objF = jt1Var.f();
            if (objF == jt1.a.a) {
                objF = new e();
                jt1Var.C(objF);
            }
            jt1Var.B();
            IntercomArticleSearchScreenKt.IntercomArticleSearchScreen(articleSearchState, (mh4) objF, oh4Var, jt1Var, 48);
            jt1Var.I();
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(go7 go7Var, jt1 jt1Var, Integer num) {
            invoke(go7Var, jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
