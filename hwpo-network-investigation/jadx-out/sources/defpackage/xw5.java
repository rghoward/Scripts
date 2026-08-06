package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xw5 implements yz9<fg5> {
    public final int t;
    public final int u;
    public final dt7 v;
    public int w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public xw5(int i, int i2, int i3) {
        this.t = i2;
        this.u = i3;
        int i4 = (i / i2) * i2;
        this.v = new dt7(uh8.j(Math.max(i4 - i3, 0), i4 + i2 + i3), d3a.u);
        this.w = i;
    }

    public final void d(int i) {
        if (i != this.w) {
            this.w = i;
            int i2 = this.t;
            int i3 = (i / i2) * i2;
            int i4 = this.u;
            this.v.setValue(uh8.j(Math.max(i3 - i4, 0), i3 + i2 + i4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yz9
    public final fg5 getValue() {
        return (fg5) this.v.getValue();
    }
}
