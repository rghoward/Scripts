package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gj0 extends hj0 {
    public gj0(jj0 jj0Var, float f) {
        int i = 0;
        q55[] q55VarArr = {jj0Var};
        this.a = -3.4028235E38f;
        this.b = Float.MAX_VALUE;
        this.c = -3.4028235E38f;
        this.d = Float.MAX_VALUE;
        this.e = -3.4028235E38f;
        this.f = Float.MAX_VALUE;
        this.g = -3.4028235E38f;
        this.h = Float.MAX_VALUE;
        ArrayList arrayList = new ArrayList();
        arrayList.add(q55VarArr[0]);
        this.i = arrayList;
        a();
        this.j = 0.85f;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((t55) obj).t();
        }
        ArrayList arrayList2 = this.i;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            ((t55) obj2).s();
        }
        this.j = f;
    }
}
