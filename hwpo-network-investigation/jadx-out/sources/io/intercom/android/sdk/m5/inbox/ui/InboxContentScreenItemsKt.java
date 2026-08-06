package io.intercom.android.sdk.m5.inbox.ui;

import defpackage.a06;
import defpackage.az5;
import defpackage.b0a;
import defpackage.bj4;
import defpackage.bz5;
import defpackage.d06;
import defpackage.d64;
import defpackage.eo7;
import defpackage.fi4;
import defpackage.fr1;
import defpackage.fv5;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.if3;
import defpackage.ir9;
import defpackage.jt1;
import defpackage.ko7;
import defpackage.kp4;
import defpackage.mh4;
import defpackage.oh4;
import defpackage.oo7;
import defpackage.ox6;
import defpackage.qb3;
import defpackage.qk5;
import defpackage.r54;
import defpackage.sr7;
import defpackage.we1;
import defpackage.ws0;
import defpackage.xj8;
import io.intercom.android.sdk.m5.components.ConversationItemKt;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.list.reducers.TicketRowReducerKt;
import io.intercom.android.sdk.tickets.list.ui.TicketRowKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class InboxContentScreenItemsKt {
    @IntercomPreviews
    private static final void InboxContentScreenPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1634106166);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            LastParticipatingAdmin.Builder builderWithAvatar = new LastParticipatingAdmin.Builder().withFirstName("Santhosh Kumar").withAvatar(new Avatar.Builder().withInitials("SK"));
            builderWithAvatar.getClass();
            List listH = ws0.h(new Conversation("123", "Dual credit guidance", false, null, ws0.h(new Part.Builder().withSummary("This is the last message received/sent to/from this user").withCreatedAt(1659081886L)), null, builderWithAvatar, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 2097068, null));
            InboxContentScreenPreview$DisplayPaging(b0a.b(new sr7(new d64(new oo7.d(listH)), sr7.e, sr7.f, new qb3(3, listH))), bj4VarO, 0);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new kp4(i, 1);
        }
    }

    private static final void InboxContentScreenPreview$DisplayPaging(r54<sr7<Conversation>> r54Var, jt1 jt1Var, int i) {
        jt1Var.K(1509694910);
        IntercomThemeKt.IntercomTheme(null, null, null, gr1.b(853574228, new InboxContentScreenItemsKt$InboxContentScreenPreview$DisplayPaging$1(d06.a(r54Var, jt1Var)), jt1Var), jt1Var, 3072, 7);
        jt1Var.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b InboxContentScreenPreview$lambda$0(int i, jt1 jt1Var, int i2) {
        InboxContentScreenPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void inboxContentScreenItems(bz5 bz5Var, a06<Conversation> a06Var, Map<String, CurrentlyTypingState> map, oh4<? super Conversation, g2b> oh4Var) {
        bz5Var.getClass();
        a06Var.getClass();
        map.getClass();
        oh4Var.getClass();
        bz5Var.a(((qk5) a06Var.d.getValue()).d(), null, az5.t, new fr1(true, 328400605, new AnonymousClass1(a06Var, oh4Var, map)));
    }

    public static /* synthetic */ void inboxContentScreenItems$default(bz5 bz5Var, a06 a06Var, Map map, oh4 oh4Var, int i, Object obj) {
        if ((i & 2) != 0) {
            map = if3.t;
        }
        inboxContentScreenItems(bz5Var, a06Var, map, oh4Var);
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.ui.InboxContentScreenItemsKt$inboxContentScreenItems$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass1 implements fi4<fv5, Integer, jt1, Integer, g2b> {
        final /* synthetic */ a06<Conversation> $inboxConversations;
        final /* synthetic */ oh4<Conversation, g2b> $onConversationClick;
        final /* synthetic */ Map<String, CurrentlyTypingState> $typingConversations;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(a06<Conversation> a06Var, oh4<? super Conversation, g2b> oh4Var, Map<String, CurrentlyTypingState> map) {
            this.$inboxConversations = a06Var;
            this.$onConversationClick = oh4Var;
            this.$typingConversations = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$4$lambda$1$lambda$0(oh4 oh4Var, Conversation conversation) {
            oh4Var.invoke(conversation);
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$4$lambda$3$lambda$2(oh4 oh4Var, Conversation conversation) {
            oh4Var.invoke(conversation);
            return g2b.a;
        }

        public final void invoke(fv5 fv5Var, int i, jt1 jt1Var, int i2) {
            int i3;
            fv5Var.getClass();
            if ((i2 & 48) == 0) {
                i3 = i2 | (jt1Var.h(i) ? 32 : 16);
            } else {
                i3 = i2;
            }
            if ((i3 & 145) == 144 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            final Conversation conversationA = this.$inboxConversations.a(i);
            if (conversationA == null) {
                return;
            }
            final oh4<Conversation, g2b> oh4Var = this.$onConversationClick;
            Map<String, CurrentlyTypingState> map = this.$typingConversations;
            Ticket ticket = conversationA.getTicket();
            ox6.a aVar = ox6.a.t;
            Object obj = jt1.a.a;
            if (ticket != null) {
                jt1Var.K(-1068649010);
                ox6 ox6VarC = ir9.c(aVar, 1.0f);
                jt1Var.K(796817636);
                boolean zJ = jt1Var.J(oh4Var) | jt1Var.j(conversationA);
                Object objF = jt1Var.f();
                if (zJ || objF == obj) {
                    objF = new mh4() { // from class: io.intercom.android.sdk.m5.inbox.ui.h
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return InboxContentScreenItemsKt.AnonymousClass1.invoke$lambda$4$lambda$1$lambda$0(oh4Var, conversationA);
                        }
                    };
                    jt1Var.C(objF);
                }
                jt1Var.B();
                TicketRowKt.TicketRow(we1.c(ox6VarC, false, null, (mh4) objF, 15), TicketRowReducerKt.reduceTicketRowData(conversationA.getTicket()), new ko7(20.0f, 16.0f, 20.0f, 16.0f), !conversationA.isRead(), jt1Var, 384, 0);
                jt1Var.B();
            } else {
                jt1Var.K(-1068147058);
                ox6 ox6VarC2 = ir9.c(aVar, 1.0f);
                CurrentlyTypingState currentlyTypingState = map.get(conversationA.getId());
                ko7 ko7Var = new ko7(20.0f, 16.0f, 20.0f, 16.0f);
                jt1Var.K(796839972);
                boolean zJ2 = jt1Var.J(oh4Var) | jt1Var.j(conversationA);
                Object objF2 = jt1Var.f();
                if (zJ2 || objF2 == obj) {
                    objF2 = new mh4() { // from class: io.intercom.android.sdk.m5.inbox.ui.i
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return InboxContentScreenItemsKt.AnonymousClass1.invoke$lambda$4$lambda$3$lambda$2(oh4Var, conversationA);
                        }
                    };
                    jt1Var.C(objF2);
                }
                jt1Var.B();
                ConversationItemKt.ConversationItem(conversationA, ox6VarC2, currentlyTypingState, ko7Var, false, (mh4) objF2, jt1Var, 3120, 16);
                jt1Var.B();
            }
            IntercomDividerKt.IntercomDivider(eo7.k(aVar, 20.0f, 0.0f, 2), jt1Var, 6, 0);
        }

        @Override // defpackage.fi4
        public /* bridge */ /* synthetic */ g2b invoke(fv5 fv5Var, Integer num, jt1 jt1Var, Integer num2) {
            invoke(fv5Var, num.intValue(), jt1Var, num2.intValue());
            return g2b.a;
        }
    }
}
