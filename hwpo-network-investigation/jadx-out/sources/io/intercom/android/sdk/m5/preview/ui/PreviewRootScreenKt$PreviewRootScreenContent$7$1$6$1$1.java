package io.intercom.android.sdk.m5.preview.ui;

import defpackage.aa0;
import defpackage.ci4;
import defpackage.dr7;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.v72;
import defpackage.xm2;
import defpackage.xv;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.preview.ui.PreviewRootScreenKt$PreviewRootScreenContent$7$1$6$1$1", f = "PreviewRootScreen.kt", l = {151}, m = "invokeSuspend")
public final class PreviewRootScreenKt$PreviewRootScreenContent$7$1$6$1$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ int $it;
    final /* synthetic */ dr7 $pagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewRootScreenKt$PreviewRootScreenContent$7$1$6$1$1(dr7 dr7Var, int i, r02<? super PreviewRootScreenKt$PreviewRootScreenContent$7$1$6$1$1> r02Var) {
        super(2, r02Var);
        this.$pagerState = dr7Var;
        this.$it = i;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new PreviewRootScreenKt$PreviewRootScreenContent$7$1$6$1$1(this.$pagerState, this.$it, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((PreviewRootScreenKt$PreviewRootScreenContent$7$1$6$1$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            dv8.b(obj);
            dr7 dr7Var = this.$pagerState;
            int i2 = this.$it;
            this.label = 1;
            Object objF = dr7Var.f(i2, xv.b(0.0f, 0.0f, null, 7), this);
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
