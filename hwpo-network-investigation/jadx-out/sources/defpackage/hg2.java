package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", l = {316, 318}, m = "invokeSuspend", v = 1)
public final class hg2 extends p6a implements oh4<r02<? super js7<? extends xz9<Object>, ? extends Boolean>>, Object> {
    public Throwable t;
    public int u;
    public final /* synthetic */ xf2<Object> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg2(xf2<Object> xf2Var, r02<? super hg2> r02Var) {
        super(1, r02Var);
        this.v = xf2Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(r02<?> r02Var) {
        return new hg2(this.v, r02Var);
    }

    @Override // defpackage.oh4
    public final Object invoke(r02<? super js7<? extends xz9<Object>, ? extends Boolean>> r02Var) {
        return ((hg2) create(r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        xz9 di8Var;
        int i = this.u;
        xf2<Object> xf2Var = this.v;
        v72 v72Var = v72.t;
        try {
            if (i == 0) {
                dv8.b(obj);
                this.u = 1;
                obj = xf2.g(xf2Var, true, this);
                if (obj == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = this.t;
                    dv8.b(obj);
                    di8Var = new di8(th, ((Number) obj).intValue());
                    return new js7(di8Var, Boolean.TRUE);
                }
                dv8.b(obj);
            }
            di8Var = (xz9) obj;
        } catch (Throwable th2) {
            pg5 pg5VarH = xf2Var.h();
            this.t = th2;
            this.u = 2;
            Object objA = pg5VarH.a(this);
            if (objA != v72Var) {
                obj = objA;
                th = th2;
            }
            return v72Var;
        }
        return new js7(di8Var, Boolean.TRUE);
    }
}
