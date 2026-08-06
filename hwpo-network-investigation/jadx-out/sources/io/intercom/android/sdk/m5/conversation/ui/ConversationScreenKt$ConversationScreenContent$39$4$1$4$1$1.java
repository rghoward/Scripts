package io.intercom.android.sdk.m5.conversation.ui;

import defpackage.aa0;
import defpackage.au3;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.nz5;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.v72;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$39$4$1$4$1$1", f = "ConversationScreen.kt", l = {822}, m = "invokeSuspend")
public final class ConversationScreenKt$ConversationScreenContent$39$4$1$4$1$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ nz5 $lazyListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationScreenKt$ConversationScreenContent$39$4$1$4$1$1(nz5 nz5Var, r02<? super ConversationScreenKt$ConversationScreenContent$39$4$1$4$1$1> r02Var) {
        super(2, r02Var);
        this.$lazyListState = nz5Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new ConversationScreenKt$ConversationScreenContent$39$4$1$4$1$1(this.$lazyListState, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((ConversationScreenKt$ConversationScreenContent$39$4$1$4$1$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            dv8.b(obj);
            nz5 nz5Var = this.$lazyListState;
            this.label = 1;
            au3 au3Var = nz5.y;
            Object objF = nz5Var.f(Integer.MAX_VALUE, 0, this);
            v72 v72Var = v72.t;
            if (objF == v72Var) {
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
