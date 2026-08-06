package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "coil.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", l = {131}, m = "invokeSuspend")
public final class lg3 extends p6a implements ci4<t72, r02<? super ig3.a>, Object> {
    public final /* synthetic */ nm3 A;
    public int t;
    public final /* synthetic */ ig3 u;
    public final /* synthetic */ gl8<ku3> v;
    public final /* synthetic */ gl8<uq1> w;
    public final /* synthetic */ k85 x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ gl8<zk7> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg3(ig3 ig3Var, gl8<ku3> gl8Var, gl8<uq1> gl8Var2, k85 k85Var, Object obj, gl8<zk7> gl8Var3, nm3 nm3Var, r02<? super lg3> r02Var) {
        super(2, r02Var);
        this.u = ig3Var;
        this.v = gl8Var;
        this.w = gl8Var2;
        this.x = k85Var;
        this.y = obj;
        this.z = gl8Var3;
        this.A = nm3Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new lg3(this.u, this.v, this.w, this.x, this.y, this.z, this.A, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super ig3.a> r02Var) {
        return ((lg3) create(t72Var, r02Var)).invokeSuspend(g2b.a);
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
        tw9 tw9Var = (tw9) this.v.t;
        uq1 uq1Var = this.w.t;
        zk7 zk7Var = this.z.t;
        this.t = 1;
        Object objB = ig3.b(this.u, tw9Var, uq1Var, this.x, this.y, zk7Var, this.A, this);
        v72 v72Var = v72.t;
        return objB == v72Var ? v72Var : objB;
    }
}
