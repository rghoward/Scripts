package defpackage;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gq0 implements eu8 {
    public final Object t;

    public gq0() {
        this.t = new LinkedHashMap();
    }

    @Override // defpackage.eu8
    public kt8 a(kt8 kt8Var, xk7 xk7Var) {
        Resources resources = (Resources) this.t;
        if (kt8Var == null) {
            return null;
        }
        return new us5(resources, kt8Var);
    }

    public void b(wc1 wc1Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.t;
        long[] jArr = wc1Var.e;
        if (jArr.length <= 0 || linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        linkedHashMap.put(Long.valueOf(wc1Var.e[0]), wc1Var);
    }

    public wc1 c() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (wc1 wc1Var : ((LinkedHashMap) this.t).values()) {
            arrayList.add(wc1Var.b);
            arrayList2.add(wc1Var.c);
            arrayList3.add(wc1Var.d);
            arrayList4.add(wc1Var.e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += (long) iArr2.length;
        }
        int i = (int) length;
        xl7.e(length, "the total number of elements (%s) in the arrays must fit in an int", length == ((long) i));
        int[] iArr3 = new int[i];
        int length2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
            length2 += iArr4.length;
        }
        return new wc1(iArr3, bf6.a((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), bf6.a((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), bf6.a((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public gq0(Resources resources) {
        this.t = resources;
    }
}
