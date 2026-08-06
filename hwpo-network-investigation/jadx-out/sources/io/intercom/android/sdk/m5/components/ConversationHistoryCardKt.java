package io.intercom.android.sdk.m5.components;

import defpackage.bj4;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.jt1;
import defpackage.ko7;
import defpackage.mh4;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.w12;
import defpackage.we1;
import defpackage.xj8;
import io.intercom.android.sdk.m5.components.ConversationHistoryCardKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.list.reducers.TicketRowReducerKt;
import io.intercom.android.sdk.tickets.list.ui.TicketRowKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationHistoryCardKt {
    public static final void ConversationHistoryCard(ox6 ox6Var, final String str, final List<Conversation> list, oh4<? super Conversation, g2b> oh4Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        final ox6 ox6Var2;
        str.getClass();
        list.getClass();
        bj4 bj4VarO = jt1Var.o(-1629591433);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.J(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.j(list) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= bj4VarO.j(oh4Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i3 & 1171) == 1170 && bj4VarO.r()) {
            bj4VarO.u();
            ox6Var2 = ox6Var;
        } else {
            if (i4 != 0) {
                ox6Var = ox6.a.t;
            }
            ox6 ox6Var3 = ox6Var;
            if (i5 != 0) {
                bj4VarO.K(-1056310787);
                Object objF = bj4VarO.f();
                if (objF == jt1.a.a) {
                    objF = new w12();
                    bj4VarO.C(objF);
                }
                oh4Var = (oh4) objF;
                bj4VarO.U(false);
            }
            HomeCardScaffoldKt.HomeCardScaffold(ox6Var3, str, gr1.b(1614953259, new AnonymousClass2(list, oh4Var), bj4VarO), bj4VarO, (i3 & 14) | 384 | (i3 & 112), 0);
            ox6Var2 = ox6Var3;
        }
        final oh4<? super Conversation, g2b> oh4Var2 = oh4Var;
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: x12
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ConversationHistoryCardKt.ConversationHistoryCard$lambda$2(ox6Var2, str, list, oh4Var2, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ConversationHistoryCard$lambda$1$lambda$0(Conversation conversation) {
        conversation.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ConversationHistoryCard$lambda$2(ox6 ox6Var, String str, List list, oh4 oh4Var, int i, int i2, jt1 jt1Var, int i3) {
        ConversationHistoryCard(ox6Var, str, list, oh4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void ConversationHistoryCardPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1923666474);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationHistoryCardKt.INSTANCE.m33getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: v12
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ConversationHistoryCardKt.ConversationHistoryCardPreview$lambda$3(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ConversationHistoryCardPreview$lambda$3(int i, jt1 jt1Var, int i2) {
        ConversationHistoryCardPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ConversationHistoryCardKt$ConversationHistoryCard$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass2 implements ci4<jt1, Integer, g2b> {
        final /* synthetic */ List<Conversation> $conversations;
        final /* synthetic */ oh4<Conversation, g2b> $onConversationClick;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<Conversation> list, oh4<? super Conversation, g2b> oh4Var) {
            this.$conversations = list;
            this.$onConversationClick = oh4Var;
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

        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            List<Conversation> list = this.$conversations;
            final oh4<Conversation, g2b> oh4Var = this.$onConversationClick;
            for (final Conversation conversation : list) {
                Ticket ticket = conversation.getTicket();
                ox6.a aVar = ox6.a.t;
                Object obj = jt1.a.a;
                if (ticket != null) {
                    jt1Var.K(1734859093);
                    ox6 ox6VarC = ir9.c(aVar, 1.0f);
                    jt1Var.K(610158718);
                    boolean zJ = jt1Var.J(oh4Var) | jt1Var.j(conversation);
                    Object objF = jt1Var.f();
                    if (zJ || objF == obj) {
                        objF = new mh4() { // from class: io.intercom.android.sdk.m5.components.z
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ConversationHistoryCardKt.AnonymousClass2.invoke$lambda$4$lambda$1$lambda$0(oh4Var, conversation);
                            }
                        };
                        jt1Var.C(objF);
                    }
                    jt1Var.B();
                    TicketRowKt.TicketRow(we1.c(ox6VarC, false, null, (mh4) objF, 15), TicketRowReducerKt.reduceTicketRowData(conversation.getTicket()), new ko7(20.0f, 8.0f, 20.0f, 8.0f), !conversation.isRead(), jt1Var, 0, 0);
                    jt1Var.B();
                } else {
                    jt1Var.K(1735357821);
                    ox6 ox6VarC2 = ir9.c(aVar, 1.0f);
                    ko7 ko7Var = new ko7(20.0f, 8.0f, 20.0f, 8.0f);
                    jt1Var.K(610175838);
                    boolean zJ2 = jt1Var.J(oh4Var) | jt1Var.j(conversation);
                    Object objF2 = jt1Var.f();
                    if (zJ2 || objF2 == obj) {
                        objF2 = new mh4() { // from class: io.intercom.android.sdk.m5.components.a0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ConversationHistoryCardKt.AnonymousClass2.invoke$lambda$4$lambda$3$lambda$2(oh4Var, conversation);
                            }
                        };
                        jt1Var.C(objF2);
                    }
                    jt1Var.B();
                    ConversationItemKt.ConversationItem(conversation, ox6VarC2, null, ko7Var, false, (mh4) objF2, jt1Var, 48, 20);
                    jt1Var.B();
                }
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
