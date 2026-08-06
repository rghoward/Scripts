package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n3b implements nv9 {
    public final int a;
    public final h95 b;

    public n3b(int[] iArr, int i) {
        h95 h95Var;
        this.a = i;
        if (iArr != null) {
            h95 h95Var2 = h95.v;
            h95Var = iArr.length == 0 ? h95.v : new h95(Arrays.copyOf(iArr, iArr.length));
        } else {
            h95Var = h95.v;
        }
        this.b = h95Var;
    }

    public final String toString() {
        h95 h95Var = this.b;
        ArrayList arrayList = new ArrayList(h95Var.u);
        int i = 0;
        while (true) {
            int i2 = h95Var.u;
            if (i >= i2) {
                return "UnsupportedBrands{major=" + n6b.Y(this.a) + ", compatible=" + arrayList + "}";
            }
            xl7.k(i, i2);
            arrayList.add(n6b.Y(h95Var.t[i]));
            i++;
        }
    }
}
