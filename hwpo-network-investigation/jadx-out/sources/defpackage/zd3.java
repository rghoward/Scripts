package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.base.domain.entity.EitherKt$flatMapSuspendable$2", f = "Either.kt", l = {147}, m = "invokeSuspend", v = 2)
public final class zd3 extends p6a implements ci4<t72, r02<? super xd3<Object, Object>>, Object> {
    public int t;
    public final /* synthetic */ xd3<Object, Object> u;
    public final /* synthetic */ ci4<Object, r02<? super xd3<Object, Object>>, Object> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zd3(xd3<Object, Object> xd3Var, ci4<Object, ? super r02<? super xd3<Object, Object>>, ? extends Object> ci4Var, r02<? super zd3> r02Var) {
        super(2, r02Var);
        this.u = xd3Var;
        this.v = ci4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new zd3(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super xd3<Object, Object>> r02Var) {
        return ((zd3) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            xd3<Object, Object> xd3Var = this.u;
            if (xd3Var instanceof xd3.a) {
                return new xd3.a(((xd3.a) xd3Var).a);
            }
            if (!(xd3Var instanceof xd3.b)) {
                u.b();
                return null;
            }
            Object obj2 = ((xd3.b) xd3Var).a;
            this.t = 1;
            obj = this.v.invoke(obj2, this);
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
        return (xd3) obj;
    }
}
