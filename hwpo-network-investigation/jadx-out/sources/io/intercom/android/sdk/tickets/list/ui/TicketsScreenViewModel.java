package io.intercom.android.sdk.tickets.list.ui;

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
import defpackage.pp7;
import defpackage.qq2;
import defpackage.qr7;
import defpackage.r02;
import defpackage.r54;
import defpackage.rhb;
import defpackage.rr7;
import defpackage.s54;
import defpackage.sd1;
import defpackage.sr7;
import defpackage.t11;
import defpackage.t72;
import defpackage.thb;
import defpackage.ty1;
import defpackage.u02;
import defpackage.uhb;
import defpackage.um9;
import defpackage.v72;
import defpackage.vhb;
import defpackage.whb;
import defpackage.wn5;
import defpackage.wr2;
import defpackage.wt4;
import defpackage.wv5;
import defpackage.xm2;
import defpackage.yk2;
import defpackage.yr7;
import defpackage.z90;
import defpackage.zl9;
import defpackage.zr7;
import defpackage.zz9;
import io.ably.lib.transport.Defaults;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import io.intercom.android.sdk.tickets.list.data.TicketsPagingSource;
import io.intercom.android.sdk.tickets.list.reducers.TicketRowReducerKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketsScreenViewModel extends mhb {
    private final f37<TicketsScreenEffects> _effect;
    private final i37<NetworkResponse<OpenMessengerResponse>> _openState;
    private final CommonRepository commonRepository;
    private final n72 dispatcher;
    private final zl9<TicketsScreenEffects> effect;
    private final IntercomDataLayer intercomDataLayer;
    private final zz9<NetworkResponse<OpenMessengerResponse>> openState;
    private final r54<sr7<TicketRowData>> pagerFlow;
    private final TicketRepository repository;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2", f = "TicketsScreenViewModel.kt", l = {Defaults.HTTP_ASYNC_THREADPOOL_SIZE}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        Object L$0;
        int label;

        public AnonymousClass2(r02<? super AnonymousClass2> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return TicketsScreenViewModel.this.new AnonymousClass2(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass2) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            i37 i37Var;
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                i37 i37Var2 = TicketsScreenViewModel.this._openState;
                CommonRepository commonRepository = TicketsScreenViewModel.this.commonRepository;
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$3", f = "TicketsScreenViewModel.kt", l = {71}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public AnonymousClass3(r02<? super AnonymousClass3> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return TicketsScreenViewModel.this.new AnonymousClass3(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass3) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                final r54<ParsedNexusEvent> r54VarRealTimeEvents = TicketsScreenViewModel.this.repository.realTimeEvents();
                final r54<Object> r54Var = new r54<Object>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$3$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$3$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public static final class AnonymousClass2<T> implements s54 {
                        final /* synthetic */ s54 $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$3$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        @xm2(c = "io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$3$invokeSuspend$$inlined$filterIsInstance$1$2", f = "TicketsScreenViewModel.kt", l = {50}, m = "emit")
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
                                if (obj instanceof ParsedNexusEvent.ConversationNexusEvent.NewComment) {
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
                        Object objCollect = r54VarRealTimeEvents.collect(new AnonymousClass2(s54Var), r02Var);
                        return objCollect == v72.t ? objCollect : g2b.a;
                    }
                };
                r54<ParsedNexusEvent.ConversationNexusEvent.NewComment> r54Var2 = new r54<ParsedNexusEvent.ConversationNexusEvent.NewComment>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$3$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$3$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public static final class AnonymousClass2<T> implements s54 {
                        final /* synthetic */ s54 $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$3$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        @xm2(c = "io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$3$invokeSuspend$$inlined$filter$1$2", f = "TicketsScreenViewModel.kt", l = {50}, m = "emit")
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
                                String ticketId = ((ParsedNexusEvent.ConversationNexusEvent.NewComment) obj).getTicketId();
                                if (!(ticketId == null || ticketId.length() == 0)) {
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
                    public Object collect(s54<? super ParsedNexusEvent.ConversationNexusEvent.NewComment> s54Var, r02 r02Var) {
                        Object objCollect = r54Var.collect(new AnonymousClass2(s54Var), r02Var);
                        return objCollect == v72.t ? objCollect : g2b.a;
                    }
                };
                final TicketsScreenViewModel ticketsScreenViewModel = TicketsScreenViewModel.this;
                s54<? super ParsedNexusEvent.ConversationNexusEvent.NewComment> s54Var = new s54() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel.3.2
                    public final Object emit(ParsedNexusEvent.ConversationNexusEvent.NewComment newComment, r02<? super g2b> r02Var) {
                        Object objEmit = ticketsScreenViewModel._effect.emit(TicketsScreenEffects.RefreshTickets.INSTANCE, r02Var);
                        return objEmit == v72.t ? objEmit : g2b.a;
                    }

                    @Override // defpackage.s54
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, r02 r02Var) {
                        return emit((ParsedNexusEvent.ConversationNexusEvent.NewComment) obj2, (r02<? super g2b>) r02Var);
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$onRetryOpen$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$onRetryOpen$1", f = "TicketsScreenViewModel.kt", l = {Defaults.PORT}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        Object L$0;
        int label;

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return TicketsScreenViewModel.this.new AnonymousClass1(r02Var);
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
                i37 i37Var2 = TicketsScreenViewModel.this._openState;
                CommonRepository commonRepository = TicketsScreenViewModel.this.commonRepository;
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

    public TicketsScreenViewModel(TicketRepository ticketRepository, n72 n72Var, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository, pp7<Long, Ticket> pp7Var) {
        ticketRepository.getClass();
        n72Var.getClass();
        intercomDataLayer.getClass();
        commonRepository.getClass();
        pp7Var.getClass();
        this.repository = ticketRepository;
        this.dispatcher = n72Var;
        this.intercomDataLayer = intercomDataLayer;
        this.commonRepository = commonRepository;
        final r54<sr7<Ticket>> r54Var = pp7Var.a;
        this.pagerFlow = t11.a(new r54<sr7<TicketRowData>>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class AnonymousClass2<T> implements s54 {
                final /* synthetic */ s54 $this_unsafeFlow;

                /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @xm2(c = "io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$special$$inlined$map$1$2", f = "TicketsScreenViewModel.kt", l = {50}, m = "emit")
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
                        sr7 sr7Var = (sr7) obj;
                        TicketsScreenViewModel$pagerFlow$1$1 ticketsScreenViewModel$pagerFlow$1$1 = TicketsScreenViewModel$pagerFlow$1$1.INSTANCE;
                        sr7Var.getClass();
                        ticketsScreenViewModel$pagerFlow$1$1.getClass();
                        sr7 sr7Var2 = new sr7(new yr7(sr7Var.a, ticketsScreenViewModel$pagerFlow$1$1), sr7Var.b, sr7Var.c, rr7.t);
                        anonymousClass1.label = 1;
                        Object objEmit = s54Var.emit(sr7Var2, anonymousClass1);
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
            public Object collect(s54<? super sr7<TicketRowData>> s54Var, r02 r02Var) {
                Object objCollect = r54Var.collect(new AnonymousClass2(s54Var), r02Var);
                return objCollect == v72.t ? objCollect : g2b.a;
            }
        }, rhb.b(this));
        a0a a0aVarB = b0a.b(null);
        this._openState = a0aVarB;
        this.openState = yk2.b(a0aVarB);
        am9 am9VarB = ty1.b(7, null);
        this._effect = am9VarB;
        this.effect = yk2.s(am9VarB, rhb.b(this), um9.a.a, 0);
        oy0.d(rhb.b(this), n72Var, null, new AnonymousClass2(null), 2);
        oy0.d(rhb.b(this), null, null, new AnonymousClass3(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zr7 _init_$lambda$0(TicketRepository ticketRepository) {
        return new TicketsPagingSource(ticketRepository);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object pagerFlow$lambda$1$reduceTicketRowData(Ticket ticket, r02 r02Var) {
        return TicketRowReducerKt.reduceTicketRowData(ticket);
    }

    public final zl9<TicketsScreenEffects> getEffect() {
        return this.effect;
    }

    public final zz9<NetworkResponse<OpenMessengerResponse>> getOpenState() {
        return this.openState;
    }

    public final r54<sr7<TicketRowData>> getPagerFlow() {
        return this.pagerFlow;
    }

    public final void onRetryOpen() {
        this._openState.setValue(null);
        oy0.d(rhb.b(this), this.dispatcher, null, new AnonymousClass1(null), 2);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$Companion$factory$1] */
        private final TicketsScreenViewModel$Companion$factory$1 factory() {
            return new thb.c() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$Companion$factory$1
                @Override // thb.c
                public <T extends mhb> T create(Class<T> cls) {
                    cls.getClass();
                    return new TicketsScreenViewModel(null, null, null, null, null, 31, null);
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

        public final TicketsScreenViewModel create(whb whbVar) {
            whbVar.getClass();
            TicketsScreenViewModel$Companion$factory$1 ticketsScreenViewModel$Companion$factory$1Factory = factory();
            ticketsScreenViewModel$Companion$factory$1Factory.getClass();
            vhb viewModelStore = whbVar.getViewModelStore();
            lb2 defaultViewModelCreationExtras = whbVar instanceof wt4 ? ((wt4) whbVar).getDefaultViewModelCreationExtras() : lb2.a.b;
            viewModelStore.getClass();
            defaultViewModelCreationExtras.getClass();
            uhb uhbVar = new uhb(viewModelStore, ticketsScreenViewModel$Companion$factory$1Factory, defaultViewModelCreationExtras);
            sd1 sd1VarA = ll8.a(TicketsScreenViewModel.class);
            String strE = sd1VarA.e();
            if (strE != null) {
                return (TicketsScreenViewModel) uhbVar.a(sd1VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strE));
            }
            z90.a("Local and anonymous classes can not be ViewModels");
            return null;
        }

        private Companion() {
        }
    }

    public TicketsScreenViewModel(TicketRepository ticketRepository, n72 n72Var, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository, pp7 pp7Var, int i, qq2 qq2Var) {
        ticketRepository = (i & 1) != 0 ? new TicketRepository(null, null, null, null, null, 31, null) : ticketRepository;
        if ((i & 2) != 0) {
            et2 et2Var = i23.a;
            n72Var = wr2.v;
        }
        intercomDataLayer = (i & 4) != 0 ? Injector.get().getDataLayer() : intercomDataLayer;
        if ((i & 8) != 0) {
            MessengerApi messengerApi = Injector.get().getMessengerApi();
            messengerApi.getClass();
            commonRepository = new CommonRepository(messengerApi, intercomDataLayer);
        }
        this(ticketRepository, n72Var, intercomDataLayer, commonRepository, (i & 16) != 0 ? new pp7(new qr7(10), new wv5(1, ticketRepository)) : pp7Var);
    }

    public TicketsScreenViewModel() {
        this(null, null, null, null, null, 31, null);
    }
}
