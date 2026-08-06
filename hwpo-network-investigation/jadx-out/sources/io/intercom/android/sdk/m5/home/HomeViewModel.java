package io.intercom.android.sdk.m5.home;

import defpackage.a0a;
import defpackage.aa0;
import defpackage.am9;
import defpackage.b0a;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.et2;
import defpackage.f37;
import defpackage.g2b;
import defpackage.i23;
import defpackage.i37;
import defpackage.lb2;
import defpackage.ll8;
import defpackage.mhb;
import defpackage.n72;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.qq2;
import defpackage.r02;
import defpackage.r54;
import defpackage.rhb;
import defpackage.s54;
import defpackage.s66;
import defpackage.sd1;
import defpackage.t72;
import defpackage.thb;
import defpackage.ty1;
import defpackage.u;
import defpackage.u02;
import defpackage.uhb;
import defpackage.um9;
import defpackage.uv2;
import defpackage.uz9;
import defpackage.v72;
import defpackage.vhb;
import defpackage.vv2;
import defpackage.whb;
import defpackage.wn5;
import defpackage.wr2;
import defpackage.wt4;
import defpackage.x21;
import defpackage.x54;
import defpackage.xm2;
import defpackage.yk2;
import defpackage.z90;
import defpackage.zl9;
import defpackage.zz9;
import io.intercom.android.nexus.NexusEventType;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.HomeRepository;
import io.intercom.android.sdk.m5.home.data.HomeV2Response;
import io.intercom.android.sdk.m5.home.reducers.HomeReducer;
import io.intercom.android.sdk.m5.home.states.HomeClientState;
import io.intercom.android.sdk.m5.home.states.HomeUiEffects;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.HomeConfig;
import io.intercom.android.sdk.models.OpenConfig;
import io.intercom.android.sdk.models.OpenToSpace;
import io.intercom.android.sdk.survey.SurveyViewModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeViewModel extends mhb {
    private final f37<HomeUiEffects> _effect;
    private final i37<HomeClientState> clientState;
    private final CommonRepository commonRepository;
    private final n72 dispatcher;
    private final zl9<HomeUiEffects> effect;
    private boolean hasConversationScreenOpenedDirectlyFromHome;
    private final HomeReducer homeReducer;
    private final HomeRepository homeRepository;
    private final IntercomDataLayer intercomDataLayer;
    private final zz9<HomeUiState> uiState;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.home.HomeViewModel$1", f = "HomeViewModel.kt", l = {69}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ s66 $lifecycle;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.m5.home.HomeViewModel$1$1", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class C01581 extends p6a implements ci4<AppConfig, r02<? super g2b>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ HomeViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01581(HomeViewModel homeViewModel, r02<? super C01581> r02Var) {
                super(2, r02Var);
                this.this$0 = homeViewModel;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C01581 c01581 = new C01581(this.this$0, r02Var);
                c01581.L$0 = obj;
                return c01581;
            }

            @Override // defpackage.ci4
            public final Object invoke(AppConfig appConfig, r02<? super g2b> r02Var) {
                return ((C01581) create(appConfig, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                if (this.label != 0) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                this.this$0.onConfig((AppConfig) this.L$0);
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(s66 s66Var, r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
            this.$lifecycle = s66Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return HomeViewModel.this.new AnonymousClass1(this.$lifecycle, r02Var);
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
                zz9<AppConfig> config = HomeViewModel.this.intercomDataLayer.getConfig();
                s66 s66Var = this.$lifecycle;
                config.getClass();
                s66Var.getClass();
                x21 x21VarD = yk2.d(new x54(s66Var, config, null));
                C01581 c01581 = new C01581(HomeViewModel.this, null);
                this.label = 1;
                Object objF = yk2.f(x21VarD, c01581, this);
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.home.HomeViewModel$2", f = "HomeViewModel.kt", l = {77}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ s66 $lifecycle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(s66 s66Var, r02<? super AnonymousClass2> r02Var) {
            super(2, r02Var);
            this.$lifecycle = s66Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return HomeViewModel.this.new AnonymousClass2(this.$lifecycle, r02Var);
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
                r54<ParsedNexusEvent> r54VarRealTimeEvents = HomeViewModel.this.homeRepository.realTimeEvents();
                s66 s66Var = this.$lifecycle;
                r54VarRealTimeEvents.getClass();
                s66Var.getClass();
                final x21 x21VarD = yk2.d(new x54(s66Var, r54VarRealTimeEvents, null));
                final r54<Object> r54Var = new r54<Object>() { // from class: io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public static final class AnonymousClass2<T> implements s54 {
                        final /* synthetic */ s54 $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        @xm2(c = "io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2", f = "HomeViewModel.kt", l = {50}, m = "emit")
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
                                if (obj instanceof ParsedNexusEvent.ConversationNexusEvent) {
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
                        Object objCollect = x21VarD.collect(new AnonymousClass2(s54Var), r02Var);
                        return objCollect == v72.t ? objCollect : g2b.a;
                    }
                };
                r54<ParsedNexusEvent.ConversationNexusEvent> r54Var2 = new r54<ParsedNexusEvent.ConversationNexusEvent>() { // from class: io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public static final class AnonymousClass2<T> implements s54 {
                        final /* synthetic */ s54 $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        @xm2(c = "io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filter$1$2", f = "HomeViewModel.kt", l = {50}, m = "emit")
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
                                if (((ParsedNexusEvent.ConversationNexusEvent) obj).getEventType() == NexusEventType.NewComment) {
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
                    public Object collect(s54<? super ParsedNexusEvent.ConversationNexusEvent> s54Var, r02 r02Var) {
                        Object objCollect = r54Var.collect(new AnonymousClass2(s54Var), r02Var);
                        return objCollect == v72.t ? objCollect : g2b.a;
                    }
                };
                final HomeViewModel homeViewModel = HomeViewModel.this;
                s54<? super ParsedNexusEvent.ConversationNexusEvent> s54Var = new s54() { // from class: io.intercom.android.sdk.m5.home.HomeViewModel.2.2
                    public final Object emit(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, r02<? super g2b> r02Var) {
                        homeViewModel.fetchHomeData();
                        return g2b.a;
                    }

                    @Override // defpackage.s54
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, r02 r02Var) {
                        return emit((ParsedNexusEvent.ConversationNexusEvent) obj2, (r02<? super g2b>) r02Var);
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

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OpenToSpace.values().length];
            try {
                iArr[OpenToSpace.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OpenToSpace.MESSAGES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OpenToSpace.CONVERSATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$fetchHomeData$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.home.HomeViewModel$fetchHomeData$1", f = "HomeViewModel.kt", l = {123, 124}, m = "invokeSuspend")
    public static final class C03731 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C03731(r02<? super C03731> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            C03731 c03731 = HomeViewModel.this.new C03731(r02Var);
            c03731.L$0 = obj;
            return c03731;
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03731) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0080  */
        /* JADX WARN: Code duplicated, block: B:26:0x009b  */
        /* JADX WARN: Code duplicated, block: B:31:0x00b0 A[LOOP:2: B:30:0x00ae->B:31:0x00b0, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:37:0x00a3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:39:0x0095 A[SYNTHETIC] */
        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            uv2 uv2Var;
            NetworkResponse networkResponse;
            NetworkResponse networkResponse2;
            i37 i37Var;
            Object value;
            ArrayList arrayList;
            HomeViewModel homeViewModel;
            int size;
            int i;
            int i2 = this.label;
            v72 v72Var = v72.t;
            if (i2 == 0) {
                dv8.b(obj);
                t72 t72Var = (t72) this.L$0;
                vv2 vv2VarB = oy0.b(t72Var, null, new HomeViewModel$fetchHomeData$1$homeDeferred$1(HomeViewModel.this, null), 3);
                vv2 vv2VarB2 = oy0.b(t72Var, null, new HomeViewModel$fetchHomeData$1$openDeferred$1(HomeViewModel.this, null), 3);
                this.L$0 = vv2VarB2;
                this.label = 1;
                Object objW = vv2VarB.w(this);
                if (objW != v72Var) {
                    uv2Var = vv2VarB2;
                    obj = objW;
                }
                return v72Var;
            }
            if (i2 == 1) {
                uv2Var = (uv2) this.L$0;
                dv8.b(obj);
            } else {
                if (i2 != 2) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                NetworkResponse networkResponse3 = (NetworkResponse) this.L$0;
                dv8.b(obj);
                networkResponse = networkResponse3;
            }
            networkResponse2 = (NetworkResponse) obj;
            i37Var = HomeViewModel.this.clientState;
            do {
                value = i37Var.getValue();
            } while (!i37Var.c(value, HomeClientState.copy$default((HomeClientState) value, networkResponse, networkResponse2, false, 4, null)));
            if (networkResponse instanceof NetworkResponse.Success) {
                List<HomeCards> cards = ((HomeV2Response) ((NetworkResponse.Success) networkResponse).getBody()).getCards();
                arrayList = new ArrayList();
                for (Object obj2 : cards) {
                    if (obj2 instanceof HomeCards.HomeRecentConversationData) {
                        arrayList.add(obj2);
                    }
                }
                homeViewModel = HomeViewModel.this;
                size = arrayList.size();
                i = 0;
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    homeViewModel.intercomDataLayer.addConversations(((HomeCards.HomeRecentConversationData) obj3).getConversations());
                }
            }
            return g2b.a;
            NetworkResponse networkResponse4 = (NetworkResponse) obj;
            this.L$0 = networkResponse4;
            this.label = 2;
            Object objG0 = uv2Var.g0(this);
            if (objG0 != v72Var) {
                networkResponse = networkResponse4;
                obj = objG0;
                networkResponse2 = (NetworkResponse) obj;
                i37Var = HomeViewModel.this.clientState;
                do {
                    value = i37Var.getValue();
                } while (!i37Var.c(value, HomeClientState.copy$default((HomeClientState) value, networkResponse, networkResponse2, false, 4, null)));
                if (networkResponse instanceof NetworkResponse.Success) {
                    List<HomeCards> cards2 = ((HomeV2Response) ((NetworkResponse.Success) networkResponse).getBody()).getCards();
                    arrayList = new ArrayList();
                    while (r10.hasNext()) {
                        if (obj2 instanceof HomeCards.HomeRecentConversationData) {
                            arrayList.add(obj2);
                        }
                    }
                    homeViewModel = HomeViewModel.this;
                    size = arrayList.size();
                    i = 0;
                    while (i < size) {
                        Object obj4 = arrayList.get(i);
                        i++;
                        homeViewModel.intercomDataLayer.addConversations(((HomeCards.HomeRecentConversationData) obj4).getConversations());
                    }
                }
                return g2b.a;
            }
            return v72Var;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$handleOpening$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.home.HomeViewModel$handleOpening$1", f = "HomeViewModel.kt", l = {SurveyViewModel.ENTITY_TYPE}, m = "invokeSuspend")
    public static final class C03741 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public C03741(r02<? super C03741> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return HomeViewModel.this.new C03741(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03741) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                f37 f37Var = HomeViewModel.this._effect;
                HomeUiEffects.NavigateToMessages navigateToMessages = HomeUiEffects.NavigateToMessages.INSTANCE;
                this.label = 1;
                Object objEmit = f37Var.emit(navigateToMessages, this);
                v72 v72Var = v72.t;
                if (objEmit == v72Var) {
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$handleOpening$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.home.HomeViewModel$handleOpening$2", f = "HomeViewModel.kt", l = {91, 105}, m = "invokeSuspend")
    public static final class C03752 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public C03752(r02<? super C03752> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return HomeViewModel.this.new C03752(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03752) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
        
            if (r11.emit(r0, r10) == r3) goto L26;
         */
        @Override // defpackage.ak0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                int r0 = r10.label
                r1 = 2
                r2 = 1
                v72 r3 = defpackage.v72.t
                if (r0 == 0) goto L1c
                if (r0 == r2) goto L18
                if (r0 != r1) goto L11
                defpackage.dv8.b(r11)
                goto L94
            L11:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r10)
                r10 = 0
                return r10
            L18:
                defpackage.dv8.b(r11)
                goto L2e
            L1c:
                defpackage.dv8.b(r11)
                io.intercom.android.sdk.m5.home.HomeViewModel r11 = io.intercom.android.sdk.m5.home.HomeViewModel.this
                io.intercom.android.sdk.m5.data.CommonRepository r11 = io.intercom.android.sdk.m5.home.HomeViewModel.access$getCommonRepository$p(r11)
                r10.label = r2
                java.lang.Object r11 = r11.openMessenger(r10)
                if (r11 != r3) goto L2e
                goto L93
            L2e:
                r6 = r11
                io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r6 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r6
                boolean r11 = r6 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success
                io.intercom.android.sdk.m5.home.HomeViewModel r0 = io.intercom.android.sdk.m5.home.HomeViewModel.this
                if (r11 != 0) goto L58
                i37 r11 = io.intercom.android.sdk.m5.home.HomeViewModel.access$getClientState$p(r0)
            L3b:
                java.lang.Object r0 = r11.getValue()
                r4 = r0
                io.intercom.android.sdk.m5.home.states.HomeClientState r4 = (io.intercom.android.sdk.m5.home.states.HomeClientState) r4
                r8 = 5
                r9 = 0
                r5 = 0
                r7 = 0
                io.intercom.android.sdk.m5.home.states.HomeClientState r1 = io.intercom.android.sdk.m5.home.states.HomeClientState.copy$default(r4, r5, r6, r7, r8, r9)
                boolean r0 = r11.c(r0, r1)
                if (r0 == 0) goto L3b
                io.intercom.android.sdk.m5.home.HomeViewModel r10 = io.intercom.android.sdk.m5.home.HomeViewModel.this
                io.intercom.android.sdk.m5.home.HomeViewModel.access$fetchHomeData(r10)
                g2b r10 = defpackage.g2b.a
                return r10
            L58:
                io.intercom.android.sdk.m5.home.HomeViewModel.access$fetchHomeData(r0)
                io.intercom.android.sdk.m5.home.HomeViewModel r11 = io.intercom.android.sdk.m5.home.HomeViewModel.this
                f37 r11 = io.intercom.android.sdk.m5.home.HomeViewModel.access$get_effect$p(r11)
                io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse$Success r6 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success) r6
                java.lang.Object r0 = r6.getBody()
                io.intercom.android.sdk.models.OpenMessengerResponse r0 = (io.intercom.android.sdk.models.OpenMessengerResponse) r0
                java.util.List r0 = r0.getOpenInboundConversations()
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L89
                io.intercom.android.sdk.m5.home.states.HomeUiEffects$NavigateToConversation r0 = new io.intercom.android.sdk.m5.home.states.HomeUiEffects$NavigateToConversation
                java.lang.Object r2 = r6.getBody()
                io.intercom.android.sdk.models.OpenMessengerResponse r2 = (io.intercom.android.sdk.models.OpenMessengerResponse) r2
                java.util.List r2 = r2.getOpenInboundConversations()
                java.lang.Object r2 = defpackage.th1.y(r2)
                java.lang.String r2 = (java.lang.String) r2
                r0.<init>(r2)
                goto L8b
            L89:
                io.intercom.android.sdk.m5.home.states.HomeUiEffects$NavigateToNewConversation r0 = io.intercom.android.sdk.m5.home.states.HomeUiEffects.NavigateToNewConversation.INSTANCE
            L8b:
                r10.label = r1
                java.lang.Object r10 = r11.emit(r0, r10)
                if (r10 != r3) goto L94
            L93:
                return r3
            L94:
                g2b r10 = defpackage.g2b.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.home.HomeViewModel.C03752.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public HomeViewModel(s66 s66Var, HomeRepository homeRepository, CommonRepository commonRepository, HomeReducer homeReducer, IntercomDataLayer intercomDataLayer, n72 n72Var) {
        s66Var.getClass();
        homeRepository.getClass();
        commonRepository.getClass();
        homeReducer.getClass();
        intercomDataLayer.getClass();
        n72Var.getClass();
        this.homeRepository = homeRepository;
        this.commonRepository = commonRepository;
        this.homeReducer = homeReducer;
        this.intercomDataLayer = intercomDataLayer;
        this.dispatcher = n72Var;
        am9 am9VarB = ty1.b(7, null);
        this._effect = am9VarB;
        this.effect = yk2.s(am9VarB, rhb.b(this), um9.a.a, 0);
        final a0a a0aVarB = b0a.b(new HomeClientState(null, null, false, 7, null));
        this.clientState = a0aVarB;
        this.uiState = yk2.u(new r54<HomeUiState>() { // from class: io.intercom.android.sdk.m5.home.HomeViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class AnonymousClass2<T> implements s54 {
                final /* synthetic */ s54 $this_unsafeFlow;
                final /* synthetic */ HomeViewModel this$0;

                /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @xm2(c = "io.intercom.android.sdk.m5.home.HomeViewModel$special$$inlined$map$1$2", f = "HomeViewModel.kt", l = {50}, m = "emit")
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

                public AnonymousClass2(s54 s54Var, HomeViewModel homeViewModel) {
                    this.$this_unsafeFlow = s54Var;
                    this.this$0 = homeViewModel;
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
                        HomeUiState homeUiStateComputeUiState$intercom_sdk_base_release = this.this$0.homeReducer.computeUiState$intercom_sdk_base_release((HomeClientState) obj, new HomeViewModel$uiState$1$1(this.this$0));
                        anonymousClass1.label = 1;
                        Object objEmit = s54Var.emit(homeUiStateComputeUiState$intercom_sdk_base_release, anonymousClass1);
                        v72 v72Var = v72.t;
                        if (objEmit == v72Var) {
                            return v72Var;
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
            public Object collect(s54<? super HomeUiState> s54Var, r02 r02Var) {
                Object objCollect = a0aVarB.collect(new AnonymousClass2(s54Var, this), r02Var);
                return objCollect == v72.t ? objCollect : g2b.a;
            }
        }, rhb.b(this), new uz9(5000L, Long.MAX_VALUE), new HomeUiState.Loading(null));
        oy0.d(rhb.b(this), null, null, new AnonymousClass1(s66Var, null), 3);
        oy0.d(rhb.b(this), null, null, new AnonymousClass2(s66Var, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchHomeData() {
        oy0.d(rhb.b(this), this.dispatcher, null, new C03731(null), 2);
    }

    private final void handleOpening(OpenToSpace openToSpace) {
        int i = WhenMappings.$EnumSwitchMapping$0[openToSpace.ordinal()];
        if (i == 1) {
            fetchHomeData();
            return;
        }
        if (i == 2) {
            oy0.d(rhb.b(this), null, null, new C03741(null), 3);
            return;
        }
        if (i != 3) {
            u.b();
        } else {
            if (this.hasConversationScreenOpenedDirectlyFromHome) {
                return;
            }
            this.hasConversationScreenOpenedDirectlyFromHome = true;
            oy0.d(rhb.b(this), null, null, new C03752(null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onConfig(AppConfig appConfig) {
        OpenToSpace openTo;
        HomeConfig home;
        OpenConfig openConfig;
        ConfigModules configModules = appConfig.getConfigModules();
        if (configModules == null || (home = configModules.getHome()) == null || (openConfig = home.getOpenConfig()) == null || (openTo = openConfig.getOpenTo()) == null) {
            openTo = OpenToSpace.HOME;
        }
        handleOpening(openTo);
    }

    public final zl9<HomeUiEffects> getEffect() {
        return this.effect;
    }

    public final zz9<HomeUiState> getUiState() {
        return this.uiState;
    }

    public final void onHeaderImageLoaded() {
        HomeClientState value;
        i37<HomeClientState> i37Var = this.clientState;
        do {
            value = i37Var.getValue();
        } while (!i37Var.c(value, HomeClientState.copy$default(value, null, null, true, 3, null)));
    }

    public final void onRetryClicked() {
        HomeClientState value;
        i37<HomeClientState> i37Var = this.clientState;
        do {
            value = i37Var.getValue();
        } while (!i37Var.c(value, HomeClientState.copy$default(value, null, null, false, 4, null)));
        fetchHomeData();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [io.intercom.android.sdk.m5.home.HomeViewModel$Companion$factory$1] */
        private final HomeViewModel$Companion$factory$1 factory(final s66 s66Var) {
            return new thb.c() { // from class: io.intercom.android.sdk.m5.home.HomeViewModel$Companion$factory$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // thb.c
                public <T extends mhb> T create(Class<T> cls) {
                    cls.getClass();
                    IntercomDataLayer dataLayer = Injector.get().getDataLayer();
                    HomeRepository homeRepository = new HomeRepository(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                    MessengerApi messengerApi = Injector.get().getMessengerApi();
                    messengerApi.getClass();
                    dataLayer.getClass();
                    return new HomeViewModel(s66Var, homeRepository, new CommonRepository(messengerApi, dataLayer), null, dataLayer, null, 40, null);
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

        public final HomeViewModel create(whb whbVar, s66 s66Var) {
            whbVar.getClass();
            s66Var.getClass();
            HomeViewModel$Companion$factory$1 homeViewModel$Companion$factory$1Factory = factory(s66Var);
            homeViewModel$Companion$factory$1Factory.getClass();
            vhb viewModelStore = whbVar.getViewModelStore();
            lb2 defaultViewModelCreationExtras = whbVar instanceof wt4 ? ((wt4) whbVar).getDefaultViewModelCreationExtras() : lb2.a.b;
            viewModelStore.getClass();
            defaultViewModelCreationExtras.getClass();
            uhb uhbVar = new uhb(viewModelStore, homeViewModel$Companion$factory$1Factory, defaultViewModelCreationExtras);
            sd1 sd1VarA = ll8.a(HomeViewModel.class);
            String strE = sd1VarA.e();
            if (strE != null) {
                return (HomeViewModel) uhbVar.a(sd1VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strE));
            }
            z90.a("Local and anonymous classes can not be ViewModels");
            return null;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HomeViewModel(s66 s66Var, HomeRepository homeRepository, CommonRepository commonRepository, HomeReducer homeReducer, IntercomDataLayer intercomDataLayer, n72 n72Var, int i, qq2 qq2Var) {
        n72 n72Var2;
        HomeReducer homeReducer2 = (i & 8) != 0 ? new HomeReducer(null, null, 3, null) : homeReducer;
        if ((i & 32) != 0) {
            et2 et2Var = i23.a;
            n72Var2 = wr2.v;
        } else {
            n72Var2 = n72Var;
        }
        this(s66Var, homeRepository, commonRepository, homeReducer2, intercomDataLayer, n72Var2);
    }
}
