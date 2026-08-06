package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ij5 {
    public final we6<a58> a;
    public final c58 b;
    public boolean c;

    public ij5(we6<a58> we6Var, c58 c58Var) {
        this.a = we6Var;
        this.b = c58Var;
    }

    public final boolean a(long j) {
        d58 d58Var;
        List<d58> list = this.b.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                d58Var = null;
                break;
            }
            d58Var = list.get(i);
            if (zj7.a(d58Var.a, j)) {
                break;
            }
            i++;
        }
        d58 d58Var2 = d58Var;
        if (d58Var2 != null) {
            return d58Var2.h;
        }
        return false;
    }
}
