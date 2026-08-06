package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.host.presentation.HostActivityViewModel$observeNavigationCommands$1", f = "HostActivityViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class n25 extends p6a implements ci4<a87, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ e25 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n25(e25 e25Var, r02<? super n25> r02Var) {
        super(2, r02Var);
        this.u = e25Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        n25 n25Var = new n25(this.u, r02Var);
        n25Var.t = obj;
        return n25Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(a87 a87Var, r02<? super g2b> r02Var) {
        return ((n25) create(a87Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        e25 e25Var = this.u;
        o52 o52Var = e25Var.z;
        a46 a46Var = e25Var.A;
        a87 a87Var = (a87) this.t;
        dv8.b(obj);
        if (a87Var instanceof a87.a) {
            a87.a aVar = (a87.a) a87Var;
            e25Var.C.a(aVar.a, aVar.b);
        } else if (a87Var instanceof a87.b) {
            e25Var.B.b(((a87.b) a87Var).a);
        } else if (a87Var instanceof a87.e) {
            int i = e25.T;
            oy0.d(rhb.b(e25Var), null, null, new i25(e25Var, (a87.e) a87Var, null), 3);
        } else if (a87Var instanceof a87.d) {
            a46Var.d(((a87.d) a87Var).a);
        } else if (a87Var instanceof a87.c) {
            a46Var.o(BuildConfig.FLAVOR, BuildConfig.FLAVOR, null, ((a87.c) a87Var).a);
        } else if (a87Var instanceof a87.f) {
            o52Var.c();
        } else {
            if (!(a87Var instanceof a87.g)) {
                u.b();
                return null;
            }
            o52Var.b();
        }
        return g2b.a;
    }
}
