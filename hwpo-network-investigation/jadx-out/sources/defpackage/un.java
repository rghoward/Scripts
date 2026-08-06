package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class un implements fl6 {
    public static final un a = new un();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<jz7.a, g2b> {
        public final /* synthetic */ ArrayList u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList) {
            super(1);
            this.u = arrayList;
        }

        @Override // defpackage.oh4
        public final g2b invoke(jz7.a aVar) {
            jz7.a aVar2 = aVar;
            ArrayList arrayList = this.u;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                jz7.a.t(aVar2, (jz7) arrayList.get(i), 0, 0);
            }
            return g2b.a;
        }
    }

    @Override // defpackage.fl6
    public final gl6 d(hl6 hl6Var, List<? extends cl6> list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iJ = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jz7 jz7VarE = list.get(i2).E(j);
            iJ = Math.max(iJ, jz7VarE.t);
            i = Math.max(i, jz7VarE.u);
            arrayList.add(jz7VarE);
        }
        if (list.isEmpty()) {
            iJ = xx1.j(j);
            i = xx1.i(j);
        }
        return hl6Var.y0(iJ, i, if3.t, new a(arrayList));
    }
}
