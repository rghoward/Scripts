package io.intercom.android.sdk.m5.conversation.ui;

import android.content.Context;
import defpackage.aa0;
import defpackage.ci4;
import defpackage.dq1;
import defpackage.dv8;
import defpackage.fl;
import defpackage.g2b;
import defpackage.h37;
import defpackage.js7;
import defpackage.ns9;
import defpackage.p6a;
import defpackage.r02;
import defpackage.s54;
import defpackage.t72;
import defpackage.v72;
import defpackage.xm2;
import defpackage.ys9;
import defpackage.zl9;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiEffect;
import io.intercom.android.sdk.m5.conversation.states.MediaUploadItem;
import io.intercom.android.sdk.utilities.Phrase;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreen$8$1", f = "ConversationScreen.kt", l = {190}, m = "invokeSuspend")
public final class ConversationScreenKt$ConversationScreen$8$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ConversationViewModel $conversationViewModel;
    final /* synthetic */ h37<js7<Boolean, String>> $showUploadSizeLimitDialog$delegate;
    final /* synthetic */ ys9 $snackbarHostState;
    final /* synthetic */ h37<MediaUploadItem> $uploadErrorDialogState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationScreenKt$ConversationScreen$8$1(ConversationViewModel conversationViewModel, Context context, ys9 ys9Var, h37<js7<Boolean, String>> h37Var, h37<MediaUploadItem> h37Var2, r02<? super ConversationScreenKt$ConversationScreen$8$1> r02Var) {
        super(2, r02Var);
        this.$conversationViewModel = conversationViewModel;
        this.$context = context;
        this.$snackbarHostState = ys9Var;
        this.$showUploadSizeLimitDialog$delegate = h37Var;
        this.$uploadErrorDialogState$delegate = h37Var2;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new ConversationScreenKt$ConversationScreen$8$1(this.$conversationViewModel, this.$context, this.$snackbarHostState, this.$showUploadSizeLimitDialog$delegate, this.$uploadErrorDialogState$delegate, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((ConversationScreenKt$ConversationScreen$8$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            dv8.b(obj);
            zl9<ConversationUiEffect> uiEffect = this.$conversationViewModel.getUiEffect();
            final Context context = this.$context;
            final ys9 ys9Var = this.$snackbarHostState;
            final h37<js7<Boolean, String>> h37Var = this.$showUploadSizeLimitDialog$delegate;
            final h37<MediaUploadItem> h37Var2 = this.$uploadErrorDialogState$delegate;
            s54<? super ConversationUiEffect> s54Var = new s54() { // from class: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreen$8$1.1
                public final Object emit(ConversationUiEffect conversationUiEffect, r02<? super g2b> r02Var) {
                    dq1 dq1Var;
                    if (conversationUiEffect instanceof ConversationUiEffect.ShowUploadSizeLimitDialog) {
                        h37Var.setValue(new js7(Boolean.TRUE, ((ConversationUiEffect.ShowUploadSizeLimitDialog) conversationUiEffect).getUploadSizeLimitMB()));
                    } else if (conversationUiEffect instanceof ConversationUiEffect.ShowUploadErrorDialog) {
                        h37Var2.setValue(((ConversationUiEffect.ShowUploadErrorDialog) conversationUiEffect).getUploadItem());
                    } else {
                        if (conversationUiEffect instanceof ConversationUiEffect.ShowMediaLimitExceeded) {
                            Object objB = ys9.b(ys9Var, Phrase.from(context, R.string.intercom_upload_max_files_allowed).put("limit", String.valueOf(((ConversationUiEffect.ShowMediaLimitExceeded) conversationUiEffect).getMaxLimit())).format().toString(), null, ns9.t, r02Var, 6);
                            return objB == v72.t ? objB : g2b.a;
                        }
                        if (conversationUiEffect instanceof ConversationUiEffect.LockScreenOrientation) {
                            Context context2 = context;
                            dq1Var = context2 instanceof dq1 ? (dq1) context2 : null;
                            if (dq1Var != null) {
                                dq1Var.setRequestedOrientation(14);
                            }
                        } else {
                            if (!(conversationUiEffect instanceof ConversationUiEffect.UnlockScreenOrientation)) {
                                defpackage.u.b();
                                return null;
                            }
                            Context context3 = context;
                            dq1Var = context3 instanceof dq1 ? (dq1) context3 : null;
                            if (dq1Var != null) {
                                dq1Var.setRequestedOrientation(-1);
                            }
                        }
                    }
                    return g2b.a;
                }

                @Override // defpackage.s54
                public /* bridge */ /* synthetic */ Object emit(Object obj2, r02 r02Var) {
                    return emit((ConversationUiEffect) obj2, (r02<? super g2b>) r02Var);
                }
            };
            this.label = 1;
            Object objCollect = uiEffect.collect(s54Var, this);
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
        fl.a();
        return null;
    }
}
