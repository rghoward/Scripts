package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class cm9 extends u2<am9<?>> {
    public long a = -1;
    public e41 b;

    @Override // defpackage.u2
    public final boolean a(s2 s2Var) {
        am9 am9Var = (am9) s2Var;
        if (this.a >= 0) {
            return false;
        }
        long j = am9Var.B;
        if (j < am9Var.C) {
            am9Var.C = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.u2
    public final r02[] b(s2 s2Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((am9) s2Var).x(j);
    }
}
