package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c01 extends f01.a {
    public int t = 0;
    public final int u;
    public final /* synthetic */ f01 v;

    public c01(f01 f01Var) {
        this.v = f01Var;
        this.u = f01Var.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.t < this.u;
    }
}
