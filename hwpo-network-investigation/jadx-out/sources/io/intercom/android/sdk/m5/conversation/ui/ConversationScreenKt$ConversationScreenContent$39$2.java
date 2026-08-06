package io.intercom.android.sdk.m5.conversation.ui;

import defpackage.al8;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.h37;
import defpackage.jt1;
import defpackage.mh4;
import defpackage.nz5;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.oy0;
import defpackage.t72;
import defpackage.uh1;
import defpackage.w20;
import defpackage.xv9;
import defpackage.yz9;
import defpackage.zl9;
import defpackage.zz9;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.ComposerUiEffect;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.MediaUploadItem;
import io.intercom.android.sdk.m5.conversation.states.VoiceTranscriptionState;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ConversationBottomBarKt;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationScreenKt$ConversationScreenContent$39$2 implements ci4<jt1, Integer, g2b> {
    final /* synthetic */ zz9<Float> $amplitudeLevel;
    final /* synthetic */ zl9<ComposerUiEffect> $composerUiEffect;
    final /* synthetic */ t72 $coroutineScope;
    final /* synthetic */ yz9<KeyboardState> $keyboardAsState$delegate;
    final /* synthetic */ xv9 $keyboardController;
    final /* synthetic */ nz5 $lazyListState;
    final /* synthetic */ oh4<String, g2b> $navigateToAnotherConversation;
    final /* synthetic */ mh4<g2b> $onCancelVoiceRecording;
    final /* synthetic */ mh4<g2b> $onClearMediaUploadItems;
    final /* synthetic */ oh4<MediaUploadItem, g2b> $onDeleteMediaUploadItem;
    final /* synthetic */ oh4<MediaUploadItem, g2b> $onFailedMediaUploadItem;
    final /* synthetic */ mh4<g2b> $onGifInputSelected;
    final /* synthetic */ oh4<ComposerInputType, g2b> $onInputChange;
    final /* synthetic */ mh4<g2b> $onMediaInputSelected;
    final /* synthetic */ mh4<g2b> $onMediaItemsLimitReached;
    final /* synthetic */ mh4<g2b> $onNewConversationClicked;
    final /* synthetic */ mh4<g2b> $onPrivacyNoticeDismissed;
    final /* synthetic */ ci4<String, List<MediaUploadItem>, g2b> $onSendMessage;
    final /* synthetic */ mh4<g2b> $onStartVoiceRecording;
    final /* synthetic */ mh4<g2b> $onStopVoiceRecording;
    final /* synthetic */ mh4<g2b> $onTyping;
    final /* synthetic */ h37<Boolean> $openBottomSheet;
    final /* synthetic */ oh4<MetricData, g2b> $trackMetric;
    final /* synthetic */ ConversationUiState $uiState;

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationScreenKt$ConversationScreenContent$39$2(ConversationUiState conversationUiState, t72 t72Var, nz5 nz5Var, ci4<? super String, ? super List<MediaUploadItem>, g2b> ci4Var, oh4<? super ComposerInputType, g2b> oh4Var, mh4<g2b> mh4Var, h37<Boolean> h37Var, mh4<g2b> mh4Var2, mh4<g2b> mh4Var3, mh4<g2b> mh4Var4, xv9 xv9Var, yz9<KeyboardState> yz9Var, oh4<? super MetricData, g2b> oh4Var2, oh4<? super String, g2b> oh4Var3, mh4<g2b> mh4Var5, mh4<g2b> mh4Var6, zl9<? extends ComposerUiEffect> zl9Var, zz9<Float> zz9Var, mh4<g2b> mh4Var7, mh4<g2b> mh4Var8, mh4<g2b> mh4Var9, oh4<? super MediaUploadItem, g2b> oh4Var4, oh4<? super MediaUploadItem, g2b> oh4Var5, mh4<g2b> mh4Var10) {
        this.$uiState = conversationUiState;
        this.$coroutineScope = t72Var;
        this.$lazyListState = nz5Var;
        this.$onSendMessage = ci4Var;
        this.$onInputChange = oh4Var;
        this.$onGifInputSelected = mh4Var;
        this.$openBottomSheet = h37Var;
        this.$onNewConversationClicked = mh4Var2;
        this.$onMediaItemsLimitReached = mh4Var3;
        this.$onMediaInputSelected = mh4Var4;
        this.$keyboardController = xv9Var;
        this.$keyboardAsState$delegate = yz9Var;
        this.$trackMetric = oh4Var2;
        this.$navigateToAnotherConversation = oh4Var3;
        this.$onPrivacyNoticeDismissed = mh4Var5;
        this.$onTyping = mh4Var6;
        this.$composerUiEffect = zl9Var;
        this.$amplitudeLevel = zz9Var;
        this.$onStartVoiceRecording = mh4Var7;
        this.$onStopVoiceRecording = mh4Var8;
        this.$onCancelVoiceRecording = mh4Var9;
        this.$onDeleteMediaUploadItem = oh4Var4;
        this.$onFailedMediaUploadItem = oh4Var5;
        this.$onClearMediaUploadItems = mh4Var10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$1$lambda$0(t72 t72Var, nz5 nz5Var, ci4 ci4Var, String str, List list) {
        str.getClass();
        list.getClass();
        oy0.d(t72Var, null, null, new ConversationScreenKt$ConversationScreenContent$39$2$1$1$1(nz5Var, ci4Var, str, list, null), 3);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$3$lambda$2(mh4 mh4Var, t72 t72Var, h37 h37Var) {
        mh4Var.invoke();
        ConversationScreenKt.ConversationScreenContent$showBottomSheet(t72Var, h37Var);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$5$lambda$4(ConversationUiState conversationUiState, mh4 mh4Var, mh4 mh4Var2, xv9 xv9Var, t72 t72Var, h37 h37Var, yz9 yz9Var) {
        if (((ConversationUiState.Content) conversationUiState).getBottomBarUiState().isMaxMediaItemsReached()) {
            mh4Var.invoke();
        } else {
            mh4Var2.invoke();
            ConversationScreenKt.ConversationScreenContent$hideKeyboardAndShowBottomSheet(xv9Var, t72Var, h37Var, yz9Var);
        }
        return g2b.a;
    }

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        if (this.$uiState instanceof ConversationUiState.Content) {
            ox6 ox6VarC = gi0.c(w20.c(ox6.a.t, w20.e), uh1.j, al8.a);
            BottomBarUiState bottomBarUiState = ((ConversationUiState.Content) this.$uiState).getBottomBarUiState();
            VoiceTranscriptionState voiceTranscriptionState = ((ConversationUiState.Content) this.$uiState).getVoiceTranscriptionState();
            jt1Var.K(-554743413);
            boolean zJ = jt1Var.j(this.$coroutineScope) | jt1Var.J(this.$lazyListState) | jt1Var.J(this.$onSendMessage);
            final t72 t72Var = this.$coroutineScope;
            final nz5 nz5Var = this.$lazyListState;
            final ci4<String, List<MediaUploadItem>, g2b> ci4Var = this.$onSendMessage;
            Object objF = jt1Var.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (zJ || objF == c0187a) {
                objF = new ci4() { // from class: io.intercom.android.sdk.m5.conversation.ui.k
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        return ConversationScreenKt$ConversationScreenContent$39$2.invoke$lambda$1$lambda$0(t72Var, nz5Var, ci4Var, (String) obj, (List) obj2);
                    }
                };
                jt1Var.C(objF);
            }
            ci4 ci4Var2 = (ci4) objF;
            jt1Var.B();
            oh4<ComposerInputType, g2b> oh4Var = this.$onInputChange;
            jt1Var.K(-554711807);
            boolean zJ2 = jt1Var.J(this.$onGifInputSelected) | jt1Var.j(this.$coroutineScope) | jt1Var.J(this.$openBottomSheet);
            final mh4<g2b> mh4Var = this.$onGifInputSelected;
            final t72 t72Var2 = this.$coroutineScope;
            final h37<Boolean> h37Var = this.$openBottomSheet;
            Object objF2 = jt1Var.f();
            if (zJ2 || objF2 == c0187a) {
                objF2 = new mh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.l
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return ConversationScreenKt$ConversationScreenContent$39$2.invoke$lambda$3$lambda$2(mh4Var, t72Var2, h37Var);
                    }
                };
                jt1Var.C(objF2);
            }
            mh4 mh4Var2 = (mh4) objF2;
            jt1Var.B();
            mh4<g2b> mh4Var3 = this.$onNewConversationClicked;
            jt1Var.K(-554726101);
            boolean zJ3 = jt1Var.j(this.$uiState) | jt1Var.J(this.$onMediaItemsLimitReached) | jt1Var.J(this.$onMediaInputSelected) | jt1Var.J(this.$keyboardController) | jt1Var.j(this.$coroutineScope) | jt1Var.J(this.$keyboardAsState$delegate) | jt1Var.J(this.$openBottomSheet);
            final ConversationUiState conversationUiState = this.$uiState;
            final mh4<g2b> mh4Var4 = this.$onMediaItemsLimitReached;
            final mh4<g2b> mh4Var5 = this.$onMediaInputSelected;
            final xv9 xv9Var = this.$keyboardController;
            final t72 t72Var3 = this.$coroutineScope;
            final h37<Boolean> h37Var2 = this.$openBottomSheet;
            final yz9<KeyboardState> yz9Var = this.$keyboardAsState$delegate;
            Object objF3 = jt1Var.f();
            if (zJ3 || objF3 == c0187a) {
                mh4 mh4Var6 = new mh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.m
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return ConversationScreenKt$ConversationScreenContent$39$2.invoke$lambda$5$lambda$4(conversationUiState, mh4Var4, mh4Var5, xv9Var, t72Var3, h37Var2, yz9Var);
                    }
                };
                jt1Var.C(mh4Var6);
                objF3 = mh4Var6;
            }
            jt1Var.B();
            ConversationBottomBarKt.m180ConversationBottomBar6KZKxL0(ox6VarC, bottomBarUiState, ci4Var2, oh4Var, mh4Var2, mh4Var3, (mh4) objF3, this.$trackMetric, 56.0f, this.$navigateToAnotherConversation, this.$onPrivacyNoticeDismissed, this.$onTyping, this.$composerUiEffect, voiceTranscriptionState, this.$amplitudeLevel, this.$onStartVoiceRecording, this.$onStopVoiceRecording, this.$onCancelVoiceRecording, this.$onDeleteMediaUploadItem, this.$onFailedMediaUploadItem, this.$onClearMediaUploadItems, jt1Var, 100663296, 0, 0, 0);
        }
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
