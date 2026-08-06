package io.intercom.android.sdk.helpcenter.articles;

import com.intercom.twig.BuildConfig;
import defpackage.a0a;
import defpackage.aa0;
import defpackage.b0a;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.et2;
import defpackage.g2b;
import defpackage.i23;
import defpackage.i37;
import defpackage.lb2;
import defpackage.ll8;
import defpackage.mhb;
import defpackage.n72;
import defpackage.oh4;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.qq2;
import defpackage.r02;
import defpackage.r54;
import defpackage.rhb;
import defpackage.s54;
import defpackage.sd1;
import defpackage.t72;
import defpackage.thb;
import defpackage.u;
import defpackage.u02;
import defpackage.uhb;
import defpackage.ux1;
import defpackage.v72;
import defpackage.vhb;
import defpackage.whb;
import defpackage.wn5;
import defpackage.wr2;
import defpackage.wt4;
import defpackage.xj5;
import defpackage.xm2;
import defpackage.yk2;
import defpackage.z90;
import defpackage.zl9;
import defpackage.zz9;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.articles.ArticleWebViewListener;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.component.TeammateHelpKt;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ArticleViewModel extends mhb implements ArticleWebViewListener {
    public static final int HAPPY_SERVER_INDEX = 0;
    public static final int NEUTRAL_SERVER_INDEX = 1;
    public static final int SAD_SERVER_INDEX = 2;
    private final i37<ArticleViewState> _state;
    private final AppConfig appConfig;
    private String articleContentId;
    private String articleId;
    private final String baseUrl;
    private final CommonRepository commonRepository;
    private final n72 dispatcher;
    private final HelpCenterApi helpCenterApi;
    private final IntercomDataLayer intercomDataLayer;
    private final boolean isFromSearchBrowse;
    private final boolean isSystemInDarkTheme;
    private final MetricTracker metricTracker;
    private final oh4<Integer, g2b> scrollTo;
    private final boolean shouldHideReactions;
    private final zz9<ArticleViewState> state;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$1", f = "ArticleViewModel.kt", l = {73}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ArticleViewModel.this.new AnonymousClass1(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                final zl9<IntercomEvent> event = ArticleViewModel.this.intercomDataLayer.getEvent();
                r54<Object> r54Var = new r54<Object>() { // from class: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$1$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public static final class AnonymousClass2<T> implements s54 {
                        final /* synthetic */ s54 $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        @xm2(c = "io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ArticleViewModel.kt", l = {50}, m = "emit")
                        public static final class AnonymousClass1 extends u02 {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(r02 r02Var) {
                                super(r02Var);
                            }

                            @Override // defpackage.ak0
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(s54 s54Var) {
                            this.$this_unsafeFlow = s54Var;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // defpackage.s54
                        public final Object emit(Object obj, r02 r02Var) throws Throwable {
                            AnonymousClass1 anonymousClass1;
                            if (r02Var instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) r02Var;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(r02Var);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(r02Var);
                            }
                            Object obj2 = anonymousClass1.result;
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                dv8.b(obj2);
                                s54 s54Var = this.$this_unsafeFlow;
                                if (obj instanceof IntercomEvent.NewConversation) {
                                    anonymousClass1.label = 1;
                                    Object objEmit = s54Var.emit(obj, anonymousClass1);
                                    v72 v72Var = v72.t;
                                    if (objEmit == v72Var) {
                                        return v72Var;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                dv8.b(obj2);
                            }
                            return g2b.a;
                        }
                    }

                    @Override // defpackage.r54
                    public Object collect(s54<? super Object> s54Var, r02 r02Var) {
                        Object objCollect = event.collect(new AnonymousClass2(s54Var), r02Var);
                        return objCollect == v72.t ? objCollect : g2b.a;
                    }
                };
                final ArticleViewModel articleViewModel = ArticleViewModel.this;
                s54<? super Object> s54Var = new s54() { // from class: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel.1.1
                    public final Object emit(IntercomEvent.NewConversation newConversation, r02<? super g2b> r02Var) {
                        articleViewModel.updateTeamPresence(newConversation.getConversation());
                        return g2b.a;
                    }

                    @Override // defpackage.s54
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, r02 r02Var) {
                        return emit((IntercomEvent.NewConversation) obj2, (r02<? super g2b>) r02Var);
                    }
                };
                this.label = 1;
                Object objCollect = r54Var.collect(s54Var, this);
                v72 v72Var = v72.t;
                if (objCollect == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

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

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$fragmentLoaded$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$fragmentLoaded$1", f = "ArticleViewModel.kt", l = {103}, m = "invokeSuspend")
    public static final class C03141 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ String $articleId;
        final /* synthetic */ ArticleViewState.Content $defaultState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03141(String str, ArticleViewState.Content content, r02<? super C03141> r02Var) {
            super(2, r02Var);
            this.$articleId = str;
            this.$defaultState = content;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ArticleViewModel.this.new C03141(this.$articleId, this.$defaultState, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03141) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objFetchArticle$default;
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                HelpCenterApi helpCenterApi = ArticleViewModel.this.helpCenterApi;
                String str = this.$articleId;
                this.label = 1;
                objFetchArticle$default = HelpCenterApi.DefaultImpls.fetchArticle$default(helpCenterApi, str, null, this, 2, null);
                v72 v72Var = v72.t;
                if (objFetchArticle$default == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                objFetchArticle$default = obj;
            }
            NetworkResponse networkResponse = (NetworkResponse) objFetchArticle$default;
            if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError) || (networkResponse instanceof NetworkResponse.ServerError)) {
                ArticleViewModel.this._state.setValue(ArticleViewState.Content.copy$default(this.$defaultState, null, null, ArticleViewState.WebViewStatus.Idle, null, null, 27, null));
            } else {
                if (!(networkResponse instanceof NetworkResponse.Success)) {
                    u.b();
                    return null;
                }
                NetworkResponse.Success success = (NetworkResponse.Success) networkResponse;
                String relatedConversationId = ((ArticleResponse) success.getBody()).getArticle().getRelatedConversationId();
                ArticleViewState.TeamPresenceState teamPresenceStateCopy$default = relatedConversationId != null ? ArticleViewState.TeamPresenceState.copy$default(ArticleViewState.TeamPresenceState.Companion.getDefaultTeamPresenceState(), null, new ArticleViewState.ConversationState(relatedConversationId, 0, 2, null), null, 0, 0, 0, null, null, false, null, 1021, null) : null;
                i37 i37Var = ArticleViewModel.this._state;
                ArticleViewState.WebViewStatus webViewStatus = ArticleViewState.WebViewStatus.Idle;
                if (teamPresenceStateCopy$default == null) {
                    teamPresenceStateCopy$default = ArticleViewState.TeamPresenceState.Companion.getDefaultTeamPresenceState();
                }
                i37Var.setValue(ArticleViewState.Content.copy$default(this.$defaultState, null, new ArticleMetadata(((ArticleResponse) success.getBody()).getArticle().getCard().getArticleId(), ((ArticleResponse) success.getBody()).getArticle().getCard().getTitle()), webViewStatus, null, teamPresenceStateCopy$default, 9, null));
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$sadReactionTapped$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$sadReactionTapped$1", f = "ArticleViewModel.kt", l = {196}, m = "invokeSuspend")
    public static final class C03151 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public C03151(r02<? super C03151> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ArticleViewModel.this.new C03151(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03151) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOpenMessenger;
            i37 i37Var;
            int i;
            ArticleViewState.TeamPresenceState teamPresenceStateCopy$default;
            ArticleViewState.Content content;
            int i2;
            int i3 = this.label;
            if (i3 == 0) {
                dv8.b(obj);
                ArticleViewState articleViewState = (ArticleViewState) ArticleViewModel.this._state.getValue();
                if (articleViewState instanceof ArticleViewState.Content) {
                    i37 i37Var2 = ArticleViewModel.this._state;
                    ArticleViewModel articleViewModel = ArticleViewModel.this;
                    ArticleViewState.Content content2 = (ArticleViewState.Content) articleViewState;
                    articleViewModel.metricTracker.sentArticleReaction(MetricTracker.Context.REACTION_SAD, Boolean.valueOf(articleViewModel.appConfig.isInboundMessages()), articleViewModel.isFromSearchBrowse);
                    articleViewModel.sendReactionToServer(articleViewModel.articleId, articleViewModel.articleContentId, 2);
                    boolean zShouldAddSendMessageRow = articleViewModel.shouldAddSendMessageRow();
                    int i4 = zShouldAddSendMessageRow ? 0 : 8;
                    ArticleViewState.TeamPresenceState teamPresenceStateComputeViewState = TeammateHelpKt.computeViewState(content2.getArticleMetadata(), content2.getTeamPresenceState(), articleViewModel.appConfig, "article", articleViewModel.isFromSearchBrowse);
                    CommonRepository commonRepository = articleViewModel.commonRepository;
                    this.L$0 = content2;
                    this.L$1 = teamPresenceStateComputeViewState;
                    this.L$2 = i37Var2;
                    this.I$0 = i4;
                    this.I$1 = zShouldAddSendMessageRow ? 1 : 0;
                    this.label = 1;
                    objOpenMessenger = commonRepository.openMessenger(this);
                    v72 v72Var = v72.t;
                    if (objOpenMessenger == v72Var) {
                        return v72Var;
                    }
                    i37Var = i37Var2;
                    i = i4;
                    teamPresenceStateCopy$default = teamPresenceStateComputeViewState;
                    content = content2;
                    i2 = zShouldAddSendMessageRow ? 1 : 0;
                } else if (!xj5.a(articleViewState, ArticleViewState.Initial.INSTANCE) && !(articleViewState instanceof ArticleViewState.Error)) {
                    u.b();
                    return null;
                }
                return g2b.a;
            }
            if (i3 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = this.I$1;
            int i5 = this.I$0;
            i37 i37Var3 = (i37) this.L$2;
            ArticleViewState.TeamPresenceState teamPresenceState = (ArticleViewState.TeamPresenceState) this.L$1;
            ArticleViewState.Content content3 = (ArticleViewState.Content) this.L$0;
            dv8.b(obj);
            i = i5;
            i37Var = i37Var3;
            teamPresenceStateCopy$default = teamPresenceState;
            content = content3;
            objOpenMessenger = obj;
            NetworkResponse networkResponse = (NetworkResponse) objOpenMessenger;
            if (networkResponse instanceof NetworkResponse.Success) {
                NetworkResponse.Success success = (NetworkResponse.Success) networkResponse;
                if (((OpenMessengerResponse) success.getBody()).getNewConversationData() != null) {
                    teamPresenceStateCopy$default = ArticleViewState.TeamPresenceState.copy$default(teamPresenceStateCopy$default, null, null, null, 0, 0, 0, null, null, false, ((OpenMessengerResponse) success.getBody()).getNewConversationData().getCta(), 511, null);
                }
            }
            i37Var.setValue(ArticleViewState.Content.copy$default(content, null, null, null, ArticleViewState.ReactionState.copy$default(content.getReactionState(), 0, ArticleViewState.Reaction.Sad, i, i2 != 0, 1, null), teamPresenceStateCopy$default, 7, null));
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$sendReactionToServer$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$sendReactionToServer$1", f = "ArticleViewModel.kt", l = {266}, m = "invokeSuspend")
    public static final class C03161 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ String $articleContentId;
        final /* synthetic */ String $articleId;
        final /* synthetic */ int $reactionIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03161(String str, int i, String str2, r02<? super C03161> r02Var) {
            super(2, r02Var);
            this.$articleId = str;
            this.$reactionIndex = i;
            this.$articleContentId = str2;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ArticleViewModel.this.new C03161(this.$articleId, this.$reactionIndex, this.$articleContentId, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03161) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                HelpCenterApi helpCenterApi = ArticleViewModel.this.helpCenterApi;
                String str = this.$articleId;
                int i2 = this.$reactionIndex;
                String str2 = this.$articleContentId;
                String str3 = ArticleViewModel.this.isFromSearchBrowse ? "search_browse" : null;
                this.label = 1;
                Object objReactToArticle$default = HelpCenterApi.DefaultImpls.reactToArticle$default(helpCenterApi, str, i2, str2, false, str3, null, this, 40, null);
                v72 v72Var = v72.t;
                if (objReactToArticle$default == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArticleViewModel(HelpCenterApi helpCenterApi, String str, AppConfig appConfig, MetricTracker metricTracker, String str2, boolean z, boolean z2, n72 n72Var, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository, oh4<? super Integer, g2b> oh4Var, boolean z3) {
        helpCenterApi.getClass();
        str.getClass();
        appConfig.getClass();
        metricTracker.getClass();
        str2.getClass();
        n72Var.getClass();
        intercomDataLayer.getClass();
        commonRepository.getClass();
        oh4Var.getClass();
        this.helpCenterApi = helpCenterApi;
        this.baseUrl = str;
        this.appConfig = appConfig;
        this.metricTracker = metricTracker;
        this.isFromSearchBrowse = z;
        this.shouldHideReactions = z2;
        this.dispatcher = n72Var;
        this.intercomDataLayer = intercomDataLayer;
        this.commonRepository = commonRepository;
        this.scrollTo = oh4Var;
        this.isSystemInDarkTheme = z3;
        a0a a0aVarB = b0a.b(ArticleViewState.Initial.INSTANCE);
        this._state = a0aVarB;
        this.state = yk2.b(a0aVarB);
        this.articleContentId = BuildConfig.FLAVOR;
        this.articleId = BuildConfig.FLAVOR;
        if (!str2.equals(MetricTracker.Place.COLLECTION_LIST)) {
            if (!str2.equals("article")) {
                metricTracker.openedNativeHelpCenter(str2, str2.equals(MetricTracker.Place.API) ? "article" : MetricTracker.Context.NO_CONTEXT);
            }
        }
        oy0.d(rhb.b(this), n72Var, null, new AnonymousClass1(null), 2);
    }

    private final void sendFailedMetric(Integer num) {
        this.metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER, "article", num != null ? num.toString() : null, this.isFromSearchBrowse);
    }

    public static /* synthetic */ void sendFailedMetric$default(ArticleViewModel articleViewModel, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        articleViewModel.sendFailedMetric(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendReactionToServer(String str, String str2, int i) {
        oy0.d(rhb.b(this), this.dispatcher, null, new C03161(str, i, str2, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldAddSendMessageRow() {
        return AppConfigExtensionsKt.canStartNewConversation(this.appConfig) && this.appConfig.getArticleAutoReactionEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTeamPresence(Conversation conversation) {
        ArticleViewState value = this._state.getValue();
        if (value instanceof ArticleViewState.Content) {
            ArticleViewState.Content content = (ArticleViewState.Content) value;
            if (content.getReactionState().getSelectedReaction() == ArticleViewState.Reaction.Sad) {
                this._state.setValue(ArticleViewState.Content.copy$default(content, null, null, null, null, ArticleViewState.TeamPresenceState.copy$default(content.getTeamPresenceState(), null, new ArticleViewState.ConversationState(conversation.getId(), 0, 2, null), null, 0, 0, 0, null, null, false, null, 1021, null), 15, null));
            }
        }
    }

    public final void articleContentIdFetched(String str) {
        if (str != null) {
            this.articleContentId = str;
            ArticleViewState value = this._state.getValue();
            if (value instanceof ArticleViewState.Content) {
                ArticleViewState.Content content = (ArticleViewState.Content) value;
                this._state.setValue(ArticleViewState.Content.copy$default(content, null, null, null, ArticleViewState.ReactionState.copy$default(content.getReactionState(), this.shouldHideReactions ? 8 : 0, null, 0, false, 14, null), null, 23, null));
            } else {
                if (xj5.a(value, ArticleViewState.Initial.INSTANCE) || (value instanceof ArticleViewState.Error)) {
                    return;
                }
                u.b();
            }
        }
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void articleNotFound() {
        sendFailedMetric(404);
        this._state.setValue(new ArticleViewState.Error(R.string.intercom_page_not_found, 8, this.appConfig.getPrimaryColor()));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    public final void fragmentLoaded(String str) {
        str.getClass();
        this.articleId = str;
        int i = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
        String str2 = "dark";
        if (i != 1) {
            if (i == 2) {
                str2 = "light";
            } else if (i != 3) {
                u.b();
                return;
            } else if (!this.isSystemInDarkTheme) {
                str2 = "light";
            }
        }
        StringBuilder sb = new StringBuilder();
        ux1.b(sb, this.baseUrl, "/articles/", str, "?theme=");
        sb.append(str2);
        ArticleViewState.Content content = new ArticleViewState.Content(sb.toString(), new ArticleMetadata(str, null, 2, null), ArticleViewState.WebViewStatus.Loading, ArticleViewState.ReactionState.Companion.getDefaultReactionState(), ArticleViewState.TeamPresenceState.Companion.getDefaultTeamPresenceState());
        this._state.setValue(content);
        oy0.d(rhb.b(this), this.dispatcher, null, new C03141(str, content, null), 2);
    }

    public final zz9<ArticleViewState> getState() {
        return this.state;
    }

    public final void happyReactionTapped() {
        ArticleViewState value = this._state.getValue();
        if (!(value instanceof ArticleViewState.Content)) {
            if (xj5.a(value, ArticleViewState.Initial.INSTANCE) || (value instanceof ArticleViewState.Error)) {
                return;
            }
            u.b();
            return;
        }
        i37<ArticleViewState> i37Var = this._state;
        ArticleViewState.Content content = (ArticleViewState.Content) value;
        this.metricTracker.sentArticleReaction(MetricTracker.Context.REACTION_HAPPY, null, this.isFromSearchBrowse);
        sendReactionToServer(this.articleId, this.articleContentId, 0);
        i37Var.setValue(ArticleViewState.Content.copy$default(content, null, null, null, ArticleViewState.ReactionState.copy$default(content.getReactionState(), 0, ArticleViewState.Reaction.Happy, 8, false, 1, null), null, 23, null));
    }

    public final void neutralReactionTapped() {
        ArticleViewState value = this._state.getValue();
        if (!(value instanceof ArticleViewState.Content)) {
            if (xj5.a(value, ArticleViewState.Initial.INSTANCE) || (value instanceof ArticleViewState.Error)) {
                return;
            }
            u.b();
            return;
        }
        i37<ArticleViewState> i37Var = this._state;
        ArticleViewState.Content content = (ArticleViewState.Content) value;
        this.metricTracker.sentArticleReaction(MetricTracker.Context.REACTION_NEUTRAL, null, this.isFromSearchBrowse);
        sendReactionToServer(this.articleId, this.articleContentId, 1);
        i37Var.setValue(ArticleViewState.Content.copy$default(content, null, null, null, ArticleViewState.ReactionState.copy$default(content.getReactionState(), 0, ArticleViewState.Reaction.Neutral, 8, false, 1, null), null, 23, null));
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void onArticleFinishedLoading() {
        this.metricTracker.viewedNativeHelpCenter("article", null, this.isFromSearchBrowse);
        ArticleViewState value = this._state.getValue();
        if (value instanceof ArticleViewState.Content) {
            this._state.setValue(ArticleViewState.Content.copy$default((ArticleViewState.Content) value, null, null, ArticleViewState.WebViewStatus.Ready, null, null, 27, null));
        } else {
            if (xj5.a(value, ArticleViewState.Initial.INSTANCE) || (value instanceof ArticleViewState.Error)) {
                return;
            }
            u.b();
        }
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void onArticleLoadingError() {
        sendFailedMetric$default(this, null, 1, null);
        this._state.setValue(new ArticleViewState.Error(R.string.intercom_something_went_wrong_try_again, 0, this.appConfig.getPrimaryColor()));
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void onArticleStartedLoading() {
        ArticleViewState value = this._state.getValue();
        if (value instanceof ArticleViewState.Content) {
            this._state.setValue(ArticleViewState.Content.copy$default((ArticleViewState.Content) value, null, null, ArticleViewState.WebViewStatus.Loading, null, null, 27, null));
        } else {
            if (xj5.a(value, ArticleViewState.Initial.INSTANCE) || (value instanceof ArticleViewState.Error)) {
                return;
            }
            u.b();
        }
    }

    public final void sadReactionTapped() {
        oy0.d(rhb.b(this), this.dispatcher, null, new C03151(null), 2);
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void scrollArticleViewTo(int i) {
        this.scrollTo.invoke(Integer.valueOf(i));
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r0v1, types: [io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$Companion$factory$1] */
        public final ArticleViewModel$Companion$factory$1 factory(final HelpCenterApi helpCenterApi, final String str, final String str2, final boolean z, final boolean z2, final oh4<? super Integer, g2b> oh4Var, final boolean z3) {
            return new thb.c() { // from class: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$Companion$factory$1
                @Override // thb.c
                public <T extends mhb> T create(Class<T> cls) {
                    cls.getClass();
                    IntercomDataLayer dataLayer = Injector.get().getDataLayer();
                    AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                    appConfig.getClass();
                    AppConfig appConfig2 = appConfig;
                    MetricTracker metricTracker = Injector.get().getMetricTracker();
                    metricTracker.getClass();
                    dataLayer.getClass();
                    MessengerApi messengerApi = Injector.get().getMessengerApi();
                    messengerApi.getClass();
                    return new ArticleViewModel(helpCenterApi, str, appConfig2, metricTracker, str2, z, z2, null, dataLayer, new CommonRepository(messengerApi, dataLayer), oh4Var, z3, 128, null);
                }

                @Override // thb.c
                public /* bridge */ /* synthetic */ mhb create(Class cls, lb2 lb2Var) {
                    return super.create(cls, lb2Var);
                }

                @Override // thb.c
                public /* bridge */ /* synthetic */ mhb create(wn5 wn5Var, lb2 lb2Var) {
                    return super.create(wn5Var, lb2Var);
                }
            };
        }

        public final ArticleViewModel create(whb whbVar, HelpCenterApi helpCenterApi, String str, String str2, boolean z, boolean z2, oh4<? super Integer, g2b> oh4Var, boolean z3) {
            whbVar.getClass();
            helpCenterApi.getClass();
            str.getClass();
            str2.getClass();
            oh4Var.getClass();
            ArticleViewModel$Companion$factory$1 articleViewModel$Companion$factory$1Factory = factory(helpCenterApi, str, str2, z, z2, oh4Var, z3);
            articleViewModel$Companion$factory$1Factory.getClass();
            vhb viewModelStore = whbVar.getViewModelStore();
            lb2 defaultViewModelCreationExtras = whbVar instanceof wt4 ? ((wt4) whbVar).getDefaultViewModelCreationExtras() : lb2.a.b;
            viewModelStore.getClass();
            defaultViewModelCreationExtras.getClass();
            uhb uhbVar = new uhb(viewModelStore, articleViewModel$Companion$factory$1Factory, defaultViewModelCreationExtras);
            sd1 sd1VarA = ll8.a(ArticleViewModel.class);
            String strE = sd1VarA.e();
            if (strE != null) {
                return (ArticleViewModel) uhbVar.a(sd1VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strE));
            }
            z90.a("Local and anonymous classes can not be ViewModels");
            return null;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ArticleViewModel(HelpCenterApi helpCenterApi, String str, AppConfig appConfig, MetricTracker metricTracker, String str2, boolean z, boolean z2, n72 n72Var, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository, oh4 oh4Var, boolean z3, int i, qq2 qq2Var) {
        z = (i & 32) != 0 ? false : z;
        z2 = (i & 64) != 0 ? false : z2;
        if ((i & 128) != 0) {
            et2 et2Var = i23.a;
            n72Var = wr2.v;
        }
        this(helpCenterApi, str, appConfig, metricTracker, str2, z, z2, n72Var, intercomDataLayer, commonRepository, oh4Var, (i & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? false : z3);
    }
}
