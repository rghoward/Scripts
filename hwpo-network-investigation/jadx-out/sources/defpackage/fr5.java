package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fr5 extends wp5 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ List<ci4<jt1, Integer, g2b>> u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fr5(List<? extends ci4<? super jt1, ? super Integer, g2b>> list) {
        super(2);
        this.u = list;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            List<ci4<jt1, Integer, g2b>> list = this.u;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ci4<jt1, Integer, g2b> ci4Var = list.get(i);
                int iHashCode = Long.hashCode(jt1Var2.v());
                bt1.c.getClass();
                bt1.a.f fVar = bt1.a.c;
                if (jt1Var2.s() == null) {
                    ml5.c();
                    throw null;
                }
                jt1Var2.q();
                if (jt1Var2.l()) {
                    jt1Var2.k(fVar);
                } else {
                    jt1Var2.z();
                }
                rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
                ci4Var.invoke(jt1Var2, 0);
                jt1Var2.I();
            }
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
