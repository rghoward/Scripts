package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.comments.data.CommentsRepositoryImpl$observeDownloadingAttachmentUpdates$1", f = "CommentsRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xm1 extends p6a implements ci4<ww3, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ dn1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm1(dn1 dn1Var, r02<? super xm1> r02Var) {
        super(2, r02Var);
        this.u = dn1Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        xm1 xm1Var = new xm1(this.u, r02Var);
        xm1Var.t = obj;
        return xm1Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(ww3 ww3Var, r02<? super g2b> r02Var) {
        return ((xm1) create(ww3Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        ww3 ww3Var = (ww3) this.t;
        dv8.b(obj);
        this.u.c.h(ww3Var.a(), fk2.a(ww3Var));
        return g2b.a;
    }
}
