package io.intercom.android.sdk.m5.conversation.data;

import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.f37;
import defpackage.g2b;
import defpackage.j64;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.qq2;
import defpackage.r02;
import defpackage.s54;
import defpackage.t72;
import defpackage.ty1;
import defpackage.u54;
import defpackage.v72;
import defpackage.w54;
import defpackage.wx7;
import defpackage.xm2;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.nexus.NexusEvent;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.UserIdentity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class NexusEventsRepository {
    public static final int $stable = 8;
    private final NexusClient nexusClient;
    private final t72 scope;
    private final f37<NexusEvent> typingEventsFlow;
    private final UserIdentity userIdentity;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.data.NexusEventsRepository$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.data.NexusEventsRepository$1", f = "NexusEventsRepository.kt", l = {25}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return NexusEventsRepository.this.new AnonymousClass1(r02Var);
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
                j64 j64Var = new j64(NexusEventsRepository.this.typingEventsFlow, null);
                final NexusEventsRepository nexusEventsRepository = NexusEventsRepository.this;
                s54 s54Var = new s54() { // from class: io.intercom.android.sdk.m5.conversation.data.NexusEventsRepository.1.1
                    public final Object emit(NexusEvent nexusEvent, r02<? super g2b> r02Var) {
                        nexusEventsRepository.nexusClient.fire(nexusEvent);
                        return g2b.a;
                    }

                    @Override // defpackage.s54
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, r02 r02Var) {
                        return emit((NexusEvent) obj2, (r02<? super g2b>) r02Var);
                    }
                };
                this.label = 1;
                w54 w54Var = new w54(j64Var, s54Var, null);
                u54 u54Var = new u54(this, getContext());
                Object objD = wx7.d(u54Var, true, u54Var, w54Var);
                Object obj2 = v72.t;
                if (objD != obj2) {
                    objD = g2b.a;
                }
                if (objD == obj2) {
                    return obj2;
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

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.data.NexusEventsRepository$userTyping$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.data.NexusEventsRepository$userTyping$1", f = "NexusEventsRepository.kt", l = {40}, m = "invokeSuspend")
    public static final class C03561 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ String $conversationId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03561(String str, r02<? super C03561> r02Var) {
            super(2, r02Var);
            this.$conversationId = str;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return NexusEventsRepository.this.new C03561(this.$conversationId, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03561) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                f37 f37Var = NexusEventsRepository.this.typingEventsFlow;
                NexusEvent userIsTypingEvent = NexusEvent.getUserIsTypingEvent(this.$conversationId, NexusEventsRepository.this.userIdentity.getIntercomId());
                userIsTypingEvent.getClass();
                this.label = 1;
                Object objEmit = f37Var.emit(userIsTypingEvent, this);
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

    public NexusEventsRepository(NexusClient nexusClient, UserIdentity userIdentity, t72 t72Var) {
        nexusClient.getClass();
        userIdentity.getClass();
        t72Var.getClass();
        this.nexusClient = nexusClient;
        this.userIdentity = userIdentity;
        this.scope = t72Var;
        this.typingEventsFlow = ty1.b(7, null);
        oy0.d(t72Var, null, null, new AnonymousClass1(null), 3);
    }

    public final void markAsSeen(String str) {
        str.getClass();
        this.nexusClient.fire(NexusEvent.getConversationSeenEvent(str, this.userIdentity.getIntercomId()));
    }

    public final void userTyping(String str) {
        str.getClass();
        oy0.d(this.scope, null, null, new C03561(str, null), 3);
    }

    public /* synthetic */ NexusEventsRepository(NexusClient nexusClient, UserIdentity userIdentity, t72 t72Var, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? Injector.get().getNexusClient() : nexusClient, (i & 2) != 0 ? Injector.get().getUserIdentity() : userIdentity, t72Var);
    }
}
