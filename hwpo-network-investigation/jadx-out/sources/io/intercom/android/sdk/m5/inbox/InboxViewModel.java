package io.intercom.android.sdk.m5.inbox;

import defpackage.a0a;
import defpackage.aa0;
import defpackage.am9;
import defpackage.b0a;
import defpackage.bw2;
import defpackage.ci4;
import defpackage.df1;
import defpackage.dv8;
import defpackage.el5;
import defpackage.et2;
import defpackage.f37;
import defpackage.g2b;
import defpackage.i23;
import defpackage.i37;
import defpackage.if3;
import defpackage.lb2;
import defpackage.ll8;
import defpackage.mhb;
import defpackage.n72;
import defpackage.op7;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.po7;
import defpackage.qq2;
import defpackage.qr7;
import defpackage.r02;
import defpackage.r54;
import defpackage.rhb;
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
import defpackage.xm2;
import defpackage.yk2;
import defpackage.z90;
import defpackage.zl9;
import defpackage.zr7;
import defpackage.zz9;
import io.intercom.android.nexus.NexusEventType;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.m5.inbox.data.InboxRepository;
import io.intercom.android.sdk.m5.inbox.states.InboxUiEffects;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class InboxViewModel extends mhb {
    private static final long TYPING_INDICATOR_TIMEOUT = 5000;
    private final f37<InboxUiEffects> _effect;
    private final i37<NetworkResponse<OpenMessengerResponse>> _openState;
    private final i37<Map<String, CurrentlyTypingState>> _typingConversations;
    private final CommonRepository commonRepository;
    private final n72 dispatcher;
    private final zl9<InboxUiEffects> effect;
    private EmptyState emptyState;
    private final r54<sr7<Conversation>> inboxPagingData;
    private final InboxRepository inboxRepository;
    private final IntercomDataLayer intercomDataLayer;
    private final zz9<NetworkResponse<OpenMessengerResponse>> openState;
    private final zz9<Map<String, CurrentlyTypingState>> typingConversations;
    private final ConcurrentHashMap<String, el5> typingJobs;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.inbox.InboxViewModel$1", f = "InboxViewModel.kt", l = {95}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        Object L$0;
        int label;

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return InboxViewModel.this.new AnonymousClass1(r02Var);
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
                i37 i37Var2 = InboxViewModel.this._openState;
                CommonRepository commonRepository = InboxViewModel.this.commonRepository;
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.inbox.InboxViewModel$2", f = "InboxViewModel.kt", l = {101}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public AnonymousClass2(r02<? super AnonymousClass2> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return InboxViewModel.this.new AnonymousClass2(r02Var);
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
                final r54<ParsedNexusEvent> r54VarRealTimeEvents = InboxViewModel.this.inboxRepository.realTimeEvents();
                final r54<Object> r54Var = new r54<Object>() { // from class: io.intercom.android.sdk.m5.inbox.InboxViewModel$2$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public static final class AnonymousClass2<T> implements s54 {
                        final /* synthetic */ s54 $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        @xm2(c = "io.intercom.android.sdk.m5.inbox.InboxViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2", f = "InboxViewModel.kt", l = {50}, m = "emit")
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
                        Object objCollect = r54VarRealTimeEvents.collect(new AnonymousClass2(s54Var), r02Var);
                        return objCollect == v72.t ? objCollect : g2b.a;
                    }
                };
                r54<ParsedNexusEvent.ConversationNexusEvent> r54Var2 = new r54<ParsedNexusEvent.ConversationNexusEvent>() { // from class: io.intercom.android.sdk.m5.inbox.InboxViewModel$2$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public static final class AnonymousClass2<T> implements s54 {
                        final /* synthetic */ s54 $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        @xm2(c = "io.intercom.android.sdk.m5.inbox.InboxViewModel$2$invokeSuspend$$inlined$filter$1$2", f = "InboxViewModel.kt", l = {50}, m = "emit")
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
                final InboxViewModel inboxViewModel = InboxViewModel.this;
                s54<? super ParsedNexusEvent.ConversationNexusEvent> s54Var = new s54() { // from class: io.intercom.android.sdk.m5.inbox.InboxViewModel.2.2
                    public final Object emit(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, r02<? super g2b> r02Var) {
                        Object objEmit = inboxViewModel._effect.emit(InboxUiEffects.RefreshInbox.INSTANCE, r02Var);
                        return objEmit == v72.t ? objEmit : g2b.a;
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.inbox.InboxViewModel$3", f = "InboxViewModel.kt", l = {108}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public AnonymousClass3(r02<? super AnonymousClass3> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return InboxViewModel.this.new AnonymousClass3(r02Var);
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
                final r54<ParsedNexusEvent> r54VarRealTimeEvents = InboxViewModel.this.inboxRepository.realTimeEvents();
                r54<Object> r54Var = new r54<Object>() { // from class: io.intercom.android.sdk.m5.inbox.InboxViewModel$3$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$3$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public static final class AnonymousClass2<T> implements s54 {
                        final /* synthetic */ s54 $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$3$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        @xm2(c = "io.intercom.android.sdk.m5.inbox.InboxViewModel$3$invokeSuspend$$inlined$filterIsInstance$1$2", f = "InboxViewModel.kt", l = {50}, m = "emit")
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
                                if (obj instanceof ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping) {
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
                final InboxViewModel inboxViewModel = InboxViewModel.this;
                s54<? super Object> s54Var = new s54() { // from class: io.intercom.android.sdk.m5.inbox.InboxViewModel.3.1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$3$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    @xm2(c = "io.intercom.android.sdk.m5.inbox.InboxViewModel$3$1$2", f = "InboxViewModel.kt", l = {121}, m = "invokeSuspend")
                    public static final class AnonymousClass2 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
                        final /* synthetic */ String $conversationId;
                        int label;
                        final /* synthetic */ InboxViewModel this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(InboxViewModel inboxViewModel, String str, r02<? super AnonymousClass2> r02Var) {
                            super(2, r02Var);
                            this.this$0 = inboxViewModel;
                            this.$conversationId = str;
                        }

                        @Override // defpackage.ak0
                        public final r02<g2b> create(Object obj, r02<?> r02Var) {
                            return new AnonymousClass2(this.this$0, this.$conversationId, r02Var);
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
                                this.label = 1;
                                Object objB = bw2.b(InboxViewModel.TYPING_INDICATOR_TIMEOUT, this);
                                v72 v72Var = v72.t;
                                if (objB == v72Var) {
                                    return v72Var;
                                }
                            } else {
                                if (i != 1) {
                                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                dv8.b(obj);
                            }
                            this.this$0.clearTypingState(this.$conversationId);
                            return g2b.a;
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final Object emit(ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping adminIsTyping, r02<? super g2b> r02Var) {
                        Object value;
                        Map mapSingletonMap;
                        String conversationId = adminIsTyping.getConversationId();
                        el5 el5Var = (el5) inboxViewModel.typingJobs.get(conversationId);
                        if (el5Var != null) {
                            el5Var.k(null);
                        }
                        i37 i37Var = inboxViewModel._typingConversations;
                        do {
                            value = i37Var.getValue();
                            Map map = (Map) value;
                            CurrentlyTypingState currentlyTypingState = new CurrentlyTypingState(new AvatarWrapper(adminIsTyping.getAvatar(), adminIsTyping.isBot()), adminIsTyping.getShowAvatar() && !adminIsTyping.isBot(), null, TypingIndicatorType.ADMIN, 4, null);
                            map.getClass();
                            if (map.isEmpty()) {
                                mapSingletonMap = Collections.singletonMap(conversationId, currentlyTypingState);
                                mapSingletonMap.getClass();
                            } else {
                                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                                linkedHashMap.put(conversationId, currentlyTypingState);
                                mapSingletonMap = linkedHashMap;
                            }
                        } while (!i37Var.c(value, mapSingletonMap));
                        inboxViewModel.typingJobs.put(conversationId, oy0.d(rhb.b(inboxViewModel), null, null, new AnonymousClass2(inboxViewModel, conversationId, null), 3));
                        return g2b.a;
                    }

                    @Override // defpackage.s54
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, r02 r02Var) {
                        return emit((ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping) obj2, (r02<? super g2b>) r02Var);
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$onConversationClick$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.inbox.InboxViewModel$onConversationClick$1", f = "InboxViewModel.kt", l = {143}, m = "invokeSuspend")
    public static final class C03781 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ Conversation $it;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03781(Conversation conversation, r02<? super C03781> r02Var) {
            super(2, r02Var);
            this.$it = conversation;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return InboxViewModel.this.new C03781(this.$it, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03781) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                f37 f37Var = InboxViewModel.this._effect;
                InboxUiEffects.NavigateToConversation navigateToConversation = new InboxUiEffects.NavigateToConversation(this.$it);
                this.label = 1;
                Object objEmit = f37Var.emit(navigateToConversation, this);
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$onRetryOpen$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.inbox.InboxViewModel$onRetryOpen$1", f = "InboxViewModel.kt", l = {137}, m = "invokeSuspend")
    public static final class C03791 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        Object L$0;
        int label;

        public C03791(r02<? super C03791> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return InboxViewModel.this.new C03791(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03791) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            i37 i37Var;
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                i37 i37Var2 = InboxViewModel.this._openState;
                CommonRepository commonRepository = InboxViewModel.this.commonRepository;
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

    public InboxViewModel(InboxRepository inboxRepository, n72 n72Var, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository) {
        inboxRepository.getClass();
        n72Var.getClass();
        intercomDataLayer.getClass();
        commonRepository.getClass();
        this.inboxRepository = inboxRepository;
        this.dispatcher = n72Var;
        this.intercomDataLayer = intercomDataLayer;
        this.commonRepository = commonRepository;
        a0a a0aVarB = b0a.b(null);
        this._openState = a0aVarB;
        this.openState = yk2.b(a0aVarB);
        a0a a0aVarB2 = b0a.b(if3.t);
        this._typingConversations = a0aVarB2;
        this.typingConversations = yk2.b(a0aVarB2);
        this.typingJobs = new ConcurrentHashMap<>();
        this.emptyState = EmptyState.Companion.getNULL();
        this.inboxPagingData = t11.a(new po7(new op7(new df1(1, this), null), new qr7(20)).e, rhb.b(this));
        am9 am9VarB = ty1.b(7, null);
        this._effect = am9VarB;
        this.effect = yk2.s(am9VarB, rhb.b(this), um9.a.a, 0);
        oy0.d(rhb.b(this), n72Var, null, new AnonymousClass1(null), 2);
        oy0.d(rhb.b(this), null, null, new AnonymousClass2(null), 3);
        oy0.d(rhb.b(this), null, null, new AnonymousClass3(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    public final void clearTypingState(String str) {
        Map<String, CurrentlyTypingState> value;
        Map<String, CurrentlyTypingState> map;
        el5 el5Var = this.typingJobs.get(str);
        if (el5Var != null) {
            el5Var.k(null);
        }
        this.typingJobs.remove(str);
        i37<Map<String, CurrentlyTypingState>> i37Var = this._typingConversations;
        do {
            value = i37Var.getValue();
            Map<String, CurrentlyTypingState> map2 = value;
            map2.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
            linkedHashMap.remove(str);
            int size = linkedHashMap.size();
            if (size == 0) {
                map = if3.t;
            } else if (size == 1) {
                map = linkedHashMap;
                Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                Map<String, CurrentlyTypingState> mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
                mapSingletonMap.getClass();
                map = mapSingletonMap;
            }
            map = linkedHashMap;
        } while (!i37Var.c(value, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zr7 inboxPagingData$lambda$0(InboxViewModel inboxViewModel) {
        return new InboxPagingSource(inboxViewModel.inboxRepository, inboxViewModel.intercomDataLayer, new InboxViewModel$inboxPagingData$1$1(inboxViewModel, null));
    }

    public final zl9<InboxUiEffects> getEffect() {
        return this.effect;
    }

    public final EmptyState getEmptyState() {
        return this.emptyState;
    }

    public final r54<sr7<Conversation>> getInboxPagingData() {
        return this.inboxPagingData;
    }

    public final zz9<NetworkResponse<OpenMessengerResponse>> getOpenState() {
        return this.openState;
    }

    public final zz9<Map<String, CurrentlyTypingState>> getTypingConversations() {
        return this.typingConversations;
    }

    public final void onConversationClick(Conversation conversation) {
        conversation.getClass();
        oy0.d(rhb.b(this), this.dispatcher, null, new C03781(conversation, null), 2);
    }

    public final void onRetryOpen() {
        this._openState.setValue(null);
        oy0.d(rhb.b(this), this.dispatcher, null, new C03791(null), 2);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [io.intercom.android.sdk.m5.inbox.InboxViewModel$Companion$factory$1] */
        private final InboxViewModel$Companion$factory$1 factory() {
            return new thb.c() { // from class: io.intercom.android.sdk.m5.inbox.InboxViewModel$Companion$factory$1
                @Override // thb.c
                public <T extends mhb> T create(Class<T> cls) {
                    cls.getClass();
                    return new InboxViewModel(null, null, null, null, 15, null);
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

        public final InboxViewModel create(whb whbVar) {
            whbVar.getClass();
            InboxViewModel$Companion$factory$1 inboxViewModel$Companion$factory$1Factory = factory();
            inboxViewModel$Companion$factory$1Factory.getClass();
            vhb viewModelStore = whbVar.getViewModelStore();
            lb2 defaultViewModelCreationExtras = whbVar instanceof wt4 ? ((wt4) whbVar).getDefaultViewModelCreationExtras() : lb2.a.b;
            viewModelStore.getClass();
            defaultViewModelCreationExtras.getClass();
            uhb uhbVar = new uhb(viewModelStore, inboxViewModel$Companion$factory$1Factory, defaultViewModelCreationExtras);
            sd1 sd1VarA = ll8.a(InboxViewModel.class);
            String strE = sd1VarA.e();
            if (strE != null) {
                return (InboxViewModel) uhbVar.a(sd1VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strE));
            }
            z90.a("Local and anonymous classes can not be ViewModels");
            return null;
        }

        private Companion() {
        }
    }

    public InboxViewModel(InboxRepository inboxRepository, n72 n72Var, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository, int i, qq2 qq2Var) {
        if ((i & 1) != 0) {
            inboxRepository = new InboxRepository(null, null, null, 7, null);
        }
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
        this(inboxRepository, n72Var, intercomDataLayer, commonRepository);
    }

    public InboxViewModel() {
        this(null, null, null, null, 15, null);
    }
}
