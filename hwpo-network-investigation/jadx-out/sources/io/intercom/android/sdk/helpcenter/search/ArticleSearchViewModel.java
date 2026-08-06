package io.intercom.android.sdk.helpcenter.search;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.intercom.twig.BuildConfig;
import defpackage.a0a;
import defpackage.a74;
import defpackage.aa0;
import defpackage.b0a;
import defpackage.ba1;
import defpackage.bw2;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.et2;
import defpackage.f37;
import defpackage.ff3;
import defpackage.g2b;
import defpackage.i23;
import defpackage.i37;
import defpackage.js7;
import defpackage.lb2;
import defpackage.ll8;
import defpackage.m64;
import defpackage.mhb;
import defpackage.n72;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.ph1;
import defpackage.qq2;
import defpackage.r02;
import defpackage.r54;
import defpackage.rhb;
import defpackage.s54;
import defpackage.sd1;
import defpackage.t72;
import defpackage.th1;
import defpackage.thb;
import defpackage.ty1;
import defpackage.u02;
import defpackage.uhb;
import defpackage.v72;
import defpackage.vhb;
import defpackage.whb;
import defpackage.wn5;
import defpackage.wr2;
import defpackage.wt4;
import defpackage.xm2;
import defpackage.xx0;
import defpackage.yk2;
import defpackage.z90;
import defpackage.zl9;
import defpackage.zz9;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.component.TeammateHelpKt;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ArticleSearchViewModel extends mhb {
    private final i37<ArticleSearchState> _state;
    private final AppConfig appConfig;
    private final CommonRepository commonRepository;
    private final n72 dispatcher;
    private boolean hasClickedAtLeastOneArticle;
    private final HelpCenterApi helpCenterApi;
    private final IntercomDataLayer intercomDataLayer;
    private final boolean isFromSearchBrowse;
    private String lastSearchedInput;
    private final MetricTracker metricTracker;
    private final f37<String> searchInput;
    private final zz9<ArticleSearchState> state;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1", f = "ArticleSearchViewModel.kt", l = {120}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ArticleSearchViewModel.this.new AnonymousClass1(r02Var);
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
                f37 f37Var = ArticleSearchViewModel.this.searchInput;
                ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1 articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1 = new ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1(null, ArticleSearchViewModel.this);
                int i2 = a74.a;
                final ba1 ba1Var = new ba1(articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1, f37Var, ff3.t, -2, xx0.t);
                final ArticleSearchViewModel articleSearchViewModel = ArticleSearchViewModel.this;
                final r54<NetworkResponse<? extends List<? extends HelpCenterArticleSearchResponse>>> r54Var = new r54<NetworkResponse<? extends List<? extends HelpCenterArticleSearchResponse>>>() { // from class: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public static final class AnonymousClass2<T> implements s54 {
                        final /* synthetic */ s54 $this_unsafeFlow;
                        final /* synthetic */ ArticleSearchViewModel this$0;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        @xm2(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$1$2", f = "ArticleSearchViewModel.kt", l = {50}, m = "emit")
                        public static final class AnonymousClass1 extends u02 {
                            Object L$0;
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

                        public AnonymousClass2(s54 s54Var, ArticleSearchViewModel articleSearchViewModel) {
                            this.$this_unsafeFlow = s54Var;
                            this.this$0 = articleSearchViewModel;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
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
                                js7 js7Var = (js7) obj;
                                this.this$0.lastSearchedInput = (String) js7Var.u;
                                A a = js7Var.t;
                                anonymousClass1.label = 1;
                                Object objEmit = s54Var.emit(a, anonymousClass1);
                                Object obj3 = v72.t;
                                if (objEmit == obj3) {
                                    return obj3;
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
                    public Object collect(s54<? super NetworkResponse<? extends List<? extends HelpCenterArticleSearchResponse>>> s54Var, r02 r02Var) {
                        Object objCollect = ba1Var.collect(new AnonymousClass2(s54Var, articleSearchViewModel), r02Var);
                        return objCollect == v72.t ? objCollect : g2b.a;
                    }
                };
                final ArticleSearchViewModel articleSearchViewModel2 = ArticleSearchViewModel.this;
                r54<ArticleSearchState> r54Var2 = new r54<ArticleSearchState>() { // from class: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$2

                    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$2$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public static final class AnonymousClass2<T> implements s54 {
                        final /* synthetic */ s54 $this_unsafeFlow;
                        final /* synthetic */ ArticleSearchViewModel this$0;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$2$2$1, reason: invalid class name */
                        @xm2(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$2$2", f = "ArticleSearchViewModel.kt", l = {65, 75, 50}, m = "emit")
                        public static final class AnonymousClass1 extends u02 {
                            Object L$0;
                            Object L$1;
                            Object L$2;
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

                        public AnonymousClass2(s54 s54Var, ArticleSearchViewModel articleSearchViewModel) {
                            this.$this_unsafeFlow = s54Var;
                            this.this$0 = articleSearchViewModel;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                        /* JADX WARN: Code restructure failed: missing block: B:53:0x013f, code lost:
                        
                            if (r3.emit(r0, r2) == r8) goto L54;
                         */
                        @Override // defpackage.s54
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r24, defpackage.r02 r25) throws java.lang.Throwable {
                            /*
                                Method dump skipped, instruction units count: 325
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, r02):java.lang.Object");
                        }
                    }

                    @Override // defpackage.r54
                    public Object collect(s54<? super ArticleSearchState> s54Var, r02 r02Var) {
                        Object objCollect = r54Var.collect(new AnonymousClass2(s54Var, articleSearchViewModel2), r02Var);
                        return objCollect == v72.t ? objCollect : g2b.a;
                    }
                };
                final ArticleSearchViewModel articleSearchViewModel3 = ArticleSearchViewModel.this;
                s54<? super ArticleSearchState> s54Var = new s54() { // from class: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel.1.4
                    public final Object emit(ArticleSearchState articleSearchState, r02<? super g2b> r02Var) {
                        articleSearchViewModel3._state.setValue(articleSearchState);
                        return g2b.a;
                    }

                    @Override // defpackage.s54
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, r02 r02Var) {
                        return emit((ArticleSearchState) obj2, (r02<? super g2b>) r02Var);
                    }
                };
                this.label = 1;
                Object objCollect = r54Var2.collect(s54Var, this);
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$2", f = "ArticleSearchViewModel.kt", l = {128}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public AnonymousClass2(r02<? super AnonymousClass2> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ArticleSearchViewModel.this.new AnonymousClass2(r02Var);
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
                final zl9<IntercomEvent> event = ArticleSearchViewModel.this.intercomDataLayer.getEvent();
                r54<Object> r54Var = new r54<Object>() { // from class: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$2$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public static final class AnonymousClass2<T> implements s54 {
                        final /* synthetic */ s54 $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        @xm2(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ArticleSearchViewModel.kt", l = {50}, m = "emit")
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
                final ArticleSearchViewModel articleSearchViewModel = ArticleSearchViewModel.this;
                s54<? super Object> s54Var = new s54() { // from class: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel.2.1
                    public final Object emit(IntercomEvent.NewConversation newConversation, r02<? super g2b> r02Var) throws Throwable {
                        Object objUpdateTeammateHelpRow = articleSearchViewModel.updateTeammateHelpRow(r02Var);
                        return objUpdateTeammateHelpRow == v72.t ? objUpdateTeammateHelpRow : g2b.a;
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$addTeammateHelpRow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$addTeammateHelpRow$1", f = "ArticleSearchViewModel.kt", l = {ModuleDescriptor.MODULE_VERSION, 187}, m = "invokeSuspend")
    public static final class C03171 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public C03171(r02<? super C03171> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ArticleSearchViewModel.this.new C03171(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03171) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            ArticleSearchState articleSearchState;
            i37 i37Var;
            ArticleSearchState.Content content;
            Collection collection;
            int i = this.label;
            v72 v72Var = v72.t;
            if (i != 0) {
                if (i == 1) {
                    articleSearchState = (ArticleSearchState) this.L$0;
                    dv8.b(obj);
                } else {
                    if (i != 2) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection = (Collection) this.L$2;
                    content = (ArticleSearchState.Content) this.L$1;
                    i37Var = (i37) this.L$0;
                    dv8.b(obj);
                }
                i37Var.setValue(content.copy(th1.L(collection, obj)));
                return g2b.a;
            }
            dv8.b(obj);
            ArticleSearchViewModel.this.hasClickedAtLeastOneArticle = true;
            if (ArticleSearchViewModel.this.shouldAddSendMessageRow()) {
                articleSearchState = (ArticleSearchState) ArticleSearchViewModel.this._state.getValue();
                if (articleSearchState instanceof ArticleSearchState.Content) {
                    List<ArticleSearchResultRow> searchResults = ((ArticleSearchState.Content) articleSearchState).getSearchResults();
                    if (searchResults == null || !searchResults.isEmpty()) {
                        Iterator<T> it = searchResults.iterator();
                        while (it.hasNext()) {
                            if (((ArticleSearchResultRow) it.next()) instanceof ArticleSearchResultRow.TeammateHelpRow) {
                            }
                        }
                    }
                    this.L$0 = articleSearchState;
                    this.label = 1;
                    if (bw2.b(2000L, this) != v72Var) {
                    }
                    return v72Var;
                }
            }
            return g2b.a;
            i37 i37Var2 = ArticleSearchViewModel.this._state;
            ArticleSearchState.Content content2 = (ArticleSearchState.Content) articleSearchState;
            List<ArticleSearchResultRow> searchResults2 = content2.getSearchResults();
            ArticleSearchViewModel articleSearchViewModel = ArticleSearchViewModel.this;
            this.L$0 = i37Var2;
            this.L$1 = content2;
            this.L$2 = searchResults2;
            this.label = 2;
            Object objTeammateHelpRow = articleSearchViewModel.teammateHelpRow(this);
            if (objTeammateHelpRow != v72Var) {
                obj = objTeammateHelpRow;
                i37Var = i37Var2;
                content = content2;
                collection = searchResults2;
                i37Var.setValue(content.copy(th1.L(collection, obj)));
                return g2b.a;
            }
            return v72Var;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$searchForArticles$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$searchForArticles$1", f = "ArticleSearchViewModel.kt", l = {138}, m = "invokeSuspend")
    public static final class C03181 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ r54<String> $textChanged;
        int label;
        final /* synthetic */ ArticleSearchViewModel this$0;

        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$searchForArticles$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$searchForArticles$1$1", f = "ArticleSearchViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class C01271 extends p6a implements ci4<s54<? super String>, r02<? super g2b>, Object> {
            int label;
            final /* synthetic */ ArticleSearchViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01271(ArticleSearchViewModel articleSearchViewModel, r02<? super C01271> r02Var) {
                super(2, r02Var);
                this.this$0 = articleSearchViewModel;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return new C01271(this.this$0, r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(s54<? super String> s54Var, r02<? super g2b> r02Var) {
                return ((C01271) create(s54Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                if (this.label != 0) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                this.this$0.metricTracker.searchedNativeHelpCenter(this.this$0.isFromSearchBrowse);
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03181(r54<String> r54Var, ArticleSearchViewModel articleSearchViewModel, r02<? super C03181> r02Var) {
            super(2, r02Var);
            this.$textChanged = r54Var;
            this.this$0 = articleSearchViewModel;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new C03181(this.$textChanged, this.this$0, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03181) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                m64 m64Var = new m64(yk2.h(this.$textChanged, 400L), new C01271(this.this$0, null));
                final ArticleSearchViewModel articleSearchViewModel = this.this$0;
                s54<? super Object> s54Var = new s54() { // from class: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel.searchForArticles.1.2
                    public final Object emit(String str, r02<? super g2b> r02Var) {
                        int length = str.length();
                        ArticleSearchViewModel articleSearchViewModel2 = articleSearchViewModel;
                        if (length == 0) {
                            articleSearchViewModel2._state.setValue(ArticleSearchState.Initial.INSTANCE);
                            return g2b.a;
                        }
                        articleSearchViewModel2._state.setValue(ArticleSearchState.Loading.INSTANCE);
                        Object objEmit = articleSearchViewModel.searchInput.emit(str, r02Var);
                        return objEmit == v72.t ? objEmit : g2b.a;
                    }

                    @Override // defpackage.s54
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, r02 r02Var) {
                        return emit((String) obj2, (r02<? super g2b>) r02Var);
                    }
                };
                this.label = 1;
                Object objCollect = m64Var.collect(s54Var, this);
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$sendClickOnSearchResultMetric$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$sendClickOnSearchResultMetric$1", f = "ArticleSearchViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class C03191 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public C03191(r02<? super C03191> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return ArticleSearchViewModel.this.new C03191(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03191) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            if (this.label != 0) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            if (ArticleSearchViewModel.this._state.getValue() instanceof ArticleSearchState.Content) {
                ArticleSearchViewModel.this.metricTracker.openedNativeHelpCenterSearchResult(ArticleSearchViewModel.this.isFromSearchBrowse, ArticleSearchViewModel.this.lastSearchedInput);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$teammateHelpRow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel", f = "ArticleSearchViewModel.kt", l = {241}, m = "teammateHelpRow")
    public static final class C03201 extends u02 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C03201(r02<? super C03201> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ArticleSearchViewModel.this.teammateHelpRow(this);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$transformToUiModel$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel", f = "ArticleSearchViewModel.kt", l = {228}, m = "transformToUiModel")
    public static final class C03211 extends u02 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C03211(r02<? super C03211> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ArticleSearchViewModel.this.transformToUiModel(null, this);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$updateTeammateHelpRow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel", f = "ArticleSearchViewModel.kt", l = {154}, m = "updateTeammateHelpRow")
    public static final class C03221 extends u02 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C03221(r02<? super C03221> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ArticleSearchViewModel.this.updateTeammateHelpRow(this);
        }
    }

    public ArticleSearchViewModel(HelpCenterApi helpCenterApi, AppConfig appConfig, MetricTracker metricTracker, boolean z, n72 n72Var, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository) {
        helpCenterApi.getClass();
        appConfig.getClass();
        metricTracker.getClass();
        n72Var.getClass();
        intercomDataLayer.getClass();
        commonRepository.getClass();
        this.helpCenterApi = helpCenterApi;
        this.appConfig = appConfig;
        this.metricTracker = metricTracker;
        this.isFromSearchBrowse = z;
        this.dispatcher = n72Var;
        this.intercomDataLayer = intercomDataLayer;
        this.commonRepository = commonRepository;
        a0a a0aVarB = b0a.b(ArticleSearchState.Initial.INSTANCE);
        this._state = a0aVarB;
        this.state = yk2.b(a0aVarB);
        this.lastSearchedInput = BuildConfig.FLAVOR;
        this.searchInput = ty1.b(7, null);
        oy0.d(rhb.b(this), n72Var, null, new AnonymousClass1(null), 2);
        oy0.d(rhb.b(this), n72Var, null, new AnonymousClass2(null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendFailedSearchMetric(Integer num) {
        this.metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER, MetricTracker.Place.SEARCH_RESULTS, num != null ? num.toString() : null, this.isFromSearchBrowse);
    }

    public static /* synthetic */ void sendFailedSearchMetric$default(ArticleSearchViewModel articleSearchViewModel, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        articleSearchViewModel.sendFailedSearchMetric(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldAddSendMessageRow() {
        return AppConfigExtensionsKt.canStartNewConversation(this.appConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object teammateHelpRow(r02<? super ArticleSearchResultRow.TeammateHelpRow> r02Var) throws Throwable {
        C03201 c03201;
        ArticleViewState.TeamPresenceState teamPresenceStateCopy$default;
        OpenMessengerResponse.NewConversationData newConversationData;
        if (r02Var instanceof C03201) {
            c03201 = (C03201) r02Var;
            int i = c03201.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c03201.label = i - Integer.MIN_VALUE;
            } else {
                c03201 = new C03201(r02Var);
            }
        } else {
            c03201 = new C03201(r02Var);
        }
        Object obj = c03201.result;
        int i2 = c03201.label;
        if (i2 == 0) {
            dv8.b(obj);
            ArticleViewState.TeamPresenceState teamPresenceStateComputeViewState = TeammateHelpKt.computeViewState(null, ArticleViewState.TeamPresenceState.Companion.getDefaultTeamPresenceState(), this.appConfig, MetricTracker.Place.SEARCH_RESULTS, this.isFromSearchBrowse);
            CommonRepository commonRepository = this.commonRepository;
            c03201.L$0 = teamPresenceStateComputeViewState;
            c03201.label = 1;
            Object objOpenMessenger = commonRepository.openMessenger(c03201);
            v72 v72Var = v72.t;
            if (objOpenMessenger == v72Var) {
                return v72Var;
            }
            teamPresenceStateCopy$default = teamPresenceStateComputeViewState;
            obj = objOpenMessenger;
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ArticleViewState.TeamPresenceState teamPresenceState = (ArticleViewState.TeamPresenceState) c03201.L$0;
            dv8.b(obj);
            teamPresenceStateCopy$default = teamPresenceState;
        }
        NetworkResponse networkResponse = (NetworkResponse) obj;
        if ((networkResponse instanceof NetworkResponse.Success) && (newConversationData = ((OpenMessengerResponse) ((NetworkResponse.Success) networkResponse).getBody()).getNewConversationData()) != null) {
            teamPresenceStateCopy$default = ArticleViewState.TeamPresenceState.copy$default(teamPresenceStateCopy$default, null, null, null, 0, 0, 0, null, null, false, newConversationData.getCta(), 511, null);
        }
        return new ArticleSearchResultRow.TeammateHelpRow(teamPresenceStateCopy$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object transformToUiModel(List<HelpCenterArticleSearchResponse> list, r02<? super List<? extends ArticleSearchResultRow>> r02Var) throws Throwable {
        C03211 c03211;
        Collection arrayList;
        Collection collection;
        if (r02Var instanceof C03211) {
            c03211 = (C03211) r02Var;
            int i = c03211.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c03211.label = i - Integer.MIN_VALUE;
            } else {
                c03211 = new C03211(r02Var);
            }
        } else {
            c03211 = new C03211(r02Var);
        }
        Object objTeammateHelpRow = c03211.result;
        int i2 = c03211.label;
        if (i2 == 0) {
            dv8.b(objTeammateHelpRow);
            ArrayList arrayList2 = new ArrayList(ph1.n(list, 10));
            for (HelpCenterArticleSearchResponse helpCenterArticleSearchResponse : list) {
                HelpCenterArticleSearchResponse.Highlight highlight = helpCenterArticleSearchResponse.getHighlight();
                String articleId = helpCenterArticleSearchResponse.getArticleId();
                String title = highlight.getTitle();
                if (title.length() == 0) {
                    title = helpCenterArticleSearchResponse.getTitle();
                }
                arrayList2.add(new ArticleSearchResultRow.ArticleResultRow(articleId, title, highlight.getSummary(), highlight.getSummary().length() == 0 ? 8 : 0));
            }
            arrayList = new ArrayList(arrayList2);
            if (shouldAddSendMessageRow() && this.hasClickedAtLeastOneArticle) {
                c03211.L$0 = arrayList;
                c03211.L$1 = arrayList;
                c03211.label = 1;
                objTeammateHelpRow = teammateHelpRow(c03211);
                Object obj = v72.t;
                if (objTeammateHelpRow == obj) {
                    return obj;
                }
                collection = arrayList;
            }
            return arrayList;
        }
        if (i2 != 1) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        collection = (Collection) c03211.L$1;
        arrayList = (List) c03211.L$0;
        dv8.b(objTeammateHelpRow);
        collection.add(objTeammateHelpRow);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object updateTeammateHelpRow(r02<? super g2b> r02Var) throws Throwable {
        C03221 c03221;
        ArticleSearchState.Content content;
        i37<ArticleSearchState> i37Var;
        Collection collection;
        if (r02Var instanceof C03221) {
            c03221 = (C03221) r02Var;
            int i = c03221.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c03221.label = i - Integer.MIN_VALUE;
            } else {
                c03221 = new C03221(r02Var);
            }
        } else {
            c03221 = new C03221(r02Var);
        }
        Object obj = c03221.result;
        int i2 = c03221.label;
        if (i2 == 0) {
            dv8.b(obj);
            ArticleSearchState value = this._state.getValue();
            if (!shouldAddSendMessageRow()) {
                i37<ArticleSearchState> i37Var2 = this._state;
                if (value instanceof ArticleSearchState.Content) {
                    ArticleSearchState.Content content2 = (ArticleSearchState.Content) value;
                    List<ArticleSearchResultRow> searchResults = content2.getSearchResults();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : searchResults) {
                        if (!(((ArticleSearchResultRow) obj2) instanceof ArticleSearchResultRow.TeammateHelpRow)) {
                            arrayList.add(obj2);
                        }
                    }
                    value = content2.copy(arrayList);
                } else if (value instanceof ArticleSearchState.NoResults) {
                    value = new ArticleSearchState.NoResultsNoTeamHelp(((ArticleSearchState.NoResults) value).getSearchTerm());
                }
                i37Var2.setValue(value);
            } else if (value instanceof ArticleSearchState.Content) {
                content = (ArticleSearchState.Content) value;
                List<ArticleSearchResultRow> searchResults2 = content.getSearchResults();
                if (searchResults2 == null || !searchResults2.isEmpty()) {
                    Iterator<T> it = searchResults2.iterator();
                    while (it.hasNext()) {
                        if (((ArticleSearchResultRow) it.next()) instanceof ArticleSearchResultRow.TeammateHelpRow) {
                        }
                    }
                }
                i37<ArticleSearchState> i37Var3 = this._state;
                List<ArticleSearchResultRow> searchResults3 = content.getSearchResults();
                c03221.L$0 = i37Var3;
                c03221.L$1 = content;
                c03221.L$2 = searchResults3;
                c03221.label = 1;
                Object objTeammateHelpRow = teammateHelpRow(c03221);
                Object obj3 = v72.t;
                if (objTeammateHelpRow == obj3) {
                    return obj3;
                }
                i37Var = i37Var3;
                obj = objTeammateHelpRow;
                collection = searchResults3;
            }
            return g2b.a;
        }
        if (i2 != 1) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        collection = (Collection) c03221.L$2;
        content = (ArticleSearchState.Content) c03221.L$1;
        i37Var = (i37) c03221.L$0;
        dv8.b(obj);
        i37Var.setValue(content.copy(th1.L(collection, obj)));
        return g2b.a;
    }

    public final void addTeammateHelpRow() {
        oy0.d(rhb.b(this), this.dispatcher, null, new C03171(null), 2);
    }

    public final zz9<ArticleSearchState> getState() {
        return this.state;
    }

    public final void searchForArticles(r54<String> r54Var) {
        r54Var.getClass();
        oy0.d(rhb.b(this), this.dispatcher, null, new C03181(r54Var, this, null), 2);
    }

    public final void sendClickOnSearchResultMetric() {
        oy0.d(rhb.b(this), this.dispatcher, null, new C03191(null), 2);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$Companion$factory$1] */
        private final ArticleSearchViewModel$Companion$factory$1 factory(final HelpCenterApi helpCenterApi, final boolean z) {
            return new thb.c() { // from class: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$Companion$factory$1
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
                    boolean z2 = z;
                    dataLayer.getClass();
                    MessengerApi messengerApi = Injector.get().getMessengerApi();
                    messengerApi.getClass();
                    return new ArticleSearchViewModel(helpCenterApi2, appConfig2, metricTracker, z2, null, dataLayer, new CommonRepository(messengerApi, dataLayer), 16, null);
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

        public final ArticleSearchViewModel create(whb whbVar, HelpCenterApi helpCenterApi, boolean z) {
            whbVar.getClass();
            helpCenterApi.getClass();
            ArticleSearchViewModel$Companion$factory$1 articleSearchViewModel$Companion$factory$1Factory = factory(helpCenterApi, z);
            articleSearchViewModel$Companion$factory$1Factory.getClass();
            vhb viewModelStore = whbVar.getViewModelStore();
            lb2 defaultViewModelCreationExtras = whbVar instanceof wt4 ? ((wt4) whbVar).getDefaultViewModelCreationExtras() : lb2.a.b;
            viewModelStore.getClass();
            defaultViewModelCreationExtras.getClass();
            uhb uhbVar = new uhb(viewModelStore, articleSearchViewModel$Companion$factory$1Factory, defaultViewModelCreationExtras);
            sd1 sd1VarA = ll8.a(ArticleSearchViewModel.class);
            String strE = sd1VarA.e();
            if (strE != null) {
                return (ArticleSearchViewModel) uhbVar.a(sd1VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strE));
            }
            z90.a("Local and anonymous classes can not be ViewModels");
            return null;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ArticleSearchViewModel(HelpCenterApi helpCenterApi, AppConfig appConfig, MetricTracker metricTracker, boolean z, n72 n72Var, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository, int i, qq2 qq2Var) {
        boolean z2 = (i & 8) != 0 ? false : z;
        if ((i & 16) != 0) {
            et2 et2Var = i23.a;
            n72Var = wr2.v;
        }
        this(helpCenterApi, appConfig, metricTracker, z2, n72Var, intercomDataLayer, commonRepository);
    }
}
