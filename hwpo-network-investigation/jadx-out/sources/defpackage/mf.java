package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mf implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ mf(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                qf qfVar = (qf) obj2;
                gm3 gm3Var = (gm3) obj;
                qf.a aVar = qf.Companion;
                gm3Var.getClass();
                if (gm3Var instanceof jf) {
                    qfVar.m(((jf) gm3Var).b);
                } else if (gm3Var instanceof gf) {
                    qfVar.q().g.t.c.setText((CharSequence) null);
                } else if (gm3Var instanceof hf) {
                    hf hfVar = (hf) gm3Var;
                    qfVar.getParentFragmentManager().e0(uy0.c(new js7("com.hwpo_training_app.affilated_gym.list.AffilatedGymListFragment.SELECTED_GYM_ID_KEY", Integer.valueOf(hfVar.b)), new js7("com.hwpo_training_app.affilated_gym.list.AffilatedGymListFragment.SELECTED_GYM_NAME_KEY", hfVar.c)), "com.hwpo_training_app.affilated_gym.list.AffilatedGymListFragment.AFFILIATED_GYM_UPDATED_KEY");
                }
                return g2b.a;
            default:
                vja vjaVar = (vja) obj2;
                String str = ((iw) obj).u;
                vja.a aVar2 = vjaVar.S;
                if (aVar2 == null) {
                    vja.a aVar3 = new vja.a(vjaVar.H, str);
                    rs7 rs7Var = new rs7(str, vjaVar.I, vjaVar.J, vjaVar.K, vjaVar.L, vjaVar.M, vjaVar.N);
                    rs7Var.d(vjaVar.c2().i);
                    aVar3.d = rs7Var;
                    vjaVar.S = aVar3;
                } else if (!xj5.a(str, aVar2.b)) {
                    aVar2.b = str;
                    rs7 rs7Var2 = aVar2.d;
                    if (rs7Var2 != null) {
                        rs7Var2.f(str, vjaVar.I, vjaVar.J, vjaVar.K, vjaVar.L, vjaVar.M, vjaVar.N);
                    }
                }
                ew2.f(vjaVar).R();
                ew2.f(vjaVar).Q();
                b73.a(vjaVar);
                return Boolean.TRUE;
        }
    }
}
