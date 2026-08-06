package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.DataStoreImpl$handleUpdate$2$1", f = "DataStoreImpl.kt", l = {256, 262, 265}, m = "invokeSuspend", v = 1)
public final class cg2 extends p6a implements ci4<t72, r02<Object>, Object> {
    public int t;
    public final /* synthetic */ xf2<Object> u;
    public final /* synthetic */ os6.a<Object> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg2(xf2<Object> xf2Var, os6.a<Object> aVar, r02<? super cg2> r02Var) {
        super(2, r02Var);
        this.u = xf2Var;
        this.v = aVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new cg2(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<Object> r02Var) {
        return ((cg2) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        os6.a<Object> aVar = this.v;
        xf2<Object> xf2Var = this.u;
        v72 v72Var = v72.t;
        if (i == 0) {
            dv8.b(obj);
            xz9<Object> xz9VarA = xf2Var.h.a();
            if (xz9VarA instanceof ne2) {
                ci4<Object, r02<? super Object>, Object> ci4Var = aVar.a;
                h72 h72Var = aVar.d;
                this.t = 1;
                Object objC = xf2Var.h().c(new ng2(xf2Var, h72Var, ci4Var, null), this);
                if (objC != v72Var) {
                    return objC;
                }
            } else {
                if (!(xz9VarA instanceof di8) && !(xz9VarA instanceof q1b)) {
                    if (xz9VarA instanceof yz3) {
                        throw ((yz3) xz9VarA).b;
                    }
                    if (xz9VarA instanceof hb7) {
                        aa0.c("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        return null;
                    }
                    u.b();
                    return null;
                }
                if (xz9VarA != aVar.c) {
                    throw ((di8) xz9VarA).b;
                }
                this.t = 2;
                if (xf2.e(xf2Var, this) != v72Var) {
                }
            }
        }
        if (i == 1) {
            dv8.b(obj);
            return obj;
        }
        if (i != 2) {
            if (i == 3) {
                dv8.b(obj);
                return obj;
            }
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        ci4<Object, r02<? super Object>, Object> ci4Var2 = aVar.a;
        h72 h72Var2 = aVar.d;
        this.t = 3;
        Object objC2 = xf2Var.h().c(new ng2(xf2Var, h72Var2, ci4Var2, null), this);
        return objC2 == v72Var ? v72Var : objC2;
    }
}
