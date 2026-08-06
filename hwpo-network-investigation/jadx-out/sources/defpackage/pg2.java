package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {368}, m = "writeData$datastore_core", v = 1)
public final class pg2 extends u02 {
    public el8 t;
    public /* synthetic */ Object u;
    public final /* synthetic */ xf2<Object> v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg2(xf2 xf2Var, u02 u02Var) {
        super(u02Var);
        this.v = xf2Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.j(null, false, this);
    }
}
