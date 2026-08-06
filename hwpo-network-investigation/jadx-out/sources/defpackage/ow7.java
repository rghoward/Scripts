package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.core.data.storage.PersistentDataStorageImpl$storeIntercomLoginStatus$2", f = "PersistentDataStorageImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ow7 extends p6a implements ci4<x27, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ pw7 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow7(pw7 pw7Var, r02 r02Var) {
        super(2, r02Var);
        this.u = pw7Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        ow7 ow7Var = new ow7(this.u, r02Var);
        ow7Var.t = obj;
        return ow7Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(x27 x27Var, r02<? super g2b> r02Var) {
        return ((ow7) create(x27Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        x27 x27Var = (x27) this.t;
        dv8.b(obj);
        x27Var.g(this.u.b, Boolean.TRUE);
        return g2b.a;
    }
}
