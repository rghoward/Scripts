package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class wb7 {
    public final k37<jb7> a = new k37<>(new jb7[16]);
    public final t27<wb7> b = new t27<>(10);

    public boolean a(we6<a58> we6Var, qq5 qq5Var, ij5 ij5Var, boolean z) {
        k37<jb7> k37Var = this.a;
        jb7[] jb7VarArr = k37Var.t;
        int i = k37Var.v;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = jb7VarArr[i2].a(we6Var, qq5Var, ij5Var, z) || z2;
        }
        return z2;
    }

    public void b(ij5 ij5Var) {
        k37<jb7> k37Var = this.a;
        int i = k37Var.v;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (k37Var.t[i].d.a == 0) {
                k37Var.o(i);
            }
        }
    }
}
