package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yh implements fl6 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;

    public yh(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static final void b(ArrayList arrayList, el8 el8Var, hl6 hl6Var, float f, ArrayList arrayList2, ArrayList arrayList3, el8 el8Var2, ArrayList arrayList4, el8 el8Var3, el8 el8Var4) {
        if (!arrayList.isEmpty()) {
            el8Var.t = hl6Var.n1(f) + el8Var.t;
        }
        arrayList.add(0, th1.T(arrayList2));
        arrayList3.add(Integer.valueOf(el8Var2.t));
        arrayList4.add(Integer.valueOf(el8Var.t));
        el8Var.t += el8Var2.t;
        el8Var3.t = Math.max(el8Var3.t, el8Var4.t);
        arrayList2.clear();
        el8Var4.t = 0;
        el8Var2.t = 0;
    }

    @Override // defpackage.fl6
    public final gl6 d(final hl6 hl6Var, List<? extends cl6> list, long j) {
        jz7 jz7Var;
        final ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        el8 el8Var = new el8();
        el8 el8Var2 = new el8();
        ArrayList arrayList4 = new ArrayList();
        el8 el8Var3 = new el8();
        el8 el8Var4 = new el8();
        int size = list.size();
        int i = 0;
        while (i < size) {
            jz7 jz7VarE = list.get(i).E(j);
            boolean zIsEmpty = arrayList4.isEmpty();
            int i2 = size;
            float f = this.a;
            if (zIsEmpty) {
                jz7Var = jz7VarE;
            } else {
                ArrayList arrayList5 = arrayList;
                el8 el8Var5 = el8Var2;
                if (hl6Var.n1(f) + el8Var3.t + jz7VarE.t <= xx1.h(j)) {
                    arrayList = arrayList5;
                    el8Var2 = el8Var5;
                    jz7Var = jz7VarE;
                } else {
                    el8Var2 = el8Var5;
                    jz7Var = jz7VarE;
                    arrayList = arrayList5;
                    b(arrayList, el8Var2, hl6Var, this.b, arrayList4, arrayList2, el8Var4, arrayList3, el8Var, el8Var3);
                }
            }
            if (!arrayList4.isEmpty()) {
                el8Var3.t = hl6Var.n1(f) + el8Var3.t;
            }
            arrayList4.add(jz7Var);
            el8Var3.t += jz7Var.t;
            el8Var4.t = Math.max(el8Var4.t, jz7Var.u);
            i++;
            size = i2;
        }
        if (!arrayList4.isEmpty()) {
            b(arrayList, el8Var2, hl6Var, this.b, arrayList4, arrayList2, el8Var4, arrayList3, el8Var, el8Var3);
        }
        final int iMax = Math.max(el8Var.t, xx1.j(j));
        int iMax2 = Math.max(el8Var2.t, xx1.i(j));
        final float f2 = this.a;
        return hl6Var.y0(iMax, iMax2, if3.t, new oh4() { // from class: xh
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                hl6 hl6Var2;
                jz7.a aVar = (jz7.a) obj;
                ArrayList arrayList6 = arrayList;
                int size2 = arrayList6.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    List list2 = (List) arrayList6.get(i3);
                    int size3 = list2.size();
                    int[] iArr = new int[size3];
                    int i4 = 0;
                    while (true) {
                        hl6Var2 = hl6Var;
                        if (i4 >= size3) {
                            break;
                        }
                        iArr[i4] = ((jz7) list2.get(i4)).t + (i4 < list2.size() + (-1) ? hl6Var2.n1(f2) : 0);
                        i4++;
                    }
                    int[] iArr2 = new int[size3];
                    if (hl6Var2.getLayoutDirection() == tq5.t) {
                        int i5 = 0;
                        for (int i6 = 0; i6 < size3; i6++) {
                            i5 += iArr[i6];
                        }
                        int i7 = iMax - i5;
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < size3) {
                            int i10 = iArr[i8];
                            iArr2[i9] = i7;
                            i7 += i10;
                            i8++;
                            i9++;
                        }
                    } else {
                        int i11 = 0;
                        for (int i12 = size3 - 1; -1 < i12; i12--) {
                            int i13 = iArr[i12];
                            iArr2[i12] = i11;
                            i11 += i13;
                        }
                    }
                    int size4 = list2.size();
                    for (int i14 = 0; i14 < size4; i14++) {
                        aVar.l((jz7) list2.get(i14), iArr2[i14], ((Number) arrayList3.get(i3)).intValue(), 0.0f);
                    }
                }
                return g2b.a;
            }
        });
    }
}
