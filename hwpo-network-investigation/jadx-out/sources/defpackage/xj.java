package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xj extends ln4 {
    public final int x;

    public xj(int i) {
        super(22);
        this.x = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xj) && ((xj) obj).x == this.x;
    }

    public final int hashCode() {
        return this.x * 31;
    }
}
