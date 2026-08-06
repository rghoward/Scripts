package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class px8 extends qr5.e {
    public static final px8 b = new px8("Undefined intrinsics block and it is required");

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<jz7.a, g2b> {
        public static final a u = new a(1);

        @Override // defpackage.oh4
        public final /* bridge */ /* synthetic */ g2b invoke(jz7.a aVar) {
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements oh4<jz7.a, g2b> {
        public final /* synthetic */ jz7 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(jz7 jz7Var) {
            super(1);
            this.u = jz7Var;
        }

        @Override // defpackage.oh4
        public final g2b invoke(jz7.a aVar) {
            jz7.a.v(aVar, this.u, 0, 0);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends wp5 implements oh4<jz7.a, g2b> {
        public final /* synthetic */ ArrayList u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ArrayList arrayList) {
            super(1);
            this.u = arrayList;
        }

        @Override // defpackage.oh4
        public final g2b invoke(jz7.a aVar) {
            jz7.a aVar2 = aVar;
            ArrayList arrayList = this.u;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                jz7.a.v(aVar2, (jz7) arrayList.get(i), 0, 0);
            }
            return g2b.a;
        }
    }

    @Override // defpackage.fl6
    public final gl6 d(hl6 hl6Var, List<? extends cl6> list, long j) {
        int size = list.size();
        if3 if3Var = if3.t;
        if (size == 0) {
            return hl6Var.y0(xx1.j(j), xx1.i(j), if3Var, a.u);
        }
        if (size == 1) {
            jz7 jz7VarE = list.get(0).E(j);
            return hl6Var.y0(zx1.g(jz7VarE.t, j), zx1.f(jz7VarE.u, j), if3Var, new b(jz7VarE));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size2; i++) {
            jz7 jz7VarE2 = list.get(i).E(j);
            iMax = Math.max(jz7VarE2.t, iMax);
            iMax2 = Math.max(jz7VarE2.u, iMax2);
            arrayList.add(jz7VarE2);
        }
        return hl6Var.y0(zx1.g(iMax, j), zx1.f(iMax2, j), if3Var, new c(arrayList));
    }
}
