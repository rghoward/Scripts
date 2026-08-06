package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ti3 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ hk0 u;

    public /* synthetic */ ti3(hk0 hk0Var, int i) {
        this.t = i;
        this.u = hk0Var;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        hk0 hk0Var = this.u;
        switch (i) {
            case 0:
                vn0 vn0Var = (vn0) obj;
                fi3 fi3Var = (fi3) hk0Var;
                fi3.a aVar = fi3.Companion;
                if (vn0Var != null) {
                    fi3Var.q().d.k((String) fi3Var.F.getValue(), ws0.h(vn0Var));
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ho5<Object>[] ho5VarArr = jo9.C;
                ((jo9) hk0Var).p().i.setEnabled(zBooleanValue);
                break;
        }
        return g2b.a;
    }
}
