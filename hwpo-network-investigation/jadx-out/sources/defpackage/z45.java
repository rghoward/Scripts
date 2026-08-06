package defpackage;

import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.core.data.file_uploader.HttpUpload", f = "HttpUpload.kt", l = {InboxPagingSource.PAGE_SIZE, 22, 26}, m = "upload", v = 2)
public final class z45 extends u02 {
    public String t;
    public /* synthetic */ Object u;
    public final /* synthetic */ a55 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z45(a55 a55Var, u02 u02Var) {
        super(u02Var);
        this.v = a55Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.a(null, null, this);
    }
}
