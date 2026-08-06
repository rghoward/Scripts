package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.sessions.presentation.session_details.SessionDetailsViewModel$getSectionDetails$2", f = "SessionDetailsViewModel.kt", l = {244}, m = "invokeSuspend", v = 2)
public final class zf9 extends p6a implements ci4<hd8, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ qf9 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf9(qf9 qf9Var, r02<? super zf9> r02Var) {
        super(2, r02Var);
        this.v = qf9Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        zf9 zf9Var = new zf9(this.v, r02Var);
        zf9Var.u = obj;
        return zf9Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(hd8 hd8Var, r02<? super g2b> r02Var) {
        return ((zf9) create(hd8Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        hd8 hd8Var = (hd8) this.u;
        int i = this.t;
        qf9 qf9Var = this.v;
        if (i == 0) {
            dv8.b(obj);
            n89 n89Var = qf9Var.H;
            this.u = null;
            this.t = 1;
            obj = n89Var.a(hd8Var);
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
        gd8 gd8Var = (gd8) obj;
        qf9Var.e(new qf9.b.d(gd8.a(gd8Var, ii6.b(gd8Var.h, qf9Var.I))));
        return g2b.a;
    }
}
