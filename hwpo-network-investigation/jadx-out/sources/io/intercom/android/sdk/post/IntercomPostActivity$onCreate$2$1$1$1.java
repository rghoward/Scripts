package io.intercom.android.sdk.post;

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
@xm2(c = "io.intercom.android.sdk.post.IntercomPostActivity$onCreate$2$1$1$1", f = "IntercomPostActivity.kt", l = {}, m = "invokeSuspend")
public final class IntercomPostActivity$onCreate$2$1$1$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    int label;
    final /* synthetic */ IntercomPostActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercomPostActivity$onCreate$2$1$1$1(IntercomPostActivity intercomPostActivity, r02<? super IntercomPostActivity$onCreate$2$1$1$1> r02Var) {
        super(2, r02Var);
        this.this$0 = intercomPostActivity;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new IntercomPostActivity$onCreate$2$1$1$1(this.this$0, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((IntercomPostActivity$onCreate$2$1$1$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.label != 0) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        this.this$0.sendPostAsRead();
        return g2b.a;
    }
}
