package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1", f = "DataStoreImpl.kt", l = {566, 467, 469}, m = "updateData", v = 1)
public final class vf2 extends u02 {
    public int A;
    public Object t;
    public Object u;
    public Object v;
    public gl8 w;
    public xf2 x;
    public /* synthetic */ Object y;
    public final /* synthetic */ wf2.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf2(wf2.a aVar, u02 u02Var) {
        super(u02Var);
        this.z = aVar;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, this);
    }
}
