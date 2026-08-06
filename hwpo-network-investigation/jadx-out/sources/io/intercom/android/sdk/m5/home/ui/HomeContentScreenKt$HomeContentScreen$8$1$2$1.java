package io.intercom.android.sdk.m5.home.ui;

import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.xm2;
import io.intercom.android.sdk.Injector;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.home.ui.HomeContentScreenKt$HomeContentScreen$8$1$2$1", f = "HomeContentScreen.kt", l = {}, m = "invokeSuspend")
public final class HomeContentScreenKt$HomeContentScreen$8$1$2$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ int $index;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeContentScreenKt$HomeContentScreen$8$1$2$1(int i, r02<? super HomeContentScreenKt$HomeContentScreen$8$1$2$1> r02Var) {
        super(2, r02Var);
        this.$index = i;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new HomeContentScreenKt$HomeContentScreen$8$1$2$1(this.$index, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((HomeContentScreenKt$HomeContentScreen$8$1$2$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.label != 0) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        Injector.get().getMetricTracker().viewedSearchBrowseCard(this.$index);
        return g2b.a;
    }
}
