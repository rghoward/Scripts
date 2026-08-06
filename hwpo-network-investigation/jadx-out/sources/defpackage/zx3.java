package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {238, 112}, m = "writeScope", v = 1)
public final class zx3 extends u02 {
    public Object t;
    public Object u;
    public ty3 v;
    public /* synthetic */ Object w;
    public final /* synthetic */ ay3<Object> x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx3(ay3 ay3Var, u02 u02Var) {
        super(u02Var);
        this.x = ay3Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.b(null, this);
    }
}
