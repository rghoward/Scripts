package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ew0 {
    public final k37<dz1.a> a = new k37<>(new dz1.a[16]);

    public final void a(CancellationException cancellationException) {
        k37<dz1.a> k37Var = this.a;
        int i = k37Var.v;
        c41[] c41VarArr = new c41[i];
        for (int i2 = 0; i2 < i; i2++) {
            c41VarArr[i2] = k37Var.t[i2].b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            c41VarArr[i3].l(cancellationException);
        }
        if (k37Var.v == 0) {
            return;
        }
        xc5.c("uncancelled requests present");
    }

    public final void b() {
        k37<dz1.a> k37Var = this.a;
        fg5 fg5VarJ = uh8.j(0, k37Var.v);
        int i = fg5VarJ.t;
        int i2 = fg5VarJ.u;
        if (i <= i2) {
            while (true) {
                k37Var.t[i].b.resumeWith(g2b.a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        k37Var.k();
    }
}
