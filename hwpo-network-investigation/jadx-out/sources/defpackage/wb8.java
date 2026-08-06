package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.profile.presentation.profile.ProfileViewModel$observeCurrentUserUpdates$1", f = "ProfileViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wb8 extends p6a implements ci4<xd3<? extends Exception, ? extends h5b>, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ zb8 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends pi4 implements oh4<h5b, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(h5b h5bVar) {
            h5b h5bVar2 = h5bVar;
            h5bVar2.getClass();
            zb8 zb8Var = (zb8) this.receiver;
            int i = zb8.I;
            if (zb8Var.b().g == null || zb8Var.b().g == h5bVar2.p) {
                zb8Var.e(new va8.e(h5bVar2));
            } else {
                oy0.d(rhb.b(zb8Var), null, null, new xb8(zb8Var, h5bVar2, null), 3);
            }
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb8(zb8 zb8Var, r02<? super wb8> r02Var) {
        super(2, r02Var);
        this.u = zb8Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        wb8 wb8Var = new wb8(this.u, r02Var);
        wb8Var.t = obj;
        return wb8Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(xd3<? extends Exception, ? extends h5b> xd3Var, r02<? super g2b> r02Var) {
        return ((wb8) create(xd3Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        xd3 xd3Var = (xd3) this.t;
        dv8.b(obj);
        yd3.h(xd3Var, new a(1, this.u, zb8.class, "onUserUpdated", "onUserUpdated(Lcom/hwpo_training_app/core/domain/model/user/User;)V", 0));
        return g2b.a;
    }
}
