package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yw2 implements di1 {
    public final /* synthetic */ zw2 t;

    public yw2(zw2 zw2Var) {
        this.t = zw2Var;
    }

    @Override // defpackage.di1
    public final long a() {
        zw2 zw2Var = this.t;
        long jA = zw2Var.M.a();
        if (jA != 16) {
            return jA;
        }
        rw8 rw8Var = (rw8) ku1.a(zw2Var, zw8.a);
        if (rw8Var != null) {
            long j = rw8Var.a;
            if (j != 16) {
                return j;
            }
        }
        return ((uh1) ku1.a(zw2Var, zy1.a)).a;
    }
}
