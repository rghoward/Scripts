package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.download.FileDownloaderImpl$enqueueFile$2", f = "FileDownloaderImpl.kt", l = {57}, m = "invokeSuspend", v = 2)
public final class sw3 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ String v;
    public final /* synthetic */ rw3 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw3(String str, rw3 rw3Var, r02<? super sw3> r02Var) {
        super(2, r02Var);
        this.v = str;
        this.w = rw3Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        sw3 sw3Var = new sw3(this.v, this.w, r02Var);
        sw3Var.u = obj;
        return sw3Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((sw3) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        t72 t72Var = (t72) this.u;
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            String str = this.v;
            str.getClass();
            String strL = z2a.L(str, "://", str);
            rw3 rw3Var = this.w;
            ww3 ww3VarG = rw3Var.g(str, strL);
            if (ww3VarG instanceof ww3.b) {
                return g2b.a;
            }
            if (ww3VarG instanceof ww3.a) {
                rw3Var.f(t72Var, new ww3.a(str));
                return g2b.a;
            }
            rw3Var.f(t72Var, new ww3.b(str));
            this.u = null;
            this.t = 1;
            Object objE = rw3.e(rw3Var, t72Var, strL, str, this);
            v72 v72Var = v72.t;
            if (objE == v72Var) {
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
