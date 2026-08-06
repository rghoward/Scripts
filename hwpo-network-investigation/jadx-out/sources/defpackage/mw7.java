package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.core.data.storage.PersistentDataStorageImpl$clearAll$2", f = "PersistentDataStorageImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class mw7 extends p6a implements ci4<x27, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        mw7 mw7Var = new mw7(2, r02Var);
        mw7Var.t = obj;
        return mw7Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(x27 x27Var, r02<? super g2b> r02Var) {
        return ((mw7) create(x27Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        x27 x27Var = (x27) this.t;
        dv8.b(obj);
        x27Var.f();
        return g2b.a;
    }
}
