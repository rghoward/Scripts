package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.core.data.PaginationDelegate", f = "PaginationDelegate.kt", l = {18, 24, 24}, m = "paginate", v = 2)
public final class mr7<Data> extends u02 {
    public boolean t;
    public p6a u;
    public p6a v;
    public /* synthetic */ Object w;
    public final /* synthetic */ nr1 x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr7(nr1 nr1Var, u02 u02Var) {
        super(u02Var);
        this.x = nr1Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.c(false, null, null, null, null, null, this);
    }
}
