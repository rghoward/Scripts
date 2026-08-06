package io.intercom.android.sdk.m5.conversation.ui;

import defpackage.az3;
import defpackage.bt1;
import defpackage.ci4;
import defpackage.di;
import defpackage.dv0;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.go7;
import defpackage.h37;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kv0;
import defpackage.kw7;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.nz5;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.oy0;
import defpackage.qr5;
import defpackage.raa;
import defpackage.rd7;
import defpackage.sp0;
import defpackage.t72;
import defpackage.tx2;
import defpackage.xv9;
import defpackage.yz9;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.components.FooterNoticeKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import io.intercom.android.sdk.m5.conversation.states.FooterNoticeState;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import io.intercom.android.sdk.models.InlineSource;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.models.Source;
import io.intercom.android.sdk.ui.component.JumpToBottomKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationScreenKt$ConversationScreenContent$39$4 implements ei4<go7, jt1, Integer, g2b> {
    final /* synthetic */ t72 $coroutineScope;
    final /* synthetic */ tx2 $density;
    final /* synthetic */ yz9<KeyboardState> $keyboardAsState$delegate;
    final /* synthetic */ xv9 $keyboardController;
    final /* synthetic */ nz5 $lazyListState;
    final /* synthetic */ oh4<String, g2b> $navigateToAnotherConversation;
    final /* synthetic */ mh4<g2b> $navigateToTicketDetail;
    final /* synthetic */ oh4<TicketType, g2b> $onCreateTicket;
    final /* synthetic */ ci4<List<InlineSource>, List<Source>, g2b> $onInlineSourcesClick;
    final /* synthetic */ oh4<Integer, g2b> $onJumpToBottomButtonClicked;
    final /* synthetic */ oh4<ReplyOption, g2b> $onReplyClicked;
    final /* synthetic */ mh4<g2b> $onReportAiAnswer;
    final /* synthetic */ mh4<g2b> $onRetryClick;
    final /* synthetic */ oh4<PendingMessage.FailedMediaUploadData, g2b> $onRetryMediaClicked;
    final /* synthetic */ oh4<Part, g2b> $onRetryMessageClicked;
    final /* synthetic */ oh4<AttributeData, g2b> $onSubmitAttribute;
    final /* synthetic */ oh4<ReplySuggestion, g2b> $onSuggestionClick;
    final /* synthetic */ h37<Boolean> $openBottomSheet;
    final /* synthetic */ ConversationUiState $uiState;

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationScreenKt$ConversationScreenContent$39$4(ConversationUiState conversationUiState, mh4<g2b> mh4Var, nz5 nz5Var, oh4<? super ReplySuggestion, g2b> oh4Var, oh4<? super ReplyOption, g2b> oh4Var2, oh4<? super Part, g2b> oh4Var3, oh4<? super PendingMessage.FailedMediaUploadData, g2b> oh4Var4, oh4<? super AttributeData, g2b> oh4Var5, mh4<g2b> mh4Var2, oh4<? super TicketType, g2b> oh4Var6, oh4<? super String, g2b> oh4Var7, ci4<? super List<InlineSource>, ? super List<Source>, g2b> ci4Var, xv9 xv9Var, t72 t72Var, yz9<KeyboardState> yz9Var, h37<Boolean> h37Var, mh4<g2b> mh4Var3, tx2 tx2Var, oh4<? super Integer, g2b> oh4Var8) {
        this.$uiState = conversationUiState;
        this.$onRetryClick = mh4Var;
        this.$lazyListState = nz5Var;
        this.$onSuggestionClick = oh4Var;
        this.$onReplyClicked = oh4Var2;
        this.$onRetryMessageClicked = oh4Var3;
        this.$onRetryMediaClicked = oh4Var4;
        this.$onSubmitAttribute = oh4Var5;
        this.$navigateToTicketDetail = mh4Var2;
        this.$onCreateTicket = oh4Var6;
        this.$navigateToAnotherConversation = oh4Var7;
        this.$onInlineSourcesClick = ci4Var;
        this.$keyboardController = xv9Var;
        this.$coroutineScope = t72Var;
        this.$keyboardAsState$delegate = yz9Var;
        this.$openBottomSheet = h37Var;
        this.$onReportAiAnswer = mh4Var3;
        this.$density = tx2Var;
        this.$onJumpToBottomButtonClicked = oh4Var8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$8$lambda$2$lambda$1(ci4 ci4Var, xv9 xv9Var, t72 t72Var, h37 h37Var, yz9 yz9Var, List list, List list2) {
        list.getClass();
        list2.getClass();
        if (ci4Var != null) {
            ci4Var.invoke(list, list2);
            ConversationScreenKt.ConversationScreenContent$hideKeyboardAndShowBottomSheet(xv9Var, t72Var, h37Var, yz9Var);
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$8$lambda$5$lambda$4(t72 t72Var, ConversationUiState conversationUiState, nz5 nz5Var, tx2 tx2Var, oh4 oh4Var) {
        oy0.d(t72Var, null, null, new ConversationScreenKt$ConversationScreenContent$39$4$1$3$1$1(conversationUiState, nz5Var, tx2Var, oh4Var, null), 3);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$8$lambda$7$lambda$6(t72 t72Var, nz5 nz5Var) {
        oy0.d(t72Var, null, null, new ConversationScreenKt$ConversationScreenContent$39$4$1$4$1$1(nz5Var, null), 3);
        return g2b.a;
    }

    public final void invoke(go7 go7Var, jt1 jt1Var, int i) {
        int i2;
        final t72 t72Var;
        go7Var.getClass();
        if ((i & 6) == 0) {
            i2 = i | (jt1Var.J(go7Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        ConversationUiState conversationUiState = this.$uiState;
        boolean z = conversationUiState instanceof ConversationUiState.Loading;
        ox6.a aVar = ox6.a.t;
        if (z) {
            jt1Var.K(-15049521);
            ConversationLoadingScreenKt.ConversationLoadingScreen(eo7.h(aVar, go7Var), jt1Var, 0, 0);
            jt1Var.B();
            return;
        }
        if (conversationUiState instanceof ConversationUiState.Error) {
            jt1Var.K(-14822229);
            ConversationErrorScreenKt.ConversationErrorScreen((ConversationUiState.Error) this.$uiState, this.$onRetryClick, eo7.h(aVar, go7Var), jt1Var, 0, 0);
            jt1Var.B();
            return;
        }
        if (!(conversationUiState instanceof ConversationUiState.Content)) {
            jt1Var.K(-554669957);
            jt1Var.B();
            defpackage.u.b();
            return;
        }
        jt1Var.K(-14299414);
        az3 az3Var = ir9.c;
        final ConversationUiState conversationUiState2 = this.$uiState;
        final nz5 nz5Var = this.$lazyListState;
        oh4<ReplySuggestion, g2b> oh4Var = this.$onSuggestionClick;
        oh4<ReplyOption, g2b> oh4Var2 = this.$onReplyClicked;
        oh4<Part, g2b> oh4Var3 = this.$onRetryMessageClicked;
        oh4<PendingMessage.FailedMediaUploadData, g2b> oh4Var4 = this.$onRetryMediaClicked;
        oh4<AttributeData, g2b> oh4Var5 = this.$onSubmitAttribute;
        mh4<g2b> mh4Var = this.$navigateToTicketDetail;
        oh4<TicketType, g2b> oh4Var6 = this.$onCreateTicket;
        oh4<String, g2b> oh4Var7 = this.$navigateToAnotherConversation;
        final ci4<List<InlineSource>, List<Source>, g2b> ci4Var = this.$onInlineSourcesClick;
        int i3 = i2;
        final xv9 xv9Var = this.$keyboardController;
        t72 t72Var2 = this.$coroutineScope;
        final yz9<KeyboardState> yz9Var = this.$keyboardAsState$delegate;
        final h37<Boolean> h37Var = this.$openBottomSheet;
        mh4<g2b> mh4Var2 = this.$onReportAiAnswer;
        final tx2 tx2Var = this.$density;
        final oh4<Integer, g2b> oh4Var8 = this.$onJumpToBottomButtonClicked;
        fl6 fl6VarD = dv0.d(di.a.a, false);
        int iHashCode = Long.hashCode(jt1Var.v());
        kw7 kw7VarY = jt1Var.y();
        ox6 ox6VarC = it1.c(jt1Var, az3Var);
        bt1.c.getClass();
        qr5.a aVar2 = bt1.a.b;
        if (jt1Var.s() == null) {
            ml5.c();
            throw null;
        }
        jt1Var.q();
        if (jt1Var.l()) {
            jt1Var.k(aVar2);
        } else {
            jt1Var.z();
        }
        rd7.d(jt1Var, bt1.a.f, fl6VarD);
        rd7.d(jt1Var, bt1.a.e, kw7VarY);
        rd7.d(jt1Var, bt1.a.g, Integer.valueOf(iHashCode));
        rd7.c(jt1Var, bt1.a.h);
        rd7.d(jt1Var, bt1.a.d, ox6VarC);
        ConversationUiState.Content content = (ConversationUiState.Content) conversationUiState2;
        boolean z2 = content.getBottomBarUiState().getComposerState() instanceof ComposerState.TextInput;
        sp0 sp0Var = di.a.e;
        kv0 kv0Var = kv0.a;
        ox6 ox6VarA = raa.a(eo7.h(kv0Var.f(aVar, sp0Var), ConversationScreenKt.getPaddingValuesForComposer(go7Var, content.getBottomBarUiState(), jt1Var, i3 & 14)), "message list");
        List<ContentRow> contentRows = content.getContentRows();
        boolean z3 = content.getBottomBarUiState().getComposerState() instanceof ComposerState.TextInput;
        boolean z4 = content.getBottomBarUiState().getBottomBadge() instanceof BottomBarUiState.BottomBadgeState.PoweredByBadgeState;
        jt1Var.K(1461993632);
        boolean zJ = jt1Var.J(ci4Var) | jt1Var.J(xv9Var) | jt1Var.j(t72Var2) | jt1Var.J(yz9Var) | jt1Var.J(h37Var);
        Object objF = jt1Var.f();
        jt1.a.C0187a c0187a = jt1.a.a;
        if (zJ || objF == c0187a) {
            t72Var = t72Var2;
            objF = new ci4() { // from class: io.intercom.android.sdk.m5.conversation.ui.n
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationScreenKt$ConversationScreenContent$39$4.invoke$lambda$8$lambda$2$lambda$1(ci4Var, xv9Var, t72Var, h37Var, yz9Var, (List) obj, (List) obj2);
                }
            };
            jt1Var.C(objF);
        } else {
            t72Var = t72Var2;
        }
        jt1Var.B();
        final t72 t72Var3 = t72Var;
        LazyMessageListKt.LazyMessageList(ox6VarA, contentRows, nz5Var, oh4Var, oh4Var2, oh4Var3, oh4Var4, oh4Var5, mh4Var, oh4Var6, z3, oh4Var7, z4, (ci4) objF, z2, mh4Var2, jt1Var, 0, 0, 0);
        jt1 jt1Var2 = jt1Var;
        FloatingIndicatorState floatingIndicatorState = content.getFloatingIndicatorState();
        boolean z5 = floatingIndicatorState instanceof FloatingIndicatorState.JumpToBottomIndicator;
        sp0 sp0Var2 = di.a.h;
        if (z5) {
            jt1Var2.K(-1922117408);
            ox6 ox6VarF = kv0Var.f(eo7.l(aVar, 24.0f, 8.0f, 24.0f, go7Var.a()), sp0Var2);
            int unreadMessages = ((FloatingIndicatorState.JumpToBottomIndicator) content.getFloatingIndicatorState()).getJumpToBottomButtonState().getUnreadMessages();
            Integer numValueOf = Integer.valueOf(unreadMessages);
            if (unreadMessages <= 0) {
                numValueOf = null;
            }
            String string = numValueOf != null ? numValueOf.toString() : null;
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i4 = IntercomTheme.$stable;
            long jM756getBadge0d7_KjU = intercomTheme.getColors(jt1Var2, i4).m756getBadge0d7_KjU();
            long jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(intercomTheme.getColors(jt1Var2, i4).m756getBadge0d7_KjU());
            jt1Var2.K(1462018961);
            boolean zJ2 = jt1Var2.j(t72Var3) | jt1Var2.j(conversationUiState2) | jt1Var2.J(nz5Var) | jt1Var2.J(tx2Var) | jt1Var2.J(oh4Var8);
            Object objF2 = jt1Var2.f();
            if (zJ2 || objF2 == c0187a) {
                objF2 = new mh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.o
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return ConversationScreenKt$ConversationScreenContent$39$4.invoke$lambda$8$lambda$5$lambda$4(t72Var3, conversationUiState2, nz5Var, tx2Var, oh4Var8);
                    }
                };
                jt1Var2.C(objF2);
            }
            jt1Var2.B();
            JumpToBottomKt.m590JumpToBottomkNRdK3w(ox6VarF, 0L, 0L, string, jM756getBadge0d7_KjU, jM833generateTextColor8_81llA, (mh4) objF2, jt1Var, 0, 6);
            jt1Var2 = jt1Var;
            jt1Var2.B();
        } else if (floatingIndicatorState instanceof FloatingIndicatorState.FooterNoticeIndicator) {
            jt1Var2.K(-1919418145);
            FooterNoticeState footerNoticeState = ((FloatingIndicatorState.FooterNoticeIndicator) content.getFloatingIndicatorState()).getFooterNoticeState();
            ox6 ox6VarF2 = kv0Var.f(eo7.m(aVar, 24.0f, 0.0f, 24.0f, go7Var.a(), 2), sp0Var2);
            String title = footerNoticeState.getTitle();
            List<AvatarWrapper> avatars = footerNoticeState.getAvatars();
            jt1Var2.K(1462129348);
            boolean zJ3 = jt1Var2.j(t72Var3) | jt1Var2.J(nz5Var);
            Object objF3 = jt1Var2.f();
            if (zJ3 || objF3 == c0187a) {
                objF3 = new mh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.p
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return ConversationScreenKt$ConversationScreenContent$39$4.invoke$lambda$8$lambda$7$lambda$6(t72Var3, nz5Var);
                    }
                };
                jt1Var2.C(objF3);
            }
            jt1Var2.B();
            FooterNoticeKt.FooterNoticePill(ox6VarF2, title, avatars, (mh4) objF3, jt1Var, 0, 0);
            jt1Var2 = jt1Var;
            jt1Var2.B();
        } else {
            if (!(floatingIndicatorState instanceof FloatingIndicatorState.None)) {
                jt1Var2.K(1462014472);
                jt1Var2.B();
                defpackage.u.b();
                return;
            }
            jt1Var2.K(-1918243803);
            jt1Var2.B();
        }
        jt1Var2.I();
        jt1Var2.B();
    }

    @Override // defpackage.ei4
    public /* bridge */ /* synthetic */ g2b invoke(go7 go7Var, jt1 jt1Var, Integer num) {
        invoke(go7Var, jt1Var, num.intValue());
        return g2b.a;
    }
}
