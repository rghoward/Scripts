package io.intercom.android.sdk.m5.conversation.ui;

import defpackage.aa0;
import defpackage.bw2;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.h37;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.v72;
import defpackage.xm2;
import defpackage.yz9;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1", f = "ConversationScreen.kt", l = {514}, m = "invokeSuspend")
public final class ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ yz9<KeyboardState> $keyboardAsState$delegate;
    final /* synthetic */ h37<Boolean> $openBottomSheet;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1(h37<Boolean> h37Var, yz9<KeyboardState> yz9Var, r02<? super ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1> r02Var) {
        super(2, r02Var);
        this.$openBottomSheet = h37Var;
        this.$keyboardAsState$delegate = yz9Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1(this.$openBottomSheet, this.$keyboardAsState$delegate, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            dv8.b(obj);
            if (ConversationScreenKt.ConversationScreenContent$lambda$169(this.$keyboardAsState$delegate).isVisible()) {
                this.label = 1;
                Object objB = bw2.b(200L, this);
                v72 v72Var = v72.t;
                if (objB == v72Var) {
                    return v72Var;
                }
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        this.$openBottomSheet.setValue(Boolean.TRUE);
        return g2b.a;
    }
}
