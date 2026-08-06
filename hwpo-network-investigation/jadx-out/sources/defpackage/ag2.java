package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$2", f = "DataStoreImpl.kt", l = {434}, m = "invokeSuspend", v = 1)
public final class ag2 extends p6a implements oh4<r02<Object>, Object> {
    public int t;
    public final /* synthetic */ lg2 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag2(lg2 lg2Var, r02 r02Var) {
        super(1, r02Var);
        this.u = lg2Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(r02<?> r02Var) {
        return new ag2(this.u, r02Var);
    }

    @Override // defpackage.oh4
    public final Object invoke(r02<Object> r02Var) {
        return ((ag2) create(r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i != 0) {
            if (i == 1) {
                dv8.b(obj);
                return obj;
            }
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        this.t = 1;
        Object objInvoke = this.u.invoke(this);
        v72 v72Var = v72.t;
        return objInvoke == v72Var ? v72Var : objInvoke;
    }
}
