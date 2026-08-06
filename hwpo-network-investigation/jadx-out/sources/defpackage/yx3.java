package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {96}, m = "readScope", v = 1)
public final class yx3<R> extends u02 {
    public boolean t;
    public px3 u;
    public /* synthetic */ Object v;
    public final /* synthetic */ ay3<Object> w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx3(ay3 ay3Var, u02 u02Var) {
        super(u02Var);
        this.w = ay3Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.c(null, this);
    }
}
