package io.intercom.android.sdk.m5.conversation.ui.components;

import defpackage.aa0;
import defpackage.bl7;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g27;
import defpackage.g2b;
import defpackage.mh4;
import defpackage.nz5;
import defpackage.oz8;
import defpackage.p6a;
import defpackage.r02;
import defpackage.s54;
import defpackage.t72;
import defpackage.v72;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$12$1", f = "LazyMessageList.kt", l = {137}, m = "invokeSuspend")
public final class LazyMessageListKt$LazyMessageList$12$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ g27 $firstVisibleItemIndex$delegate;
    final /* synthetic */ nz5 $lazyListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyMessageListKt$LazyMessageList$12$1(nz5 nz5Var, g27 g27Var, r02<? super LazyMessageListKt$LazyMessageList$12$1> r02Var) {
        super(2, r02Var);
        this.$lazyListState = nz5Var;
        this.$firstVisibleItemIndex$delegate = g27Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new LazyMessageListKt$LazyMessageList$12$1(this.$lazyListState, this.$firstVisibleItemIndex$delegate, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((LazyMessageListKt$LazyMessageList$12$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            dv8.b(obj);
            final nz5 nz5Var = this.$lazyListState;
            oz8 oz8VarK = bl7.k(new mh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.j
                @Override // defpackage.mh4
                public final Object invoke() {
                    return Integer.valueOf(nz5Var.h());
                }
            });
            final g27 g27Var = this.$firstVisibleItemIndex$delegate;
            s54 s54Var = new s54() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$12$1.2
                @Override // defpackage.s54
                public /* bridge */ /* synthetic */ Object emit(Object obj2, r02 r02Var) {
                    return emit(((Number) obj2).intValue(), (r02<? super g2b>) r02Var);
                }

                public final Object emit(int i2, r02<? super g2b> r02Var) {
                    g27Var.j(i2);
                    return g2b.a;
                }
            };
            this.label = 1;
            Object objCollect = oz8VarK.collect(s54Var, this);
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
        return g2b.a;
    }
}
