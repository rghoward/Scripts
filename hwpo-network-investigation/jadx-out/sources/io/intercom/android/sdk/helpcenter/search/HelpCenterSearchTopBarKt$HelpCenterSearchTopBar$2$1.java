package io.intercom.android.sdk.helpcenter.search;

import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.i37;
import defpackage.oh4;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.helpcenter.search.HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$2$1", f = "HelpCenterSearchTopBar.kt", l = {}, m = "invokeSuspend")
public final class HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$2$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ oh4<i37<String>, g2b> $onTextChanged;
    final /* synthetic */ i37<String> $textFlow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$2$1(oh4<? super i37<String>, g2b> oh4Var, i37<String> i37Var, r02<? super HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$2$1> r02Var) {
        super(2, r02Var);
        this.$onTextChanged = oh4Var;
        this.$textFlow = i37Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$2$1(this.$onTextChanged, this.$textFlow, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$2$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.label != 0) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        this.$onTextChanged.invoke(this.$textFlow);
        return g2b.a;
    }
}
