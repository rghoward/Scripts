package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.profile.presentation.profile.ProfileViewModel$logout$1", f = "ProfileViewModel.kt", l = {69}, m = "invokeSuspend", v = 2)
public final class vb8 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ zb8 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb8(zb8 zb8Var, r02<? super vb8> r02Var) {
        super(2, r02Var);
        this.u = zb8Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new vb8(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((vb8) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        zb8 zb8Var = this.u;
        if (i == 0) {
            dv8.b(obj);
            int i2 = zb8.I;
            zb8Var.e(va8.c.a);
            rd6 rd6Var = zb8Var.A;
            rd6.a aVar = new rd6.a(false);
            this.t = 1;
            rd6Var.getClass();
            obj = g5b.b(rd6Var, aVar, this);
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
        ((xd3) obj).getClass();
        int i3 = zb8.I;
        zb8Var.e(va8.a.a);
        zb8Var.x.b();
        g2b g2bVar = g2b.a;
        return g2b.a;
    }
}
