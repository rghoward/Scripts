package io.intercom.android.sdk.m5.conversation.ui.components;

import defpackage.aa0;
import defpackage.au3;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g27;
import defpackage.g2b;
import defpackage.h37;
import defpackage.nz5;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.v72;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$15$1$2$2$1", f = "LazyMessageList.kt", l = {271}, m = "invokeSuspend")
public final class LazyMessageListKt$LazyMessageList$15$1$2$2$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ g27 $firstVisibleItemIndex$delegate;
    final /* synthetic */ int $index;
    final /* synthetic */ h37<Boolean> $isListAtTheBottom$delegate;
    final /* synthetic */ nz5 $lazyListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyMessageListKt$LazyMessageList$15$1$2$2$1(int i, nz5 nz5Var, h37<Boolean> h37Var, g27 g27Var, r02<? super LazyMessageListKt$LazyMessageList$15$1$2$2$1> r02Var) {
        super(2, r02Var);
        this.$index = i;
        this.$lazyListState = nz5Var;
        this.$isListAtTheBottom$delegate = h37Var;
        this.$firstVisibleItemIndex$delegate = g27Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new LazyMessageListKt$LazyMessageList$15$1$2$2$1(this.$index, this.$lazyListState, this.$isListAtTheBottom$delegate, this.$firstVisibleItemIndex$delegate, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((LazyMessageListKt$LazyMessageList$15$1$2$2$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            dv8.b(obj);
            if (LazyMessageListKt.LazyMessageList$lambda$27(this.$isListAtTheBottom$delegate) && this.$firstVisibleItemIndex$delegate.k() < this.$index) {
                nz5 nz5Var = this.$lazyListState;
                this.label = 1;
                au3 au3Var = nz5.y;
                Object objF = nz5Var.f(Integer.MAX_VALUE, 0, this);
                v72 v72Var = v72.t;
                if (objF == v72Var) {
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
