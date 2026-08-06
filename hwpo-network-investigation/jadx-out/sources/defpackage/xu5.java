package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xu5 {
    public final /* synthetic */ zu5 a;

    public xu5(zu5 zu5Var) {
        this.a = zu5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList a(final int i) {
        ArrayList arrayList = new ArrayList();
        zu5 zu5Var = this.a;
        hu9 hu9VarA = hu9.a.a();
        oh4<Object, g2b> oh4VarE = hu9VarA != null ? hu9VarA.e() : null;
        hu9 hu9VarB = hu9.a.b(hu9VarA);
        try {
            final gu5 gu5Var = zu5Var.b ? zu5Var.c : (gu5) zu5Var.e.getValue();
            if (gu5Var != null) {
                final el8 el8Var = new el8();
                el8Var.t = 1;
                final List<js7<Integer, xx1>> listInvoke = gu5Var.k.invoke(Integer.valueOf(i));
                int size = listInvoke.size();
                for (int i2 = 0; i2 < size; i2++) {
                    js7<Integer, xx1> js7Var = listInvoke.get(i2);
                    lx5 lx5Var = zu5Var.o;
                    int iIntValue = js7Var.t.intValue();
                    long j = js7Var.u.a;
                    au3 au3Var = zu5.w;
                    el8Var = el8Var;
                    final ArrayList arrayList2 = null;
                    arrayList.add(lx5Var.a(iIntValue, j, false, new oh4(arrayList2, el8Var, listInvoke, i, gu5Var) { // from class: wu5
                        public final /* synthetic */ List t;
                        public final /* synthetic */ el8 u;
                        public final /* synthetic */ List v;
                        public final /* synthetic */ gu5 w;

                        {
                            this.w = gu5Var;
                        }

                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            lx5.c cVar = (lx5.c) obj;
                            int iB = cVar.b();
                            int iA = 0;
                            for (int i3 = 0; i3 < iB; i3++) {
                                iA += (int) (this.w.q == fl7.t ? cVar.a(i3) & 4294967295L : cVar.a(i3) >> 32);
                            }
                            List list = this.t;
                            if (list != null) {
                                list.add(Integer.valueOf(iA));
                            }
                            el8 el8Var2 = this.u;
                            if (el8Var2.t != this.v.size()) {
                                el8Var2.t++;
                            }
                            return g2b.a;
                        }
                    }));
                }
                g2b g2bVar = g2b.a;
            }
            return arrayList;
        } finally {
            hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
        }
    }
}
