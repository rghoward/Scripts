package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface ri4<T> extends r54<T> {
    static /* synthetic */ r54 e(ri4 ri4Var, h72 h72Var, int i, xx0 xx0Var, int i2) {
        if ((i2 & 1) != 0) {
            h72Var = ff3.t;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            xx0Var = xx0.t;
        }
        return ri4Var.b(h72Var, i, xx0Var);
    }

    r54<T> b(h72 h72Var, int i, xx0 xx0Var);
}
