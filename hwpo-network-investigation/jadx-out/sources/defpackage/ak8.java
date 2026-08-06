package defpackage;

import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ak8 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ ak8(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ipb] */
    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                ((gk8) obj).H();
                return g2b.a;
            default:
                final jpb jpbVar = (jpb) obj;
                ho5<Object>[] ho5VarArr = jpb.F;
                tlb tlbVar = new tlb(new oh4() { // from class: ipb
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        LocalDate localDate = (LocalDate) obj2;
                        ho5<Object>[] ho5VarArr2 = jpb.F;
                        localDate.getClass();
                        jpbVar.q().g(localDate);
                        return g2b.a;
                    }
                });
                tlbVar.s();
                return tlbVar;
        }
    }
}
