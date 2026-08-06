package io.intercom.android.sdk.m5.helpcenter;

import android.content.Context;
import android.content.res.Configuration;
import defpackage.a0a;
import defpackage.aa0;
import defpackage.am9;
import defpackage.b0a;
import defpackage.bw2;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.et2;
import defpackage.f37;
import defpackage.g2b;
import defpackage.i23;
import defpackage.i37;
import defpackage.lb2;
import defpackage.ll8;
import defpackage.mh4;
import defpackage.mhb;
import defpackage.n72;
import defpackage.nl2;
import defpackage.o7a;
import defpackage.of3;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.ph1;
import defpackage.qq2;
import defpackage.r02;
import defpackage.rhb;
import defpackage.sd1;
import defpackage.ss5;
import defpackage.t72;
import defpackage.th1;
import defpackage.thb;
import defpackage.ty1;
import defpackage.u;
import defpackage.u02;
import defpackage.uhb;
import defpackage.um9;
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
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.component.TeammateHelpKt;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterArticle;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent;
import io.intercom.android.sdk.helpcenter.utils.HelpCenterEligibilityChecker;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsRow;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionRowData;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsRow;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiEffects;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Space;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.utilities.ContextLocaliser;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterViewModel extends mhb {
    private final i37<CollectionDetailsUiState> _collectionDetailsState;
    private final i37<CollectionsUiState> _collectionsState;
    private final f37<CollectionsUiEffects> _effect;
    private final i37<NetworkResponse<OpenMessengerResponse>> _openState;
    private final AppConfig appConfig;
    private final zz9<CollectionDetailsUiState> collectionDetailsState;
    private final zz9<CollectionsUiState> collectionsState;
    private final CommonRepository commonRepository;
    private final n72 dispatcher;
    private final zl9<CollectionsUiEffects> effect;
    private final ErrorState.WithoutCTA genericError;
    private boolean hasClickedAtLeastOneArticle;
    private final HelpCenterApi helpCenterApi;
    private final HelpCenterEligibilityChecker helpCenterEligibilityChecker;
    private final IntercomDataLayer intercomDataLayer;
    private boolean isPartialHelpCenterLoaded;
    private final MetricTracker metricTracker;
    private final ErrorState.WithoutCTA notFoundError;
    private final zz9<NetworkResponse<OpenMessengerResponse>> openState;
    private final String place;
    private final ss5 searchBrowseTeamPresenceState$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$1", f = "HelpCenterViewModel.kt", l = {102}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        Object L$0;
        int label;

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return HelpCenterViewModel.this.new AnonymousClass1(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            i37 i37Var;
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                i37 i37Var2 = HelpCenterViewModel.this._openState;
                CommonRepository commonRepository = HelpCenterViewModel.this.commonRepository;
                this.L$0 = i37Var2;
                this.label = 1;
                Object objOpenMessenger = commonRepository.openMessenger(this);
                v72 v72Var = v72.t;
                if (objOpenMessenger == v72Var) {
                    return v72Var;
                }
                obj = objOpenMessenger;
                i37Var = i37Var2;
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i37Var = (i37) this.L$0;
                dv8.b(obj);
            }
            i37Var.setValue(obj);
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$2", f = "HelpCenterViewModel.kt", l = {105}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$2$1", f = "HelpCenterViewModel.kt", l = {106}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends p6a implements ci4<AppConfig, r02<? super g2b>, Object> {
            int label;
            final /* synthetic */ HelpCenterViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HelpCenterViewModel helpCenterViewModel, r02<? super AnonymousClass1> r02Var) {
                super(2, r02Var);
                this.this$0 = helpCenterViewModel;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return new AnonymousClass1(this.this$0, r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(AppConfig appConfig, r02<? super g2b> r02Var) {
                return ((AnonymousClass1) create(appConfig, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.label;
                if (i == 0) {
                    dv8.b(obj);
                    HelpCenterViewModel helpCenterViewModel = this.this$0;
                    this.label = 1;
                    Object objOnNewConfig = helpCenterViewModel.onNewConfig(this);
                    v72 v72Var = v72.t;
                    if (objOnNewConfig == v72Var) {
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

        public AnonymousClass2(r02<? super AnonymousClass2> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return HelpCenterViewModel.this.new AnonymousClass2(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass2) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                zz9<AppConfig> config = HelpCenterViewModel.this.intercomDataLayer.getConfig();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(HelpCenterViewModel.this, null);
                this.label = 1;
                Object objF = yk2.f(config, anonymousClass1, this);
                v72 v72Var = v72.t;
                if (objF == v72Var) {
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$fetchCollectionDetails$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$fetchCollectionDetails$1", f = "HelpCenterViewModel.kt", l = {255, 297}, m = "invokeSuspend")
    public static final class C03651 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ String $collectionId;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03651(String str, r02<? super C03651> r02Var) {
            super(2, r02Var);
            this.$collectionId = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invokeSuspend$lambda$0(HelpCenterViewModel helpCenterViewModel, String str) {
            helpCenterViewModel.fetchCollectionDetails(str);
            return g2b.a;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return HelpCenterViewModel.this.new C03651(this.$collectionId, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03651) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            C03651 c03651;
            i37 i37Var;
            HelpCenterCollectionContent helpCenterCollectionContent;
            List list;
            i37 i37Var2;
            HelpCenterCollectionContent helpCenterCollectionContent2;
            List list2;
            CollectionDetailsUiState error;
            List list3;
            int i = this.label;
            v72 v72Var = v72.t;
            if (i == 0) {
                dv8.b(obj);
                CollectionDetailsUiState value = HelpCenterViewModel.this.getCollectionDetailsState().getValue();
                if ((value instanceof CollectionDetailsUiState.Content) && xj5.a(((CollectionDetailsUiState.Content) value).getId(), this.$collectionId)) {
                    return g2b.a;
                }
                HelpCenterViewModel.this._collectionDetailsState.setValue(CollectionDetailsUiState.Loading.INSTANCE);
                HelpCenterApi helpCenterApi = HelpCenterViewModel.this.helpCenterApi;
                String str = this.$collectionId;
                this.label = 1;
                c03651 = this;
                obj = HelpCenterApi.DefaultImpls.fetchCollectionDetails$default(helpCenterApi, str, null, c03651, 2, null);
                if (obj != v72Var) {
                }
                return v72Var;
            }
            if (i == 1) {
                dv8.b(obj);
                c03651 = this;
            } else {
                if (i != 2) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list4 = (List) this.L$3;
                i37Var2 = (i37) this.L$2;
                List list5 = (List) this.L$1;
                helpCenterCollectionContent2 = (HelpCenterCollectionContent) this.L$0;
                dv8.b(obj);
                list3 = list4;
                list2 = list5;
            }
            list3.add(new CollectionDetailsRow.SendMessageRow((ArticleViewState.TeamPresenceState) obj));
            helpCenterCollectionContent = helpCenterCollectionContent2;
            i37Var = i37Var2;
            list = list2;
            error = new CollectionDetailsUiState.Content(helpCenterCollectionContent.getCollectionId(), helpCenterCollectionContent.getTitle(), helpCenterCollectionContent.getSummary(), helpCenterCollectionContent.getArticlesCount(), helpCenterCollectionContent.getAuthors(), list);
            i37Var.setValue(error);
            return g2b.a;
            NetworkResponse networkResponse = (NetworkResponse) obj;
            i37Var = HelpCenterViewModel.this._collectionDetailsState;
            if (networkResponse instanceof NetworkResponse.ServerError) {
                NetworkResponse.ServerError serverError = (NetworkResponse.ServerError) networkResponse;
                HelpCenterViewModel.this.sendFailedSingleCollectionMetric(new Integer(serverError.getCode()));
                int code = serverError.getCode();
                HelpCenterViewModel helpCenterViewModel = HelpCenterViewModel.this;
                error = code == 404 ? new CollectionDetailsUiState.Error(helpCenterViewModel.notFoundError) : new CollectionDetailsUiState.Error(helpCenterViewModel.genericError);
            } else if (networkResponse instanceof NetworkResponse.ClientError) {
                HelpCenterViewModel.sendFailedSingleCollectionMetric$default(HelpCenterViewModel.this, null, 1, null);
                error = new CollectionDetailsUiState.Error(HelpCenterViewModel.this.genericError);
            } else if (networkResponse instanceof NetworkResponse.NetworkError) {
                HelpCenterViewModel.sendFailedSingleCollectionMetric$default(HelpCenterViewModel.this, null, 1, null);
                final HelpCenterViewModel helpCenterViewModel2 = HelpCenterViewModel.this;
                final String str2 = c03651.$collectionId;
                error = new CollectionDetailsUiState.Error(helpCenterViewModel2.errorWithRetry(new mh4() { // from class: io.intercom.android.sdk.m5.helpcenter.a
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return HelpCenterViewModel.C03651.invokeSuspend$lambda$0(helpCenterViewModel2, str2);
                    }
                }));
            } else {
                if (!(networkResponse instanceof NetworkResponse.Success)) {
                    u.b();
                    return null;
                }
                helpCenterCollectionContent = (HelpCenterCollectionContent) ((NetworkResponse.Success) networkResponse).getBody();
                ArrayList arrayListU = th1.U(HelpCenterViewModel.this.transformToUiModel(helpCenterCollectionContent));
                if (HelpCenterViewModel.this.isPartialHelpCenterLoaded) {
                    arrayListU.add(CollectionDetailsRow.FullHelpCenterRow.INSTANCE);
                }
                HelpCenterViewModel.this.metricTracker.viewedNativeHelpCenter(MetricTracker.Place.ARTICLE_LIST, Boolean.valueOf(HelpCenterViewModel.this.isPartialHelpCenterLoaded), HelpCenterViewModel.this.isFromSearchBrowse());
                if (HelpCenterViewModel.this.shouldAddSendMessageRow()) {
                    HelpCenterViewModel helpCenterViewModel3 = HelpCenterViewModel.this;
                    c03651.L$0 = helpCenterCollectionContent;
                    c03651.L$1 = arrayListU;
                    c03651.L$2 = i37Var;
                    c03651.L$3 = arrayListU;
                    c03651.label = 2;
                    Object ctaData = helpCenterViewModel3.getCtaData(c03651);
                    if (ctaData != v72Var) {
                        i37Var2 = i37Var;
                        helpCenterCollectionContent2 = helpCenterCollectionContent;
                        obj = ctaData;
                        list2 = arrayListU;
                        list3 = arrayListU;
                        list3.add(new CollectionDetailsRow.SendMessageRow((ArticleViewState.TeamPresenceState) obj));
                        helpCenterCollectionContent = helpCenterCollectionContent2;
                        i37Var = i37Var2;
                        list = list2;
                    }
                    return v72Var;
                }
                list = arrayListU;
                error = new CollectionDetailsUiState.Content(helpCenterCollectionContent.getCollectionId(), helpCenterCollectionContent.getTitle(), helpCenterCollectionContent.getSummary(), helpCenterCollectionContent.getArticlesCount(), helpCenterCollectionContent.getAuthors(), list);
            }
            i37Var.setValue(error);
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$fetchCollections$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$fetchCollections$1", f = "HelpCenterViewModel.kt", l = {138, 177, 187, 210}, m = "invokeSuspend")
    public static final class C03661 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ Set<String> $collectionIds;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03661(Set<String> set, r02<? super C03661> r02Var) {
            super(2, r02Var);
            this.$collectionIds = set;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invokeSuspend$lambda$0(HelpCenterViewModel helpCenterViewModel, Set set) {
            helpCenterViewModel.fetchCollections(set);
            return g2b.a;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return HelpCenterViewModel.this.new C03661(this.$collectionIds, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03661) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x0166, code lost:
        
            if (r12.emit(r1, r11) == r6) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0190, code lost:
        
            if (r1.emit(r3, r11) == r6) goto L77;
         */
        @Override // defpackage.ak0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 522
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel.C03661.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$getCtaData$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel", f = "HelpCenterViewModel.kt", l = {401}, m = "getCtaData")
    public static final class C03671 extends u02 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C03671(r02<? super C03671> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HelpCenterViewModel.this.getCtaData(this);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$onArticleClicked$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$onArticleClicked$1", f = "HelpCenterViewModel.kt", l = {323, 326, 331}, m = "invokeSuspend")
    public static final class C03681 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public C03681(r02<? super C03681> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return HelpCenterViewModel.this.new C03681(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03681) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code duplicated, block: B:46:0x00d5 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:50:0x00ec  */
        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            CollectionDetailsUiState.Content content;
            CollectionsUiState.Content content2;
            int i;
            int i2;
            CollectionDetailsUiState.Content content3;
            i37 i37Var;
            i37 i37Var2;
            CollectionsUiState.Content content4;
            int i3 = this.label;
            v72 v72Var = v72.t;
            if (i3 == 0) {
                dv8.b(obj);
                HelpCenterViewModel.this.hasClickedAtLeastOneArticle = true;
                if (HelpCenterViewModel.this.shouldAddSendMessageRow()) {
                    Object value = HelpCenterViewModel.this._collectionDetailsState.getValue();
                    content = value instanceof CollectionDetailsUiState.Content ? (CollectionDetailsUiState.Content) value : null;
                    Object value2 = HelpCenterViewModel.this._collectionsState.getValue();
                    CollectionsUiState.Content content5 = value2 instanceof CollectionsUiState.Content ? (CollectionsUiState.Content) value2 : null;
                    int i4 = 0;
                    int i5 = (content == null || content.hasSendMessageRow()) ? 0 : 1;
                    if (content5 != null && !content5.hasSendMessageRow()) {
                        i4 = 1;
                    }
                    if (i5 != 0 || i4 != 0) {
                        this.L$0 = content;
                        this.L$1 = content5;
                        this.I$0 = i5;
                        this.I$1 = i4;
                        this.label = 1;
                        if (bw2.b(2000L, this) != v72Var) {
                            int i6 = i4;
                            content2 = content5;
                            i = i6;
                            i2 = i5;
                        }
                        return v72Var;
                    }
                }
                return g2b.a;
            }
            if (i3 == 1) {
                i = this.I$1;
                i2 = this.I$0;
                content2 = (CollectionsUiState.Content) this.L$1;
                CollectionDetailsUiState.Content content6 = (CollectionDetailsUiState.Content) this.L$0;
                dv8.b(obj);
                content = content6;
            } else {
                if (i3 == 2) {
                    i = this.I$0;
                    i37Var = (i37) this.L$2;
                    content3 = (CollectionDetailsUiState.Content) this.L$1;
                    content2 = (CollectionsUiState.Content) this.L$0;
                    dv8.b(obj);
                    i37Var.setValue(content3.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj));
                    if (i != 0 && content2 != null) {
                        HelpCenterViewModel helpCenterViewModel = HelpCenterViewModel.this;
                        i37Var2 = helpCenterViewModel._collectionsState;
                        this.L$0 = content2;
                        this.L$1 = i37Var2;
                        this.L$2 = null;
                        this.label = 3;
                        obj = helpCenterViewModel.getCtaData(this);
                        if (obj != v72Var) {
                            content4 = content2;
                        }
                        return v72Var;
                    }
                    return g2b.a;
                }
                if (i3 != 3) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i37Var2 = (i37) this.L$1;
                content4 = (CollectionsUiState.Content) this.L$0;
                dv8.b(obj);
            }
            i37Var2.setValue(content4.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj));
            return g2b.a;
            if (i2 == 0 || content == null) {
                if (i != 0) {
                    HelpCenterViewModel helpCenterViewModel2 = HelpCenterViewModel.this;
                    i37Var2 = helpCenterViewModel2._collectionsState;
                    this.L$0 = content2;
                    this.L$1 = i37Var2;
                    this.L$2 = null;
                    this.label = 3;
                    obj = helpCenterViewModel2.getCtaData(this);
                    if (obj != v72Var) {
                        content4 = content2;
                        i37Var2.setValue(content4.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj));
                    }
                }
                return g2b.a;
            }
            HelpCenterViewModel helpCenterViewModel3 = HelpCenterViewModel.this;
            i37 i37Var3 = helpCenterViewModel3._collectionDetailsState;
            this.L$0 = content2;
            this.L$1 = content;
            this.L$2 = i37Var3;
            this.I$0 = i;
            this.label = 2;
            Object ctaData = helpCenterViewModel3.getCtaData(this);
            if (ctaData != v72Var) {
                content3 = content;
                obj = ctaData;
                i37Var = i37Var3;
                i37Var.setValue(content3.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj));
                if (i != 0) {
                    HelpCenterViewModel helpCenterViewModel4 = HelpCenterViewModel.this;
                    i37Var2 = helpCenterViewModel4._collectionsState;
                    this.L$0 = content2;
                    this.L$1 = i37Var2;
                    this.L$2 = null;
                    this.label = 3;
                    obj = helpCenterViewModel4.getCtaData(this);
                    if (obj != v72Var) {
                        content4 = content2;
                        i37Var2.setValue(content4.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj));
                    }
                }
                return g2b.a;
            }
            return v72Var;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$onNewConfig$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel", f = "HelpCenterViewModel.kt", l = {383, 391}, m = "onNewConfig")
    public static final class C03691 extends u02 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C03691(r02<? super C03691> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HelpCenterViewModel.this.onNewConfig(this);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$onRetryOpen$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$onRetryOpen$1", f = "HelpCenterViewModel.kt", l = {114}, m = "invokeSuspend")
    public static final class C03701 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        Object L$0;
        int label;

        public C03701(r02<? super C03701> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return HelpCenterViewModel.this.new C03701(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03701) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            i37 i37Var;
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                i37 i37Var2 = HelpCenterViewModel.this._openState;
                CommonRepository commonRepository = HelpCenterViewModel.this.commonRepository;
                this.L$0 = i37Var2;
                this.label = 1;
                Object objOpenMessenger = commonRepository.openMessenger(this);
                v72 v72Var = v72.t;
                if (objOpenMessenger == v72Var) {
                    return v72Var;
                }
                obj = objOpenMessenger;
                i37Var = i37Var2;
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i37Var = (i37) this.L$0;
                dv8.b(obj);
            }
            i37Var.setValue(obj);
            return g2b.a;
        }
    }

    public HelpCenterViewModel(HelpCenterApi helpCenterApi, AppConfig appConfig, MetricTracker metricTracker, String str, HelpCenterEligibilityChecker helpCenterEligibilityChecker, n72 n72Var, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository) {
        helpCenterApi.getClass();
        appConfig.getClass();
        metricTracker.getClass();
        str.getClass();
        helpCenterEligibilityChecker.getClass();
        n72Var.getClass();
        intercomDataLayer.getClass();
        commonRepository.getClass();
        this.helpCenterApi = helpCenterApi;
        this.appConfig = appConfig;
        this.metricTracker = metricTracker;
        this.place = str;
        this.helpCenterEligibilityChecker = helpCenterEligibilityChecker;
        this.dispatcher = n72Var;
        this.intercomDataLayer = intercomDataLayer;
        this.commonRepository = commonRepository;
        a0a a0aVarB = b0a.b(CollectionsUiState.Initial.INSTANCE);
        this._collectionsState = a0aVarB;
        this.collectionsState = yk2.b(a0aVarB);
        a0a a0aVarB2 = b0a.b(CollectionDetailsUiState.Initial.INSTANCE);
        this._collectionDetailsState = a0aVarB2;
        this.collectionDetailsState = yk2.b(a0aVarB2);
        a0a a0aVarB3 = b0a.b(null);
        this._openState = a0aVarB3;
        this.openState = yk2.b(a0aVarB3);
        am9 am9VarB = ty1.b(7, null);
        this._effect = am9VarB;
        this.effect = yk2.s(am9VarB, rhb.b(this), um9.a.a, 0);
        this.genericError = new ErrorState.WithoutCTA(0, 0, null, 7, null);
        this.notFoundError = new ErrorState.WithoutCTA(0, R.string.intercom_page_not_found, null, 5, null);
        this.searchBrowseTeamPresenceState$delegate = new o7a(new nl2(1, this));
        if (str.length() > 0) {
            metricTracker.openedNativeHelpCenter(str, null);
        }
        oy0.d(rhb.b(this), n72Var, null, new AnonymousClass1(null), 2);
        oy0.d(rhb.b(this), null, null, new AnonymousClass2(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ErrorState.WithCTA errorWithRetry(mh4<g2b> mh4Var) {
        return new ErrorState.WithCTA(0, 0, null, 0, mh4Var, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchCollections$default(HelpCenterViewModel helpCenterViewModel, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            set = of3.t;
        }
        helpCenterViewModel.fetchCollections(set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getCtaData(r02<? super ArticleViewState.TeamPresenceState> r02Var) throws Throwable {
        C03671 c03671;
        if (r02Var instanceof C03671) {
            c03671 = (C03671) r02Var;
            int i = c03671.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c03671.label = i - Integer.MIN_VALUE;
            } else {
                c03671 = new C03671(r02Var);
            }
        } else {
            c03671 = new C03671(r02Var);
        }
        Object objOpenMessenger = c03671.result;
        int i2 = c03671.label;
        if (i2 == 0) {
            dv8.b(objOpenMessenger);
            CommonRepository commonRepository = this.commonRepository;
            c03671.L$0 = this;
            c03671.label = 1;
            objOpenMessenger = commonRepository.openMessenger(c03671);
            v72 v72Var = v72.t;
            if (objOpenMessenger == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = (HelpCenterViewModel) c03671.L$0;
            dv8.b(objOpenMessenger);
        }
        NetworkResponse networkResponse = (NetworkResponse) objOpenMessenger;
        if (!(networkResponse instanceof NetworkResponse.Success)) {
            return this.getSearchBrowseTeamPresenceState();
        }
        OpenMessengerResponse.NewConversationData newConversationData = ((OpenMessengerResponse) ((NetworkResponse.Success) networkResponse).getBody()).getNewConversationData();
        return newConversationData == null ? this.getSearchBrowseTeamPresenceState() : ArticleViewState.TeamPresenceState.copy$default(this.getSearchBrowseTeamPresenceState(), null, null, null, 0, 0, 0, null, null, false, newConversationData.getCta(), 511, null);
    }

    private final ArticleViewState.TeamPresenceState getSearchBrowseTeamPresenceState() {
        return (ArticleViewState.TeamPresenceState) this.searchBrowseTeamPresenceState$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFromSearchBrowse() {
        return xj5.a(this.place, "search_browse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x0095  */
    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object onNewConfig(r02<? super g2b> r02Var) throws Throwable {
        C03691 c03691;
        i37<CollectionsUiState> i37Var;
        HelpCenterViewModel helpCenterViewModel;
        CollectionsUiState.Content contentCopyWithoutSendMessageRow;
        CollectionsUiState.Content content;
        CollectionDetailsUiState value;
        i37<CollectionDetailsUiState> i37Var2;
        CollectionDetailsUiState.Content contentCopyWithoutSendMessageRow2;
        CollectionDetailsUiState.Content content2;
        Object ctaData;
        CollectionDetailsUiState.Content content3;
        i37<CollectionDetailsUiState> i37Var3;
        if (r02Var instanceof C03691) {
            c03691 = (C03691) r02Var;
            int i = c03691.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c03691.label = i - Integer.MIN_VALUE;
            } else {
                c03691 = new C03691(r02Var);
            }
        } else {
            c03691 = new C03691(r02Var);
        }
        Object obj = c03691.result;
        int i2 = c03691.label;
        v72 v72Var = v72.t;
        if (i2 != 0) {
            if (i2 == 1) {
                content = (CollectionsUiState.Content) c03691.L$2;
                i37Var = (i37) c03691.L$1;
                helpCenterViewModel = (HelpCenterViewModel) c03691.L$0;
                dv8.b(obj);
            } else {
                if (i2 != 2) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                content3 = (CollectionDetailsUiState.Content) c03691.L$1;
                i37Var3 = (i37) c03691.L$0;
                dv8.b(obj);
            }
            contentCopyWithoutSendMessageRow2 = content3.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj);
            i37Var2 = i37Var3;
            i37Var2.setValue(contentCopyWithoutSendMessageRow2);
            return g2b.a;
        }
        dv8.b(obj);
        CollectionsUiState value2 = this._collectionsState.getValue();
        if (!(value2 instanceof CollectionsUiState.Content)) {
            value = this._collectionDetailsState.getValue();
            if (value instanceof CollectionDetailsUiState.Content) {
                i37Var2 = this._collectionDetailsState;
                if (this.shouldAddSendMessageRow()) {
                    content2 = (CollectionDetailsUiState.Content) value;
                    c03691.L$0 = i37Var2;
                    c03691.L$1 = content2;
                    c03691.L$2 = null;
                    c03691.label = 2;
                    ctaData = this.getCtaData(c03691);
                    if (ctaData != v72Var) {
                        obj = ctaData;
                        content3 = content2;
                        i37Var3 = i37Var2;
                        contentCopyWithoutSendMessageRow2 = content3.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj);
                        i37Var2 = i37Var3;
                    }
                } else {
                    contentCopyWithoutSendMessageRow2 = ((CollectionDetailsUiState.Content) value).copyWithoutSendMessageRow();
                }
                i37Var2.setValue(contentCopyWithoutSendMessageRow2);
            }
            return g2b.a;
        }
        i37Var = this._collectionsState;
        if (!shouldAddSendMessageRow()) {
            helpCenterViewModel = this;
            contentCopyWithoutSendMessageRow = ((CollectionsUiState.Content) value2).copyWithoutSendMessageRow();
            i37Var.setValue(contentCopyWithoutSendMessageRow);
            this = helpCenterViewModel;
            value = this._collectionDetailsState.getValue();
            if (value instanceof CollectionDetailsUiState.Content) {
                i37Var2 = this._collectionDetailsState;
                if (this.shouldAddSendMessageRow()) {
                    content2 = (CollectionDetailsUiState.Content) value;
                    c03691.L$0 = i37Var2;
                    c03691.L$1 = content2;
                    c03691.L$2 = null;
                    c03691.label = 2;
                    ctaData = this.getCtaData(c03691);
                    if (ctaData != v72Var) {
                        obj = ctaData;
                        content3 = content2;
                        i37Var3 = i37Var2;
                        contentCopyWithoutSendMessageRow2 = content3.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj);
                        i37Var2 = i37Var3;
                    }
                } else {
                    contentCopyWithoutSendMessageRow2 = ((CollectionDetailsUiState.Content) value).copyWithoutSendMessageRow();
                }
                i37Var2.setValue(contentCopyWithoutSendMessageRow2);
            }
            return g2b.a;
        }
        CollectionsUiState.Content content4 = (CollectionsUiState.Content) value2;
        c03691.L$0 = this;
        c03691.L$1 = i37Var;
        c03691.L$2 = content4;
        c03691.label = 1;
        Object ctaData2 = getCtaData(c03691);
        if (ctaData2 != v72Var) {
            helpCenterViewModel = this;
            content = content4;
            obj = ctaData2;
        }
        return v72Var;
        contentCopyWithoutSendMessageRow = content.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj);
        i37Var.setValue(contentCopyWithoutSendMessageRow);
        this = helpCenterViewModel;
        value = this._collectionDetailsState.getValue();
        if (value instanceof CollectionDetailsUiState.Content) {
            i37Var2 = this._collectionDetailsState;
            if (this.shouldAddSendMessageRow()) {
                content2 = (CollectionDetailsUiState.Content) value;
                c03691.L$0 = i37Var2;
                c03691.L$1 = content2;
                c03691.L$2 = null;
                c03691.label = 2;
                ctaData = this.getCtaData(c03691);
                if (ctaData != v72Var) {
                    obj = ctaData;
                    content3 = content2;
                    i37Var3 = i37Var2;
                    contentCopyWithoutSendMessageRow2 = content3.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj);
                    i37Var2 = i37Var3;
                }
                return v72Var;
            }
            contentCopyWithoutSendMessageRow2 = ((CollectionDetailsUiState.Content) value).copyWithoutSendMessageRow();
            i37Var2.setValue(contentCopyWithoutSendMessageRow2);
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleViewState.TeamPresenceState searchBrowseTeamPresenceState_delegate$lambda$0(HelpCenterViewModel helpCenterViewModel) {
        return TeammateHelpKt.computeViewState(null, ArticleViewState.TeamPresenceState.Companion.getDefaultTeamPresenceState(), helpCenterViewModel.appConfig, helpCenterViewModel.place, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendFailedCollectionListMetric(Integer num) {
        this.metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER, MetricTracker.Place.COLLECTION_LIST, num != null ? num.toString() : null, isFromSearchBrowse());
    }

    public static /* synthetic */ void sendFailedCollectionListMetric$default(HelpCenterViewModel helpCenterViewModel, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        helpCenterViewModel.sendFailedCollectionListMetric(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendFailedSingleCollectionMetric(Integer num) {
        this.metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER, MetricTracker.Place.ARTICLE_LIST, num != null ? num.toString() : null, isFromSearchBrowse());
    }

    public static /* synthetic */ void sendFailedSingleCollectionMetric$default(HelpCenterViewModel helpCenterViewModel, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        helpCenterViewModel.sendFailedSingleCollectionMetric(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldAddSendMessageRow() {
        return AppConfigExtensionsKt.canStartNewConversation(this.appConfig) && this.hasClickedAtLeastOneArticle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CollectionDetailsRow> transformToUiModel(HelpCenterCollectionContent helpCenterCollectionContent) {
        ArrayList arrayList = new ArrayList();
        List<HelpCenterArticle> helpCenterArticles = helpCenterCollectionContent.getHelpCenterArticles();
        ArrayList arrayList2 = new ArrayList(ph1.n(helpCenterArticles, 10));
        for (HelpCenterArticle helpCenterArticle : helpCenterArticles) {
            arrayList2.add(new CollectionDetailsRow.ArticleRow(helpCenterArticle.getArticleId(), helpCenterArticle.getTitle()));
        }
        arrayList.addAll(arrayList2);
        List<HelpCenterCollection> subCollections = helpCenterCollectionContent.getSubCollections();
        ArrayList arrayList3 = new ArrayList(ph1.n(subCollections, 10));
        for (HelpCenterCollection helpCenterCollection : subCollections) {
            arrayList3.add(new CollectionDetailsRow.CollectionRow(new CollectionRowData(helpCenterCollection.getId(), helpCenterCollection.getTitle(), helpCenterCollection.getSummary().length() == 0 ? 8 : 0, helpCenterCollection.getSummary(), helpCenterCollection.getArticlesCount(), helpCenterCollection.getCollectionsCount())));
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    public final void fetchCollectionDetails(String str) {
        str.getClass();
        oy0.d(rhb.b(this), this.dispatcher, null, new C03651(str, null), 2);
    }

    public final void fetchCollections(Set<String> set) {
        set.getClass();
        if (this.helpCenterEligibilityChecker.isEligibleUser()) {
            oy0.d(rhb.b(this), this.dispatcher, null, new C03661(set, null), 2);
        } else {
            this._collectionsState.setValue(new CollectionsUiState.Error(this.genericError));
        }
    }

    public final zz9<CollectionDetailsUiState> getCollectionDetailsState() {
        return this.collectionDetailsState;
    }

    public final zz9<CollectionsUiState> getCollectionsState() {
        return this.collectionsState;
    }

    public final zl9<CollectionsUiEffects> getEffect() {
        return this.effect;
    }

    public final zz9<NetworkResponse<OpenMessengerResponse>> getOpenState() {
        return this.openState;
    }

    public final StringProvider getScreenTitle() {
        String spaceLabelIfExists = this.appConfig.getSpaceLabelIfExists(Space.Type.HELP);
        return spaceLabelIfExists != null ? new StringProvider.ActualString(spaceLabelIfExists) : new StringProvider.StringRes(R.string.intercom_get_help, null, 2, null);
    }

    public final Context localizedContext(Context context) {
        context.getClass();
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(ContextLocaliser.convertToLocale(this.appConfig.getHelpCenterLocale()));
        Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
        contextCreateConfigurationContext.getClass();
        return contextCreateConfigurationContext;
    }

    public final void onArticleClicked() {
        oy0.d(rhb.b(this), this.dispatcher, null, new C03681(null), 2);
    }

    public final void onRetryOpen() {
        this._openState.setValue(null);
        oy0.d(rhb.b(this), this.dispatcher, null, new C03701(null), 2);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$Companion$factory$1] */
        private final HelpCenterViewModel$Companion$factory$1 factory(final HelpCenterApi helpCenterApi, final String str) {
            return new thb.c() { // from class: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$Companion$factory$1
                @Override // thb.c
                public <T extends mhb> T create(Class<T> cls) {
                    cls.getClass();
                    IntercomDataLayer dataLayer = Injector.get().getDataLayer();
                    HelpCenterApi helpCenterApi2 = helpCenterApi;
                    AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                    appConfig.getClass();
                    AppConfig appConfig2 = appConfig;
                    MetricTracker metricTracker = Injector.get().getMetricTracker();
                    metricTracker.getClass();
                    String str2 = str;
                    dataLayer.getClass();
                    MessengerApi messengerApi = Injector.get().getMessengerApi();
                    messengerApi.getClass();
                    return new HelpCenterViewModel(helpCenterApi2, appConfig2, metricTracker, str2, null, null, dataLayer, new CommonRepository(messengerApi, dataLayer), 48, null);
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

        public final HelpCenterViewModel create(whb whbVar, HelpCenterApi helpCenterApi, String str) {
            whbVar.getClass();
            helpCenterApi.getClass();
            str.getClass();
            HelpCenterViewModel$Companion$factory$1 helpCenterViewModel$Companion$factory$1Factory = factory(helpCenterApi, str);
            helpCenterViewModel$Companion$factory$1Factory.getClass();
            vhb viewModelStore = whbVar.getViewModelStore();
            lb2 defaultViewModelCreationExtras = whbVar instanceof wt4 ? ((wt4) whbVar).getDefaultViewModelCreationExtras() : lb2.a.b;
            viewModelStore.getClass();
            defaultViewModelCreationExtras.getClass();
            uhb uhbVar = new uhb(viewModelStore, helpCenterViewModel$Companion$factory$1Factory, defaultViewModelCreationExtras);
            sd1 sd1VarA = ll8.a(HelpCenterViewModel.class);
            String strE = sd1VarA.e();
            if (strE != null) {
                return (HelpCenterViewModel) uhbVar.a(sd1VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strE));
            }
            z90.a("Local and anonymous classes can not be ViewModels");
            return null;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CollectionsRow.CollectionRow> transformToUiModel(List<HelpCenterCollection> list) {
        ArrayList arrayList = new ArrayList(ph1.n(list, 10));
        for (HelpCenterCollection helpCenterCollection : list) {
            arrayList.add(new CollectionsRow.CollectionRow(new CollectionRowData(helpCenterCollection.getId(), helpCenterCollection.getTitle(), helpCenterCollection.getSummary().length() == 0 ? 8 : 0, helpCenterCollection.getSummary(), helpCenterCollection.getArticlesCount(), helpCenterCollection.getCollectionsCount())));
        }
        return arrayList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HelpCenterViewModel(HelpCenterApi helpCenterApi, AppConfig appConfig, MetricTracker metricTracker, String str, HelpCenterEligibilityChecker helpCenterEligibilityChecker, n72 n72Var, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository, int i, qq2 qq2Var) {
        n72 n72Var2;
        HelpCenterEligibilityChecker helpCenterEligibilityChecker2 = (i & 16) != 0 ? HelpCenterEligibilityChecker.INSTANCE : helpCenterEligibilityChecker;
        if ((i & 32) != 0) {
            et2 et2Var = i23.a;
            n72Var2 = wr2.v;
        } else {
            n72Var2 = n72Var;
        }
        this(helpCenterApi, appConfig, metricTracker, str, helpCenterEligibilityChecker2, n72Var2, intercomDataLayer, commonRepository);
    }
}
