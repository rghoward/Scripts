package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class by5 implements jac {
    public static final /* synthetic */ by5 t = new by5();

    public static final List b(e1a e1aVar, int i, int i2, ArrayList arrayList, uf5 uf5Var, int i3, int i4, int i5, int i6, oh4 oh4Var) {
        int i7;
        e1a e1aVar2 = e1aVar;
        if (e1aVar2 == null || arrayList.isEmpty() || uf5Var.b == 0) {
            return hf3.t;
        }
        d27 d27VarA = e1aVar2.a(i, i2, uf5Var);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = arrayList.get(i8);
            int index = ((uw5) obj).getIndex();
            int[] iArr = uf5Var.a;
            int i9 = uf5Var.b;
            for (int i10 = 0; i10 < i9; i10++) {
                if (iArr[i10] == index) {
                    arrayList3.add(obj);
                    break;
                }
            }
        }
        int[] iArr2 = d27VarA.a;
        int i11 = d27VarA.b;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = iArr2[i12];
            int size2 = arrayList.size();
            int i14 = 0;
            int i15 = 0;
            while (true) {
                if (i15 >= size2) {
                    i14 = -1;
                    break;
                }
                Object obj2 = arrayList.get(i15);
                i15++;
                if (((uw5) obj2).getIndex() == i13) {
                    break;
                }
                i14++;
            }
            uw5 uw5Var = i14 == -1 ? (uw5) oh4Var.invoke(Integer.valueOf(i13)) : (uw5) arrayList.remove(i14);
            ArrayList arrayList4 = arrayList3;
            int iG = uw5Var.g();
            if (i14 == -1) {
                i7 = Integer.MIN_VALUE;
            } else {
                long jN = uw5Var.n(0);
                i7 = (int) (uw5Var.l() ? jN & 4294967295L : jN >> 32);
            }
            int iB = e1aVar2.b(arrayList4, i13, iG, i7, i3);
            uw5Var.m();
            uw5Var.f(iB, 0, i5, i6);
            arrayList2.add(uw5Var);
            i12++;
            e1aVar2 = e1aVar;
            arrayList3 = arrayList4;
        }
        return arrayList2;
    }

    public static ox6 c(ox6 ox6Var, eq eqVar) {
        return ox6Var.H(new u48(eqVar));
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Integer.valueOf((int) u4c.u.get().q0());
    }
}
