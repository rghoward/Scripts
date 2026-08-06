package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {305, 314, 322}, m = "readDataAndUpdateCache", v = 1)
public final class gg2 extends u02 {
    public boolean t;
    public xz9 u;
    public /* synthetic */ Object v;
    public final /* synthetic */ xf2<Object> w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg2(xf2<Object> xf2Var, r02<? super gg2> r02Var) {
        super(r02Var);
        this.w = xf2Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return xf2.f(this.w, false, this);
    }
}
