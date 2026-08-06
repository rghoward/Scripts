package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vu implements fl6 {
    public final kv a;
    public boolean b;

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
                aVar2.l((jz7) arrayList.get(i), 0, 0, 0.0f);
            }
            return g2b.a;
        }
    }

    public vu(kv kvVar) {
        this.a = kvVar;
    }

    @Override // defpackage.fl6
    public final int a(qj5 qj5Var, List<? extends pj5> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iC = list.get(0).C(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iC2 = list.get(i2).C(i);
                if (iC2 > iC) {
                    iC = iC2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iC;
    }

    @Override // defpackage.fl6
    public final gl6 d(hl6 hl6Var, List<? extends cl6> list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            jz7 jz7VarE = list.get(i).E(j);
            iMax = Math.max(iMax, jz7VarE.t);
            iMax2 = Math.max(iMax2, jz7VarE.u);
            arrayList.add(jz7VarE);
        }
        boolean zP0 = hl6Var.P0();
        kv kvVar = this.a;
        if (zP0) {
            this.b = true;
            kvVar.a.setValue(new kg5((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        } else if (!this.b) {
            kvVar.a.setValue(new kg5((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        }
        return hl6Var.y0(iMax, iMax2, if3.t, new a(arrayList));
    }

    @Override // defpackage.fl6
    public final int e(qj5 qj5Var, List<? extends pj5> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iA = list.get(0).A(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iA2 = list.get(i2).A(i);
                if (iA2 > iA) {
                    iA = iA2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iA;
    }

    @Override // defpackage.fl6
    public final int g(qj5 qj5Var, List<? extends pj5> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iO = list.get(0).o(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iO2 = list.get(i2).o(i);
                if (iO2 > iO) {
                    iO = iO2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iO;
    }

    @Override // defpackage.fl6
    public final int i(qj5 qj5Var, List<? extends pj5> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iC0 = list.get(0).c0(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iC1 = list.get(i2).c0(i);
                if (iC1 > iC0) {
                    iC0 = iC1;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iC0;
    }
}
