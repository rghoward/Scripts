package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.account.presentation.AccountViewModel$observeCurrentUserUpdates$1", f = "AccountViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f8 extends p6a implements ci4<xd3<? extends Exception, ? extends h5b>, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ e8 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(e8 e8Var, r02<? super f8> r02Var) {
        super(2, r02Var);
        this.u = e8Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        f8 f8Var = new f8(this.u, r02Var);
        f8Var.t = obj;
        return f8Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(xd3<? extends Exception, ? extends h5b> xd3Var, r02<? super g2b> r02Var) {
        return ((f8) create(xd3Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        xd3 xd3Var = (xd3) this.t;
        dv8.b(obj);
        xd3Var.getClass();
        if (xd3Var instanceof xd3.a) {
            rma.a.b((Throwable) ((xd3.a) xd3Var).a);
            g2b g2bVar = g2b.a;
        } else {
            if (!(xd3Var instanceof xd3.b)) {
                u.b();
                return null;
            }
            b5.g gVar = new b5.g((h5b) ((xd3.b) xd3Var).a);
            e8.a aVar = e8.Companion;
            this.u.e(gVar);
            g2b g2bVar2 = g2b.a;
        }
        return g2b.a;
    }
}
