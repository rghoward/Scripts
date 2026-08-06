package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class eg5 extends tf5 {
    public final int t;
    public final int u;
    public boolean v;
    public int w;

    public eg5(int i, int i2, int i3) {
        this.t = i3;
        this.u = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.v = z;
        this.w = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.v;
    }

    @Override // defpackage.tf5
    public final int nextInt() {
        int i = this.w;
        if (i != this.u) {
            this.w = this.t + i;
            return i;
        }
        if (this.v) {
            this.v = false;
            return i;
        }
        vl.b();
        return 0;
    }
}
