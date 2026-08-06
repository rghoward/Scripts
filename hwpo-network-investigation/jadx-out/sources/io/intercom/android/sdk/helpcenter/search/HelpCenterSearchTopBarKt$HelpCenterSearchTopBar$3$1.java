package io.intercom.android.sdk.helpcenter.search;

import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.p94;
import defpackage.r02;
import defpackage.t72;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.helpcenter.search.HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$3$1", f = "HelpCenterSearchTopBar.kt", l = {}, m = "invokeSuspend")
public final class HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$3$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ p94 $focusRequester;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$3$1(p94 p94Var, r02<? super HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$3$1> r02Var) {
        super(2, r02Var);
        this.$focusRequester = p94Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$3$1(this.$focusRequester, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$3$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.label != 0) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        p94.a(this.$focusRequester);
        return g2b.a;
    }
}
