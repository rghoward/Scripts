package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.account.presentation.AccountViewModel$updateFirstName$1", f = "AccountViewModel.kt", l = {280}, m = "invokeSuspend", v = 2)
public final class m8 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ e8 u;
    public final /* synthetic */ String v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends pi4 implements oh4<Exception, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(Exception exc) {
            Exception exc2 = exc;
            exc2.getClass();
            e8.g((e8) this.receiver, exc2);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(e8 e8Var, String str, r02<? super m8> r02Var) {
        super(2, r02Var);
        this.u = e8Var;
        this.v = str;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new m8(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((m8) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objI;
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            this.t = 1;
            objI = e8.i(this.u, this.v, null, null, null, this, 14);
            v72 v72Var = v72.t;
            if (objI == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            objI = obj;
        }
        xd3 xd3Var = (xd3) objI;
        xd3Var.getClass();
        e8.a aVar = e8.Companion;
        e8 e8Var = this.u;
        e8Var.e(b5.a.a);
        g2b g2bVar = g2b.a;
        a aVar2 = new a(1, e8Var, e8.class, "onError", "onError(Ljava/lang/Exception;)V", 0);
        if (xd3Var instanceof xd3.a) {
            aVar2.invoke(((xd3.a) xd3Var).a);
        } else {
            if (!(xd3Var instanceof xd3.b)) {
                u.b();
                return null;
            }
            String str = this.v;
            e8Var.e(new b5.e(str, str != null ? String.valueOf(a3a.S(str)) : null));
        }
        return g2b.a;
    }
}
