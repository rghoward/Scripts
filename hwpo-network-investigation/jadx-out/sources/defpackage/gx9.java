package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gx9 extends tf5 {
    public int t;
    public final /* synthetic */ fx9<Object> u;

    public gx9(fx9<Object> fx9Var) {
        this.u = fx9Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.t < this.u.f();
    }

    @Override // defpackage.tf5
    public final int nextInt() {
        int i = this.t;
        this.t = i + 1;
        return this.u.d(i);
    }
}
