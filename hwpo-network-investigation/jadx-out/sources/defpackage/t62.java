package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t62 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ t62(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                a72 a72Var = (a72) obj2;
                dt7 dt7Var = a72Var.L.t;
                Boolean bool = Boolean.TRUE;
                dt7Var.setValue(bool);
                a72Var.L.s.setValue(bool);
                u56 u56Var = a72Var.L;
                CharSequence charSequenceA = ((dz3) obj).a();
                charSequenceA.getClass();
                a72.f2(u56Var, (String) charSequenceA, a72Var.M, a72Var.N);
                return bool;
            case 1:
                oc4 oc4Var = (oc4) obj2;
                gm3 gm3Var = (gm3) obj;
                ho5<Object>[] ho5VarArr = oc4.C;
                gm3Var.getClass();
                if (gm3Var instanceof uc4) {
                    oc4Var.m(((uc4) gm3Var).b);
                } else if (gm3Var instanceof vc4) {
                    oc4Var.n(((vc4) gm3Var).b);
                }
                return g2b.a;
            default:
                jz7 jz7Var = (jz7) obj2;
                jz7.a aVar = (jz7.a) obj;
                if (aVar.g() == tq5.t || aVar.j() == 0) {
                    jz7.a.e(jz7Var, aVar);
                    jz7Var.i0(bg5.d(0L, jz7Var.x), 0.0f, null);
                } else {
                    long j = ((long) (aVar.j() - jz7Var.t)) << 32;
                    jz7.a.e(jz7Var, aVar);
                    jz7Var.i0(bg5.d(j, jz7Var.x), 0.0f, null);
                }
                return g2b.a;
        }
    }
}
