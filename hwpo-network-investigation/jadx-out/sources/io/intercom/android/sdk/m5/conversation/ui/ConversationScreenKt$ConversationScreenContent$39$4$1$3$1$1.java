package io.intercom.android.sdk.m5.conversation.ui;

import defpackage.ci4;
import defpackage.g2b;
import defpackage.nz5;
import defpackage.oh4;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.tx2;
import defpackage.xm2;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$39$4$1$3$1$1", f = "ConversationScreen.kt", l = {781, 784}, m = "invokeSuspend")
public final class ConversationScreenKt$ConversationScreenContent$39$4$1$3$1$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ tx2 $density;
    final /* synthetic */ nz5 $lazyListState;
    final /* synthetic */ oh4<Integer, g2b> $onJumpToBottomButtonClicked;
    final /* synthetic */ ConversationUiState $uiState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConversationScreenKt$ConversationScreenContent$39$4$1$3$1$1(ConversationUiState conversationUiState, nz5 nz5Var, tx2 tx2Var, oh4<? super Integer, g2b> oh4Var, r02<? super ConversationScreenKt$ConversationScreenContent$39$4$1$3$1$1> r02Var) {
        super(2, r02Var);
        this.$uiState = conversationUiState;
        this.$lazyListState = nz5Var;
        this.$density = tx2Var;
        this.$onJumpToBottomButtonClicked = oh4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new ConversationScreenKt$ConversationScreenContent$39$4$1$3$1$1(this.$uiState, this.$lazyListState, this.$density, this.$onJumpToBottomButtonClicked, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((ConversationScreenKt$ConversationScreenContent$39$4$1$3$1$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        if (r7.$lazyListState.f(r0, -r5, r7) == r6) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
    
        if (r7.$lazyListState.f(r8 + 1, -r5, r7) == r6) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        return r6;
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
            if (r0 == 0) goto L18
            if (r0 == r3) goto L13
            if (r0 != r1) goto Lc
            goto L13
        Lc:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r7)
            r7 = 0
            return r7
        L13:
            defpackage.dv8.b(r8)
            goto L9a
        L18:
            defpackage.dv8.b(r8)
            io.intercom.android.sdk.m5.conversation.states.ConversationUiState r8 = r7.$uiState
            io.intercom.android.sdk.m5.conversation.states.ConversationUiState$Content r8 = (io.intercom.android.sdk.m5.conversation.states.ConversationUiState.Content) r8
            java.util.List r8 = r8.getContentRows()
            java.util.Iterator r8 = r8.iterator()
            r0 = r2
        L28:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r4 = r8.next()
            io.intercom.android.sdk.m5.conversation.states.ContentRow r4 = (io.intercom.android.sdk.m5.conversation.states.ContentRow) r4
            java.lang.String r4 = r4.getKey()
            java.lang.String r5 = "new_messages_row"
            boolean r4 = defpackage.w2a.n(r4, r5, r2)
            if (r4 == 0) goto L41
            goto L45
        L41:
            int r0 = r0 + 1
            goto L28
        L44:
            r0 = -1
        L45:
            io.intercom.android.sdk.m5.conversation.states.ConversationUiState r8 = r7.$uiState
            io.intercom.android.sdk.m5.conversation.states.ConversationUiState$Content r8 = (io.intercom.android.sdk.m5.conversation.states.ConversationUiState.Content) r8
            io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState r8 = r8.getFloatingIndicatorState()
            io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState$JumpToBottomIndicator r8 = (io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState.JumpToBottomIndicator) r8
            io.intercom.android.sdk.m5.conversation.states.JumpToBottomButtonState r8 = r8.getJumpToBottomButtonState()
            int r8 = r8.getLastSeenItemIndex()
            nz5 r4 = r7.$lazyListState
            ty5 r4 = r4.j()
            java.util.List r4 = r4.g()
            java.lang.Object r4 = defpackage.th1.H(r4)
            hy5 r4 = (defpackage.hy5) r4
            if (r4 == 0) goto L6e
            int r4 = r4.getIndex()
            goto L6f
        L6e:
            r4 = r2
        L6f:
            tx2 r5 = r7.$density
            float r6 = io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt.access$getJumpToBottomNewMessagesTopOffset$p()
            int r5 = r5.n1(r6)
            v72 r6 = defpackage.v72.t
            if (r0 <= r8) goto L89
            nz5 r8 = r7.$lazyListState
            int r1 = -r5
            r7.label = r3
            java.lang.Object r8 = r8.f(r0, r1, r7)
            if (r8 != r6) goto L9a
            goto L99
        L89:
            int r8 = java.lang.Math.max(r8, r4)
            nz5 r0 = r7.$lazyListState
            int r8 = r8 + r3
            int r3 = -r5
            r7.label = r1
            java.lang.Object r8 = r0.f(r8, r3, r7)
            if (r8 != r6) goto L9a
        L99:
            return r6
        L9a:
            nz5 r8 = r7.$lazyListState
            ty5 r8 = r8.j()
            java.util.List r8 = r8.g()
            java.lang.Object r8 = defpackage.th1.H(r8)
            hy5 r8 = (defpackage.hy5) r8
            if (r8 == 0) goto Lb0
            int r2 = r8.getIndex()
        Lb0:
            oh4<java.lang.Integer, g2b> r7 = r7.$onJumpToBottomButtonClicked
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r2)
            r7.invoke(r8)
            g2b r7 = defpackage.g2b.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$39$4$1$3$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
