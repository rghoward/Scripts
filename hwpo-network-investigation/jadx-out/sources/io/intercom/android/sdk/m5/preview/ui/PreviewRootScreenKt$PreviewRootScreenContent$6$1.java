package io.intercom.android.sdk.m5.preview.ui;

import defpackage.aa0;
import defpackage.bl7;
import defpackage.ci4;
import defpackage.dr7;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.mh4;
import defpackage.oh4;
import defpackage.oz8;
import defpackage.p6a;
import defpackage.r02;
import defpackage.s54;
import defpackage.t72;
import defpackage.v72;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.preview.ui.PreviewRootScreenKt$PreviewRootScreenContent$6$1", f = "PreviewRootScreen.kt", l = {97}, m = "invokeSuspend")
public final class PreviewRootScreenKt$PreviewRootScreenContent$6$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ oh4<Integer, g2b> $onPageNavigated;
    final /* synthetic */ dr7 $pagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PreviewRootScreenKt$PreviewRootScreenContent$6$1(dr7 dr7Var, oh4<? super Integer, g2b> oh4Var, r02<? super PreviewRootScreenKt$PreviewRootScreenContent$6$1> r02Var) {
        super(2, r02Var);
        this.$pagerState = dr7Var;
        this.$onPageNavigated = oh4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new PreviewRootScreenKt$PreviewRootScreenContent$6$1(this.$pagerState, this.$onPageNavigated, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((PreviewRootScreenKt$PreviewRootScreenContent$6$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            dv8.b(obj);
            final dr7 dr7Var = this.$pagerState;
            oz8 oz8VarK = bl7.k(new mh4() { // from class: io.intercom.android.sdk.m5.preview.ui.i
                @Override // defpackage.mh4
                public final Object invoke() {
                    return Integer.valueOf(dr7Var.k());
                }
            });
            final oh4<Integer, g2b> oh4Var = this.$onPageNavigated;
            s54 s54Var = new s54() { // from class: io.intercom.android.sdk.m5.preview.ui.PreviewRootScreenKt$PreviewRootScreenContent$6$1.2
                public final Object emit(int i2, r02<? super g2b> r02Var) {
                    oh4Var.invoke(new Integer(i2));
                    return g2b.a;
                }

                @Override // defpackage.s54
                public /* bridge */ /* synthetic */ Object emit(Object obj2, r02 r02Var) {
                    return emit(((Number) obj2).intValue(), (r02<? super g2b>) r02Var);
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
