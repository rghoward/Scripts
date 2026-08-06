package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class yj5 extends yu8 {
    public int t;
    public final /* synthetic */ ci4 u;
    public final /* synthetic */ r02 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj5(r02 r02Var, r02 r02Var2, ci4 ci4Var) {
        super(r02Var);
        this.u = ci4Var;
        this.v = r02Var2;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i != 0) {
            if (i != 1) {
                aa0.c("This coroutine had already completed");
                return null;
            }
            this.t = 2;
            dv8.b(obj);
            return obj;
        }
        this.t = 1;
        dv8.b(obj);
        ci4 ci4Var = this.u;
        ci4Var.getClass();
        fza.b(2, ci4Var);
        return ci4Var.invoke(this.v, this);
    }
}
