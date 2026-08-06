package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.StorageConnectionKt$readData$2", f = "StorageConnection.kt", l = {63}, m = "invokeSuspend", v = 1)
public final class h1a extends p6a implements ei4<gi8<Object>, Boolean, r02<Object>, Object> {
    public int t;
    public /* synthetic */ gi8 u;

    @Override // defpackage.ei4
    public final Object invoke(gi8<Object> gi8Var, Boolean bool, r02<Object> r02Var) {
        bool.getClass();
        h1a h1aVar = new h1a(3, r02Var);
        h1aVar.u = gi8Var;
        return h1aVar.invokeSuspend(g2b.a);
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
        gi8 gi8Var = this.u;
        this.t = 1;
        Object objA = gi8Var.a(this);
        v72 v72Var = v72.t;
        return objA == v72Var ? v72Var : objA;
    }
}
