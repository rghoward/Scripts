package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.jvm.kt", l = {213}, m = "invokeSuspend", v = 1)
public final class tu7 extends p6a implements ci4<t72, r02<Object>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ s66 v;
    public final /* synthetic */ sbb w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu7(s66 s66Var, sbb sbbVar, r02 r02Var) {
        super(2, r02Var);
        this.v = s66Var;
        this.w = sbbVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        tu7 tu7Var = new tu7(this.v, this.w, r02Var);
        tu7Var.u = obj;
        return tu7Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<Object> r02Var) {
        return ((tu7) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        v66 v66Var;
        int i = this.t;
        if (i != 0) {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v66Var = (v66) this.u;
            try {
                dv8.b(obj);
                v66Var.a();
                return obj;
            } catch (Throwable th) {
                th = th;
                v66Var.a();
                throw th;
            }
        }
        dv8.b(obj);
        el5 el5Var = (el5) ((t72) this.u).getCoroutineContext().d0(el5.a.t);
        if (el5Var == null) {
            aa0.c("when[State] methods should have a parent job");
            return null;
        }
        su7 su7Var = new su7();
        v66 v66Var2 = new v66(this.v, su7Var.v, el5Var);
        try {
            sbb sbbVar = this.w;
            this.u = v66Var2;
            this.t = 1;
            obj = oy0.g(su7Var, sbbVar, this);
            v72 v72Var = v72.t;
            if (obj == v72Var) {
                return v72Var;
            }
            v66Var = v66Var2;
            v66Var.a();
            return obj;
        } catch (Throwable th2) {
            th = th2;
            v66Var = v66Var2;
            v66Var.a();
            throw th;
        }
    }
}
