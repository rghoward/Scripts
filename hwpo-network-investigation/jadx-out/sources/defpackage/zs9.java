package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.material3.SnackbarHostState", f = "SnackbarHost.kt", l = {428, 431}, m = "showSnackbar")
public final class zs9 extends u02 {
    public qt9 t;
    public x37 u;
    public /* synthetic */ Object v;
    public final /* synthetic */ ys9 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs9(ys9 ys9Var, r02<? super zs9> r02Var) {
        super(r02Var);
        this.w = ys9Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.a(null, this);
    }
}
