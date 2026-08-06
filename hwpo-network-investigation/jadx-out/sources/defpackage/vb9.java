package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vb9 {
    public final lb9 a;
    public final f27 b;

    public vb9(ub9 ub9Var, zf5<xb9> zf5Var) {
        this.a = ub9Var.d;
        List listJ = ub9.j(4, ub9Var);
        this.b = new f27(listJ.size());
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            ub9 ub9Var2 = (ub9) listJ.get(i);
            if (zf5Var.a(ub9Var2.f)) {
                this.b.a(ub9Var2.f);
            }
        }
    }
}
