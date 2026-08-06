package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.google.firebase.datastorage.JavaDataStorage$getSync$1", f = "JavaDataStorage.kt", l = {104}, m = "invokeSuspend")
public final class yk5 extends p6a implements ci4<t72, r02<Object>, Object> {
    public int t;
    public final /* synthetic */ al5 u;
    public final /* synthetic */ t78.a<Object> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk5(al5 al5Var, t78.a aVar, r02 r02Var) {
        super(2, r02Var);
        this.u = al5Var;
        this.v = aVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new yk5(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<Object> r02Var) {
        return ((yk5) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objB;
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            r54<t78> data = this.u.c.getData();
            this.t = 1;
            obj = yk2.m(data, this);
            v72 v72Var = v72.t;
            if (obj == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        t78 t78Var = (t78) obj;
        if (t78Var == null || (objB = t78Var.b(this.v)) == null) {
            return -1L;
        }
        return objB;
    }
}
