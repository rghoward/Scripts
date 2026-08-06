package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sf implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ hk0 u;

    public /* synthetic */ sf(hk0 hk0Var, int i) {
        this.t = i;
        this.u = hk0Var;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        hk0 hk0Var = this.u;
        switch (i) {
            case 0:
                final qf qfVar = (qf) hk0Var;
                qf.a aVar = qf.Companion;
                qfVar.q().d.g((vz7) obj, new mh4() { // from class: lf
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        qf.a aVar2 = qf.Companion;
                        pg pgVarS = qfVar.s();
                        oy0.d(rhb.b(pgVarS), null, null, new ug(pgVarS, null), 3);
                        return g2b.a;
                    }
                });
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                hi9.a aVar2 = hi9.Companion;
                ((hi9) hk0Var).p().e.setVisible(zBooleanValue);
                break;
        }
        return g2b.a;
    }
}
