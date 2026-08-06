package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class t03 extends fy2 {
    public int m;

    public t03(dmb dmbVar) {
        super(dmbVar);
        if (dmbVar instanceof o15) {
            this.e = fy2.a.u;
        } else {
            this.e = fy2.a.v;
        }
    }

    @Override // defpackage.fy2
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            by2 by2Var = (by2) obj;
            by2Var.a(by2Var);
        }
    }
}
