package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qu7 implements im8 {
    public final Set<im8> t;
    public final k37<jm8> u = new k37<>(new jm8[16]);

    public qu7(Set<im8> set) {
        this.t = set;
    }

    @Override // defpackage.im8
    public final void d() {
        k37<jm8> k37Var = this.u;
        jm8[] jm8VarArr = k37Var.t;
        int i = k37Var.v;
        for (int i2 = 0; i2 < i; i2++) {
            im8 im8VarC = jm8VarArr[i2].c();
            this.t.remove(im8VarC);
            im8VarC.d();
        }
    }

    @Override // defpackage.im8
    public final void b() {
    }

    @Override // defpackage.im8
    public final void c() {
    }
}
