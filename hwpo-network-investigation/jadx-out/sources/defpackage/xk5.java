package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.google.firebase.datastorage.JavaDataStorage$getAllSync$1", f = "JavaDataStorage.kt", l = {170}, m = "invokeSuspend")
public final class xk5 extends p6a implements ci4<t72, r02<? super Map<t78.a<?>, ? extends Object>>, Object> {
    public int t;
    public final /* synthetic */ al5 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk5(al5 al5Var, r02<? super xk5> r02Var) {
        super(2, r02Var);
        this.u = al5Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new xk5(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super Map<t78.a<?>, ? extends Object>> r02Var) {
        return ((xk5) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
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
        return t78Var != null ? t78Var.a() : if3.t;
    }
}
