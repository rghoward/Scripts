package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.sessions.presentation.sessions_list.SessionsViewModel$completePerformance$1", f = "SessionsViewModel.kt", l = {359}, m = "invokeSuspend", v = 2)
public final class mj9 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ lj9 u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj9(lj9 lj9Var, int i, r02<? super mj9> r02Var) {
        super(2, r02Var);
        this.u = lj9Var;
        this.v = i;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new mj9(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((mj9) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        lj9 lj9Var = this.u;
        if (i == 0) {
            dv8.b(obj);
            kj9.g gVar = kj9.g.a;
            lj9.a aVar = lj9.Companion;
            lj9Var.e(gVar);
            fp1 fp1Var = lj9Var.y;
            bc8 bc8Var = lj9Var.b().a;
            if (bc8Var == null) {
                z90.a("Required value was null.");
                return null;
            }
            fp1.a aVar2 = new fp1.a(bc8Var.t, this.v);
            this.t = 1;
            fp1Var.getClass();
            obj = g5b.b(fp1Var, aVar2, this);
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
        xd3 xd3Var = (xd3) obj;
        xd3Var.getClass();
        if (xd3Var instanceof xd3.a) {
            Exception exc = (Exception) ((xd3.a) xd3Var).a;
            kj9.b bVar = kj9.b.a;
            lj9.a aVar3 = lj9.Companion;
            lj9Var.e(bVar);
            lj9Var.f(new wh9(lj9Var.I.a(exc)));
            g2b g2bVar = g2b.a;
        } else {
            if (!(xd3Var instanceof xd3.b)) {
                u.b();
                return null;
            }
            kj9.b bVar2 = kj9.b.a;
            lj9.a aVar4 = lj9.Companion;
            lj9Var.e(bVar2);
            g2b g2bVar2 = g2b.a;
        }
        return g2b.a;
    }
}
