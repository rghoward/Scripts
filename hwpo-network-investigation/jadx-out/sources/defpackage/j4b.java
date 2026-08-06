package defpackage;

import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.core.data.file_uploader.UploadTask$uploadFile$2", f = "UploadTask.kt", l = {InboxPagingSource.PAGE_SIZE}, m = "invokeSuspend", v = 2)
public final class j4b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ a55 u;
    public final /* synthetic */ String v;
    public final /* synthetic */ String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4b(a55 a55Var, String str, String str2, r02 r02Var) {
        super(2, r02Var);
        this.u = a55Var;
        this.v = str;
        this.w = str2;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new j4b(this.u, this.v, this.w, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((j4b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            this.t = 1;
            Object objA = this.u.a(this.v, this.w, this);
            v72 v72Var = v72.t;
            if (objA == v72Var) {
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
