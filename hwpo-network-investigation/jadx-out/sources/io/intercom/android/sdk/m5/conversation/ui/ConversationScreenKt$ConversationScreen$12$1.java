package io.intercom.android.sdk.m5.conversation.ui;

import android.content.Context;
import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.mh4;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.v72;
import defpackage.xm2;
import defpackage.ys9;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.NetworkState;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreen$12$1", f = "ConversationScreen.kt", l = {269}, m = "invokeSuspend")
public final class ConversationScreenKt$ConversationScreen$12$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ConversationUiState $conversationUiState;
    final /* synthetic */ ConversationViewModel $conversationViewModel;
    final /* synthetic */ ys9 $snackbarHostState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationScreenKt$ConversationScreen$12$1(ConversationUiState conversationUiState, ys9 ys9Var, Context context, ConversationViewModel conversationViewModel, r02<? super ConversationScreenKt$ConversationScreen$12$1> r02Var) {
        super(2, r02Var);
        this.$conversationUiState = conversationUiState;
        this.$snackbarHostState = ys9Var;
        this.$context = context;
        this.$conversationViewModel = conversationViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invokeSuspend$lambda$0(ConversationViewModel conversationViewModel) {
        conversationViewModel.onNetworkMessageDismissed();
        return g2b.a;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new ConversationScreenKt$ConversationScreen$12$1(this.$conversationUiState, this.$snackbarHostState, this.$context, this.$conversationViewModel, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((ConversationScreenKt$ConversationScreen$12$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            dv8.b(obj);
            NetworkState networkState = ((ConversationUiState.Content) this.$conversationUiState).getNetworkState();
            ys9 ys9Var = this.$snackbarHostState;
            Context context = this.$context;
            final ConversationViewModel conversationViewModel = this.$conversationViewModel;
            mh4 mh4Var = new mh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.b
                @Override // defpackage.mh4
                public final Object invoke() {
                    return ConversationScreenKt$ConversationScreen$12$1.invokeSuspend$lambda$0(conversationViewModel);
                }
            };
            this.label = 1;
            Object objShowNetworkMessage = ConversationScreenKt.showNetworkMessage(networkState, ys9Var, context, mh4Var, this);
            v72 v72Var = v72.t;
            if (objShowNetworkMessage == v72Var) {
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
