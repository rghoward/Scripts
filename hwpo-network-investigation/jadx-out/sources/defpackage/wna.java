package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wna implements fl6 {
    public final /* synthetic */ float a;

    public wna(float f) {
        this.a = f;
    }

    @Override // defpackage.fl6
    public final gl6 d(hl6 hl6Var, List<? extends cl6> list, final long j) {
        wq5 wq5Var;
        wq5 wq5Var2;
        cl6 cl6Var;
        cl6 cl6Var2;
        final float fG = xx1.g(j) * this.a;
        int i = 0;
        long jA = xx1.a(0, 0, 0, 0, 10, j);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        while (true) {
            wq5Var = wq5.u;
            wq5Var2 = wq5.t;
            if (i2 >= size) {
                break;
            }
            cl6 cl6Var3 = list.get(i2);
            cl6 cl6Var4 = cl6Var3;
            if (yq5.c(cl6Var4) != wq5Var2 && yq5.c(cl6Var4) != wq5Var) {
                arrayList.add(cl6Var3);
            }
            i2++;
        }
        final ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList2.add(((cl6) arrayList.get(i3)).E(jA));
        }
        int size3 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                cl6Var = null;
                break;
            }
            cl6Var = list.get(i4);
            if (yq5.c(cl6Var) == wq5Var2) {
                break;
            }
            i4++;
        }
        cl6 cl6Var5 = cl6Var;
        int size4 = list.size();
        while (true) {
            if (i >= size4) {
                cl6Var2 = null;
                break;
            }
            cl6Var2 = list.get(i);
            if (yq5.c(cl6Var2) == wq5Var) {
                break;
            }
            i++;
        }
        cl6 cl6Var6 = cl6Var2;
        final float size5 = 6.2831855f / arrayList2.size();
        jz7 jz7VarE = cl6Var5 != null ? cl6Var5.E(jA) : null;
        final jz7 jz7VarE2 = cl6Var6 != null ? cl6Var6.E(jA) : null;
        final jz7 jz7Var = jz7VarE;
        return hl6Var.y0(xx1.j(j), xx1.i(j), if3.t, new oh4() { // from class: vna
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                long j2;
                jz7.a aVar = (jz7.a) obj;
                int i5 = 0;
                jz7 jz7Var2 = jz7Var;
                if (jz7Var2 != null) {
                    aVar.l(jz7Var2, 0, 0, 0.0f);
                }
                ArrayList arrayList3 = arrayList2;
                int size6 = arrayList3.size();
                while (true) {
                    j2 = j;
                    if (i5 >= size6) {
                        break;
                    }
                    jz7 jz7Var3 = (jz7) arrayList3.get(i5);
                    int iH = (xx1.h(j2) / 2) - (jz7Var3.t / 2);
                    int iG = (xx1.g(j2) / 2) - (jz7Var3.u / 2);
                    double d = fG;
                    double d2 = ((double) (size5 * i5)) - 1.5707963267948966d;
                    aVar.l(jz7Var3, wk6.a((Math.cos(d2) * d) + ((double) iH)), wk6.a((Math.sin(d2) * d) + ((double) iG)), 0.0f);
                    i5++;
                    arrayList3 = arrayList3;
                }
                jz7 jz7Var4 = jz7VarE2;
                if (jz7Var4 != null) {
                    aVar.l(jz7Var4, (xx1.j(j2) - jz7Var4.t) / 2, (xx1.i(j2) - jz7Var4.u) / 2, 0.0f);
                }
                return g2b.a;
            }
        });
    }
}
