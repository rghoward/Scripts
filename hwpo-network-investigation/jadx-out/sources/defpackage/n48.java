package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n48 extends w0 {
    public final int e;
    public final int f;
    public final int[] g;
    public final int[] h;
    public final toa[] i;
    public final Object[] j;
    public final HashMap<Object, Integer> k;

    public n48(toa[] toaVarArr, Object[] objArr, bo9 bo9Var) {
        super(bo9Var);
        int length = toaVarArr.length;
        this.i = toaVarArr;
        this.g = new int[length];
        this.h = new int[length];
        this.j = objArr;
        this.k = new HashMap<>();
        int length2 = toaVarArr.length;
        int i = 0;
        int iO = 0;
        int iH = 0;
        int i2 = 0;
        while (i < length2) {
            toa toaVar = toaVarArr[i];
            this.i[i2] = toaVar;
            this.h[i2] = iO;
            this.g[i2] = iH;
            iO += toaVar.o();
            iH += this.i[i2].h();
            this.k.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.e = iO;
        this.f = iH;
    }

    @Override // defpackage.toa
    public final int h() {
        return this.f;
    }

    @Override // defpackage.toa
    public final int o() {
        return this.e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n48(ArrayList arrayList, bo9 bo9Var) {
        toa[] toaVarArr = new toa[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            toaVarArr[i2] = ((kq6) obj).b();
            i2++;
        }
        Object[] objArr = new Object[arrayList.size()];
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            objArr[i] = ((kq6) obj2).a();
            i++;
        }
        this(toaVarArr, objArr, bo9Var);
    }
}
