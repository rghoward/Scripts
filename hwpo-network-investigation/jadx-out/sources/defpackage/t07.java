package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", l = {213, 47, 48}, m = "lock", v = 1)
public final class t07<T> extends u02 {
    public Object t;
    public Object u;
    public AutoCloseable v;
    public /* synthetic */ Object w;
    public final /* synthetic */ q07 x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t07(q07 q07Var, u02 u02Var) {
        super(u02Var);
        this.x = q07Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.c(null, this);
    }
}
