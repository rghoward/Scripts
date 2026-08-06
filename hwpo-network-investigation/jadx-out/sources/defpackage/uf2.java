package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.DataStoreImpl$InitDataStore", f = "DataStoreImpl.kt", l = {449, 453}, m = "doRun", v = 1)
public final class uf2 extends u02 {
    public /* synthetic */ Object t;
    public final /* synthetic */ xf2<Object>.a u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf2(xf2.a aVar, u02 u02Var) {
        super(u02Var);
        this.u = aVar;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.a(this);
    }
}
