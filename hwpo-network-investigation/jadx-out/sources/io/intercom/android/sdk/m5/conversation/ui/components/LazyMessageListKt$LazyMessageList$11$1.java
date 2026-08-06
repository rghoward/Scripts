package io.intercom.android.sdk.m5.conversation.ui.components;

import defpackage.aa0;
import defpackage.b27;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.h37;
import defpackage.nz5;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.v72;
import defpackage.xm2;
import defpackage.xv;
import defpackage.yz9;
import defpackage.zh1;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$11$1", f = "LazyMessageList.kt", l = {131}, m = "invokeSuspend")
public final class LazyMessageListKt$LazyMessageList$11$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ h37<Boolean> $isListAtTheBottom$delegate;
    final /* synthetic */ yz9<KeyboardState> $keyboardAsState$delegate;
    final /* synthetic */ b27 $keyboardScrollOffset$delegate;
    final /* synthetic */ nz5 $lazyListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyMessageListKt$LazyMessageList$11$1(nz5 nz5Var, yz9<KeyboardState> yz9Var, h37<Boolean> h37Var, b27 b27Var, r02<? super LazyMessageListKt$LazyMessageList$11$1> r02Var) {
        super(2, r02Var);
        this.$lazyListState = nz5Var;
        this.$keyboardAsState$delegate = yz9Var;
        this.$isListAtTheBottom$delegate = h37Var;
        this.$keyboardScrollOffset$delegate = b27Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new LazyMessageListKt$LazyMessageList$11$1(this.$lazyListState, this.$keyboardAsState$delegate, this.$isListAtTheBottom$delegate, this.$keyboardScrollOffset$delegate, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((LazyMessageListKt$LazyMessageList$11$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            dv8.b(obj);
            if (LazyMessageListKt.LazyMessageList$lambda$18(this.$keyboardAsState$delegate).isDismissed() && !LazyMessageListKt.LazyMessageList$lambda$27(this.$isListAtTheBottom$delegate) && this.$keyboardScrollOffset$delegate.h() > 0.0f) {
                nz5 nz5Var = this.$lazyListState;
                float f = -this.$keyboardScrollOffset$delegate.h();
                this.label = 1;
                Object objA = zh1.a(nz5Var, f, xv.b(0.0f, 0.0f, null, 7), this);
                v72 v72Var = v72.t;
                if (objA == v72Var) {
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
        return g2b.a;
    }
}
