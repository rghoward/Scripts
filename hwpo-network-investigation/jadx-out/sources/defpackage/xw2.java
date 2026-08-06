package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xw2 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ xw2(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                zw2 zw2Var = (zw2) obj;
                rw8 rw8Var = (rw8) ku1.a(zw2Var, zw8.a);
                ar arVar = zw2Var.N;
                if (rw8Var == null) {
                    if (arVar != null) {
                        zw2Var.d2(arVar);
                    }
                    zw2Var.N = null;
                } else if (arVar == null) {
                    yw2 yw2Var = new yw2(zw2Var);
                    b22 b22Var = new b22(1, zw2Var);
                    h27 h27Var = zw2Var.J;
                    boolean z = zw2Var.K;
                    float f = zw2Var.L;
                    xya<Float> xyaVar = ax8.a;
                    ar arVar2 = new ar(h27Var, z, f, yw2Var, b22Var);
                    zw2Var.c2(arVar2);
                    zw2Var.N = arVar2;
                }
                return g2b.a;
            case 1:
                wq4.a aVar = wq4.Companion;
                rr4 rr4VarW = ((wq4) obj).w();
                oy0.d(rhb.b(rr4VarW), null, null, new ur4(rr4VarW, null), 3);
                return g2b.a;
            default:
                ((mh4) obj).invoke();
                return Boolean.TRUE;
        }
    }
}
