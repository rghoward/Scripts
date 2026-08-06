package defpackage;

import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.account.presentation.AccountViewModel$onBirthdayUpdated$1", f = "AccountViewModel.kt", l = {205}, m = "invokeSuspend", v = 2)
public final class g8 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ e8 u;
    public final /* synthetic */ LocalDate v;

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
    public g8(e8 e8Var, LocalDate localDate, r02<? super g8> r02Var) {
        super(2, r02Var);
        this.u = e8Var;
        this.v = localDate;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new g8(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((g8) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        g8 g8Var;
        int i = this.t;
        LocalDate localDate = this.v;
        if (i == 0) {
            dv8.b(obj);
            this.t = 1;
            g8Var = this;
            obj = e8.i(this.u, null, null, null, localDate, g8Var, 7);
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
            g8Var = this;
        }
        xd3 xd3Var = (xd3) obj;
        xd3Var.getClass();
        e8.a aVar = e8.Companion;
        e8 e8Var = g8Var.u;
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
            e8Var.e(new b5.c(localDate));
        }
        return g2b.a;
    }
}
