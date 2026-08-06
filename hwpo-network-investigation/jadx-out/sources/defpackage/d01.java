package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d01 extends e01.a {
    public int t = 0;
    public final int u;
    public final /* synthetic */ e01 v;

    public d01(e01 e01Var) {
        this.v = e01Var;
        this.u = e01Var.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.t < this.u;
    }
}
