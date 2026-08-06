package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vx0 {
    public int t;

    public final void h(int i) {
        this.t = i | this.t;
    }

    public final boolean i(int i) {
        return (this.t & i) == i;
    }
}
