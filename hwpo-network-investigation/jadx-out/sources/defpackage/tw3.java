package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.download.FileDownloaderImpl", f = "FileDownloaderImpl.kt", l = {118}, m = "startDownloadFile", v = 2)
public final class tw3 extends u02 {
    public t72 t;
    public String u;
    public /* synthetic */ Object v;
    public final /* synthetic */ rw3 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw3(rw3 rw3Var, u02 u02Var) {
        super(u02Var);
        this.w = rw3Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return rw3.e(this.w, null, null, null, this);
    }
}
