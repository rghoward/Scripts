package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.core.data.file_uploader.FileUploader", f = "FileUploader.kt", l = {28}, m = "cancelFileUploading", v = 2)
public final class ny3 extends u02 {
    public String t;
    public /* synthetic */ Object u;
    public final /* synthetic */ oy3 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny3(oy3 oy3Var, u02 u02Var) {
        super(u02Var);
        this.v = oy3Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.a(null, this);
    }
}
