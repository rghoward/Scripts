package io.intercom.android.sdk.helpcenter.api;

import com.intercom.twig.BuildConfig;
import defpackage.aa0;
import defpackage.ci4;
import defpackage.dn4;
import defpackage.dv8;
import defpackage.et2;
import defpackage.g2b;
import defpackage.i23;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.ph1;
import defpackage.r02;
import defpackage.t72;
import defpackage.u;
import defpackage.w2a;
import defpackage.wr2;
import defpackage.xm2;
import io.ably.lib.util.Log;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.search.HelpCenterArticleSearchResponse;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterApiWrapper {
    public static final int $stable = 0;
    public static final HelpCenterApiWrapper INSTANCE = new HelpCenterApiWrapper();

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollection$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollection$1", f = "HelpCenterApiWrapper.kt", l = {98, Log.NONE}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ CollectionContentRequestCallback $collectionContentRequestCallback;
        final /* synthetic */ String $collectionId;
        final /* synthetic */ MetricTracker $metricTracker;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollection$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollection$1$1", f = "HelpCenterApiWrapper.kt", l = {}, m = "invokeSuspend")
        public static final class C01221 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
            final /* synthetic */ CollectionContentRequestCallback $collectionContentRequestCallback;
            final /* synthetic */ NetworkResponse<HelpCenterCollectionContent> $fetchSectionsListResponse;
            final /* synthetic */ MetricTracker $metricTracker;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01221(NetworkResponse<HelpCenterCollectionContent> networkResponse, MetricTracker metricTracker, CollectionContentRequestCallback collectionContentRequestCallback, r02<? super C01221> r02Var) {
                super(2, r02Var);
                this.$fetchSectionsListResponse = networkResponse;
                this.$metricTracker = metricTracker;
                this.$collectionContentRequestCallback = collectionContentRequestCallback;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return new C01221(this.$fetchSectionsListResponse, this.$metricTracker, this.$collectionContentRequestCallback, r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                return ((C01221) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                if (this.label != 0) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                NetworkResponse<HelpCenterCollectionContent> networkResponse = this.$fetchSectionsListResponse;
                if (networkResponse instanceof NetworkResponse.ServerError) {
                    this.$metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER_DATA_API, MetricTracker.Place.ARTICLE_LIST, String.valueOf(((NetworkResponse.ServerError) networkResponse).getCode()), false);
                    this.$collectionContentRequestCallback.onError(((NetworkResponse.ServerError) this.$fetchSectionsListResponse).getCode());
                } else if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError)) {
                    this.$metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER_DATA_API, MetricTracker.Place.ARTICLE_LIST, null, false);
                    this.$collectionContentRequestCallback.onFailure();
                } else {
                    if (!(networkResponse instanceof NetworkResponse.Success)) {
                        u.b();
                        return null;
                    }
                    this.$collectionContentRequestCallback.onComplete((HelpCenterCollectionContent) ((NetworkResponse.Success) networkResponse).getBody());
                }
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MetricTracker metricTracker, String str, CollectionContentRequestCallback collectionContentRequestCallback, r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
            this.$metricTracker = metricTracker;
            this.$collectionId = str;
            this.$collectionContentRequestCallback = collectionContentRequestCallback;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new AnonymousClass1(this.$metricTracker, this.$collectionId, this.$collectionContentRequestCallback, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
        
            if (defpackage.oy0.g(r11, r0, r8) == r4) goto L15;
         */
        @Override // defpackage.ak0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                int r0 = r11.label
                r1 = 0
                r2 = 2
                r3 = 1
                v72 r4 = defpackage.v72.t
                if (r0 == 0) goto L1c
                if (r0 == r3) goto L17
                if (r0 != r2) goto L11
                defpackage.dv8.b(r12)
                goto L55
            L11:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r11)
                return r1
            L17:
                defpackage.dv8.b(r12)
                r8 = r11
                goto L3d
            L1c:
                defpackage.dv8.b(r12)
                io.intercom.android.sdk.metrics.MetricTracker r12 = r11.$metricTracker
                java.lang.String r0 = "article_list"
                r12.requestedHelpCenterData(r0)
                io.intercom.android.sdk.Injector r12 = io.intercom.android.sdk.Injector.get()
                io.intercom.android.sdk.helpcenter.api.HelpCenterApi r5 = r12.getHelpCenterApi()
                java.lang.String r6 = r11.$collectionId
                r11.label = r3
                r7 = 0
                r9 = 2
                r10 = 0
                r8 = r11
                java.lang.Object r12 = io.intercom.android.sdk.helpcenter.api.HelpCenterApi.DefaultImpls.fetchCollectionDetails$default(r5, r6, r7, r8, r9, r10)
                if (r12 != r4) goto L3d
                goto L54
            L3d:
                io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r12 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r12
                et2 r11 = defpackage.i23.a
                ht4 r11 = defpackage.ag6.a
                io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollection$1$1 r0 = new io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollection$1$1
                io.intercom.android.sdk.metrics.MetricTracker r3 = r8.$metricTracker
                io.intercom.android.sdk.helpcenter.api.CollectionContentRequestCallback r5 = r8.$collectionContentRequestCallback
                r0.<init>(r12, r3, r5, r1)
                r8.label = r2
                java.lang.Object r11 = defpackage.oy0.g(r11, r0, r8)
                if (r11 != r4) goto L55
            L54:
                return r4
            L55:
                g2b r11 = defpackage.g2b.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollections$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollections$1", f = "HelpCenterApiWrapper.kt", l = {23, 24}, m = "invokeSuspend")
    public static final class C03121 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ CollectionRequestCallback $collectionRequestCallback;
        final /* synthetic */ MetricTracker $metricTracker;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollections$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollections$1$1", f = "HelpCenterApiWrapper.kt", l = {}, m = "invokeSuspend")
        public static final class C01231 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
            final /* synthetic */ CollectionRequestCallback $collectionRequestCallback;
            final /* synthetic */ NetworkResponse<List<HelpCenterCollection>> $fetchCollectionListResponse;
            final /* synthetic */ MetricTracker $metricTracker;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C01231(NetworkResponse<? extends List<HelpCenterCollection>> networkResponse, MetricTracker metricTracker, CollectionRequestCallback collectionRequestCallback, r02<? super C01231> r02Var) {
                super(2, r02Var);
                this.$fetchCollectionListResponse = networkResponse;
                this.$metricTracker = metricTracker;
                this.$collectionRequestCallback = collectionRequestCallback;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return new C01231(this.$fetchCollectionListResponse, this.$metricTracker, this.$collectionRequestCallback, r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                return ((C01231) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                if (this.label != 0) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                NetworkResponse<List<HelpCenterCollection>> networkResponse = this.$fetchCollectionListResponse;
                if (networkResponse instanceof NetworkResponse.ServerError) {
                    this.$metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER_DATA_API, MetricTracker.Place.COLLECTION_LIST, String.valueOf(((NetworkResponse.ServerError) networkResponse).getCode()), false);
                    this.$collectionRequestCallback.onError(((NetworkResponse.ServerError) this.$fetchCollectionListResponse).getCode());
                } else if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError)) {
                    this.$metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER_DATA_API, MetricTracker.Place.COLLECTION_LIST, null, false);
                    this.$collectionRequestCallback.onFailure();
                } else {
                    if (!(networkResponse instanceof NetworkResponse.Success)) {
                        u.b();
                        return null;
                    }
                    this.$collectionRequestCallback.onComplete((List) ((NetworkResponse.Success) networkResponse).getBody());
                }
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03121(MetricTracker metricTracker, CollectionRequestCallback collectionRequestCallback, r02<? super C03121> r02Var) {
            super(2, r02Var);
            this.$metricTracker = metricTracker;
            this.$collectionRequestCallback = collectionRequestCallback;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new C03121(this.$metricTracker, this.$collectionRequestCallback, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03121) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (defpackage.oy0.g(r0, r3, r7) == r4) goto L15;
         */
        @Override // defpackage.ak0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                int r0 = r7.label
                r1 = 2
                r2 = 0
                r3 = 1
                v72 r4 = defpackage.v72.t
                if (r0 == 0) goto L1b
                if (r0 == r3) goto L17
                if (r0 != r1) goto L11
                defpackage.dv8.b(r8)
                goto L4e
            L11:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r7)
                return r2
            L17:
                defpackage.dv8.b(r8)
                goto L36
            L1b:
                defpackage.dv8.b(r8)
                io.intercom.android.sdk.metrics.MetricTracker r8 = r7.$metricTracker
                java.lang.String r0 = "collection_list"
                r8.requestedHelpCenterData(r0)
                io.intercom.android.sdk.Injector r8 = io.intercom.android.sdk.Injector.get()
                io.intercom.android.sdk.helpcenter.api.HelpCenterApi r8 = r8.getHelpCenterApi()
                r7.label = r3
                java.lang.Object r8 = io.intercom.android.sdk.helpcenter.api.HelpCenterApi.DefaultImpls.fetchCollections$default(r8, r2, r7, r3, r2)
                if (r8 != r4) goto L36
                goto L4d
            L36:
                io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r8 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r8
                et2 r0 = defpackage.i23.a
                ht4 r0 = defpackage.ag6.a
                io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollections$1$1 r3 = new io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterCollections$1$1
                io.intercom.android.sdk.metrics.MetricTracker r5 = r7.$metricTracker
                io.intercom.android.sdk.helpcenter.api.CollectionRequestCallback r6 = r7.$collectionRequestCallback
                r3.<init>(r8, r5, r6, r2)
                r7.label = r1
                java.lang.Object r7 = defpackage.oy0.g(r0, r3, r7)
                if (r7 != r4) goto L4e
            L4d:
                return r4
            L4e:
                g2b r7 = defpackage.g2b.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper.C03121.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterResultsForSearchTerm$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterResultsForSearchTerm$1", f = "HelpCenterApiWrapper.kt", l = {59, 60}, m = "invokeSuspend")
    public static final class C03131 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ MetricTracker $metricTracker;
        final /* synthetic */ SearchRequestCallback $searchRequestCallback;
        final /* synthetic */ String $searchTerm;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterResultsForSearchTerm$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterResultsForSearchTerm$1$1", f = "HelpCenterApiWrapper.kt", l = {}, m = "invokeSuspend")
        public static final class C01241 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
            final /* synthetic */ MetricTracker $metricTracker;
            final /* synthetic */ NetworkResponse<List<HelpCenterArticleSearchResponse>> $searchForArticlesResponse;
            final /* synthetic */ SearchRequestCallback $searchRequestCallback;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C01241(NetworkResponse<? extends List<HelpCenterArticleSearchResponse>> networkResponse, MetricTracker metricTracker, SearchRequestCallback searchRequestCallback, r02<? super C01241> r02Var) {
                super(2, r02Var);
                this.$searchForArticlesResponse = networkResponse;
                this.$metricTracker = metricTracker;
                this.$searchRequestCallback = searchRequestCallback;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return new C01241(this.$searchForArticlesResponse, this.$metricTracker, this.$searchRequestCallback, r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                return ((C01241) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                if (this.label != 0) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                NetworkResponse<List<HelpCenterArticleSearchResponse>> networkResponse = this.$searchForArticlesResponse;
                if (networkResponse instanceof NetworkResponse.ServerError) {
                    this.$metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER_DATA_API, MetricTracker.Place.SEARCH_RESULTS, String.valueOf(((NetworkResponse.ServerError) networkResponse).getCode()), false);
                    this.$searchRequestCallback.onError(((NetworkResponse.ServerError) this.$searchForArticlesResponse).getCode());
                } else if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError)) {
                    this.$metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER_DATA_API, MetricTracker.Place.SEARCH_RESULTS, null, false);
                    this.$searchRequestCallback.onFailure();
                } else {
                    if (!(networkResponse instanceof NetworkResponse.Success)) {
                        u.b();
                        return null;
                    }
                    this.$searchRequestCallback.onComplete(HelpCenterApiWrapper.INSTANCE.transformSearchResponse((List) ((NetworkResponse.Success) networkResponse).getBody()));
                }
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03131(MetricTracker metricTracker, String str, SearchRequestCallback searchRequestCallback, r02<? super C03131> r02Var) {
            super(2, r02Var);
            this.$metricTracker = metricTracker;
            this.$searchTerm = str;
            this.$searchRequestCallback = searchRequestCallback;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new C03131(this.$metricTracker, this.$searchTerm, this.$searchRequestCallback, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03131) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        
            if (defpackage.oy0.g(r12, r0, r9) == r4) goto L15;
         */
        @Override // defpackage.ak0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                r12 = this;
                int r0 = r12.label
                r1 = 0
                r2 = 2
                r3 = 1
                v72 r4 = defpackage.v72.t
                if (r0 == 0) goto L1c
                if (r0 == r3) goto L17
                if (r0 != r2) goto L11
                defpackage.dv8.b(r13)
                goto L56
            L11:
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r12)
                return r1
            L17:
                defpackage.dv8.b(r13)
                r9 = r12
                goto L3e
            L1c:
                defpackage.dv8.b(r13)
                io.intercom.android.sdk.metrics.MetricTracker r13 = r12.$metricTracker
                java.lang.String r0 = "search_results"
                r13.requestedHelpCenterData(r0)
                io.intercom.android.sdk.Injector r13 = io.intercom.android.sdk.Injector.get()
                io.intercom.android.sdk.helpcenter.api.HelpCenterApi r5 = r13.getHelpCenterApi()
                java.lang.String r6 = r12.$searchTerm
                r12.label = r3
                r7 = 0
                r8 = 0
                r10 = 6
                r11 = 0
                r9 = r12
                java.lang.Object r13 = io.intercom.android.sdk.helpcenter.api.HelpCenterApi.DefaultImpls.searchForArticles$default(r5, r6, r7, r8, r9, r10, r11)
                if (r13 != r4) goto L3e
                goto L55
            L3e:
                io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r13 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r13
                et2 r12 = defpackage.i23.a
                ht4 r12 = defpackage.ag6.a
                io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterResultsForSearchTerm$1$1 r0 = new io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper$fetchHelpCenterResultsForSearchTerm$1$1
                io.intercom.android.sdk.metrics.MetricTracker r3 = r9.$metricTracker
                io.intercom.android.sdk.helpcenter.api.SearchRequestCallback r5 = r9.$searchRequestCallback
                r0.<init>(r13, r3, r5, r1)
                r9.label = r2
                java.lang.Object r12 = defpackage.oy0.g(r12, r0, r9)
                if (r12 != r4) goto L56
            L55:
                return r4
            L56:
                g2b r12 = defpackage.g2b.a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper.C03131.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private HelpCenterApiWrapper() {
    }

    private final String removeHighlightTags(String str) {
        return w2a.l(w2a.l(str, "<highlight>", BuildConfig.FLAVOR), "</highlight>", BuildConfig.FLAVOR);
    }

    public final void fetchHelpCenterCollection(MetricTracker metricTracker, String str, CollectionContentRequestCallback collectionContentRequestCallback) {
        metricTracker.getClass();
        str.getClass();
        collectionContentRequestCallback.getClass();
        et2 et2Var = i23.a;
        oy0.d(dn4.t, wr2.v, null, new AnonymousClass1(metricTracker, str, collectionContentRequestCallback, null), 2);
    }

    public final void fetchHelpCenterCollections(MetricTracker metricTracker, CollectionRequestCallback collectionRequestCallback) {
        metricTracker.getClass();
        collectionRequestCallback.getClass();
        et2 et2Var = i23.a;
        oy0.d(dn4.t, wr2.v, null, new C03121(metricTracker, collectionRequestCallback, null), 2);
    }

    public final void fetchHelpCenterResultsForSearchTerm(MetricTracker metricTracker, String str, SearchRequestCallback searchRequestCallback) {
        metricTracker.getClass();
        str.getClass();
        searchRequestCallback.getClass();
        et2 et2Var = i23.a;
        oy0.d(dn4.t, wr2.v, null, new C03131(metricTracker, str, searchRequestCallback, null), 2);
    }

    public final List<HelpCenterArticleSearchResult> transformSearchResponse(List<HelpCenterArticleSearchResponse> list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(ph1.n(list, 10));
        for (HelpCenterArticleSearchResponse helpCenterArticleSearchResponse : list) {
            String title = helpCenterArticleSearchResponse.getHighlight().getTitle();
            String title2 = (title == null || title.length() == 0) ? helpCenterArticleSearchResponse.getTitle() : helpCenterArticleSearchResponse.getHighlight().getTitle();
            String summary = helpCenterArticleSearchResponse.getHighlight().getSummary();
            String str = BuildConfig.FLAVOR;
            if (summary == null) {
                summary = BuildConfig.FLAVOR;
            }
            String articleId = helpCenterArticleSearchResponse.getArticleId();
            HelpCenterApiWrapper helpCenterApiWrapper = INSTANCE;
            String strRemoveHighlightTags = helpCenterApiWrapper.removeHighlightTags(title2);
            String summary2 = helpCenterArticleSearchResponse.getSummary();
            if (summary2 != null) {
                str = summary2;
            }
            arrayList.add(new HelpCenterArticleSearchResult(articleId, strRemoveHighlightTags, str, helpCenterApiWrapper.removeHighlightTags(summary)));
        }
        return arrayList;
    }
}
