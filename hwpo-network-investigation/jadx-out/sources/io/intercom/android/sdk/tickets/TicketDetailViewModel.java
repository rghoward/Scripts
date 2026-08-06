package io.intercom.android.sdk.tickets;

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
import defpackage.thb;
import defpackage.u;
import defpackage.u02;
import defpackage.uhb;
import defpackage.v72;
import defpackage.vhb;
import defpackage.whb;
import defpackage.wn5;
import defpackage.wr2;
import defpackage.wt4;
import defpackage.xj5;
import defpackage.xm2;
import defpackage.z2a;
import defpackage.z90;
import defpackage.zz9;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketDetailViewModel extends mhb {
    private final i37<TicketDetailState> _stateFlow;
    private final n72 dispatcher;
    private final IntercomDataLayer intercomDataLayer;
    private final TicketLaunchedFrom launchedFrom;
    private boolean metricSent;
    private final MetricTracker metricTracker;
    private final TicketRepository repository;
    private final zz9<TicketDetailState> stateFlow;
    private String ticketId;
    private final UserIdentity user;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.TicketDetailViewModel$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.tickets.TicketDetailViewModel$2", f = "TicketDetailViewModel.kt", l = {86}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public AnonymousClass2(r02<? super AnonymousClass2> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return TicketDetailViewModel.this.new AnonymousClass2(r02Var);
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
                final r54<ParsedNexusEvent> r54VarRealTimeEvents = TicketDetailViewModel.this.repository.realTimeEvents();
                final r54<Object> r54Var = new r54<Object>() { // from class: io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public static final class AnonymousClass2<T> implements s54 {
                        final /* synthetic */ s54 $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        @xm2(c = "io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2", f = "TicketDetailViewModel.kt", l = {50}, m = "emit")
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
                final TicketDetailViewModel ticketDetailViewModel = TicketDetailViewModel.this;
                r54<ParsedNexusEvent.ConversationNexusEvent.NewComment> r54Var2 = new r54<ParsedNexusEvent.ConversationNexusEvent.NewComment>() { // from class: io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public static final class AnonymousClass2<T> implements s54 {
                        final /* synthetic */ s54 $this_unsafeFlow;
                        final /* synthetic */ TicketDetailViewModel this$0;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        @xm2(c = "io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filter$1$2", f = "TicketDetailViewModel.kt", l = {50}, m = "emit")
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

                        public AnonymousClass2(s54 s54Var, TicketDetailViewModel ticketDetailViewModel) {
                            this.$this_unsafeFlow = s54Var;
                            this.this$0 = ticketDetailViewModel;
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
                                ParsedNexusEvent.ConversationNexusEvent.NewComment newComment = (ParsedNexusEvent.ConversationNexusEvent.NewComment) obj;
                                String ticketId = newComment.getTicketId();
                                if (ticketId != null && !z2a.w(ticketId) && xj5.a(newComment.getTicketId(), this.this$0.ticketId)) {
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
                        Object objCollect = r54Var.collect(new AnonymousClass2(s54Var, ticketDetailViewModel), r02Var);
                        return objCollect == v72.t ? objCollect : g2b.a;
                    }
                };
                final TicketDetailViewModel ticketDetailViewModel2 = TicketDetailViewModel.this;
                s54<? super ParsedNexusEvent.ConversationNexusEvent.NewComment> s54Var = new s54() { // from class: io.intercom.android.sdk.tickets.TicketDetailViewModel.2.2
                    public final Object emit(ParsedNexusEvent.ConversationNexusEvent.NewComment newComment, r02<? super g2b> r02Var) {
                        TicketDetailViewModel ticketDetailViewModel3 = ticketDetailViewModel2;
                        String str = ticketDetailViewModel3.ticketId;
                        str.getClass();
                        ticketDetailViewModel3.fetchTicketDetail$intercom_sdk_base_release(str);
                        return g2b.a;
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.TicketDetailViewModel$markAsReadIfNecessary$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.tickets.TicketDetailViewModel$markAsReadIfNecessary$1", f = "TicketDetailViewModel.kt", l = {95}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ Ticket $ticket;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ticket ticket, r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
            this.$ticket = ticket;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return TicketDetailViewModel.this.new AnonymousClass1(this.$ticket, r02Var);
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
                TicketRepository ticketRepository = TicketDetailViewModel.this.repository;
                String id = this.$ticket.getId();
                this.label = 1;
                Object objMarkAsRead = ticketRepository.markAsRead(id, this);
                v72 v72Var = v72.t;
                if (objMarkAsRead == v72Var) {
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

    public TicketDetailViewModel(TicketLaunchedFrom ticketLaunchedFrom, UserIdentity userIdentity, MetricTracker metricTracker, TicketRepository ticketRepository, n72 n72Var, IntercomDataLayer intercomDataLayer) {
        ticketLaunchedFrom.getClass();
        userIdentity.getClass();
        metricTracker.getClass();
        ticketRepository.getClass();
        n72Var.getClass();
        intercomDataLayer.getClass();
        this.launchedFrom = ticketLaunchedFrom;
        this.user = userIdentity;
        this.metricTracker = metricTracker;
        this.repository = ticketRepository;
        this.dispatcher = n72Var;
        this.intercomDataLayer = intercomDataLayer;
        a0a a0aVarB = b0a.b(TicketDetailState.Initial.INSTANCE);
        this._stateFlow = a0aVarB;
        this.stateFlow = a0aVarB;
        if (ticketLaunchedFrom instanceof TicketLaunchedFrom.Conversation) {
            TicketLaunchedFrom.Conversation conversation = (TicketLaunchedFrom.Conversation) ticketLaunchedFrom;
            fireMetricIfNecessary(conversation.getTicket());
            markAsReadIfNecessary(conversation.getTicket());
            Ticket ticket = conversation.getTicket();
            this.ticketId = ticket.getId();
            a0aVarB.setValue(TicketDetailReducerKt.computeTicketViewState(ticket, userIdentity, getActiveAdminsAvatars(), ticketLaunchedFrom));
        } else {
            if (!(ticketLaunchedFrom instanceof TicketLaunchedFrom.Other)) {
                u.b();
                throw null;
            }
            fetchTicketDetail$intercom_sdk_base_release(((TicketLaunchedFrom.Other) ticketLaunchedFrom).getTicketId());
        }
        oy0.d(rhb.b(this), null, null, new AnonymousClass2(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireMetricIfNecessary(Ticket ticket) {
        if (this.metricSent) {
            return;
        }
        MetricTracker metricTracker = this.metricTracker;
        Long lValueOf = Long.valueOf(ticket.getTicketTypeId());
        String conversationId = ticket.getConversationId();
        if (conversationId == null) {
            conversationId = BuildConfig.FLAVOR;
        }
        metricTracker.viewedTicketDetails(lValueOf, conversationId, ticket.getCurrentStatus().getType(), this.launchedFrom.getFrom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<AvatarWrapper> getActiveAdminsAvatars() {
        List<Participant> builtActiveAdmins = this.intercomDataLayer.getTeamPresence().getValue().getBuiltActiveAdmins();
        ArrayList arrayList = new ArrayList(ph1.n(builtActiveAdmins, 10));
        for (Participant participant : builtActiveAdmins) {
            Avatar avatar = participant.getAvatar();
            avatar.getClass();
            Boolean boolIsBot = participant.isBot();
            boolIsBot.getClass();
            arrayList.add(new AvatarWrapper(avatar, boolIsBot.booleanValue()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markAsReadIfNecessary(Ticket ticket) {
        if (xj5.a(ticket.isRead(), Boolean.FALSE)) {
            oy0.d(rhb.b(this), this.dispatcher, null, new AnonymousClass1(ticket, null), 2);
        }
    }

    public final void fetchTicketDetail$intercom_sdk_base_release(String str) {
        str.getClass();
        if (z2a.w(str)) {
            this._stateFlow.setValue(new TicketDetailState.Error(new ErrorState.WithoutCTA(0, 0, Integer.valueOf(R.string.intercom_error_loading_ticket), 3, null)));
        } else {
            oy0.d(rhb.b(this), this.dispatcher, null, new TicketDetailViewModel$fetchTicketDetail$1(this, str, null), 2);
        }
    }

    public final zz9<TicketDetailState> getStateFlow() {
        return this.stateFlow;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [io.intercom.android.sdk.tickets.TicketDetailViewModel$Companion$factory$1] */
        private final TicketDetailViewModel$Companion$factory$1 factory(final TicketLaunchedFrom ticketLaunchedFrom) {
            return new thb.c() { // from class: io.intercom.android.sdk.tickets.TicketDetailViewModel$Companion$factory$1
                @Override // thb.c
                public <T extends mhb> T create(Class<T> cls) {
                    cls.getClass();
                    return new TicketDetailViewModel(ticketLaunchedFrom, null, null, null, null, null, 62, null);
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

        public final TicketDetailViewModel create(whb whbVar, TicketLaunchedFrom ticketLaunchedFrom) {
            whbVar.getClass();
            ticketLaunchedFrom.getClass();
            TicketDetailViewModel$Companion$factory$1 ticketDetailViewModel$Companion$factory$1Factory = factory(ticketLaunchedFrom);
            ticketDetailViewModel$Companion$factory$1Factory.getClass();
            vhb viewModelStore = whbVar.getViewModelStore();
            lb2 defaultViewModelCreationExtras = whbVar instanceof wt4 ? ((wt4) whbVar).getDefaultViewModelCreationExtras() : lb2.a.b;
            viewModelStore.getClass();
            defaultViewModelCreationExtras.getClass();
            uhb uhbVar = new uhb(viewModelStore, ticketDetailViewModel$Companion$factory$1Factory, defaultViewModelCreationExtras);
            sd1 sd1VarA = ll8.a(TicketDetailViewModel.class);
            String strE = sd1VarA.e();
            if (strE != null) {
                return (TicketDetailViewModel) uhbVar.a(sd1VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strE));
            }
            z90.a("Local and anonymous classes can not be ViewModels");
            return null;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TicketDetailViewModel(TicketLaunchedFrom ticketLaunchedFrom, UserIdentity userIdentity, MetricTracker metricTracker, TicketRepository ticketRepository, n72 n72Var, IntercomDataLayer intercomDataLayer, int i, qq2 qq2Var) {
        n72 n72Var2;
        UserIdentity userIdentity2 = (i & 2) != 0 ? Injector.get().getUserIdentity() : userIdentity;
        MetricTracker metricTracker2 = (i & 4) != 0 ? Injector.get().getMetricTracker() : metricTracker;
        TicketRepository ticketRepository2 = (i & 8) != 0 ? new TicketRepository(null, null, null, null, null, 31, null) : ticketRepository;
        if ((i & 16) != 0) {
            et2 et2Var = i23.a;
            n72Var2 = wr2.v;
        } else {
            n72Var2 = n72Var;
        }
        this(ticketLaunchedFrom, userIdentity2, metricTracker2, ticketRepository2, n72Var2, (i & 32) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }
}
