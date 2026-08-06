package io.intercom.android.sdk.helpcenter.articles;

import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1$1$1$1", f = "IntercomArticleActivity.kt", l = {}, m = "invokeSuspend")
public final class IntercomArticleActivity$onCreate$1$1$1$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    int label;
    final /* synthetic */ IntercomArticleActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercomArticleActivity$onCreate$1$1$1$1(IntercomArticleActivity intercomArticleActivity, r02<? super IntercomArticleActivity$onCreate$1$1$1$1> r02Var) {
        super(2, r02Var);
        this.this$0 = intercomArticleActivity;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new IntercomArticleActivity$onCreate$1$1$1$1(this.this$0, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((IntercomArticleActivity$onCreate$1$1$1$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.label != 0) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        this.this$0.getViewModel().fragmentLoaded(this.this$0.getArguments().getArticleId());
        return g2b.a;
    }
}
