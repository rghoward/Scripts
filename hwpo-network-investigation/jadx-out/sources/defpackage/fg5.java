package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class fg5 extends dg5 {
    public static final fg5 w = new fg5(1, 0, 1);

    public final boolean d(int i) {
        return this.t <= i && i <= this.u;
    }

    @Override // defpackage.dg5
    public final boolean equals(Object obj) {
        if (!(obj instanceof fg5)) {
            return false;
        }
        if (isEmpty() && ((fg5) obj).isEmpty()) {
            return true;
        }
        fg5 fg5Var = (fg5) obj;
        return this.t == fg5Var.t && this.u == fg5Var.u;
    }

    @Override // defpackage.dg5
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.t * 31) + this.u;
    }

    @Override // defpackage.dg5
    public final boolean isEmpty() {
        return this.t > this.u;
    }

    @Override // defpackage.dg5
    public final String toString() {
        return this.t + ".." + this.u;
    }
}
