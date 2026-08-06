package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zx2 implements tx2 {
    public final float t;
    public final float u;
    public final jb4 v;

    public zx2(float f, float f2, jb4 jb4Var) {
        this.t = f;
        this.u = f2;
        this.v = jb4Var;
    }

    @Override // defpackage.tx2
    public final float N0() {
        return this.u;
    }

    @Override // defpackage.tx2
    public final long O(float f) {
        return cka.c(this.v.a(f), 4294967296L);
    }

    @Override // defpackage.tx2
    public final float d0(long j) {
        if (dka.a(bka.b(j), 4294967296L)) {
            return this.v.b(bka.c(j));
        }
        aa0.c("Only Sp can convert to Px");
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx2)) {
            return false;
        }
        zx2 zx2Var = (zx2) obj;
        return Float.compare(this.t, zx2Var.t) == 0 && Float.compare(this.u, zx2Var.u) == 0 && this.v.equals(zx2Var.v);
    }

    @Override // defpackage.tx2
    public final float getDensity() {
        return this.t;
    }

    public final int hashCode() {
        return this.v.hashCode() + h44.a(Float.hashCode(this.t) * 31, this.u, 31);
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.t + ", fontScale=" + this.u + ", converter=" + this.v + ')';
    }
}
