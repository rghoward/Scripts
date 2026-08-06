package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tq4 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ tq4(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                wq4 wq4Var = (wq4) obj2;
                gm3 gm3Var = (gm3) obj;
                wq4.a aVar = wq4.Companion;
                gm3Var.getClass();
                if (gm3Var instanceof sq4) {
                    wq4Var.t(((sq4) gm3Var).b);
                } else if (gm3Var instanceof rq4) {
                    wq4Var.getParentFragmentManager().e0(uy0.c(new js7("com.hwpo_training_app.affilated_gym.filters.location_filter.GymLocationFilterFragment.SELECT_FILTER_RESULT_KEY", ((rq4) gm3Var).b)), "com.hwpo_training_app.affilated_gym.filters.location_filter.GymLocationFilterFragment.SELECT_FILTER_REQUEST_KEY");
                    wq4Var.i();
                }
                return g2b.a;
            case 1:
                aba abaVar = (aba) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                aba.a aVar2 = abaVar.W;
                if (aVar2 == null) {
                    z = false;
                } else {
                    oh4<? super aba.a, g2b> oh4Var = abaVar.S;
                    if (oh4Var != null) {
                        oh4Var.invoke(aVar2);
                    }
                    aba.a aVar3 = abaVar.W;
                    if (aVar3 != null) {
                        aVar3.c = zBooleanValue;
                    }
                    ew2.f(abaVar).R();
                    ew2.f(abaVar).Q();
                    b73.a(abaVar);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                wpb wpbVar = (wpb) obj2;
                dl2 dl2Var = (dl2) obj;
                if (!(dl2Var instanceof dl2.a)) {
                    u.b();
                    return null;
                }
                wpb.a aVar4 = wpb.Companion;
                return oy0.d(rhb.b(wpbVar), null, null, new bqb(null, wpbVar, wpbVar.b().b, ((dl2.a) dl2Var).a), 3);
        }
    }
}
