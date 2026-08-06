package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0a implements m0a {
    public final k60 t = new k60(0);

    public final boolean m(int i) {
        return (this.t.get() & i) != 0;
    }

    public final void y(int i) {
        k60 k60Var;
        int i2;
        do {
            k60Var = this.t;
            i2 = k60Var.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!k60Var.compareAndSet(i2, i2 | i));
    }
}
