package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xx2 implements tx2 {
    public final float t;
    public final float u;

    public xx2(float f, float f2) {
        this.t = f;
        this.u = f2;
    }

    @Override // defpackage.tx2
    public final float N0() {
        return this.u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx2)) {
            return false;
        }
        xx2 xx2Var = (xx2) obj;
        return Float.compare(this.t, xx2Var.t) == 0 && Float.compare(this.u, xx2Var.u) == 0;
    }

    @Override // defpackage.tx2
    public final float getDensity() {
        return this.t;
    }

    public final int hashCode() {
        return Float.hashCode(this.u) + (Float.hashCode(this.t) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.t);
        sb.append(", fontScale=");
        return ho.a(sb, this.u, ')');
    }
}
